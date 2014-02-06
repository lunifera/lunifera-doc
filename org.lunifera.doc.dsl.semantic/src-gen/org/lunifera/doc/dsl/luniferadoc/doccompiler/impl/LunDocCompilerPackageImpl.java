/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.xbase.XbasePackage;

import org.lunifera.doc.dsl.luniferadoc.LunDocPackage;

import org.lunifera.doc.dsl.luniferadoc.doccompiler.BoldEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.BoldStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.BoxEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.BoxStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ChapterEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ChapterStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.CodeEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.CodeStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ColumnEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ColumnLayoutEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ColumnLayoutStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ColumnStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ContainerEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ContainerStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.DTORefEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.DTORefStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.DocumentEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.DocumentStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ElseIfCondition;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ElseStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.EndIf;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.EntityRefEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.EntityRefStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ExampleEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ExampleStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.FooterEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.FooterStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ForLoopEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ForLoopStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.H1End;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.H1Start;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.H2End;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.H2Start;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.H3End;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.H3Start;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.H4End;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.H4Start;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.H5End;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.H5Start;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.H6End;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.H6Start;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.HeaderEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.HeaderStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.IfConditionStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ImgEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ImgStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.IndexElementEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.IndexElementStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.IndexEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.IndexStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ItalicEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ItalicStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.Line;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.LineBreak;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.LinePart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ListElementEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ListElementStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ListEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ListStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.Literal;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerFactory;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.MailtoEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.MailtoStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.Markup;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.MovieEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.MovieStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.OpenViewEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.OpenViewStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.OrderedListEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.OrderedListStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.PrintedExpression;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ProcessRefEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ProcessRefStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ProcessedRichString;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.RefEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.RefStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.SectionEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.SectionStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.SkypeEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.SkypeStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.SpanEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.SpanStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.StartProcessEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.StartProcessStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.SubSectionEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.SubSectionStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.TableCellEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.TableCellStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.TableEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.TableRowEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.TableRowStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.TableStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.TaskRefEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.TaskRefStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.UIRefEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.UIRefStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.URLEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.URLStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.UnderlineEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.UnderlineStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ViewRefEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ViewRefStart;

import org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LunDocCompilerPackageImpl extends EPackageImpl implements LunDocCompilerPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processedRichStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linePartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineBreakEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forLoopStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forLoopEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass printedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifConditionStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elseIfConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elseStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endIfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass markupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass h1StartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass h1EndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass h2StartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass h2EndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass h3StartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass h3EndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass h4StartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass h4EndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass h5StartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass h5EndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass h6StartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass h6EndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exampleStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exampleEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boldStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boldEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass underlineStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass underlineEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass italicStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass italicEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imgStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imgEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mailtoStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mailtoEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass skypeStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass skypeEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass movieStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass movieEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableRowStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableRowEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableCellStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableCellEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderedListStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderedListEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listElementStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listElementEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chapterStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chapterEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subSectionStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subSectionEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass openViewStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass openViewEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startProcessStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startProcessEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityRefStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityRefEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dtoRefStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dtoRefEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processRefStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processRefEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskRefStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskRefEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewRefStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewRefEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiRefStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiRefEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boxStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boxEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnLayoutStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnLayoutEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass footerStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass footerEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexElementStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexElementEndEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LunDocCompilerPackageImpl()
  {
    super(eNS_URI, LunDocCompilerFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link LunDocCompilerPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LunDocCompilerPackage init()
  {
    if (isInited) return (LunDocCompilerPackage)EPackage.Registry.INSTANCE.getEPackage(LunDocCompilerPackage.eNS_URI);

    // Obtain or create and register package
    LunDocCompilerPackageImpl theLunDocCompilerPackage = (LunDocCompilerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LunDocCompilerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LunDocCompilerPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLunDocCompilerPackage.createPackageContents();

    // Initialize created meta-data
    theLunDocCompilerPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLunDocCompilerPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LunDocCompilerPackage.eNS_URI, theLunDocCompilerPackage);
    return theLunDocCompilerPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentStart()
  {
    return documentStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentStart_Content()
  {
    return (EReference)documentStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentStart_End()
  {
    return (EReference)documentStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentStart_Document()
  {
    return (EReference)documentStartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentEnd()
  {
    return documentEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentEnd_Start()
  {
    return (EReference)documentEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessedRichString()
  {
    return processedRichStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessedRichString_RichString()
  {
    return (EReference)processedRichStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessedRichString_Lines()
  {
    return (EReference)processedRichStringEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLine()
  {
    return lineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLine_Parts()
  {
    return (EReference)lineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLine_RichString()
  {
    return (EReference)lineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinePart()
  {
    return linePartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinePart_Line()
  {
    return (EReference)linePartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteral_Literal()
  {
    return (EReference)literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_Offset()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_Length()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLineBreak()
  {
    return lineBreakEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForLoopStart()
  {
    return forLoopStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForLoopStart_Loop()
  {
    return (EReference)forLoopStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForLoopStart_End()
  {
    return (EReference)forLoopStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForLoopEnd()
  {
    return forLoopEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForLoopEnd_Start()
  {
    return (EReference)forLoopEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrintedExpression()
  {
    return printedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrintedExpression_Expression()
  {
    return (EReference)printedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfConditionStart()
  {
    return ifConditionStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfConditionStart_RichStringIf()
  {
    return (EReference)ifConditionStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfConditionStart_ElseStart()
  {
    return (EReference)ifConditionStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfConditionStart_ElseIfConditions()
  {
    return (EReference)ifConditionStartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfConditionStart_EndIf()
  {
    return (EReference)ifConditionStartEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElseIfCondition()
  {
    return elseIfConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseIfCondition_RichStringElseIf()
  {
    return (EReference)elseIfConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseIfCondition_IfConditionStart()
  {
    return (EReference)elseIfConditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElseStart()
  {
    return elseStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseStart_IfConditionStart()
  {
    return (EReference)elseStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEndIf()
  {
    return endIfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEndIf_IfConditionStart()
  {
    return (EReference)endIfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMarkup()
  {
    return markupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMarkup_Markup()
  {
    return (EReference)markupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getH1Start()
  {
    return h1StartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH1Start_Content()
  {
    return (EReference)h1StartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH1Start_End()
  {
    return (EReference)h1StartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getH1End()
  {
    return h1EndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH1End_Start()
  {
    return (EReference)h1EndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getH2Start()
  {
    return h2StartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH2Start_Content()
  {
    return (EReference)h2StartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH2Start_End()
  {
    return (EReference)h2StartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getH2End()
  {
    return h2EndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH2End_Start()
  {
    return (EReference)h2EndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getH3Start()
  {
    return h3StartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH3Start_Content()
  {
    return (EReference)h3StartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH3Start_End()
  {
    return (EReference)h3StartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getH3End()
  {
    return h3EndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH3End_Start()
  {
    return (EReference)h3EndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getH4Start()
  {
    return h4StartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH4Start_Content()
  {
    return (EReference)h4StartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH4Start_End()
  {
    return (EReference)h4StartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getH4End()
  {
    return h4EndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH4End_Start()
  {
    return (EReference)h4EndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getH5Start()
  {
    return h5StartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH5Start_Content()
  {
    return (EReference)h5StartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH5Start_End()
  {
    return (EReference)h5StartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getH5End()
  {
    return h5EndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH5End_Start()
  {
    return (EReference)h5EndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getH6Start()
  {
    return h6StartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH6Start_Content()
  {
    return (EReference)h6StartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH6Start_End()
  {
    return (EReference)h6StartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getH6End()
  {
    return h6EndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getH6End_Start()
  {
    return (EReference)h6EndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExampleStart()
  {
    return exampleStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExampleStart_Content()
  {
    return (EReference)exampleStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExampleStart_End()
  {
    return (EReference)exampleStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExampleEnd()
  {
    return exampleEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExampleEnd_Start()
  {
    return (EReference)exampleEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getURLStart()
  {
    return urlStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getURLStart_Content()
  {
    return (EReference)urlStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getURLStart_End()
  {
    return (EReference)urlStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getURLEnd()
  {
    return urlEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getURLEnd_Start()
  {
    return (EReference)urlEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefStart()
  {
    return refStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefStart_Content()
  {
    return (EReference)refStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefStart_End()
  {
    return (EReference)refStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefEnd()
  {
    return refEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefEnd_Start()
  {
    return (EReference)refEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoldStart()
  {
    return boldStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoldStart_Content()
  {
    return (EReference)boldStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoldStart_End()
  {
    return (EReference)boldStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoldEnd()
  {
    return boldEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoldEnd_Start()
  {
    return (EReference)boldEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnderlineStart()
  {
    return underlineStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnderlineStart_Content()
  {
    return (EReference)underlineStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnderlineStart_End()
  {
    return (EReference)underlineStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnderlineEnd()
  {
    return underlineEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnderlineEnd_Start()
  {
    return (EReference)underlineEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItalicStart()
  {
    return italicStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItalicStart_Content()
  {
    return (EReference)italicStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItalicStart_End()
  {
    return (EReference)italicStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItalicEnd()
  {
    return italicEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItalicEnd_Start()
  {
    return (EReference)italicEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanStart()
  {
    return spanStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpanStart_Content()
  {
    return (EReference)spanStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpanStart_End()
  {
    return (EReference)spanStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanEnd()
  {
    return spanEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpanEnd_Start()
  {
    return (EReference)spanEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImgStart()
  {
    return imgStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImgStart_Content()
  {
    return (EReference)imgStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImgStart_End()
  {
    return (EReference)imgStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImgEnd()
  {
    return imgEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImgEnd_Start()
  {
    return (EReference)imgEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMailtoStart()
  {
    return mailtoStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMailtoStart_Content()
  {
    return (EReference)mailtoStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMailtoStart_End()
  {
    return (EReference)mailtoStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMailtoEnd()
  {
    return mailtoEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMailtoEnd_Start()
  {
    return (EReference)mailtoEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSkypeStart()
  {
    return skypeStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSkypeStart_Content()
  {
    return (EReference)skypeStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSkypeStart_End()
  {
    return (EReference)skypeStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSkypeEnd()
  {
    return skypeEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSkypeEnd_Start()
  {
    return (EReference)skypeEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMovieStart()
  {
    return movieStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMovieStart_Content()
  {
    return (EReference)movieStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMovieStart_End()
  {
    return (EReference)movieStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMovieEnd()
  {
    return movieEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMovieEnd_Start()
  {
    return (EReference)movieEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeStart()
  {
    return codeStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeStart_Content()
  {
    return (EReference)codeStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeStart_End()
  {
    return (EReference)codeStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeEnd()
  {
    return codeEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeEnd_Start()
  {
    return (EReference)codeEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableStart()
  {
    return tableStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableStart_Content()
  {
    return (EReference)tableStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableStart_End()
  {
    return (EReference)tableStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableEnd()
  {
    return tableEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableEnd_Start()
  {
    return (EReference)tableEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableRowStart()
  {
    return tableRowStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableRowStart_Content()
  {
    return (EReference)tableRowStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableRowStart_End()
  {
    return (EReference)tableRowStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableRowEnd()
  {
    return tableRowEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableRowEnd_Start()
  {
    return (EReference)tableRowEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableCellStart()
  {
    return tableCellStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableCellStart_Content()
  {
    return (EReference)tableCellStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableCellStart_End()
  {
    return (EReference)tableCellStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableCellEnd()
  {
    return tableCellEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableCellEnd_Start()
  {
    return (EReference)tableCellEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListStart()
  {
    return listStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListStart_Content()
  {
    return (EReference)listStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListStart_End()
  {
    return (EReference)listStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListEnd()
  {
    return listEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListEnd_Start()
  {
    return (EReference)listEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrderedListStart()
  {
    return orderedListStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrderedListStart_Content()
  {
    return (EReference)orderedListStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrderedListStart_End()
  {
    return (EReference)orderedListStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrderedListEnd()
  {
    return orderedListEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrderedListEnd_Start()
  {
    return (EReference)orderedListEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListElementStart()
  {
    return listElementStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListElementStart_Content()
  {
    return (EReference)listElementStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListElementStart_End()
  {
    return (EReference)listElementStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListElementEnd()
  {
    return listElementEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListElementEnd_Start()
  {
    return (EReference)listElementEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChapterStart()
  {
    return chapterStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChapterStart_Content()
  {
    return (EReference)chapterStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChapterStart_End()
  {
    return (EReference)chapterStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChapterEnd()
  {
    return chapterEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChapterEnd_Start()
  {
    return (EReference)chapterEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSectionStart()
  {
    return sectionStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSectionStart_Content()
  {
    return (EReference)sectionStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSectionStart_End()
  {
    return (EReference)sectionStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSectionEnd()
  {
    return sectionEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSectionEnd_Start()
  {
    return (EReference)sectionEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubSectionStart()
  {
    return subSectionStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubSectionStart_Content()
  {
    return (EReference)subSectionStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubSectionStart_End()
  {
    return (EReference)subSectionStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubSectionEnd()
  {
    return subSectionEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubSectionEnd_Start()
  {
    return (EReference)subSectionEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOpenViewStart()
  {
    return openViewStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpenViewStart_Content()
  {
    return (EReference)openViewStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpenViewStart_End()
  {
    return (EReference)openViewStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOpenViewEnd()
  {
    return openViewEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpenViewEnd_Start()
  {
    return (EReference)openViewEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStartProcessStart()
  {
    return startProcessStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStartProcessStart_Content()
  {
    return (EReference)startProcessStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStartProcessStart_End()
  {
    return (EReference)startProcessStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStartProcessEnd()
  {
    return startProcessEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStartProcessEnd_Start()
  {
    return (EReference)startProcessEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityRefStart()
  {
    return entityRefStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityRefStart_Content()
  {
    return (EReference)entityRefStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityRefStart_End()
  {
    return (EReference)entityRefStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityRefEnd()
  {
    return entityRefEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityRefEnd_Start()
  {
    return (EReference)entityRefEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDTORefStart()
  {
    return dtoRefStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDTORefStart_Content()
  {
    return (EReference)dtoRefStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDTORefStart_End()
  {
    return (EReference)dtoRefStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDTORefEnd()
  {
    return dtoRefEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDTORefEnd_Start()
  {
    return (EReference)dtoRefEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessRefStart()
  {
    return processRefStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessRefStart_Content()
  {
    return (EReference)processRefStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessRefStart_End()
  {
    return (EReference)processRefStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessRefEnd()
  {
    return processRefEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessRefEnd_Start()
  {
    return (EReference)processRefEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskRefStart()
  {
    return taskRefStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskRefStart_Content()
  {
    return (EReference)taskRefStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskRefStart_End()
  {
    return (EReference)taskRefStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskRefEnd()
  {
    return taskRefEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskRefEnd_Start()
  {
    return (EReference)taskRefEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewRefStart()
  {
    return viewRefStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewRefStart_Content()
  {
    return (EReference)viewRefStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewRefStart_End()
  {
    return (EReference)viewRefStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewRefEnd()
  {
    return viewRefEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewRefEnd_Start()
  {
    return (EReference)viewRefEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIRefStart()
  {
    return uiRefStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIRefStart_Content()
  {
    return (EReference)uiRefStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIRefStart_End()
  {
    return (EReference)uiRefStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIRefEnd()
  {
    return uiRefEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIRefEnd_Start()
  {
    return (EReference)uiRefEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoxStart()
  {
    return boxStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxStart_Content()
  {
    return (EReference)boxStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxStart_End()
  {
    return (EReference)boxStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoxEnd()
  {
    return boxEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxEnd_Start()
  {
    return (EReference)boxEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerStart()
  {
    return containerStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerStart_Content()
  {
    return (EReference)containerStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerStart_End()
  {
    return (EReference)containerStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerEnd()
  {
    return containerEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerEnd_Start()
  {
    return (EReference)containerEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnLayoutStart()
  {
    return columnLayoutStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnLayoutStart_Content()
  {
    return (EReference)columnLayoutStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnLayoutStart_End()
  {
    return (EReference)columnLayoutStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnLayoutEnd()
  {
    return columnLayoutEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnLayoutEnd_Start()
  {
    return (EReference)columnLayoutEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnStart()
  {
    return columnStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnStart_Content()
  {
    return (EReference)columnStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnStart_End()
  {
    return (EReference)columnStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnEnd()
  {
    return columnEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnEnd_Start()
  {
    return (EReference)columnEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFooterStart()
  {
    return footerStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFooterStart_Content()
  {
    return (EReference)footerStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFooterStart_End()
  {
    return (EReference)footerStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFooterEnd()
  {
    return footerEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFooterEnd_Start()
  {
    return (EReference)footerEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeaderStart()
  {
    return headerStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHeaderStart_Content()
  {
    return (EReference)headerStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHeaderStart_End()
  {
    return (EReference)headerStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeaderEnd()
  {
    return headerEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHeaderEnd_Start()
  {
    return (EReference)headerEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexStart()
  {
    return indexStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexStart_Content()
  {
    return (EReference)indexStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexStart_End()
  {
    return (EReference)indexStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexEnd()
  {
    return indexEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexEnd_Start()
  {
    return (EReference)indexEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexElementStart()
  {
    return indexElementStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexElementStart_Content()
  {
    return (EReference)indexElementStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexElementStart_End()
  {
    return (EReference)indexElementStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexElementEnd()
  {
    return indexElementEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexElementEnd_Start()
  {
    return (EReference)indexElementEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LunDocCompilerFactory getLunDocCompilerFactory()
  {
    return (LunDocCompilerFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    documentStartEClass = createEClass(DOCUMENT_START);
    createEReference(documentStartEClass, DOCUMENT_START__CONTENT);
    createEReference(documentStartEClass, DOCUMENT_START__END);
    createEReference(documentStartEClass, DOCUMENT_START__DOCUMENT);

    documentEndEClass = createEClass(DOCUMENT_END);
    createEReference(documentEndEClass, DOCUMENT_END__START);

    processedRichStringEClass = createEClass(PROCESSED_RICH_STRING);
    createEReference(processedRichStringEClass, PROCESSED_RICH_STRING__RICH_STRING);
    createEReference(processedRichStringEClass, PROCESSED_RICH_STRING__LINES);

    lineEClass = createEClass(LINE);
    createEReference(lineEClass, LINE__PARTS);
    createEReference(lineEClass, LINE__RICH_STRING);

    linePartEClass = createEClass(LINE_PART);
    createEReference(linePartEClass, LINE_PART__LINE);

    literalEClass = createEClass(LITERAL);
    createEReference(literalEClass, LITERAL__LITERAL);
    createEAttribute(literalEClass, LITERAL__OFFSET);
    createEAttribute(literalEClass, LITERAL__LENGTH);

    lineBreakEClass = createEClass(LINE_BREAK);

    forLoopStartEClass = createEClass(FOR_LOOP_START);
    createEReference(forLoopStartEClass, FOR_LOOP_START__LOOP);
    createEReference(forLoopStartEClass, FOR_LOOP_START__END);

    forLoopEndEClass = createEClass(FOR_LOOP_END);
    createEReference(forLoopEndEClass, FOR_LOOP_END__START);

    printedExpressionEClass = createEClass(PRINTED_EXPRESSION);
    createEReference(printedExpressionEClass, PRINTED_EXPRESSION__EXPRESSION);

    ifConditionStartEClass = createEClass(IF_CONDITION_START);
    createEReference(ifConditionStartEClass, IF_CONDITION_START__RICH_STRING_IF);
    createEReference(ifConditionStartEClass, IF_CONDITION_START__ELSE_START);
    createEReference(ifConditionStartEClass, IF_CONDITION_START__ELSE_IF_CONDITIONS);
    createEReference(ifConditionStartEClass, IF_CONDITION_START__END_IF);

    elseIfConditionEClass = createEClass(ELSE_IF_CONDITION);
    createEReference(elseIfConditionEClass, ELSE_IF_CONDITION__RICH_STRING_ELSE_IF);
    createEReference(elseIfConditionEClass, ELSE_IF_CONDITION__IF_CONDITION_START);

    elseStartEClass = createEClass(ELSE_START);
    createEReference(elseStartEClass, ELSE_START__IF_CONDITION_START);

    endIfEClass = createEClass(END_IF);
    createEReference(endIfEClass, END_IF__IF_CONDITION_START);

    markupEClass = createEClass(MARKUP);
    createEReference(markupEClass, MARKUP__MARKUP);

    h1StartEClass = createEClass(H1_START);
    createEReference(h1StartEClass, H1_START__CONTENT);
    createEReference(h1StartEClass, H1_START__END);

    h1EndEClass = createEClass(H1_END);
    createEReference(h1EndEClass, H1_END__START);

    h2StartEClass = createEClass(H2_START);
    createEReference(h2StartEClass, H2_START__CONTENT);
    createEReference(h2StartEClass, H2_START__END);

    h2EndEClass = createEClass(H2_END);
    createEReference(h2EndEClass, H2_END__START);

    h3StartEClass = createEClass(H3_START);
    createEReference(h3StartEClass, H3_START__CONTENT);
    createEReference(h3StartEClass, H3_START__END);

    h3EndEClass = createEClass(H3_END);
    createEReference(h3EndEClass, H3_END__START);

    h4StartEClass = createEClass(H4_START);
    createEReference(h4StartEClass, H4_START__CONTENT);
    createEReference(h4StartEClass, H4_START__END);

    h4EndEClass = createEClass(H4_END);
    createEReference(h4EndEClass, H4_END__START);

    h5StartEClass = createEClass(H5_START);
    createEReference(h5StartEClass, H5_START__CONTENT);
    createEReference(h5StartEClass, H5_START__END);

    h5EndEClass = createEClass(H5_END);
    createEReference(h5EndEClass, H5_END__START);

    h6StartEClass = createEClass(H6_START);
    createEReference(h6StartEClass, H6_START__CONTENT);
    createEReference(h6StartEClass, H6_START__END);

    h6EndEClass = createEClass(H6_END);
    createEReference(h6EndEClass, H6_END__START);

    exampleStartEClass = createEClass(EXAMPLE_START);
    createEReference(exampleStartEClass, EXAMPLE_START__CONTENT);
    createEReference(exampleStartEClass, EXAMPLE_START__END);

    exampleEndEClass = createEClass(EXAMPLE_END);
    createEReference(exampleEndEClass, EXAMPLE_END__START);

    urlStartEClass = createEClass(URL_START);
    createEReference(urlStartEClass, URL_START__CONTENT);
    createEReference(urlStartEClass, URL_START__END);

    urlEndEClass = createEClass(URL_END);
    createEReference(urlEndEClass, URL_END__START);

    refStartEClass = createEClass(REF_START);
    createEReference(refStartEClass, REF_START__CONTENT);
    createEReference(refStartEClass, REF_START__END);

    refEndEClass = createEClass(REF_END);
    createEReference(refEndEClass, REF_END__START);

    boldStartEClass = createEClass(BOLD_START);
    createEReference(boldStartEClass, BOLD_START__CONTENT);
    createEReference(boldStartEClass, BOLD_START__END);

    boldEndEClass = createEClass(BOLD_END);
    createEReference(boldEndEClass, BOLD_END__START);

    underlineStartEClass = createEClass(UNDERLINE_START);
    createEReference(underlineStartEClass, UNDERLINE_START__CONTENT);
    createEReference(underlineStartEClass, UNDERLINE_START__END);

    underlineEndEClass = createEClass(UNDERLINE_END);
    createEReference(underlineEndEClass, UNDERLINE_END__START);

    italicStartEClass = createEClass(ITALIC_START);
    createEReference(italicStartEClass, ITALIC_START__CONTENT);
    createEReference(italicStartEClass, ITALIC_START__END);

    italicEndEClass = createEClass(ITALIC_END);
    createEReference(italicEndEClass, ITALIC_END__START);

    spanStartEClass = createEClass(SPAN_START);
    createEReference(spanStartEClass, SPAN_START__CONTENT);
    createEReference(spanStartEClass, SPAN_START__END);

    spanEndEClass = createEClass(SPAN_END);
    createEReference(spanEndEClass, SPAN_END__START);

    imgStartEClass = createEClass(IMG_START);
    createEReference(imgStartEClass, IMG_START__CONTENT);
    createEReference(imgStartEClass, IMG_START__END);

    imgEndEClass = createEClass(IMG_END);
    createEReference(imgEndEClass, IMG_END__START);

    mailtoStartEClass = createEClass(MAILTO_START);
    createEReference(mailtoStartEClass, MAILTO_START__CONTENT);
    createEReference(mailtoStartEClass, MAILTO_START__END);

    mailtoEndEClass = createEClass(MAILTO_END);
    createEReference(mailtoEndEClass, MAILTO_END__START);

    skypeStartEClass = createEClass(SKYPE_START);
    createEReference(skypeStartEClass, SKYPE_START__CONTENT);
    createEReference(skypeStartEClass, SKYPE_START__END);

    skypeEndEClass = createEClass(SKYPE_END);
    createEReference(skypeEndEClass, SKYPE_END__START);

    movieStartEClass = createEClass(MOVIE_START);
    createEReference(movieStartEClass, MOVIE_START__CONTENT);
    createEReference(movieStartEClass, MOVIE_START__END);

    movieEndEClass = createEClass(MOVIE_END);
    createEReference(movieEndEClass, MOVIE_END__START);

    codeStartEClass = createEClass(CODE_START);
    createEReference(codeStartEClass, CODE_START__CONTENT);
    createEReference(codeStartEClass, CODE_START__END);

    codeEndEClass = createEClass(CODE_END);
    createEReference(codeEndEClass, CODE_END__START);

    tableStartEClass = createEClass(TABLE_START);
    createEReference(tableStartEClass, TABLE_START__CONTENT);
    createEReference(tableStartEClass, TABLE_START__END);

    tableEndEClass = createEClass(TABLE_END);
    createEReference(tableEndEClass, TABLE_END__START);

    tableRowStartEClass = createEClass(TABLE_ROW_START);
    createEReference(tableRowStartEClass, TABLE_ROW_START__CONTENT);
    createEReference(tableRowStartEClass, TABLE_ROW_START__END);

    tableRowEndEClass = createEClass(TABLE_ROW_END);
    createEReference(tableRowEndEClass, TABLE_ROW_END__START);

    tableCellStartEClass = createEClass(TABLE_CELL_START);
    createEReference(tableCellStartEClass, TABLE_CELL_START__CONTENT);
    createEReference(tableCellStartEClass, TABLE_CELL_START__END);

    tableCellEndEClass = createEClass(TABLE_CELL_END);
    createEReference(tableCellEndEClass, TABLE_CELL_END__START);

    listStartEClass = createEClass(LIST_START);
    createEReference(listStartEClass, LIST_START__CONTENT);
    createEReference(listStartEClass, LIST_START__END);

    listEndEClass = createEClass(LIST_END);
    createEReference(listEndEClass, LIST_END__START);

    orderedListStartEClass = createEClass(ORDERED_LIST_START);
    createEReference(orderedListStartEClass, ORDERED_LIST_START__CONTENT);
    createEReference(orderedListStartEClass, ORDERED_LIST_START__END);

    orderedListEndEClass = createEClass(ORDERED_LIST_END);
    createEReference(orderedListEndEClass, ORDERED_LIST_END__START);

    listElementStartEClass = createEClass(LIST_ELEMENT_START);
    createEReference(listElementStartEClass, LIST_ELEMENT_START__CONTENT);
    createEReference(listElementStartEClass, LIST_ELEMENT_START__END);

    listElementEndEClass = createEClass(LIST_ELEMENT_END);
    createEReference(listElementEndEClass, LIST_ELEMENT_END__START);

    chapterStartEClass = createEClass(CHAPTER_START);
    createEReference(chapterStartEClass, CHAPTER_START__CONTENT);
    createEReference(chapterStartEClass, CHAPTER_START__END);

    chapterEndEClass = createEClass(CHAPTER_END);
    createEReference(chapterEndEClass, CHAPTER_END__START);

    sectionStartEClass = createEClass(SECTION_START);
    createEReference(sectionStartEClass, SECTION_START__CONTENT);
    createEReference(sectionStartEClass, SECTION_START__END);

    sectionEndEClass = createEClass(SECTION_END);
    createEReference(sectionEndEClass, SECTION_END__START);

    subSectionStartEClass = createEClass(SUB_SECTION_START);
    createEReference(subSectionStartEClass, SUB_SECTION_START__CONTENT);
    createEReference(subSectionStartEClass, SUB_SECTION_START__END);

    subSectionEndEClass = createEClass(SUB_SECTION_END);
    createEReference(subSectionEndEClass, SUB_SECTION_END__START);

    openViewStartEClass = createEClass(OPEN_VIEW_START);
    createEReference(openViewStartEClass, OPEN_VIEW_START__CONTENT);
    createEReference(openViewStartEClass, OPEN_VIEW_START__END);

    openViewEndEClass = createEClass(OPEN_VIEW_END);
    createEReference(openViewEndEClass, OPEN_VIEW_END__START);

    startProcessStartEClass = createEClass(START_PROCESS_START);
    createEReference(startProcessStartEClass, START_PROCESS_START__CONTENT);
    createEReference(startProcessStartEClass, START_PROCESS_START__END);

    startProcessEndEClass = createEClass(START_PROCESS_END);
    createEReference(startProcessEndEClass, START_PROCESS_END__START);

    entityRefStartEClass = createEClass(ENTITY_REF_START);
    createEReference(entityRefStartEClass, ENTITY_REF_START__CONTENT);
    createEReference(entityRefStartEClass, ENTITY_REF_START__END);

    entityRefEndEClass = createEClass(ENTITY_REF_END);
    createEReference(entityRefEndEClass, ENTITY_REF_END__START);

    dtoRefStartEClass = createEClass(DTO_REF_START);
    createEReference(dtoRefStartEClass, DTO_REF_START__CONTENT);
    createEReference(dtoRefStartEClass, DTO_REF_START__END);

    dtoRefEndEClass = createEClass(DTO_REF_END);
    createEReference(dtoRefEndEClass, DTO_REF_END__START);

    processRefStartEClass = createEClass(PROCESS_REF_START);
    createEReference(processRefStartEClass, PROCESS_REF_START__CONTENT);
    createEReference(processRefStartEClass, PROCESS_REF_START__END);

    processRefEndEClass = createEClass(PROCESS_REF_END);
    createEReference(processRefEndEClass, PROCESS_REF_END__START);

    taskRefStartEClass = createEClass(TASK_REF_START);
    createEReference(taskRefStartEClass, TASK_REF_START__CONTENT);
    createEReference(taskRefStartEClass, TASK_REF_START__END);

    taskRefEndEClass = createEClass(TASK_REF_END);
    createEReference(taskRefEndEClass, TASK_REF_END__START);

    viewRefStartEClass = createEClass(VIEW_REF_START);
    createEReference(viewRefStartEClass, VIEW_REF_START__CONTENT);
    createEReference(viewRefStartEClass, VIEW_REF_START__END);

    viewRefEndEClass = createEClass(VIEW_REF_END);
    createEReference(viewRefEndEClass, VIEW_REF_END__START);

    uiRefStartEClass = createEClass(UI_REF_START);
    createEReference(uiRefStartEClass, UI_REF_START__CONTENT);
    createEReference(uiRefStartEClass, UI_REF_START__END);

    uiRefEndEClass = createEClass(UI_REF_END);
    createEReference(uiRefEndEClass, UI_REF_END__START);

    boxStartEClass = createEClass(BOX_START);
    createEReference(boxStartEClass, BOX_START__CONTENT);
    createEReference(boxStartEClass, BOX_START__END);

    boxEndEClass = createEClass(BOX_END);
    createEReference(boxEndEClass, BOX_END__START);

    containerStartEClass = createEClass(CONTAINER_START);
    createEReference(containerStartEClass, CONTAINER_START__CONTENT);
    createEReference(containerStartEClass, CONTAINER_START__END);

    containerEndEClass = createEClass(CONTAINER_END);
    createEReference(containerEndEClass, CONTAINER_END__START);

    columnLayoutStartEClass = createEClass(COLUMN_LAYOUT_START);
    createEReference(columnLayoutStartEClass, COLUMN_LAYOUT_START__CONTENT);
    createEReference(columnLayoutStartEClass, COLUMN_LAYOUT_START__END);

    columnLayoutEndEClass = createEClass(COLUMN_LAYOUT_END);
    createEReference(columnLayoutEndEClass, COLUMN_LAYOUT_END__START);

    columnStartEClass = createEClass(COLUMN_START);
    createEReference(columnStartEClass, COLUMN_START__CONTENT);
    createEReference(columnStartEClass, COLUMN_START__END);

    columnEndEClass = createEClass(COLUMN_END);
    createEReference(columnEndEClass, COLUMN_END__START);

    footerStartEClass = createEClass(FOOTER_START);
    createEReference(footerStartEClass, FOOTER_START__CONTENT);
    createEReference(footerStartEClass, FOOTER_START__END);

    footerEndEClass = createEClass(FOOTER_END);
    createEReference(footerEndEClass, FOOTER_END__START);

    headerStartEClass = createEClass(HEADER_START);
    createEReference(headerStartEClass, HEADER_START__CONTENT);
    createEReference(headerStartEClass, HEADER_START__END);

    headerEndEClass = createEClass(HEADER_END);
    createEReference(headerEndEClass, HEADER_END__START);

    indexStartEClass = createEClass(INDEX_START);
    createEReference(indexStartEClass, INDEX_START__CONTENT);
    createEReference(indexStartEClass, INDEX_START__END);

    indexEndEClass = createEClass(INDEX_END);
    createEReference(indexEndEClass, INDEX_END__START);

    indexElementStartEClass = createEClass(INDEX_ELEMENT_START);
    createEReference(indexElementStartEClass, INDEX_ELEMENT_START__CONTENT);
    createEReference(indexElementStartEClass, INDEX_ELEMENT_START__END);

    indexElementEndEClass = createEClass(INDEX_ELEMENT_END);
    createEReference(indexElementEndEClass, INDEX_ELEMENT_END__START);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    LunDocPackage theLunDocPackage = (LunDocPackage)EPackage.Registry.INSTANCE.getEPackage(LunDocPackage.eNS_URI);
    LunDocRichstringPackage theLunDocRichstringPackage = (LunDocRichstringPackage)EPackage.Registry.INSTANCE.getEPackage(LunDocRichstringPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    documentStartEClass.getESuperTypes().add(this.getLinePart());
    documentEndEClass.getESuperTypes().add(this.getLinePart());
    literalEClass.getESuperTypes().add(this.getLinePart());
    lineBreakEClass.getESuperTypes().add(this.getLiteral());
    forLoopStartEClass.getESuperTypes().add(this.getLinePart());
    forLoopEndEClass.getESuperTypes().add(this.getLinePart());
    printedExpressionEClass.getESuperTypes().add(this.getLinePart());
    ifConditionStartEClass.getESuperTypes().add(this.getLinePart());
    elseIfConditionEClass.getESuperTypes().add(this.getLinePart());
    elseStartEClass.getESuperTypes().add(this.getLinePart());
    endIfEClass.getESuperTypes().add(this.getLinePart());
    markupEClass.getESuperTypes().add(this.getLinePart());
    h1StartEClass.getESuperTypes().add(this.getLinePart());
    h1EndEClass.getESuperTypes().add(this.getLinePart());
    h2StartEClass.getESuperTypes().add(this.getLinePart());
    h2EndEClass.getESuperTypes().add(this.getLinePart());
    h3StartEClass.getESuperTypes().add(this.getLinePart());
    h3EndEClass.getESuperTypes().add(this.getLinePart());
    h4StartEClass.getESuperTypes().add(this.getLinePart());
    h4EndEClass.getESuperTypes().add(this.getLinePart());
    h5StartEClass.getESuperTypes().add(this.getLinePart());
    h5EndEClass.getESuperTypes().add(this.getLinePart());
    h6StartEClass.getESuperTypes().add(this.getLinePart());
    h6EndEClass.getESuperTypes().add(this.getLinePart());
    exampleStartEClass.getESuperTypes().add(this.getLinePart());
    exampleEndEClass.getESuperTypes().add(this.getLinePart());
    urlStartEClass.getESuperTypes().add(this.getLinePart());
    urlEndEClass.getESuperTypes().add(this.getLinePart());
    refStartEClass.getESuperTypes().add(this.getLinePart());
    refEndEClass.getESuperTypes().add(this.getLinePart());
    boldStartEClass.getESuperTypes().add(this.getLinePart());
    boldEndEClass.getESuperTypes().add(this.getLinePart());
    underlineStartEClass.getESuperTypes().add(this.getLinePart());
    underlineEndEClass.getESuperTypes().add(this.getLinePart());
    italicStartEClass.getESuperTypes().add(this.getLinePart());
    italicEndEClass.getESuperTypes().add(this.getLinePart());
    spanStartEClass.getESuperTypes().add(this.getLinePart());
    spanEndEClass.getESuperTypes().add(this.getLinePart());
    imgStartEClass.getESuperTypes().add(this.getLinePart());
    imgEndEClass.getESuperTypes().add(this.getLinePart());
    mailtoStartEClass.getESuperTypes().add(this.getLinePart());
    mailtoEndEClass.getESuperTypes().add(this.getLinePart());
    skypeStartEClass.getESuperTypes().add(this.getLinePart());
    skypeEndEClass.getESuperTypes().add(this.getLinePart());
    movieStartEClass.getESuperTypes().add(this.getLinePart());
    movieEndEClass.getESuperTypes().add(this.getLinePart());
    codeStartEClass.getESuperTypes().add(this.getLinePart());
    codeEndEClass.getESuperTypes().add(this.getLinePart());
    tableStartEClass.getESuperTypes().add(this.getLinePart());
    tableEndEClass.getESuperTypes().add(this.getLinePart());
    tableRowStartEClass.getESuperTypes().add(this.getLinePart());
    tableRowEndEClass.getESuperTypes().add(this.getLinePart());
    tableCellStartEClass.getESuperTypes().add(this.getLinePart());
    tableCellEndEClass.getESuperTypes().add(this.getLinePart());
    listStartEClass.getESuperTypes().add(this.getLinePart());
    listEndEClass.getESuperTypes().add(this.getLinePart());
    orderedListStartEClass.getESuperTypes().add(this.getLinePart());
    orderedListEndEClass.getESuperTypes().add(this.getLinePart());
    listElementStartEClass.getESuperTypes().add(this.getLinePart());
    listElementEndEClass.getESuperTypes().add(this.getLinePart());
    chapterStartEClass.getESuperTypes().add(this.getLinePart());
    chapterEndEClass.getESuperTypes().add(this.getLinePart());
    sectionStartEClass.getESuperTypes().add(this.getLinePart());
    sectionEndEClass.getESuperTypes().add(this.getLinePart());
    subSectionStartEClass.getESuperTypes().add(this.getLinePart());
    subSectionEndEClass.getESuperTypes().add(this.getLinePart());
    openViewStartEClass.getESuperTypes().add(this.getLinePart());
    openViewEndEClass.getESuperTypes().add(this.getLinePart());
    startProcessStartEClass.getESuperTypes().add(this.getLinePart());
    startProcessEndEClass.getESuperTypes().add(this.getLinePart());
    entityRefStartEClass.getESuperTypes().add(this.getLinePart());
    entityRefEndEClass.getESuperTypes().add(this.getLinePart());
    dtoRefStartEClass.getESuperTypes().add(this.getLinePart());
    dtoRefEndEClass.getESuperTypes().add(this.getLinePart());
    processRefStartEClass.getESuperTypes().add(this.getLinePart());
    processRefEndEClass.getESuperTypes().add(this.getLinePart());
    taskRefStartEClass.getESuperTypes().add(this.getLinePart());
    taskRefEndEClass.getESuperTypes().add(this.getLinePart());
    viewRefStartEClass.getESuperTypes().add(this.getLinePart());
    viewRefEndEClass.getESuperTypes().add(this.getLinePart());
    uiRefStartEClass.getESuperTypes().add(this.getLinePart());
    uiRefEndEClass.getESuperTypes().add(this.getLinePart());
    boxStartEClass.getESuperTypes().add(this.getLinePart());
    boxEndEClass.getESuperTypes().add(this.getLinePart());
    containerStartEClass.getESuperTypes().add(this.getLinePart());
    containerEndEClass.getESuperTypes().add(this.getLinePart());
    columnLayoutStartEClass.getESuperTypes().add(this.getLinePart());
    columnLayoutEndEClass.getESuperTypes().add(this.getLinePart());
    columnStartEClass.getESuperTypes().add(this.getLinePart());
    columnEndEClass.getESuperTypes().add(this.getLinePart());
    footerStartEClass.getESuperTypes().add(this.getLinePart());
    footerEndEClass.getESuperTypes().add(this.getLinePart());
    headerStartEClass.getESuperTypes().add(this.getLinePart());
    headerEndEClass.getESuperTypes().add(this.getLinePart());
    indexStartEClass.getESuperTypes().add(this.getLinePart());
    indexEndEClass.getESuperTypes().add(this.getLinePart());
    indexElementStartEClass.getESuperTypes().add(this.getLinePart());
    indexElementEndEClass.getESuperTypes().add(this.getLinePart());

    // Initialize classes and features; add operations and parameters
    initEClass(documentStartEClass, DocumentStart.class, "DocumentStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDocumentStart_Content(), this.getProcessedRichString(), null, "content", null, 0, 1, DocumentStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentStart_End(), this.getDocumentEnd(), null, "end", null, 0, 1, DocumentStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentStart_Document(), theLunDocPackage.getLDocNamedDocument(), null, "document", null, 0, 1, DocumentStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentEndEClass, DocumentEnd.class, "DocumentEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDocumentEnd_Start(), this.getDocumentStart(), null, "start", null, 0, 1, DocumentEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processedRichStringEClass, ProcessedRichString.class, "ProcessedRichString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcessedRichString_RichString(), theLunDocRichstringPackage.getRichString(), null, "richString", null, 0, 1, ProcessedRichString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcessedRichString_Lines(), this.getLine(), this.getLine_RichString(), "lines", null, 0, -1, ProcessedRichString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLine_Parts(), this.getLinePart(), this.getLinePart_Line(), "parts", null, 0, -1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLine_RichString(), this.getProcessedRichString(), this.getProcessedRichString_Lines(), "richString", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linePartEClass, LinePart.class, "LinePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLinePart_Line(), this.getLine(), this.getLine_Parts(), "line", null, 0, 1, LinePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteral_Literal(), theLunDocRichstringPackage.getRichStringLiteral(), null, "literal", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteral_Offset(), theEcorePackage.getEInt(), "Offset", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteral_Length(), theEcorePackage.getEInt(), "length", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lineBreakEClass, LineBreak.class, "LineBreak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forLoopStartEClass, ForLoopStart.class, "ForLoopStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForLoopStart_Loop(), theLunDocRichstringPackage.getRichStringForLoop(), null, "loop", null, 0, 1, ForLoopStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForLoopStart_End(), this.getForLoopEnd(), this.getForLoopEnd_Start(), "end", null, 0, 1, ForLoopStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forLoopEndEClass, ForLoopEnd.class, "ForLoopEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForLoopEnd_Start(), this.getForLoopStart(), this.getForLoopStart_End(), "start", null, 0, 1, ForLoopEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(printedExpressionEClass, PrintedExpression.class, "PrintedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrintedExpression_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, PrintedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifConditionStartEClass, IfConditionStart.class, "IfConditionStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfConditionStart_RichStringIf(), theLunDocRichstringPackage.getRichStringIf(), null, "richStringIf", null, 0, 1, IfConditionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfConditionStart_ElseStart(), this.getElseStart(), this.getElseStart_IfConditionStart(), "elseStart", null, 0, 1, IfConditionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfConditionStart_ElseIfConditions(), this.getElseIfCondition(), this.getElseIfCondition_IfConditionStart(), "elseIfConditions", null, 0, -1, IfConditionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfConditionStart_EndIf(), this.getEndIf(), null, "endIf", null, 0, 1, IfConditionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elseIfConditionEClass, ElseIfCondition.class, "ElseIfCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElseIfCondition_RichStringElseIf(), theLunDocRichstringPackage.getRichStringElseIf(), null, "richStringElseIf", null, 0, 1, ElseIfCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElseIfCondition_IfConditionStart(), this.getIfConditionStart(), this.getIfConditionStart_ElseIfConditions(), "ifConditionStart", null, 0, 1, ElseIfCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elseStartEClass, ElseStart.class, "ElseStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElseStart_IfConditionStart(), this.getIfConditionStart(), this.getIfConditionStart_ElseStart(), "ifConditionStart", null, 0, 1, ElseStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(endIfEClass, EndIf.class, "EndIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEndIf_IfConditionStart(), this.getIfConditionStart(), null, "ifConditionStart", null, 0, 1, EndIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(markupEClass, Markup.class, "Markup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMarkup_Markup(), theLunDocRichstringPackage.getRichStringMarkup(), null, "markup", null, 0, 1, Markup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(h1StartEClass, H1Start.class, "H1Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getH1Start_Content(), theLunDocRichstringPackage.getRichStringH1(), null, "content", null, 0, 1, H1Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getH1Start_End(), this.getH1End(), null, "end", null, 0, 1, H1Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(h1EndEClass, H1End.class, "H1End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getH1End_Start(), this.getH1Start(), null, "start", null, 0, 1, H1End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(h2StartEClass, H2Start.class, "H2Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getH2Start_Content(), theLunDocRichstringPackage.getRichStringH2(), null, "content", null, 0, 1, H2Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getH2Start_End(), this.getH2End(), null, "end", null, 0, 1, H2Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(h2EndEClass, H2End.class, "H2End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getH2End_Start(), this.getH2Start(), null, "start", null, 0, 1, H2End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(h3StartEClass, H3Start.class, "H3Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getH3Start_Content(), theLunDocRichstringPackage.getRichStringH3(), null, "content", null, 0, 1, H3Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getH3Start_End(), this.getH3End(), null, "end", null, 0, 1, H3Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(h3EndEClass, H3End.class, "H3End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getH3End_Start(), this.getH3Start(), null, "start", null, 0, 1, H3End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(h4StartEClass, H4Start.class, "H4Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getH4Start_Content(), theLunDocRichstringPackage.getRichStringH4(), null, "content", null, 0, 1, H4Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getH4Start_End(), this.getH4End(), null, "end", null, 0, 1, H4Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(h4EndEClass, H4End.class, "H4End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getH4End_Start(), this.getH4Start(), null, "start", null, 0, 1, H4End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(h5StartEClass, H5Start.class, "H5Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getH5Start_Content(), theLunDocRichstringPackage.getRichStringH5(), null, "content", null, 0, 1, H5Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getH5Start_End(), this.getH5End(), null, "end", null, 0, 1, H5Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(h5EndEClass, H5End.class, "H5End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getH5End_Start(), this.getH5Start(), null, "start", null, 0, 1, H5End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(h6StartEClass, H6Start.class, "H6Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getH6Start_Content(), theLunDocRichstringPackage.getRichStringH6(), null, "content", null, 0, 1, H6Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getH6Start_End(), this.getH6End(), null, "end", null, 0, 1, H6Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(h6EndEClass, H6End.class, "H6End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getH6End_Start(), this.getH6Start(), null, "start", null, 0, 1, H6End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exampleStartEClass, ExampleStart.class, "ExampleStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExampleStart_Content(), theLunDocRichstringPackage.getRichStringExample(), null, "content", null, 0, 1, ExampleStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExampleStart_End(), this.getExampleEnd(), null, "end", null, 0, 1, ExampleStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exampleEndEClass, ExampleEnd.class, "ExampleEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExampleEnd_Start(), this.getExampleStart(), null, "start", null, 0, 1, ExampleEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(urlStartEClass, URLStart.class, "URLStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getURLStart_Content(), theLunDocRichstringPackage.getRichStringURL(), null, "content", null, 0, 1, URLStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getURLStart_End(), this.getURLEnd(), null, "end", null, 0, 1, URLStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(urlEndEClass, URLEnd.class, "URLEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getURLEnd_Start(), this.getURLStart(), null, "start", null, 0, 1, URLEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refStartEClass, RefStart.class, "RefStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefStart_Content(), theLunDocRichstringPackage.getRichStringRef(), null, "content", null, 0, 1, RefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRefStart_End(), this.getRefEnd(), null, "end", null, 0, 1, RefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refEndEClass, RefEnd.class, "RefEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefEnd_Start(), this.getRefStart(), null, "start", null, 0, 1, RefEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boldStartEClass, BoldStart.class, "BoldStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBoldStart_Content(), theLunDocRichstringPackage.getRichStringBold(), null, "content", null, 0, 1, BoldStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoldStart_End(), this.getBoldEnd(), null, "end", null, 0, 1, BoldStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boldEndEClass, BoldEnd.class, "BoldEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBoldEnd_Start(), this.getBoldStart(), null, "start", null, 0, 1, BoldEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(underlineStartEClass, UnderlineStart.class, "UnderlineStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnderlineStart_Content(), theLunDocRichstringPackage.getRichStringUnderline(), null, "content", null, 0, 1, UnderlineStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnderlineStart_End(), this.getUnderlineEnd(), null, "end", null, 0, 1, UnderlineStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(underlineEndEClass, UnderlineEnd.class, "UnderlineEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnderlineEnd_Start(), this.getUnderlineStart(), null, "start", null, 0, 1, UnderlineEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(italicStartEClass, ItalicStart.class, "ItalicStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItalicStart_Content(), theLunDocRichstringPackage.getRichStringItalic(), null, "content", null, 0, 1, ItalicStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItalicStart_End(), this.getItalicEnd(), null, "end", null, 0, 1, ItalicStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(italicEndEClass, ItalicEnd.class, "ItalicEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItalicEnd_Start(), this.getItalicStart(), null, "start", null, 0, 1, ItalicEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spanStartEClass, SpanStart.class, "SpanStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpanStart_Content(), theLunDocRichstringPackage.getRichStringSpan(), null, "content", null, 0, 1, SpanStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpanStart_End(), this.getSpanEnd(), null, "end", null, 0, 1, SpanStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spanEndEClass, SpanEnd.class, "SpanEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpanEnd_Start(), this.getSpanStart(), null, "start", null, 0, 1, SpanEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imgStartEClass, ImgStart.class, "ImgStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImgStart_Content(), theLunDocRichstringPackage.getRichStringImg(), null, "content", null, 0, 1, ImgStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImgStart_End(), this.getImgEnd(), null, "end", null, 0, 1, ImgStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imgEndEClass, ImgEnd.class, "ImgEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImgEnd_Start(), this.getImgStart(), null, "start", null, 0, 1, ImgEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mailtoStartEClass, MailtoStart.class, "MailtoStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMailtoStart_Content(), theLunDocRichstringPackage.getRichStringMailto(), null, "content", null, 0, 1, MailtoStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMailtoStart_End(), this.getMailtoEnd(), null, "end", null, 0, 1, MailtoStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mailtoEndEClass, MailtoEnd.class, "MailtoEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMailtoEnd_Start(), this.getMailtoStart(), null, "start", null, 0, 1, MailtoEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(skypeStartEClass, SkypeStart.class, "SkypeStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSkypeStart_Content(), theLunDocRichstringPackage.getRichStringSkype(), null, "content", null, 0, 1, SkypeStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSkypeStart_End(), this.getSkypeEnd(), null, "end", null, 0, 1, SkypeStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(skypeEndEClass, SkypeEnd.class, "SkypeEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSkypeEnd_Start(), this.getSkypeStart(), null, "start", null, 0, 1, SkypeEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(movieStartEClass, MovieStart.class, "MovieStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMovieStart_Content(), theLunDocRichstringPackage.getRichStringMovie(), null, "content", null, 0, 1, MovieStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMovieStart_End(), this.getMovieEnd(), null, "end", null, 0, 1, MovieStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(movieEndEClass, MovieEnd.class, "MovieEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMovieEnd_Start(), this.getMovieStart(), null, "start", null, 0, 1, MovieEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeStartEClass, CodeStart.class, "CodeStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCodeStart_Content(), theLunDocRichstringPackage.getRichStringCode(), null, "content", null, 0, 1, CodeStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCodeStart_End(), this.getCodeEnd(), null, "end", null, 0, 1, CodeStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeEndEClass, CodeEnd.class, "CodeEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCodeEnd_Start(), this.getCodeStart(), null, "start", null, 0, 1, CodeEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableStartEClass, TableStart.class, "TableStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableStart_Content(), theLunDocRichstringPackage.getRichStringTable(), null, "content", null, 0, 1, TableStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableStart_End(), this.getTableEnd(), null, "end", null, 0, 1, TableStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableEndEClass, TableEnd.class, "TableEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableEnd_Start(), this.getTableStart(), null, "start", null, 0, 1, TableEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableRowStartEClass, TableRowStart.class, "TableRowStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableRowStart_Content(), theLunDocRichstringPackage.getRichStringTableRow(), null, "content", null, 0, 1, TableRowStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableRowStart_End(), this.getTableRowEnd(), null, "end", null, 0, 1, TableRowStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableRowEndEClass, TableRowEnd.class, "TableRowEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableRowEnd_Start(), this.getTableRowStart(), null, "start", null, 0, 1, TableRowEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableCellStartEClass, TableCellStart.class, "TableCellStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableCellStart_Content(), theLunDocRichstringPackage.getRichStringTableCell(), null, "content", null, 0, 1, TableCellStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableCellStart_End(), this.getTableCellEnd(), null, "end", null, 0, 1, TableCellStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableCellEndEClass, TableCellEnd.class, "TableCellEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableCellEnd_Start(), this.getTableCellStart(), null, "start", null, 0, 1, TableCellEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listStartEClass, ListStart.class, "ListStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListStart_Content(), theLunDocRichstringPackage.getRichStringList(), null, "content", null, 0, 1, ListStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListStart_End(), this.getListEnd(), null, "end", null, 0, 1, ListStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listEndEClass, ListEnd.class, "ListEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListEnd_Start(), this.getListStart(), null, "start", null, 0, 1, ListEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderedListStartEClass, OrderedListStart.class, "OrderedListStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrderedListStart_Content(), theLunDocRichstringPackage.getRichStringOrderedList(), null, "content", null, 0, 1, OrderedListStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrderedListStart_End(), this.getOrderedListEnd(), null, "end", null, 0, 1, OrderedListStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderedListEndEClass, OrderedListEnd.class, "OrderedListEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrderedListEnd_Start(), this.getOrderedListStart(), null, "start", null, 0, 1, OrderedListEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listElementStartEClass, ListElementStart.class, "ListElementStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListElementStart_Content(), theLunDocRichstringPackage.getRichStringListElement(), null, "content", null, 0, 1, ListElementStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListElementStart_End(), this.getListElementEnd(), null, "end", null, 0, 1, ListElementStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listElementEndEClass, ListElementEnd.class, "ListElementEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListElementEnd_Start(), this.getListElementStart(), null, "start", null, 0, 1, ListElementEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chapterStartEClass, ChapterStart.class, "ChapterStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChapterStart_Content(), theLunDocRichstringPackage.getRichStringChapter(), null, "content", null, 0, 1, ChapterStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChapterStart_End(), this.getChapterEnd(), null, "end", null, 0, 1, ChapterStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chapterEndEClass, ChapterEnd.class, "ChapterEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChapterEnd_Start(), this.getChapterStart(), null, "start", null, 0, 1, ChapterEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionStartEClass, SectionStart.class, "SectionStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSectionStart_Content(), theLunDocRichstringPackage.getRichStringSection(), null, "content", null, 0, 1, SectionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSectionStart_End(), this.getSectionEnd(), null, "end", null, 0, 1, SectionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionEndEClass, SectionEnd.class, "SectionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSectionEnd_Start(), this.getSectionStart(), null, "start", null, 0, 1, SectionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subSectionStartEClass, SubSectionStart.class, "SubSectionStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubSectionStart_Content(), theLunDocRichstringPackage.getRichStringSubsection(), null, "content", null, 0, 1, SubSectionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubSectionStart_End(), this.getSubSectionEnd(), null, "end", null, 0, 1, SubSectionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subSectionEndEClass, SubSectionEnd.class, "SubSectionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubSectionEnd_Start(), this.getSubSectionStart(), null, "start", null, 0, 1, SubSectionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(openViewStartEClass, OpenViewStart.class, "OpenViewStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOpenViewStart_Content(), theLunDocRichstringPackage.getRichStringOpenView(), null, "content", null, 0, 1, OpenViewStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOpenViewStart_End(), this.getOpenViewEnd(), null, "end", null, 0, 1, OpenViewStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(openViewEndEClass, OpenViewEnd.class, "OpenViewEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOpenViewEnd_Start(), this.getOpenViewStart(), null, "start", null, 0, 1, OpenViewEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(startProcessStartEClass, StartProcessStart.class, "StartProcessStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStartProcessStart_Content(), theLunDocRichstringPackage.getRichStringStartProcess(), null, "content", null, 0, 1, StartProcessStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStartProcessStart_End(), this.getStartProcessEnd(), null, "end", null, 0, 1, StartProcessStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(startProcessEndEClass, StartProcessEnd.class, "StartProcessEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStartProcessEnd_Start(), this.getStartProcessStart(), null, "start", null, 0, 1, StartProcessEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityRefStartEClass, EntityRefStart.class, "EntityRefStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntityRefStart_Content(), theLunDocRichstringPackage.getRichStringEntityRef(), null, "content", null, 0, 1, EntityRefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntityRefStart_End(), this.getEntityRefEnd(), null, "end", null, 0, 1, EntityRefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityRefEndEClass, EntityRefEnd.class, "EntityRefEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntityRefEnd_Start(), this.getEntityRefStart(), null, "start", null, 0, 1, EntityRefEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dtoRefStartEClass, DTORefStart.class, "DTORefStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDTORefStart_Content(), theLunDocRichstringPackage.getRichStringDTORef(), null, "content", null, 0, 1, DTORefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDTORefStart_End(), this.getDTORefEnd(), null, "end", null, 0, 1, DTORefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dtoRefEndEClass, DTORefEnd.class, "DTORefEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDTORefEnd_Start(), this.getDTORefStart(), null, "start", null, 0, 1, DTORefEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processRefStartEClass, ProcessRefStart.class, "ProcessRefStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcessRefStart_Content(), theLunDocRichstringPackage.getRichStringProcessRef(), null, "content", null, 0, 1, ProcessRefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcessRefStart_End(), this.getProcessRefEnd(), null, "end", null, 0, 1, ProcessRefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processRefEndEClass, ProcessRefEnd.class, "ProcessRefEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcessRefEnd_Start(), this.getProcessRefStart(), null, "start", null, 0, 1, ProcessRefEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskRefStartEClass, TaskRefStart.class, "TaskRefStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTaskRefStart_Content(), theLunDocRichstringPackage.getRichStringTaskRef(), null, "content", null, 0, 1, TaskRefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTaskRefStart_End(), this.getTaskRefEnd(), null, "end", null, 0, 1, TaskRefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskRefEndEClass, TaskRefEnd.class, "TaskRefEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTaskRefEnd_Start(), this.getTaskRefStart(), null, "start", null, 0, 1, TaskRefEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewRefStartEClass, ViewRefStart.class, "ViewRefStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewRefStart_Content(), theLunDocRichstringPackage.getRichStringViewRef(), null, "content", null, 0, 1, ViewRefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewRefStart_End(), this.getViewRefEnd(), null, "end", null, 0, 1, ViewRefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewRefEndEClass, ViewRefEnd.class, "ViewRefEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewRefEnd_Start(), this.getViewRefStart(), null, "start", null, 0, 1, ViewRefEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uiRefStartEClass, UIRefStart.class, "UIRefStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUIRefStart_Content(), theLunDocRichstringPackage.getRichStringUIRef(), null, "content", null, 0, 1, UIRefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUIRefStart_End(), this.getUIRefEnd(), null, "end", null, 0, 1, UIRefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uiRefEndEClass, UIRefEnd.class, "UIRefEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUIRefEnd_Start(), this.getUIRefStart(), null, "start", null, 0, 1, UIRefEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boxStartEClass, BoxStart.class, "BoxStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBoxStart_Content(), theLunDocRichstringPackage.getRichStringBox(), null, "content", null, 0, 1, BoxStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoxStart_End(), this.getBoxEnd(), null, "end", null, 0, 1, BoxStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boxEndEClass, BoxEnd.class, "BoxEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBoxEnd_Start(), this.getBoxStart(), null, "start", null, 0, 1, BoxEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerStartEClass, ContainerStart.class, "ContainerStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainerStart_Content(), theLunDocRichstringPackage.getRichStringContainer(), null, "content", null, 0, 1, ContainerStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerStart_End(), this.getContainerEnd(), null, "end", null, 0, 1, ContainerStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerEndEClass, ContainerEnd.class, "ContainerEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainerEnd_Start(), this.getContainerStart(), null, "start", null, 0, 1, ContainerEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnLayoutStartEClass, ColumnLayoutStart.class, "ColumnLayoutStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColumnLayoutStart_Content(), theLunDocRichstringPackage.getRichStringColumnLayout(), null, "content", null, 0, 1, ColumnLayoutStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColumnLayoutStart_End(), this.getColumnLayoutEnd(), null, "end", null, 0, 1, ColumnLayoutStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnLayoutEndEClass, ColumnLayoutEnd.class, "ColumnLayoutEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColumnLayoutEnd_Start(), this.getColumnLayoutStart(), null, "start", null, 0, 1, ColumnLayoutEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnStartEClass, ColumnStart.class, "ColumnStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColumnStart_Content(), theLunDocRichstringPackage.getRichStringColumn(), null, "content", null, 0, 1, ColumnStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColumnStart_End(), this.getColumnEnd(), null, "end", null, 0, 1, ColumnStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnEndEClass, ColumnEnd.class, "ColumnEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColumnEnd_Start(), this.getColumnStart(), null, "start", null, 0, 1, ColumnEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(footerStartEClass, FooterStart.class, "FooterStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFooterStart_Content(), theLunDocRichstringPackage.getRichStringFooter(), null, "content", null, 0, 1, FooterStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFooterStart_End(), this.getFooterEnd(), null, "end", null, 0, 1, FooterStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(footerEndEClass, FooterEnd.class, "FooterEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFooterEnd_Start(), this.getFooterStart(), null, "start", null, 0, 1, FooterEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerStartEClass, HeaderStart.class, "HeaderStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeaderStart_Content(), theLunDocRichstringPackage.getRichStringHeader(), null, "content", null, 0, 1, HeaderStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHeaderStart_End(), this.getHeaderEnd(), null, "end", null, 0, 1, HeaderStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerEndEClass, HeaderEnd.class, "HeaderEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeaderEnd_Start(), this.getHeaderStart(), null, "start", null, 0, 1, HeaderEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexStartEClass, IndexStart.class, "IndexStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndexStart_Content(), theLunDocRichstringPackage.getRichStringIndex(), null, "content", null, 0, 1, IndexStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndexStart_End(), this.getIndexEnd(), null, "end", null, 0, 1, IndexStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexEndEClass, IndexEnd.class, "IndexEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndexEnd_Start(), this.getIndexStart(), null, "start", null, 0, 1, IndexEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexElementStartEClass, IndexElementStart.class, "IndexElementStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndexElementStart_Content(), theLunDocRichstringPackage.getRichStringIndexElement(), null, "content", null, 0, 1, IndexElementStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndexElementStart_End(), this.getIndexElementEnd(), null, "end", null, 0, 1, IndexElementStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexElementEndEClass, IndexElementEnd.class, "IndexElementEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndexElementEnd_Start(), this.getIndexElementStart(), null, "start", null, 0, 1, IndexElementEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";			
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "rootPackage", "ldoccompiler"
       });
  }

} //LunDocCompilerPackageImpl
