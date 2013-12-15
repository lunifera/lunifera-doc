/**
 */
package org.lunifera.doc.dsl.doccompiler.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.lunifera.doc.dsl.doccompiler.BoldEnd;
import org.lunifera.doc.dsl.doccompiler.BoldStart;
import org.lunifera.doc.dsl.doccompiler.ChapterEnd;
import org.lunifera.doc.dsl.doccompiler.ChapterStart;
import org.lunifera.doc.dsl.doccompiler.CodeEnd;
import org.lunifera.doc.dsl.doccompiler.CodeStart;
import org.lunifera.doc.dsl.doccompiler.DocCompilerFactory;
import org.lunifera.doc.dsl.doccompiler.DocCompilerPackage;
import org.lunifera.doc.dsl.doccompiler.DocumentEnd;
import org.lunifera.doc.dsl.doccompiler.DocumentStart;
import org.lunifera.doc.dsl.doccompiler.ElseIfCondition;
import org.lunifera.doc.dsl.doccompiler.ElseStart;
import org.lunifera.doc.dsl.doccompiler.EndIf;
import org.lunifera.doc.dsl.doccompiler.ExampleEnd;
import org.lunifera.doc.dsl.doccompiler.ExampleStart;
import org.lunifera.doc.dsl.doccompiler.ForLoopEnd;
import org.lunifera.doc.dsl.doccompiler.ForLoopStart;
import org.lunifera.doc.dsl.doccompiler.H1End;
import org.lunifera.doc.dsl.doccompiler.H1Start;
import org.lunifera.doc.dsl.doccompiler.H2End;
import org.lunifera.doc.dsl.doccompiler.H2Start;
import org.lunifera.doc.dsl.doccompiler.IfConditionStart;
import org.lunifera.doc.dsl.doccompiler.ImgStart;
import org.lunifera.doc.dsl.doccompiler.ItalicEnd;
import org.lunifera.doc.dsl.doccompiler.ItalicStart;
import org.lunifera.doc.dsl.doccompiler.Line;
import org.lunifera.doc.dsl.doccompiler.LineBreak;
import org.lunifera.doc.dsl.doccompiler.LinePart;
import org.lunifera.doc.dsl.doccompiler.Literal;
import org.lunifera.doc.dsl.doccompiler.MailtoEnd;
import org.lunifera.doc.dsl.doccompiler.MailtoStart;
import org.lunifera.doc.dsl.doccompiler.Markup;
import org.lunifera.doc.dsl.doccompiler.MovieEnd;
import org.lunifera.doc.dsl.doccompiler.MovieStart;
import org.lunifera.doc.dsl.doccompiler.PrintedExpression;
import org.lunifera.doc.dsl.doccompiler.ProcessedRichString;
import org.lunifera.doc.dsl.doccompiler.RefEnd;
import org.lunifera.doc.dsl.doccompiler.RefStart;
import org.lunifera.doc.dsl.doccompiler.SectionEnd;
import org.lunifera.doc.dsl.doccompiler.SectionStart;
import org.lunifera.doc.dsl.doccompiler.SkypeEnd;
import org.lunifera.doc.dsl.doccompiler.SkypeStart;
import org.lunifera.doc.dsl.doccompiler.SubsectionEnd;
import org.lunifera.doc.dsl.doccompiler.SubsectionStart;
import org.lunifera.doc.dsl.doccompiler.TableDataEnd;
import org.lunifera.doc.dsl.doccompiler.TableDataStart;
import org.lunifera.doc.dsl.doccompiler.TableEnd;
import org.lunifera.doc.dsl.doccompiler.TableRowEnd;
import org.lunifera.doc.dsl.doccompiler.TableRowStart;
import org.lunifera.doc.dsl.doccompiler.TableStart;
import org.lunifera.doc.dsl.doccompiler.URLEnd;
import org.lunifera.doc.dsl.doccompiler.URLStart;
import org.lunifera.doc.dsl.doccompiler.UnderlineEnd;
import org.lunifera.doc.dsl.doccompiler.UnderlineStart;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class DocCompilerFactoryImpl extends EFactoryImpl implements DocCompilerFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DocCompilerFactory init() {
		try {
			DocCompilerFactory theDocCompilerFactory = (DocCompilerFactory) EPackage.Registry.INSTANCE
					.getEFactory(DocCompilerPackage.eNS_URI);
			if (theDocCompilerFactory != null) {
				return theDocCompilerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DocCompilerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocCompilerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DocCompilerPackage.DOCUMENT_START:
			return createDocumentStart();
		case DocCompilerPackage.DOCUMENT_END:
			return createDocumentEnd();
		case DocCompilerPackage.PROCESSED_RICH_STRING:
			return createProcessedRichString();
		case DocCompilerPackage.LINE:
			return createLine();
		case DocCompilerPackage.LINE_PART:
			return createLinePart();
		case DocCompilerPackage.LITERAL:
			return createLiteral();
		case DocCompilerPackage.LINE_BREAK:
			return createLineBreak();
		case DocCompilerPackage.FOR_LOOP_START:
			return createForLoopStart();
		case DocCompilerPackage.FOR_LOOP_END:
			return createForLoopEnd();
		case DocCompilerPackage.PRINTED_EXPRESSION:
			return createPrintedExpression();
		case DocCompilerPackage.IF_CONDITION_START:
			return createIfConditionStart();
		case DocCompilerPackage.ELSE_IF_CONDITION:
			return createElseIfCondition();
		case DocCompilerPackage.ELSE_START:
			return createElseStart();
		case DocCompilerPackage.END_IF:
			return createEndIf();
		case DocCompilerPackage.MARKUP:
			return createMarkup();
		case DocCompilerPackage.H1_START:
			return createH1Start();
		case DocCompilerPackage.H1_END:
			return createH1End();
		case DocCompilerPackage.H2_START:
			return createH2Start();
		case DocCompilerPackage.H2_END:
			return createH2End();
		case DocCompilerPackage.EXAMPLE_START:
			return createExampleStart();
		case DocCompilerPackage.EXAMPLE_END:
			return createExampleEnd();
		case DocCompilerPackage.URL_START:
			return createURLStart();
		case DocCompilerPackage.URL_END:
			return createURLEnd();
		case DocCompilerPackage.REF_START:
			return createRefStart();
		case DocCompilerPackage.REF_END:
			return createRefEnd();
		case DocCompilerPackage.BOLD_START:
			return createBoldStart();
		case DocCompilerPackage.BOLD_END:
			return createBoldEnd();
		case DocCompilerPackage.UNDERLINE_START:
			return createUnderlineStart();
		case DocCompilerPackage.UNDERLINE_END:
			return createUnderlineEnd();
		case DocCompilerPackage.ITALIC_START:
			return createItalicStart();
		case DocCompilerPackage.ITALIC_END:
			return createItalicEnd();
		case DocCompilerPackage.IMG_START:
			return createImgStart();
		case DocCompilerPackage.MAILTO_START:
			return createMailtoStart();
		case DocCompilerPackage.MAILTO_END:
			return createMailtoEnd();
		case DocCompilerPackage.SKYPE_START:
			return createSkypeStart();
		case DocCompilerPackage.SKYPE_END:
			return createSkypeEnd();
		case DocCompilerPackage.MOVIE_START:
			return createMovieStart();
		case DocCompilerPackage.MOVIE_END:
			return createMovieEnd();
		case DocCompilerPackage.CODE_START:
			return createCodeStart();
		case DocCompilerPackage.CODE_END:
			return createCodeEnd();
		case DocCompilerPackage.TABLE_START:
			return createTableStart();
		case DocCompilerPackage.TABLE_END:
			return createTableEnd();
		case DocCompilerPackage.TABLE_ROW_START:
			return createTableRowStart();
		case DocCompilerPackage.TABLE_ROW_END:
			return createTableRowEnd();
		case DocCompilerPackage.TABLE_DATA_START:
			return createTableDataStart();
		case DocCompilerPackage.TABLE_DATA_END:
			return createTableDataEnd();
		case DocCompilerPackage.CHAPTER_START:
			return createChapterStart();
		case DocCompilerPackage.CHAPTER_END:
			return createChapterEnd();
		case DocCompilerPackage.SECTION_START:
			return createSectionStart();
		case DocCompilerPackage.SECTION_END:
			return createSectionEnd();
		case DocCompilerPackage.SUBSECTION_START:
			return createSubsectionStart();
		case DocCompilerPackage.SUBSECTION_END:
			return createSubsectionEnd();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocumentStart createDocumentStart() {
		DocumentStartImpl documentStart = new DocumentStartImpl();
		return documentStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocumentEnd createDocumentEnd() {
		DocumentEndImpl documentEnd = new DocumentEndImpl();
		return documentEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProcessedRichString createProcessedRichString() {
		ProcessedRichStringImpl processedRichString = new ProcessedRichStringImpl();
		return processedRichString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LinePart createLinePart() {
		LinePartImpl linePart = new LinePartImpl();
		return linePart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LineBreak createLineBreak() {
		LineBreakImpl lineBreak = new LineBreakImpl();
		return lineBreak;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ForLoopStart createForLoopStart() {
		ForLoopStartImpl forLoopStart = new ForLoopStartImpl();
		return forLoopStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ForLoopEnd createForLoopEnd() {
		ForLoopEndImpl forLoopEnd = new ForLoopEndImpl();
		return forLoopEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PrintedExpression createPrintedExpression() {
		PrintedExpressionImpl printedExpression = new PrintedExpressionImpl();
		return printedExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IfConditionStart createIfConditionStart() {
		IfConditionStartImpl ifConditionStart = new IfConditionStartImpl();
		return ifConditionStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ElseIfCondition createElseIfCondition() {
		ElseIfConditionImpl elseIfCondition = new ElseIfConditionImpl();
		return elseIfCondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ElseStart createElseStart() {
		ElseStartImpl elseStart = new ElseStartImpl();
		return elseStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EndIf createEndIf() {
		EndIfImpl endIf = new EndIfImpl();
		return endIf;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Markup createMarkup() {
		MarkupImpl markup = new MarkupImpl();
		return markup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public H1Start createH1Start() {
		H1StartImpl h1Start = new H1StartImpl();
		return h1Start;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public H1End createH1End() {
		H1EndImpl h1End = new H1EndImpl();
		return h1End;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public H2Start createH2Start() {
		H2StartImpl h2Start = new H2StartImpl();
		return h2Start;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public H2End createH2End() {
		H2EndImpl h2End = new H2EndImpl();
		return h2End;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExampleStart createExampleStart() {
		ExampleStartImpl exampleStart = new ExampleStartImpl();
		return exampleStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExampleEnd createExampleEnd() {
		ExampleEndImpl exampleEnd = new ExampleEndImpl();
		return exampleEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URLStart createURLStart() {
		URLStartImpl urlStart = new URLStartImpl();
		return urlStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URLEnd createURLEnd() {
		URLEndImpl urlEnd = new URLEndImpl();
		return urlEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RefStart createRefStart() {
		RefStartImpl refStart = new RefStartImpl();
		return refStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RefEnd createRefEnd() {
		RefEndImpl refEnd = new RefEndImpl();
		return refEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BoldStart createBoldStart() {
		BoldStartImpl boldStart = new BoldStartImpl();
		return boldStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BoldEnd createBoldEnd() {
		BoldEndImpl boldEnd = new BoldEndImpl();
		return boldEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnderlineStart createUnderlineStart() {
		UnderlineStartImpl underlineStart = new UnderlineStartImpl();
		return underlineStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnderlineEnd createUnderlineEnd() {
		UnderlineEndImpl underlineEnd = new UnderlineEndImpl();
		return underlineEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ItalicStart createItalicStart() {
		ItalicStartImpl italicStart = new ItalicStartImpl();
		return italicStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ItalicEnd createItalicEnd() {
		ItalicEndImpl italicEnd = new ItalicEndImpl();
		return italicEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ImgStart createImgStart() {
		ImgStartImpl imgStart = new ImgStartImpl();
		return imgStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MailtoStart createMailtoStart() {
		MailtoStartImpl mailtoStart = new MailtoStartImpl();
		return mailtoStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MailtoEnd createMailtoEnd() {
		MailtoEndImpl mailtoEnd = new MailtoEndImpl();
		return mailtoEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SkypeStart createSkypeStart() {
		SkypeStartImpl skypeStart = new SkypeStartImpl();
		return skypeStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SkypeEnd createSkypeEnd() {
		SkypeEndImpl skypeEnd = new SkypeEndImpl();
		return skypeEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MovieStart createMovieStart() {
		MovieStartImpl movieStart = new MovieStartImpl();
		return movieStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MovieEnd createMovieEnd() {
		MovieEndImpl movieEnd = new MovieEndImpl();
		return movieEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeStart createCodeStart() {
		CodeStartImpl codeStart = new CodeStartImpl();
		return codeStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeEnd createCodeEnd() {
		CodeEndImpl codeEnd = new CodeEndImpl();
		return codeEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TableStart createTableStart() {
		TableStartImpl tableStart = new TableStartImpl();
		return tableStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TableEnd createTableEnd() {
		TableEndImpl tableEnd = new TableEndImpl();
		return tableEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TableRowStart createTableRowStart() {
		TableRowStartImpl tableRowStart = new TableRowStartImpl();
		return tableRowStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TableRowEnd createTableRowEnd() {
		TableRowEndImpl tableRowEnd = new TableRowEndImpl();
		return tableRowEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TableDataStart createTableDataStart() {
		TableDataStartImpl tableDataStart = new TableDataStartImpl();
		return tableDataStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TableDataEnd createTableDataEnd() {
		TableDataEndImpl tableDataEnd = new TableDataEndImpl();
		return tableDataEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChapterStart createChapterStart() {
		ChapterStartImpl chapterStart = new ChapterStartImpl();
		return chapterStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChapterEnd createChapterEnd() {
		ChapterEndImpl chapterEnd = new ChapterEndImpl();
		return chapterEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SectionStart createSectionStart() {
		SectionStartImpl sectionStart = new SectionStartImpl();
		return sectionStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SectionEnd createSectionEnd() {
		SectionEndImpl sectionEnd = new SectionEndImpl();
		return sectionEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SubsectionStart createSubsectionStart() {
		SubsectionStartImpl subsectionStart = new SubsectionStartImpl();
		return subsectionStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SubsectionEnd createSubsectionEnd() {
		SubsectionEndImpl subsectionEnd = new SubsectionEndImpl();
		return subsectionEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocCompilerPackage getDocCompilerPackage() {
		return (DocCompilerPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DocCompilerPackage getPackage() {
		return DocCompilerPackage.eINSTANCE;
	}

} // DocCompilerFactoryImpl
