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
	}
}
