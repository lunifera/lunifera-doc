package org.lunifera.doc.dsl.formatting

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmTypeParameter
import org.eclipse.xtext.xbase.formatting.BlankLineKey
import org.eclipse.xtext.xbase.formatting.FormattableDocument
import org.eclipse.xtext.xbase.formatting.FormattingDataFactory
import org.eclipse.xtext.xbase.formatting.HiddenLeafAccess
import org.eclipse.xtext.xbase.formatting.NodeModelAccess
import org.eclipse.xtext.xbase.formatting.XbaseFormatter2
import org.eclipse.xtext.xtype.XImportSection
import org.lunifera.doc.dsl.luniferadoc.DocumentInclude
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage
import org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument
import org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class LuniferaDocGrammarFormatter extends XbaseFormatter2 {

public static val blankLinesAfterPackageDecl = new BlankLineKey("blank.lines.after.packagedecl", 1)
	public static val blankLinesBetweenImports = new BlankLineKey("blank.lines.between.imports", 0)
	public static val blankLinesAfterImports = new BlankLineKey("blank.lines.after.imports", 1)
	public static val blankLinesBetweenClasses = new BlankLineKey("blank.lines.between.classes", 1)
	public static val blankLinesBeforeFirstMember = new BlankLineKey("blank.lines.before.first.member", 0)
	public static val blankLinesAfterLastMember = new BlankLineKey("blank.lines.after.last.member", 0)
	public static val blankLinesBetweenFields = new BlankLineKey("blank.lines.between.fields", 0)
	public static val blankLinesBetweenFieldsAndMethods = new BlankLineKey("blank.lines.between.fields.and.methods", 1)
	public static val blankLinesBetweenMethods = new BlankLineKey("blank.lines.between.methods", 1)
	public static val blankLinesBetweenEnumLiterals = new BlankLineKey("blank.lines.between.enum.literals", 0)

	@Inject extension NodeModelAccess
	@Inject extension HiddenLeafAccess
	@Inject extension FormattingDataFactory

	@Inject RichStringFormatter richStringFormatter

	def protected dispatch void format(GeneralDocument document, FormattableDocument format) {
		format += document.nodeForEObject.prepend[noSpace]
		val imports = document.nodeForFeature(LayoutPackage.Literals.LUNIFERA_DOC_LAYOUT__IMPORTS)
		format += imports.prepend[oneSpace]
		val includes = document.nodeForFeature(DocumentPackage.Literals.GENERAL_DOCUMENT__INCLUDES)
		val semicolon = imports.immediatelyFollowingKeyword(";")
			format += imports.append[space = ""]
			format += semicolon.append[cfg(blankLinesAfterPackageDecl)]
			
		format += includes.prepend[oneSpace]
		
		xtendFile.importSection?.format(format)
		for (clazz : xtendFile.xtendTypes) {
			clazz.format(format)
			if (clazz != xtendFile.xtendTypes.last)
				format += clazz.nodeForEObject.append[cfg(blankLinesBetweenClasses)]
		}

		format += xtendFile.nodeForEObject.append[newLine]
	}
	
	def protected dispatch void format(XImportSection section, FormattableDocument format) {
		for (imp : section.importDeclarations) {
			imp.format(format)
			if (imp != section.importDeclarations.last)
				format += imp.nodeForEObject.append[cfg(blankLinesBetweenImports)]
			else
				format += imp.nodeForEObject.append[cfg(blankLinesAfterImports)]
		}
	}

	def protected dispatch void format(DocumentInclude imp, FormattableDocument document) {
		document += imp.nodeForKeyword("import").append[oneSpace]
		document += imp.nodeForFeature(LuniferaDocPackage.Literals.DOCUMENT_INCLUDE__INCLUDE).append[oneSpace]
		document += imp.nodeForKeyword("as").append[oneSpace]
		document += imp.nodeForFeature(LuniferaDocPackage.Literals.DOCUMENT_INCLUDE__VAR_NAME).append[oneSpace]
		document += imp.nodeForKeyword(";").prepend[noSpace]
	}

	def protected dispatch void format(XtendClass clazz, FormattableDocument format) {
		formatAnnotations(clazz, format, newLineAfterClassAnnotations)
		formatModifiers(clazz, format)
		formatTypeParameters(clazz, clazz.typeParameters, format)
		format += clazz.nodeForKeyword("class").append[oneSpace]
		format += clazz.nodeForKeyword("extends").surround[oneSpace]
		clazz.^extends.format(format)
		format += clazz.nodeForKeyword("implements").surround[oneSpace]
		for (imp : clazz.^implements) {
			format += imp.nodeForEObject.immediatelyFollowingKeyword(",").surround([noSpace], [oneSpace])
			imp.format(format)
		}
		formatBody(clazz, format)
	}

	def protected formatTypeParameters(XtendMember member, List<? extends JvmTypeParameter> typeParameters, FormattableDocument format) {
		if (!typeParameters.empty) {
			format += member.nodeForKeyword("<").surround[noSpace]
			for (arg : typeParameters) {
				arg.format(format)
				format += arg.immediatelyFollowingKeyword(",").surround([noSpace], [oneSpace])
			}
			format += member.nodeForKeyword(">").prepend[noSpace]
		}
	}

	def protected formatBody(XtendTypeDeclaration type, FormattableDocument format) {
		val clazzOpenBrace = type.nodeForKeyword("{")
		format += clazzOpenBrace.prepend[cfg(bracesInNewLine)]
		if (!type.members.empty) {
			format += clazzOpenBrace.append[increaseIndentation]
			format += clazzOpenBrace.append[cfg(blankLinesBeforeFirstMember)]
			for (i : 0 .. (type.members.size - 1)) {
				val current = type.members.get(i)
				current.format(format)
				if (i < type.members.size - 1) {
					val next = type.members.get(i + 1)
					if (current instanceof XtendField && next instanceof XtendField)
						format += current.nodeForEObject.append[cfg(blankLinesBetweenFields)]
					else if (current instanceof XtendFunction && next instanceof XtendFunction)
						format += current.nodeForEObject.append[cfg(blankLinesBetweenMethods)]
					else
						format += current.nodeForEObject.append[cfg(blankLinesBetweenFieldsAndMethods)]
				} else {
					val node = type.members.get(i).nodeForEObject
					format += node.append[decreaseIndentation]
					format += node.append[cfg(blankLinesAfterLastMember)]
				}
			}
		} else {
			if(clazzOpenBrace.hiddenLeafsAfter.containsComment)
				format += clazzOpenBrace.append[newLine increaseIndentation decreaseIndentation]
			else
				format += clazzOpenBrace.append[newLine]
		}
	}

	def protected dispatch void format(XtendInterface interfaze, FormattableDocument format) {
		formatAnnotations(interfaze, format, newLineAfterClassAnnotations)
		formatModifiers(interfaze, format)
		formatTypeParameters(interfaze, interfaze.typeParameters, format)
		format += interfaze.nodeForKeyword("interface").append[oneSpace]
		format += interfaze.nodeForKeyword("extends").surround[oneSpace]
		for (imp : interfaze.extends) {
			format += imp.nodeForEObject.immediatelyFollowingKeyword(",").surround([noSpace], [oneSpace])
			imp.format(format)
		}
		formatBody(interfaze, format)
	}

	def protected dispatch void format(XtendAnnotationType annotationType, FormattableDocument format) {
		formatAnnotations(annotationType, format, newLineAfterClassAnnotations)
		formatModifiers(annotationType, format)
		format += annotationType.nodeForKeyword("annotation").append[oneSpace]
		formatBody(annotationType, format)
	}

	def protected dispatch void format(XtendEnum enumeration, FormattableDocument format) {
		formatAnnotations(enumeration, format, newLineAfterClassAnnotations)
		formatModifiers(enumeration, format)
		format += enumeration.nodeForKeyword("enum").append[oneSpace]
				val clazzOpenBrace = enumeration.nodeForKeyword("{")
		format += clazzOpenBrace.prepend[cfg(bracesInNewLine)]
		if (!enumeration.members.empty) {
			format += clazzOpenBrace.append[increaseIndentation]
			format += clazzOpenBrace.append[cfg(blankLinesBeforeFirstMember)]
			for (i : 0 .. (enumeration.members.size - 1)) {
				val current = enumeration.members.get(i)
				current.format(format)
				if (i < enumeration.members.size - 1) {
					format += current.nodeForEObject.immediatelyFollowingKeyword(",").surround([noSpace], [cfg(blankLinesBetweenEnumLiterals)])
				} else {
					val node = current.nodeForEObject
					format += node.append[decreaseIndentation]
					format += node.append[cfg(blankLinesAfterLastMember)]
				}
			}
		} else {
			format += clazzOpenBrace.append[newLine]
		}
	}

	def protected dispatch void format(XtendConstructor func, FormattableDocument format) {
		formatAnnotations(func, format, newLineAfterConstructorAnnotations)
		formatModifiers(func, format)
		format += func.nodeForKeyword("new").append[noSpace]
		if (!func.typeParameters.empty) {
			format += func.nodeForKeyword("<").append[noSpace]
			for (arg : func.typeParameters) {
				arg.format(format)
				format += arg.immediatelyFollowingKeyword(",").surround([noSpace], [oneSpace])
			}
			format += func.nodeForKeyword(">").surround([noSpace])
		}
		val open = func.nodeForKeyword("(")
		val close = func.nodeForKeyword(")")
		format += close.append[cfg(bracesInNewLine)]
		formatCommaSeparatedList(func.parameters, open, close, format)

		func.expression.format(format)
	}

	def protected dispatch void format(XtendFunction func, FormattableDocument format) {
		formatAnnotations(func, format, newLineAfterMethodAnnotations)
		formatModifiers(func, format)
		if (!func.typeParameters.empty) {
			format += func.nodeForKeyword("<").append[noSpace]
			for (arg : func.typeParameters) {
				arg.format(format)
				format += arg.immediatelyFollowingKeyword(",").surround([noSpace], [oneSpace])
			}
			format += func.nodeForKeyword(">").surround([noSpace], [oneSpace])
		}
		val nameNode = func.nodeForFeature(XTEND_FUNCTION__NAME)
		val open = nameNode.immediatelyFollowingKeyword("(")
		val close = func.nodeForKeyword(")")
		format += func.nodeForFeature(XTEND_FUNCTION__RETURN_TYPE).append[oneSpace]
		format += open.prepend[noSpace]
		if(func.expression != null)
			format += close.append[cfg(bracesInNewLine)]
		formatCommaSeparatedList(func.parameters, open, close, format)
		func.returnType.format(format)
		func.expression.format(format)
	}

	def protected dispatch void format(XtendField field, FormattableDocument document) {
		formatAnnotations(field, document, newLineAfterFieldAnnotations)
		formatModifiers(field, document)
		if (field.name != null)
			document += field.nodeForFeature(XTEND_FIELD__TYPE).append[oneSpace]
		document += field.nodeForKeyword("=").surround([oneSpace], [oneSpace])
		field.type.format(document)
		field.initialValue.format(document)
	}

	def protected dispatch void format(XtendParameter param, FormattableDocument format) {
		formatAnnotations(param, format, newLineAfterParameterAnnotations)
		param.parameterType.format(format)
		val nameNode = param.nodeForFeature(XTEND_PARAMETER__NAME)
		format += nameNode.prepend[oneSpace]
	}

	def protected dispatch void format(RichString rs, FormattableDocument format) {
		val (EObject, FormattableDocument)=>void callback = [EObject obj, FormattableDocument doc|obj.format(doc)]
		richStringFormatter.format(callback, format, rs)
	}
	
	/** 
	 * Always put existing modifiers into this fixed order
	 */
	def protected formatModifiers(XtendMember member, FormattableDocument document) {
		document += member.nodeForKeyword("public").append[oneSpace]
		document += member.nodeForKeyword("protected").append[oneSpace]
		document += member.nodeForKeyword("package").append[oneSpace]
		document += member.nodeForKeyword("private").append[oneSpace]
		document += member.nodeForKeyword("abstract").append[oneSpace]
		document += member.nodeForKeyword("static").append[oneSpace]
		document += member.nodeForKeyword("final").append[oneSpace]
		document += member.nodeForKeyword("extension").append[oneSpace]
		document += member.nodeForKeyword("val").append[oneSpace]
		document += member.nodeForKeyword("var").append[oneSpace]
		document += member.nodeForKeyword("def").append[oneSpace]
		document += member.nodeForKeyword("override").append[oneSpace]
		
//		for (Pair<Keyword, Keyword> pair : findKeywordPairs("'''", "'''")) {
////			c.setIndentationIncrement().before(pair.first)
//			c.setLinewrap(1).after(pair.first)
////			c.setIndentationDecrement().before(pair.second)
//			c.setLinewrap(1).around(pair.second)
//		}
		
		for(Keyword keyword: namedDocumentAccess.findKeywords("'''")) {
			c.setLinewrap(1).around(keyword)
		}
		
		for(Keyword keyword: namedDocumentAccess.findKeywords("«")) {
			c.setNoSpace.before(keyword)
		}
		
		// LAYOUTS
		
		// DOCUMENTS
		
		// entity doc
		c.setLinewrap(1).after(entityFieldAccess.nameAssignment_2)
		c.setLinewrap(1).after(entityFieldAccess.pkAssignment_5_1)
		c.setLinewrap(1).after(entityFieldAccess.typeAssignment_3_1)
		c.setLinewrap(1).after(entityFieldAccess.lengthAssignment_4_1)
		c.setLinewrap(1).after(entityFieldAccess.nullableAssignment_6_1)
		
		// dto doc
		c.setLinewrap(1).after(DTOPropertyAccess.nameAssignment_2)
		
		// FORMATTING/RICHSTRINGS

		// h1
		c.setNoSpace().around(richStringH1Access.h1Keyword_1)
		c.setNoSpace().around(richStringH1Access.h1Keyword_3)
		
		// h2
		c.setNoSpace().around(richStringH2Access.h2Keyword_1)
		c.setNoSpace().around(richStringH2Access.h2Keyword_3)
		
		// h3
		c.setNoSpace().around(richStringH3Access.h3Keyword_1)
		c.setNoSpace().around(richStringH3Access.h3Keyword_3)
		
		// h4
		c.setNoSpace().around(richStringH4Access.h4Keyword_1)
		c.setNoSpace().around(richStringH4Access.h4Keyword_3)
		
		// h5
		c.setNoSpace().around(richStringH5Access.h5Keyword_1)
		c.setNoSpace().around(richStringH5Access.h5Keyword_3)
		
		// h6
		c.setNoSpace().around(richStringH6Access.h6Keyword_1)
		c.setNoSpace().around(richStringH6Access.h6Keyword_3)
		
		// chapter
		c.setNoSpace().before(richStringChapterAccess.chapterKeyword_1)
		c.setNoSpace().around(richStringChapterAccess.chapterKeyword_4)
		
		// section
		c.setNoSpace().before(richStringSectionAccess.sectionKeyword_1)
		c.setNoSpace().around(richStringSectionAccess.sectionKeyword_4)
		
		// subsection
		c.setNoSpace().before(richStringSubsectionAccess.subsectionKeyword_1)
		c.setNoSpace().around(richStringSubsectionAccess.subsectionKeyword_4)
		
		// URL
		c.setNoSpace().before(richStringURLAccess.urlKeyword_1)
		c.setNoSpace().after(richStringURLAccess.locationAssignment_2)
		c.setNoSpace().around(richStringURLAccess.urlKeyword_4)
		
		// Ref
		c.setNoSpace().before(richStringRefAccess.refKeyword_1)
		c.setNoSpace().after(richStringRefAccess.refIdAssignment_2)
		c.setNoSpace().around(richStringRefAccess.refKeyword_4)
		
		// bold
		c.setNoSpace().around(richStringBoldAccess.boldKeyword_1)
		c.setNoSpace().around(richStringBoldAccess.boldKeyword_3)
		
		// italic
		c.setNoSpace().around(richStringItalicAccess.italicKeyword_1)
		c.setNoSpace().around(richStringItalicAccess.italicKeyword_3)
		
		// underline
		c.setNoSpace().around(richStringUnderlineAccess.UKeyword_1)
		c.setNoSpace().around(richStringUnderlineAccess.UKeyword_3)
		
		// img
		c.setNoSpace().before(richStringImgAccess.imgKeyword_1)
		c.setNoSpace().after(richStringImgAccess.solidusKeyword_10)
		c.setNoSpace().before(richStringImgAccess.srcAssignment_3)
		c.setNoSpace().before(richStringImgAccess.altAssignment_5)
		c.setNoSpace().before(richStringImgAccess.heightAssignment_9)
		c.setNoSpace().before(richStringImgAccess.widthAssignment_7)
		
		// mailto
		c.setNoSpace().before(richStringMailtoAccess.mailtoKeyword_1)
		c.setNoSpace().around(richStringMailtoAccess.mailtoKeyword_4)
		c.setNoSpace().after(richStringMailtoAccess.emailAssignment_2)
		
		// skype
		c.setNoSpace().before(richStringSkypeAccess.skypeKeyword_1)
		c.setNoSpace().around(richStringSkypeAccess.skypeKeyword_4)
		c.setNoSpace().after(richStringSkypeAccess.targetAssignment_2)
		
		// movie
		c.setNoSpace().before(richStringMovieAccess.movieKeyword_1)
		c.setNoSpace().before(richStringMovieAccess.srcAssignment_3)
		c.setNoSpace().before(richStringMovieAccess.typeAssignment_5)
		c.setNoSpace().before(richStringMovieAccess.widthAssignment_7)
		c.setNoSpace().before(richStringMovieAccess.heightAssignment_9)
		c.setNoSpace().around(richStringMovieAccess.movieKeyword_11)
		
		// code
		c.setNoSpace().before(richStringCodeAccess.codeKeyword_1)
		c.setNoSpace().around(richStringCodeAccess.codeKeyword_4)
		c.setNoSpace().around(richStringCodeAccess.langAssignment_2_1)
		
		// example
		c.setNoSpace().around(richStringExampleAccess.exampleKeyword_1)
		c.setNoSpace().around(richStringExampleAccess.exampleKeyword_3)
		
		// table
		c.setNoSpace().around(richStringTableAccess.tableKeyword_1)
		c.setNoSpace().around(richStringTableAccess.tableKeyword_3)
		
		// table row
		c.setNoSpace().around(richStringTableRowAccess.rowKeyword_1)
		c.setNoSpace().around(richStringTableRowAccess.rowKeyword_3)
		
		// table date (column)
		c.setNoSpace().around(richStringTableDataAccess.columnKeyword_1)
		c.setNoSpace().around(richStringTableDataAccess.columnKeyword_3)
		
		// open view
		c.setNoSpace().before(richStringOpenViewAccess.openviewKeyword_1)
		c.setNoSpace().around(richStringOpenViewAccess.openviewKeyword_4)
		c.setNoSpace().after(richStringOpenViewAccess.viewIdAssignment_2)
		
		// start process
		c.setNoSpace().before(richStringStartProcessAccess.startprocessKeyword_1)
		c.setNoSpace().around(richStringStartProcessAccess.startprocessKeyword_4)
		c.setNoSpace().after(richStringStartProcessAccess.processIdAssignment_2)
		
		// entity ref
		c.setNoSpace().before(richStringEntityRefAccess.entityRefKeyword_1)
		c.setNoSpace().around(richStringEntityRefAccess.entityRefKeyword_4)
		c.setNoSpace().after(richStringEntityRefAccess.entityDocAssignment_2)
		
		// dto ref
		c.setNoSpace().before(richStringDTORefAccess.dtoRefKeyword_1)
		c.setNoSpace().around(richStringDTORefAccess.dtoRefKeyword_4)
		c.setNoSpace().after(richStringDTORefAccess.dtoDocAssignment_2)
		
		// process ref
		c.setNoSpace().before(richStringProcessRefAccess.processRefKeyword_1)
		c.setNoSpace().around(richStringProcessRefAccess.processRefKeyword_4)
		c.setNoSpace().after(richStringProcessRefAccess.processDocAssignment_2)
		
		// task ref
		c.setNoSpace().before(richStringTaskRefAccess.taskRefKeyword_1)
		c.setNoSpace().around(richStringTaskRefAccess.taskRefKeyword_4)
		c.setNoSpace().after(richStringTaskRefAccess.taskDocAssignment_2)
		
		// view ref
		c.setNoSpace().before(richStringViewRefAccess.viewRefKeyword_1)
		c.setNoSpace().around(richStringViewRefAccess.viewRefKeyword_4)
		c.setNoSpace().after(richStringViewRefAccess.viewDocAssignment_2)
		
		// ui ref
		c.setNoSpace().before(richStringUIRefAccess.uiRefKeyword_1)
		c.setNoSpace().around(richStringUIRefAccess.uiRefKeyword_4)
		c.setNoSpace().around(richStringUIRefAccess.uiDocAssignment_2)
		
		// unordered list
		c.setNoSpace().around(richStringListAccess.ulKeyword_1)
		c.setNoSpace().around(richStringListAccess.ulKeyword_3)
		
		// ordered list
		c.setNoSpace().around(richStringOrderedListAccess.olKeyword_1)
		c.setNoSpace().around(richStringOrderedListAccess.olKeyword_3)
		
		// list element
		c.setNoSpace().around(richStringListElementAccess.liKeyword_1)
		c.setNoSpace().around(richStringListElementAccess.liKeyword_3)
		
		// span/style
		c.setNoSpace().before(richStringSpanAccess.styleKeyword_1)
		c.setNoSpace().around(richStringSpanAccess.styleKeyword_4)
		c.setNoSpace().after(richStringSpanAccess.styleClassAssignment_2)
	}
}
