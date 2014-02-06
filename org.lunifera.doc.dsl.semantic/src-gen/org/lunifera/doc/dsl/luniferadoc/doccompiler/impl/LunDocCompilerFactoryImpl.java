/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.doc.dsl.luniferadoc.doccompiler.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LunDocCompilerFactoryImpl extends EFactoryImpl implements LunDocCompilerFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LunDocCompilerFactory init()
  {
    try
    {
      LunDocCompilerFactory theLunDocCompilerFactory = (LunDocCompilerFactory)EPackage.Registry.INSTANCE.getEFactory(LunDocCompilerPackage.eNS_URI);
      if (theLunDocCompilerFactory != null)
      {
        return theLunDocCompilerFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LunDocCompilerFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LunDocCompilerFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LunDocCompilerPackage.DOCUMENT_START: return createDocumentStart();
      case LunDocCompilerPackage.DOCUMENT_END: return createDocumentEnd();
      case LunDocCompilerPackage.PROCESSED_RICH_STRING: return createProcessedRichString();
      case LunDocCompilerPackage.LINE: return createLine();
      case LunDocCompilerPackage.LINE_PART: return createLinePart();
      case LunDocCompilerPackage.LITERAL: return createLiteral();
      case LunDocCompilerPackage.LINE_BREAK: return createLineBreak();
      case LunDocCompilerPackage.FOR_LOOP_START: return createForLoopStart();
      case LunDocCompilerPackage.FOR_LOOP_END: return createForLoopEnd();
      case LunDocCompilerPackage.PRINTED_EXPRESSION: return createPrintedExpression();
      case LunDocCompilerPackage.IF_CONDITION_START: return createIfConditionStart();
      case LunDocCompilerPackage.ELSE_IF_CONDITION: return createElseIfCondition();
      case LunDocCompilerPackage.ELSE_START: return createElseStart();
      case LunDocCompilerPackage.END_IF: return createEndIf();
      case LunDocCompilerPackage.MARKUP: return createMarkup();
      case LunDocCompilerPackage.H1_START: return createH1Start();
      case LunDocCompilerPackage.H1_END: return createH1End();
      case LunDocCompilerPackage.H2_START: return createH2Start();
      case LunDocCompilerPackage.H2_END: return createH2End();
      case LunDocCompilerPackage.H3_START: return createH3Start();
      case LunDocCompilerPackage.H3_END: return createH3End();
      case LunDocCompilerPackage.H4_START: return createH4Start();
      case LunDocCompilerPackage.H4_END: return createH4End();
      case LunDocCompilerPackage.H5_START: return createH5Start();
      case LunDocCompilerPackage.H5_END: return createH5End();
      case LunDocCompilerPackage.H6_START: return createH6Start();
      case LunDocCompilerPackage.H6_END: return createH6End();
      case LunDocCompilerPackage.EXAMPLE_START: return createExampleStart();
      case LunDocCompilerPackage.EXAMPLE_END: return createExampleEnd();
      case LunDocCompilerPackage.URL_START: return createURLStart();
      case LunDocCompilerPackage.URL_END: return createURLEnd();
      case LunDocCompilerPackage.REF_START: return createRefStart();
      case LunDocCompilerPackage.REF_END: return createRefEnd();
      case LunDocCompilerPackage.BOLD_START: return createBoldStart();
      case LunDocCompilerPackage.BOLD_END: return createBoldEnd();
      case LunDocCompilerPackage.UNDERLINE_START: return createUnderlineStart();
      case LunDocCompilerPackage.UNDERLINE_END: return createUnderlineEnd();
      case LunDocCompilerPackage.ITALIC_START: return createItalicStart();
      case LunDocCompilerPackage.ITALIC_END: return createItalicEnd();
      case LunDocCompilerPackage.SPAN_START: return createSpanStart();
      case LunDocCompilerPackage.SPAN_END: return createSpanEnd();
      case LunDocCompilerPackage.IMG_START: return createImgStart();
      case LunDocCompilerPackage.IMG_END: return createImgEnd();
      case LunDocCompilerPackage.MAILTO_START: return createMailtoStart();
      case LunDocCompilerPackage.MAILTO_END: return createMailtoEnd();
      case LunDocCompilerPackage.SKYPE_START: return createSkypeStart();
      case LunDocCompilerPackage.SKYPE_END: return createSkypeEnd();
      case LunDocCompilerPackage.MOVIE_START: return createMovieStart();
      case LunDocCompilerPackage.MOVIE_END: return createMovieEnd();
      case LunDocCompilerPackage.CODE_START: return createCodeStart();
      case LunDocCompilerPackage.CODE_END: return createCodeEnd();
      case LunDocCompilerPackage.TABLE_START: return createTableStart();
      case LunDocCompilerPackage.TABLE_END: return createTableEnd();
      case LunDocCompilerPackage.TABLE_ROW_START: return createTableRowStart();
      case LunDocCompilerPackage.TABLE_ROW_END: return createTableRowEnd();
      case LunDocCompilerPackage.TABLE_CELL_START: return createTableCellStart();
      case LunDocCompilerPackage.TABLE_CELL_END: return createTableCellEnd();
      case LunDocCompilerPackage.LIST_START: return createListStart();
      case LunDocCompilerPackage.LIST_END: return createListEnd();
      case LunDocCompilerPackage.ORDERED_LIST_START: return createOrderedListStart();
      case LunDocCompilerPackage.ORDERED_LIST_END: return createOrderedListEnd();
      case LunDocCompilerPackage.LIST_ELEMENT_START: return createListElementStart();
      case LunDocCompilerPackage.LIST_ELEMENT_END: return createListElementEnd();
      case LunDocCompilerPackage.CHAPTER_START: return createChapterStart();
      case LunDocCompilerPackage.CHAPTER_END: return createChapterEnd();
      case LunDocCompilerPackage.SECTION_START: return createSectionStart();
      case LunDocCompilerPackage.SECTION_END: return createSectionEnd();
      case LunDocCompilerPackage.SUB_SECTION_START: return createSubSectionStart();
      case LunDocCompilerPackage.SUB_SECTION_END: return createSubSectionEnd();
      case LunDocCompilerPackage.OPEN_VIEW_START: return createOpenViewStart();
      case LunDocCompilerPackage.OPEN_VIEW_END: return createOpenViewEnd();
      case LunDocCompilerPackage.START_PROCESS_START: return createStartProcessStart();
      case LunDocCompilerPackage.START_PROCESS_END: return createStartProcessEnd();
      case LunDocCompilerPackage.ENTITY_REF_START: return createEntityRefStart();
      case LunDocCompilerPackage.ENTITY_REF_END: return createEntityRefEnd();
      case LunDocCompilerPackage.DTO_REF_START: return createDTORefStart();
      case LunDocCompilerPackage.DTO_REF_END: return createDTORefEnd();
      case LunDocCompilerPackage.PROCESS_REF_START: return createProcessRefStart();
      case LunDocCompilerPackage.PROCESS_REF_END: return createProcessRefEnd();
      case LunDocCompilerPackage.TASK_REF_START: return createTaskRefStart();
      case LunDocCompilerPackage.TASK_REF_END: return createTaskRefEnd();
      case LunDocCompilerPackage.VIEW_REF_START: return createViewRefStart();
      case LunDocCompilerPackage.VIEW_REF_END: return createViewRefEnd();
      case LunDocCompilerPackage.UI_REF_START: return createUIRefStart();
      case LunDocCompilerPackage.UI_REF_END: return createUIRefEnd();
      case LunDocCompilerPackage.BOX_START: return createBoxStart();
      case LunDocCompilerPackage.BOX_END: return createBoxEnd();
      case LunDocCompilerPackage.CONTAINER_START: return createContainerStart();
      case LunDocCompilerPackage.CONTAINER_END: return createContainerEnd();
      case LunDocCompilerPackage.COLUMN_LAYOUT_START: return createColumnLayoutStart();
      case LunDocCompilerPackage.COLUMN_LAYOUT_END: return createColumnLayoutEnd();
      case LunDocCompilerPackage.COLUMN_START: return createColumnStart();
      case LunDocCompilerPackage.COLUMN_END: return createColumnEnd();
      case LunDocCompilerPackage.FOOTER_START: return createFooterStart();
      case LunDocCompilerPackage.FOOTER_END: return createFooterEnd();
      case LunDocCompilerPackage.HEADER_START: return createHeaderStart();
      case LunDocCompilerPackage.HEADER_END: return createHeaderEnd();
      case LunDocCompilerPackage.INDEX_START: return createIndexStart();
      case LunDocCompilerPackage.INDEX_END: return createIndexEnd();
      case LunDocCompilerPackage.INDEX_ELEMENT_START: return createIndexElementStart();
      case LunDocCompilerPackage.INDEX_ELEMENT_END: return createIndexElementEnd();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentStart createDocumentStart()
  {
    DocumentStartImpl documentStart = new DocumentStartImpl();
    return documentStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentEnd createDocumentEnd()
  {
    DocumentEndImpl documentEnd = new DocumentEndImpl();
    return documentEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessedRichString createProcessedRichString()
  {
    ProcessedRichStringImpl processedRichString = new ProcessedRichStringImpl();
    return processedRichString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Line createLine()
  {
    LineImpl line = new LineImpl();
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinePart createLinePart()
  {
    LinePartImpl linePart = new LinePartImpl();
    return linePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineBreak createLineBreak()
  {
    LineBreakImpl lineBreak = new LineBreakImpl();
    return lineBreak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForLoopStart createForLoopStart()
  {
    ForLoopStartImpl forLoopStart = new ForLoopStartImpl();
    return forLoopStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForLoopEnd createForLoopEnd()
  {
    ForLoopEndImpl forLoopEnd = new ForLoopEndImpl();
    return forLoopEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrintedExpression createPrintedExpression()
  {
    PrintedExpressionImpl printedExpression = new PrintedExpressionImpl();
    return printedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfConditionStart createIfConditionStart()
  {
    IfConditionStartImpl ifConditionStart = new IfConditionStartImpl();
    return ifConditionStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseIfCondition createElseIfCondition()
  {
    ElseIfConditionImpl elseIfCondition = new ElseIfConditionImpl();
    return elseIfCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseStart createElseStart()
  {
    ElseStartImpl elseStart = new ElseStartImpl();
    return elseStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndIf createEndIf()
  {
    EndIfImpl endIf = new EndIfImpl();
    return endIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Markup createMarkup()
  {
    MarkupImpl markup = new MarkupImpl();
    return markup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public H1Start createH1Start()
  {
    H1StartImpl h1Start = new H1StartImpl();
    return h1Start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public H1End createH1End()
  {
    H1EndImpl h1End = new H1EndImpl();
    return h1End;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public H2Start createH2Start()
  {
    H2StartImpl h2Start = new H2StartImpl();
    return h2Start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public H2End createH2End()
  {
    H2EndImpl h2End = new H2EndImpl();
    return h2End;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public H3Start createH3Start()
  {
    H3StartImpl h3Start = new H3StartImpl();
    return h3Start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public H3End createH3End()
  {
    H3EndImpl h3End = new H3EndImpl();
    return h3End;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public H4Start createH4Start()
  {
    H4StartImpl h4Start = new H4StartImpl();
    return h4Start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public H4End createH4End()
  {
    H4EndImpl h4End = new H4EndImpl();
    return h4End;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public H5Start createH5Start()
  {
    H5StartImpl h5Start = new H5StartImpl();
    return h5Start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public H5End createH5End()
  {
    H5EndImpl h5End = new H5EndImpl();
    return h5End;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public H6Start createH6Start()
  {
    H6StartImpl h6Start = new H6StartImpl();
    return h6Start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public H6End createH6End()
  {
    H6EndImpl h6End = new H6EndImpl();
    return h6End;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExampleStart createExampleStart()
  {
    ExampleStartImpl exampleStart = new ExampleStartImpl();
    return exampleStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExampleEnd createExampleEnd()
  {
    ExampleEndImpl exampleEnd = new ExampleEndImpl();
    return exampleEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URLStart createURLStart()
  {
    URLStartImpl urlStart = new URLStartImpl();
    return urlStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URLEnd createURLEnd()
  {
    URLEndImpl urlEnd = new URLEndImpl();
    return urlEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefStart createRefStart()
  {
    RefStartImpl refStart = new RefStartImpl();
    return refStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefEnd createRefEnd()
  {
    RefEndImpl refEnd = new RefEndImpl();
    return refEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoldStart createBoldStart()
  {
    BoldStartImpl boldStart = new BoldStartImpl();
    return boldStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoldEnd createBoldEnd()
  {
    BoldEndImpl boldEnd = new BoldEndImpl();
    return boldEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnderlineStart createUnderlineStart()
  {
    UnderlineStartImpl underlineStart = new UnderlineStartImpl();
    return underlineStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnderlineEnd createUnderlineEnd()
  {
    UnderlineEndImpl underlineEnd = new UnderlineEndImpl();
    return underlineEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItalicStart createItalicStart()
  {
    ItalicStartImpl italicStart = new ItalicStartImpl();
    return italicStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItalicEnd createItalicEnd()
  {
    ItalicEndImpl italicEnd = new ItalicEndImpl();
    return italicEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanStart createSpanStart()
  {
    SpanStartImpl spanStart = new SpanStartImpl();
    return spanStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanEnd createSpanEnd()
  {
    SpanEndImpl spanEnd = new SpanEndImpl();
    return spanEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImgStart createImgStart()
  {
    ImgStartImpl imgStart = new ImgStartImpl();
    return imgStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImgEnd createImgEnd()
  {
    ImgEndImpl imgEnd = new ImgEndImpl();
    return imgEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MailtoStart createMailtoStart()
  {
    MailtoStartImpl mailtoStart = new MailtoStartImpl();
    return mailtoStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MailtoEnd createMailtoEnd()
  {
    MailtoEndImpl mailtoEnd = new MailtoEndImpl();
    return mailtoEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SkypeStart createSkypeStart()
  {
    SkypeStartImpl skypeStart = new SkypeStartImpl();
    return skypeStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SkypeEnd createSkypeEnd()
  {
    SkypeEndImpl skypeEnd = new SkypeEndImpl();
    return skypeEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MovieStart createMovieStart()
  {
    MovieStartImpl movieStart = new MovieStartImpl();
    return movieStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MovieEnd createMovieEnd()
  {
    MovieEndImpl movieEnd = new MovieEndImpl();
    return movieEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeStart createCodeStart()
  {
    CodeStartImpl codeStart = new CodeStartImpl();
    return codeStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeEnd createCodeEnd()
  {
    CodeEndImpl codeEnd = new CodeEndImpl();
    return codeEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableStart createTableStart()
  {
    TableStartImpl tableStart = new TableStartImpl();
    return tableStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableEnd createTableEnd()
  {
    TableEndImpl tableEnd = new TableEndImpl();
    return tableEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableRowStart createTableRowStart()
  {
    TableRowStartImpl tableRowStart = new TableRowStartImpl();
    return tableRowStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableRowEnd createTableRowEnd()
  {
    TableRowEndImpl tableRowEnd = new TableRowEndImpl();
    return tableRowEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableCellStart createTableCellStart()
  {
    TableCellStartImpl tableCellStart = new TableCellStartImpl();
    return tableCellStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableCellEnd createTableCellEnd()
  {
    TableCellEndImpl tableCellEnd = new TableCellEndImpl();
    return tableCellEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListStart createListStart()
  {
    ListStartImpl listStart = new ListStartImpl();
    return listStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListEnd createListEnd()
  {
    ListEndImpl listEnd = new ListEndImpl();
    return listEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderedListStart createOrderedListStart()
  {
    OrderedListStartImpl orderedListStart = new OrderedListStartImpl();
    return orderedListStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderedListEnd createOrderedListEnd()
  {
    OrderedListEndImpl orderedListEnd = new OrderedListEndImpl();
    return orderedListEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListElementStart createListElementStart()
  {
    ListElementStartImpl listElementStart = new ListElementStartImpl();
    return listElementStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListElementEnd createListElementEnd()
  {
    ListElementEndImpl listElementEnd = new ListElementEndImpl();
    return listElementEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChapterStart createChapterStart()
  {
    ChapterStartImpl chapterStart = new ChapterStartImpl();
    return chapterStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChapterEnd createChapterEnd()
  {
    ChapterEndImpl chapterEnd = new ChapterEndImpl();
    return chapterEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionStart createSectionStart()
  {
    SectionStartImpl sectionStart = new SectionStartImpl();
    return sectionStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionEnd createSectionEnd()
  {
    SectionEndImpl sectionEnd = new SectionEndImpl();
    return sectionEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubSectionStart createSubSectionStart()
  {
    SubSectionStartImpl subSectionStart = new SubSectionStartImpl();
    return subSectionStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubSectionEnd createSubSectionEnd()
  {
    SubSectionEndImpl subSectionEnd = new SubSectionEndImpl();
    return subSectionEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenViewStart createOpenViewStart()
  {
    OpenViewStartImpl openViewStart = new OpenViewStartImpl();
    return openViewStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenViewEnd createOpenViewEnd()
  {
    OpenViewEndImpl openViewEnd = new OpenViewEndImpl();
    return openViewEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartProcessStart createStartProcessStart()
  {
    StartProcessStartImpl startProcessStart = new StartProcessStartImpl();
    return startProcessStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartProcessEnd createStartProcessEnd()
  {
    StartProcessEndImpl startProcessEnd = new StartProcessEndImpl();
    return startProcessEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityRefStart createEntityRefStart()
  {
    EntityRefStartImpl entityRefStart = new EntityRefStartImpl();
    return entityRefStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityRefEnd createEntityRefEnd()
  {
    EntityRefEndImpl entityRefEnd = new EntityRefEndImpl();
    return entityRefEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTORefStart createDTORefStart()
  {
    DTORefStartImpl dtoRefStart = new DTORefStartImpl();
    return dtoRefStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTORefEnd createDTORefEnd()
  {
    DTORefEndImpl dtoRefEnd = new DTORefEndImpl();
    return dtoRefEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessRefStart createProcessRefStart()
  {
    ProcessRefStartImpl processRefStart = new ProcessRefStartImpl();
    return processRefStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessRefEnd createProcessRefEnd()
  {
    ProcessRefEndImpl processRefEnd = new ProcessRefEndImpl();
    return processRefEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskRefStart createTaskRefStart()
  {
    TaskRefStartImpl taskRefStart = new TaskRefStartImpl();
    return taskRefStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskRefEnd createTaskRefEnd()
  {
    TaskRefEndImpl taskRefEnd = new TaskRefEndImpl();
    return taskRefEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewRefStart createViewRefStart()
  {
    ViewRefStartImpl viewRefStart = new ViewRefStartImpl();
    return viewRefStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewRefEnd createViewRefEnd()
  {
    ViewRefEndImpl viewRefEnd = new ViewRefEndImpl();
    return viewRefEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIRefStart createUIRefStart()
  {
    UIRefStartImpl uiRefStart = new UIRefStartImpl();
    return uiRefStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIRefEnd createUIRefEnd()
  {
    UIRefEndImpl uiRefEnd = new UIRefEndImpl();
    return uiRefEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoxStart createBoxStart()
  {
    BoxStartImpl boxStart = new BoxStartImpl();
    return boxStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoxEnd createBoxEnd()
  {
    BoxEndImpl boxEnd = new BoxEndImpl();
    return boxEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerStart createContainerStart()
  {
    ContainerStartImpl containerStart = new ContainerStartImpl();
    return containerStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerEnd createContainerEnd()
  {
    ContainerEndImpl containerEnd = new ContainerEndImpl();
    return containerEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnLayoutStart createColumnLayoutStart()
  {
    ColumnLayoutStartImpl columnLayoutStart = new ColumnLayoutStartImpl();
    return columnLayoutStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnLayoutEnd createColumnLayoutEnd()
  {
    ColumnLayoutEndImpl columnLayoutEnd = new ColumnLayoutEndImpl();
    return columnLayoutEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnStart createColumnStart()
  {
    ColumnStartImpl columnStart = new ColumnStartImpl();
    return columnStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnEnd createColumnEnd()
  {
    ColumnEndImpl columnEnd = new ColumnEndImpl();
    return columnEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FooterStart createFooterStart()
  {
    FooterStartImpl footerStart = new FooterStartImpl();
    return footerStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FooterEnd createFooterEnd()
  {
    FooterEndImpl footerEnd = new FooterEndImpl();
    return footerEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderStart createHeaderStart()
  {
    HeaderStartImpl headerStart = new HeaderStartImpl();
    return headerStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderEnd createHeaderEnd()
  {
    HeaderEndImpl headerEnd = new HeaderEndImpl();
    return headerEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexStart createIndexStart()
  {
    IndexStartImpl indexStart = new IndexStartImpl();
    return indexStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexEnd createIndexEnd()
  {
    IndexEndImpl indexEnd = new IndexEndImpl();
    return indexEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexElementStart createIndexElementStart()
  {
    IndexElementStartImpl indexElementStart = new IndexElementStartImpl();
    return indexElementStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexElementEnd createIndexElementEnd()
  {
    IndexElementEndImpl indexElementEnd = new IndexElementEndImpl();
    return indexElementEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LunDocCompilerPackage getLunDocCompilerPackage()
  {
    return (LunDocCompilerPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LunDocCompilerPackage getPackage()
  {
    return LunDocCompilerPackage.eINSTANCE;
  }

} //LunDocCompilerFactoryImpl
