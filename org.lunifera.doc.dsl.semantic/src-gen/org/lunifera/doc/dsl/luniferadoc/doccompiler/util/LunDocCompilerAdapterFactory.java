/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.doc.dsl.luniferadoc.doccompiler.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage
 * @generated
 */
public class LunDocCompilerAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LunDocCompilerPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LunDocCompilerAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LunDocCompilerPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LunDocCompilerSwitch<Adapter> modelSwitch =
    new LunDocCompilerSwitch<Adapter>()
    {
      @Override
      public Adapter caseDocumentStart(DocumentStart object)
      {
        return createDocumentStartAdapter();
      }
      @Override
      public Adapter caseDocumentEnd(DocumentEnd object)
      {
        return createDocumentEndAdapter();
      }
      @Override
      public Adapter caseProcessedRichString(ProcessedRichString object)
      {
        return createProcessedRichStringAdapter();
      }
      @Override
      public Adapter caseLine(Line object)
      {
        return createLineAdapter();
      }
      @Override
      public Adapter caseLinePart(LinePart object)
      {
        return createLinePartAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseLineBreak(LineBreak object)
      {
        return createLineBreakAdapter();
      }
      @Override
      public Adapter caseForLoopStart(ForLoopStart object)
      {
        return createForLoopStartAdapter();
      }
      @Override
      public Adapter caseForLoopEnd(ForLoopEnd object)
      {
        return createForLoopEndAdapter();
      }
      @Override
      public Adapter casePrintedExpression(PrintedExpression object)
      {
        return createPrintedExpressionAdapter();
      }
      @Override
      public Adapter caseIfConditionStart(IfConditionStart object)
      {
        return createIfConditionStartAdapter();
      }
      @Override
      public Adapter caseElseIfCondition(ElseIfCondition object)
      {
        return createElseIfConditionAdapter();
      }
      @Override
      public Adapter caseElseStart(ElseStart object)
      {
        return createElseStartAdapter();
      }
      @Override
      public Adapter caseEndIf(EndIf object)
      {
        return createEndIfAdapter();
      }
      @Override
      public Adapter caseMarkup(Markup object)
      {
        return createMarkupAdapter();
      }
      @Override
      public Adapter caseH1Start(H1Start object)
      {
        return createH1StartAdapter();
      }
      @Override
      public Adapter caseH1End(H1End object)
      {
        return createH1EndAdapter();
      }
      @Override
      public Adapter caseH2Start(H2Start object)
      {
        return createH2StartAdapter();
      }
      @Override
      public Adapter caseH2End(H2End object)
      {
        return createH2EndAdapter();
      }
      @Override
      public Adapter caseH3Start(H3Start object)
      {
        return createH3StartAdapter();
      }
      @Override
      public Adapter caseH3End(H3End object)
      {
        return createH3EndAdapter();
      }
      @Override
      public Adapter caseH4Start(H4Start object)
      {
        return createH4StartAdapter();
      }
      @Override
      public Adapter caseH4End(H4End object)
      {
        return createH4EndAdapter();
      }
      @Override
      public Adapter caseH5Start(H5Start object)
      {
        return createH5StartAdapter();
      }
      @Override
      public Adapter caseH5End(H5End object)
      {
        return createH5EndAdapter();
      }
      @Override
      public Adapter caseH6Start(H6Start object)
      {
        return createH6StartAdapter();
      }
      @Override
      public Adapter caseH6End(H6End object)
      {
        return createH6EndAdapter();
      }
      @Override
      public Adapter caseExampleStart(ExampleStart object)
      {
        return createExampleStartAdapter();
      }
      @Override
      public Adapter caseExampleEnd(ExampleEnd object)
      {
        return createExampleEndAdapter();
      }
      @Override
      public Adapter caseURLStart(URLStart object)
      {
        return createURLStartAdapter();
      }
      @Override
      public Adapter caseURLEnd(URLEnd object)
      {
        return createURLEndAdapter();
      }
      @Override
      public Adapter caseRefStart(RefStart object)
      {
        return createRefStartAdapter();
      }
      @Override
      public Adapter caseRefEnd(RefEnd object)
      {
        return createRefEndAdapter();
      }
      @Override
      public Adapter caseBoldStart(BoldStart object)
      {
        return createBoldStartAdapter();
      }
      @Override
      public Adapter caseBoldEnd(BoldEnd object)
      {
        return createBoldEndAdapter();
      }
      @Override
      public Adapter caseUnderlineStart(UnderlineStart object)
      {
        return createUnderlineStartAdapter();
      }
      @Override
      public Adapter caseUnderlineEnd(UnderlineEnd object)
      {
        return createUnderlineEndAdapter();
      }
      @Override
      public Adapter caseItalicStart(ItalicStart object)
      {
        return createItalicStartAdapter();
      }
      @Override
      public Adapter caseItalicEnd(ItalicEnd object)
      {
        return createItalicEndAdapter();
      }
      @Override
      public Adapter caseSpanStart(SpanStart object)
      {
        return createSpanStartAdapter();
      }
      @Override
      public Adapter caseSpanEnd(SpanEnd object)
      {
        return createSpanEndAdapter();
      }
      @Override
      public Adapter caseImgStart(ImgStart object)
      {
        return createImgStartAdapter();
      }
      @Override
      public Adapter caseImgEnd(ImgEnd object)
      {
        return createImgEndAdapter();
      }
      @Override
      public Adapter caseMailtoStart(MailtoStart object)
      {
        return createMailtoStartAdapter();
      }
      @Override
      public Adapter caseMailtoEnd(MailtoEnd object)
      {
        return createMailtoEndAdapter();
      }
      @Override
      public Adapter caseSkypeStart(SkypeStart object)
      {
        return createSkypeStartAdapter();
      }
      @Override
      public Adapter caseSkypeEnd(SkypeEnd object)
      {
        return createSkypeEndAdapter();
      }
      @Override
      public Adapter caseMovieStart(MovieStart object)
      {
        return createMovieStartAdapter();
      }
      @Override
      public Adapter caseMovieEnd(MovieEnd object)
      {
        return createMovieEndAdapter();
      }
      @Override
      public Adapter caseCodeStart(CodeStart object)
      {
        return createCodeStartAdapter();
      }
      @Override
      public Adapter caseCodeEnd(CodeEnd object)
      {
        return createCodeEndAdapter();
      }
      @Override
      public Adapter caseTableStart(TableStart object)
      {
        return createTableStartAdapter();
      }
      @Override
      public Adapter caseTableEnd(TableEnd object)
      {
        return createTableEndAdapter();
      }
      @Override
      public Adapter caseTableRowStart(TableRowStart object)
      {
        return createTableRowStartAdapter();
      }
      @Override
      public Adapter caseTableRowEnd(TableRowEnd object)
      {
        return createTableRowEndAdapter();
      }
      @Override
      public Adapter caseTableCellStart(TableCellStart object)
      {
        return createTableCellStartAdapter();
      }
      @Override
      public Adapter caseTableCellEnd(TableCellEnd object)
      {
        return createTableCellEndAdapter();
      }
      @Override
      public Adapter caseListStart(ListStart object)
      {
        return createListStartAdapter();
      }
      @Override
      public Adapter caseListEnd(ListEnd object)
      {
        return createListEndAdapter();
      }
      @Override
      public Adapter caseOrderedListStart(OrderedListStart object)
      {
        return createOrderedListStartAdapter();
      }
      @Override
      public Adapter caseOrderedListEnd(OrderedListEnd object)
      {
        return createOrderedListEndAdapter();
      }
      @Override
      public Adapter caseListElementStart(ListElementStart object)
      {
        return createListElementStartAdapter();
      }
      @Override
      public Adapter caseListElementEnd(ListElementEnd object)
      {
        return createListElementEndAdapter();
      }
      @Override
      public Adapter caseChapterStart(ChapterStart object)
      {
        return createChapterStartAdapter();
      }
      @Override
      public Adapter caseChapterEnd(ChapterEnd object)
      {
        return createChapterEndAdapter();
      }
      @Override
      public Adapter caseSectionStart(SectionStart object)
      {
        return createSectionStartAdapter();
      }
      @Override
      public Adapter caseSectionEnd(SectionEnd object)
      {
        return createSectionEndAdapter();
      }
      @Override
      public Adapter caseSubSectionStart(SubSectionStart object)
      {
        return createSubSectionStartAdapter();
      }
      @Override
      public Adapter caseSubSectionEnd(SubSectionEnd object)
      {
        return createSubSectionEndAdapter();
      }
      @Override
      public Adapter caseOpenViewStart(OpenViewStart object)
      {
        return createOpenViewStartAdapter();
      }
      @Override
      public Adapter caseOpenViewEnd(OpenViewEnd object)
      {
        return createOpenViewEndAdapter();
      }
      @Override
      public Adapter caseStartProcessStart(StartProcessStart object)
      {
        return createStartProcessStartAdapter();
      }
      @Override
      public Adapter caseStartProcessEnd(StartProcessEnd object)
      {
        return createStartProcessEndAdapter();
      }
      @Override
      public Adapter caseEntityRefStart(EntityRefStart object)
      {
        return createEntityRefStartAdapter();
      }
      @Override
      public Adapter caseEntityRefEnd(EntityRefEnd object)
      {
        return createEntityRefEndAdapter();
      }
      @Override
      public Adapter caseDTORefStart(DTORefStart object)
      {
        return createDTORefStartAdapter();
      }
      @Override
      public Adapter caseDTORefEnd(DTORefEnd object)
      {
        return createDTORefEndAdapter();
      }
      @Override
      public Adapter caseProcessRefStart(ProcessRefStart object)
      {
        return createProcessRefStartAdapter();
      }
      @Override
      public Adapter caseProcessRefEnd(ProcessRefEnd object)
      {
        return createProcessRefEndAdapter();
      }
      @Override
      public Adapter caseTaskRefStart(TaskRefStart object)
      {
        return createTaskRefStartAdapter();
      }
      @Override
      public Adapter caseTaskRefEnd(TaskRefEnd object)
      {
        return createTaskRefEndAdapter();
      }
      @Override
      public Adapter caseViewRefStart(ViewRefStart object)
      {
        return createViewRefStartAdapter();
      }
      @Override
      public Adapter caseViewRefEnd(ViewRefEnd object)
      {
        return createViewRefEndAdapter();
      }
      @Override
      public Adapter caseUIRefStart(UIRefStart object)
      {
        return createUIRefStartAdapter();
      }
      @Override
      public Adapter caseUIRefEnd(UIRefEnd object)
      {
        return createUIRefEndAdapter();
      }
      @Override
      public Adapter caseBoxStart(BoxStart object)
      {
        return createBoxStartAdapter();
      }
      @Override
      public Adapter caseBoxEnd(BoxEnd object)
      {
        return createBoxEndAdapter();
      }
      @Override
      public Adapter caseContainerStart(ContainerStart object)
      {
        return createContainerStartAdapter();
      }
      @Override
      public Adapter caseContainerEnd(ContainerEnd object)
      {
        return createContainerEndAdapter();
      }
      @Override
      public Adapter caseColumnLayoutStart(ColumnLayoutStart object)
      {
        return createColumnLayoutStartAdapter();
      }
      @Override
      public Adapter caseColumnLayoutEnd(ColumnLayoutEnd object)
      {
        return createColumnLayoutEndAdapter();
      }
      @Override
      public Adapter caseColumnStart(ColumnStart object)
      {
        return createColumnStartAdapter();
      }
      @Override
      public Adapter caseColumnEnd(ColumnEnd object)
      {
        return createColumnEndAdapter();
      }
      @Override
      public Adapter caseFooterStart(FooterStart object)
      {
        return createFooterStartAdapter();
      }
      @Override
      public Adapter caseFooterEnd(FooterEnd object)
      {
        return createFooterEndAdapter();
      }
      @Override
      public Adapter caseHeaderStart(HeaderStart object)
      {
        return createHeaderStartAdapter();
      }
      @Override
      public Adapter caseHeaderEnd(HeaderEnd object)
      {
        return createHeaderEndAdapter();
      }
      @Override
      public Adapter caseIndexStart(IndexStart object)
      {
        return createIndexStartAdapter();
      }
      @Override
      public Adapter caseIndexEnd(IndexEnd object)
      {
        return createIndexEndAdapter();
      }
      @Override
      public Adapter caseIndexElementStart(IndexElementStart object)
      {
        return createIndexElementStartAdapter();
      }
      @Override
      public Adapter caseIndexElementEnd(IndexElementEnd object)
      {
        return createIndexElementEndAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.DocumentStart <em>Document Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.DocumentStart
   * @generated
   */
  public Adapter createDocumentStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.DocumentEnd <em>Document End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.DocumentEnd
   * @generated
   */
  public Adapter createDocumentEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ProcessedRichString <em>Processed Rich String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ProcessedRichString
   * @generated
   */
  public Adapter createProcessedRichStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.Line <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.Line
   * @generated
   */
  public Adapter createLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.LinePart <em>Line Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LinePart
   * @generated
   */
  public Adapter createLinePartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.LineBreak <em>Line Break</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LineBreak
   * @generated
   */
  public Adapter createLineBreakAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ForLoopStart <em>For Loop Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ForLoopStart
   * @generated
   */
  public Adapter createForLoopStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ForLoopEnd <em>For Loop End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ForLoopEnd
   * @generated
   */
  public Adapter createForLoopEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.PrintedExpression <em>Printed Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.PrintedExpression
   * @generated
   */
  public Adapter createPrintedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.IfConditionStart <em>If Condition Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.IfConditionStart
   * @generated
   */
  public Adapter createIfConditionStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ElseIfCondition <em>Else If Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ElseIfCondition
   * @generated
   */
  public Adapter createElseIfConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ElseStart <em>Else Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ElseStart
   * @generated
   */
  public Adapter createElseStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.EndIf <em>End If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.EndIf
   * @generated
   */
  public Adapter createEndIfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.Markup <em>Markup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.Markup
   * @generated
   */
  public Adapter createMarkupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.H1Start <em>H1 Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.H1Start
   * @generated
   */
  public Adapter createH1StartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.H1End <em>H1 End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.H1End
   * @generated
   */
  public Adapter createH1EndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.H2Start <em>H2 Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.H2Start
   * @generated
   */
  public Adapter createH2StartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.H2End <em>H2 End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.H2End
   * @generated
   */
  public Adapter createH2EndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.H3Start <em>H3 Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.H3Start
   * @generated
   */
  public Adapter createH3StartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.H3End <em>H3 End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.H3End
   * @generated
   */
  public Adapter createH3EndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.H4Start <em>H4 Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.H4Start
   * @generated
   */
  public Adapter createH4StartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.H4End <em>H4 End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.H4End
   * @generated
   */
  public Adapter createH4EndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.H5Start <em>H5 Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.H5Start
   * @generated
   */
  public Adapter createH5StartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.H5End <em>H5 End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.H5End
   * @generated
   */
  public Adapter createH5EndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.H6Start <em>H6 Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.H6Start
   * @generated
   */
  public Adapter createH6StartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.H6End <em>H6 End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.H6End
   * @generated
   */
  public Adapter createH6EndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ExampleStart <em>Example Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ExampleStart
   * @generated
   */
  public Adapter createExampleStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ExampleEnd <em>Example End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ExampleEnd
   * @generated
   */
  public Adapter createExampleEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.URLStart <em>URL Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.URLStart
   * @generated
   */
  public Adapter createURLStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.URLEnd <em>URL End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.URLEnd
   * @generated
   */
  public Adapter createURLEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.RefStart <em>Ref Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.RefStart
   * @generated
   */
  public Adapter createRefStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.RefEnd <em>Ref End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.RefEnd
   * @generated
   */
  public Adapter createRefEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.BoldStart <em>Bold Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.BoldStart
   * @generated
   */
  public Adapter createBoldStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.BoldEnd <em>Bold End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.BoldEnd
   * @generated
   */
  public Adapter createBoldEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.UnderlineStart <em>Underline Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.UnderlineStart
   * @generated
   */
  public Adapter createUnderlineStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.UnderlineEnd <em>Underline End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.UnderlineEnd
   * @generated
   */
  public Adapter createUnderlineEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ItalicStart <em>Italic Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ItalicStart
   * @generated
   */
  public Adapter createItalicStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ItalicEnd <em>Italic End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ItalicEnd
   * @generated
   */
  public Adapter createItalicEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.SpanStart <em>Span Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.SpanStart
   * @generated
   */
  public Adapter createSpanStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.SpanEnd <em>Span End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.SpanEnd
   * @generated
   */
  public Adapter createSpanEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ImgStart <em>Img Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ImgStart
   * @generated
   */
  public Adapter createImgStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ImgEnd <em>Img End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ImgEnd
   * @generated
   */
  public Adapter createImgEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.MailtoStart <em>Mailto Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.MailtoStart
   * @generated
   */
  public Adapter createMailtoStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.MailtoEnd <em>Mailto End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.MailtoEnd
   * @generated
   */
  public Adapter createMailtoEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.SkypeStart <em>Skype Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.SkypeStart
   * @generated
   */
  public Adapter createSkypeStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.SkypeEnd <em>Skype End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.SkypeEnd
   * @generated
   */
  public Adapter createSkypeEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.MovieStart <em>Movie Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.MovieStart
   * @generated
   */
  public Adapter createMovieStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.MovieEnd <em>Movie End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.MovieEnd
   * @generated
   */
  public Adapter createMovieEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.CodeStart <em>Code Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.CodeStart
   * @generated
   */
  public Adapter createCodeStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.CodeEnd <em>Code End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.CodeEnd
   * @generated
   */
  public Adapter createCodeEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.TableStart <em>Table Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.TableStart
   * @generated
   */
  public Adapter createTableStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.TableEnd <em>Table End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.TableEnd
   * @generated
   */
  public Adapter createTableEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.TableRowStart <em>Table Row Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.TableRowStart
   * @generated
   */
  public Adapter createTableRowStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.TableRowEnd <em>Table Row End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.TableRowEnd
   * @generated
   */
  public Adapter createTableRowEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.TableCellStart <em>Table Cell Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.TableCellStart
   * @generated
   */
  public Adapter createTableCellStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.TableCellEnd <em>Table Cell End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.TableCellEnd
   * @generated
   */
  public Adapter createTableCellEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ListStart <em>List Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ListStart
   * @generated
   */
  public Adapter createListStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ListEnd <em>List End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ListEnd
   * @generated
   */
  public Adapter createListEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.OrderedListStart <em>Ordered List Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.OrderedListStart
   * @generated
   */
  public Adapter createOrderedListStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.OrderedListEnd <em>Ordered List End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.OrderedListEnd
   * @generated
   */
  public Adapter createOrderedListEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ListElementStart <em>List Element Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ListElementStart
   * @generated
   */
  public Adapter createListElementStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ListElementEnd <em>List Element End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ListElementEnd
   * @generated
   */
  public Adapter createListElementEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ChapterStart <em>Chapter Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ChapterStart
   * @generated
   */
  public Adapter createChapterStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ChapterEnd <em>Chapter End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ChapterEnd
   * @generated
   */
  public Adapter createChapterEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.SectionStart <em>Section Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.SectionStart
   * @generated
   */
  public Adapter createSectionStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.SectionEnd <em>Section End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.SectionEnd
   * @generated
   */
  public Adapter createSectionEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.SubSectionStart <em>Sub Section Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.SubSectionStart
   * @generated
   */
  public Adapter createSubSectionStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.SubSectionEnd <em>Sub Section End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.SubSectionEnd
   * @generated
   */
  public Adapter createSubSectionEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.OpenViewStart <em>Open View Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.OpenViewStart
   * @generated
   */
  public Adapter createOpenViewStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.OpenViewEnd <em>Open View End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.OpenViewEnd
   * @generated
   */
  public Adapter createOpenViewEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.StartProcessStart <em>Start Process Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.StartProcessStart
   * @generated
   */
  public Adapter createStartProcessStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.StartProcessEnd <em>Start Process End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.StartProcessEnd
   * @generated
   */
  public Adapter createStartProcessEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.EntityRefStart <em>Entity Ref Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.EntityRefStart
   * @generated
   */
  public Adapter createEntityRefStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.EntityRefEnd <em>Entity Ref End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.EntityRefEnd
   * @generated
   */
  public Adapter createEntityRefEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.DTORefStart <em>DTO Ref Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.DTORefStart
   * @generated
   */
  public Adapter createDTORefStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.DTORefEnd <em>DTO Ref End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.DTORefEnd
   * @generated
   */
  public Adapter createDTORefEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ProcessRefStart <em>Process Ref Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ProcessRefStart
   * @generated
   */
  public Adapter createProcessRefStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ProcessRefEnd <em>Process Ref End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ProcessRefEnd
   * @generated
   */
  public Adapter createProcessRefEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.TaskRefStart <em>Task Ref Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.TaskRefStart
   * @generated
   */
  public Adapter createTaskRefStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.TaskRefEnd <em>Task Ref End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.TaskRefEnd
   * @generated
   */
  public Adapter createTaskRefEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ViewRefStart <em>View Ref Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ViewRefStart
   * @generated
   */
  public Adapter createViewRefStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ViewRefEnd <em>View Ref End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ViewRefEnd
   * @generated
   */
  public Adapter createViewRefEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.UIRefStart <em>UI Ref Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.UIRefStart
   * @generated
   */
  public Adapter createUIRefStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.UIRefEnd <em>UI Ref End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.UIRefEnd
   * @generated
   */
  public Adapter createUIRefEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.BoxStart <em>Box Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.BoxStart
   * @generated
   */
  public Adapter createBoxStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.BoxEnd <em>Box End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.BoxEnd
   * @generated
   */
  public Adapter createBoxEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ContainerStart <em>Container Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ContainerStart
   * @generated
   */
  public Adapter createContainerStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ContainerEnd <em>Container End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ContainerEnd
   * @generated
   */
  public Adapter createContainerEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ColumnLayoutStart <em>Column Layout Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ColumnLayoutStart
   * @generated
   */
  public Adapter createColumnLayoutStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ColumnLayoutEnd <em>Column Layout End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ColumnLayoutEnd
   * @generated
   */
  public Adapter createColumnLayoutEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ColumnStart <em>Column Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ColumnStart
   * @generated
   */
  public Adapter createColumnStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ColumnEnd <em>Column End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.ColumnEnd
   * @generated
   */
  public Adapter createColumnEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.FooterStart <em>Footer Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.FooterStart
   * @generated
   */
  public Adapter createFooterStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.FooterEnd <em>Footer End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.FooterEnd
   * @generated
   */
  public Adapter createFooterEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.HeaderStart <em>Header Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.HeaderStart
   * @generated
   */
  public Adapter createHeaderStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.HeaderEnd <em>Header End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.HeaderEnd
   * @generated
   */
  public Adapter createHeaderEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.IndexStart <em>Index Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.IndexStart
   * @generated
   */
  public Adapter createIndexStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.IndexEnd <em>Index End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.IndexEnd
   * @generated
   */
  public Adapter createIndexEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.IndexElementStart <em>Index Element Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.IndexElementStart
   * @generated
   */
  public Adapter createIndexElementStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.IndexElementEnd <em>Index Element End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.IndexElementEnd
   * @generated
   */
  public Adapter createIndexElementEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LunDocCompilerAdapterFactory
