package org.lunifera.doc.dsl.formatting

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.formatting.BlankLineKey
import org.eclipse.xtext.xbase.formatting.FormattableDocument
import org.eclipse.xtext.xbase.formatting.FormattingDataFactory
import org.eclipse.xtext.xbase.formatting.HiddenLeafAccess
import org.eclipse.xtext.xbase.formatting.NodeModelAccess
import org.eclipse.xtext.xbase.formatting.XbaseFormatter2
import org.eclipse.xtext.xtype.XImportDeclaration
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument
import org.lunifera.doc.dsl.luniferadoc.LDocInclude
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter
import org.lunifera.doc.dsl.luniferadoc.LDocPackage
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

	def protected dispatch void format(LDocLayouter document, FormattableDocument format) {
		format += document.nodeForEObject.prepend[noSpace]
		format += document.nodeForKeyword("Layouter").append[increaseIndentation]

		for (imp : document.imports) {
			imp.format(format)
		}

		for (inc : document.includes) {
			inc.format(format)
		}

		format += document.nodeForKeyword("language").append[oneSpace]
		format += document.nodeForKeyword(";").prepend[noSpace]
		format += document.nodeForKeyword(";").append[cfg(blankLinesAfterImports)]

		document.content.format(format)
	}

	def protected dispatch void format(XImportDeclaration imp, FormattableDocument format) {
		format += imp.nodeForKeyword("import").append[oneSpace]
		format += imp.nodeForKeyword(";").prepend[noSpace]
	}

	def protected dispatch void format(LDocInclude imp, FormattableDocument format) {
		format += imp.nodeForKeyword("include").append[oneSpace]
		format += imp.nodeForFeature(LDocPackage.Literals.LDOC_INCLUDE__DOCUMENT).append[oneSpace]
		format += imp.nodeForFeature(LDocPackage.Literals.LDOC_INCLUDE__PROVIDED).append[oneSpace]
		format += imp.nodeForFeature(LDocPackage.Literals.LDOC_INCLUDE__PROVIDED_TYPE).append[oneSpace]
		format += imp.nodeForKeyword("as").append[oneSpace]
		format += imp.nodeForKeyword(";").prepend[noSpace]
	}

	def protected dispatch void format(LDocEntityDocument document, FormattableDocument format) {
		format += document.nodeForEObject.prepend[noSpace]

		format += document.nodeForKeyword("language").append[oneSpace]
		format += document.nodeForKeyword(";").prepend[noSpace]
		format += document.nodeForKeyword(";").append[cfg(blankLinesAfterImports)]

		format += document.nodeForKeyword("description").append[oneSpace]
		format += document.nodeForKeyword("fields").append[oneSpace]

	}

	def protected dispatch void format(RichString rs, FormattableDocument format) {
		val (EObject, FormattableDocument)=>void callback = [EObject obj, FormattableDocument doc|obj.format(doc)]
		richStringFormatter.format(callback, format, rs)
	}
}
