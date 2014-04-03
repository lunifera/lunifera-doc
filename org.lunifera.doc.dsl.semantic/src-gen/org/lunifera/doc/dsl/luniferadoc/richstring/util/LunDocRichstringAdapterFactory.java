/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XStringLiteral;

import org.lunifera.doc.dsl.luniferadoc.richstring.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage
 * @generated
 */
public class LunDocRichstringAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LunDocRichstringPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LunDocRichstringAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LunDocRichstringPackage.eINSTANCE;
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
  protected LunDocRichstringSwitch<Adapter> modelSwitch =
    new LunDocRichstringSwitch<Adapter>()
    {
      @Override
      public Adapter caseRichString(RichString object)
      {
        return createRichStringAdapter();
      }
      @Override
      public Adapter caseRichStringIf(RichStringIf object)
      {
        return createRichStringIfAdapter();
      }
      @Override
      public Adapter caseRichStringElseIf(RichStringElseIf object)
      {
        return createRichStringElseIfAdapter();
      }
      @Override
      public Adapter caseRichStringLiteral(RichStringLiteral object)
      {
        return createRichStringLiteralAdapter();
      }
      @Override
      public Adapter caseRichStringForLoop(RichStringForLoop object)
      {
        return createRichStringForLoopAdapter();
      }
      @Override
      public Adapter caseRichStringMarkup(RichStringMarkup object)
      {
        return createRichStringMarkupAdapter();
      }
      @Override
      public Adapter caseRichStringExample(RichStringExample object)
      {
        return createRichStringExampleAdapter();
      }
      @Override
      public Adapter caseRichStringH1(RichStringH1 object)
      {
        return createRichStringH1Adapter();
      }
      @Override
      public Adapter caseRichStringH2(RichStringH2 object)
      {
        return createRichStringH2Adapter();
      }
      @Override
      public Adapter caseRichStringH3(RichStringH3 object)
      {
        return createRichStringH3Adapter();
      }
      @Override
      public Adapter caseRichStringH4(RichStringH4 object)
      {
        return createRichStringH4Adapter();
      }
      @Override
      public Adapter caseRichStringH5(RichStringH5 object)
      {
        return createRichStringH5Adapter();
      }
      @Override
      public Adapter caseRichStringH6(RichStringH6 object)
      {
        return createRichStringH6Adapter();
      }
      @Override
      public Adapter caseIndexElement(IndexElement object)
      {
        return createIndexElementAdapter();
      }
      @Override
      public Adapter caseRichStringChapter(RichStringChapter object)
      {
        return createRichStringChapterAdapter();
      }
      @Override
      public Adapter caseRichStringSection(RichStringSection object)
      {
        return createRichStringSectionAdapter();
      }
      @Override
      public Adapter caseRichStringSubsection(RichStringSubsection object)
      {
        return createRichStringSubsectionAdapter();
      }
      @Override
      public Adapter caseRichStringURL(RichStringURL object)
      {
        return createRichStringURLAdapter();
      }
      @Override
      public Adapter caseRichStringRef(RichStringRef object)
      {
        return createRichStringRefAdapter();
      }
      @Override
      public Adapter caseRichStringBold(RichStringBold object)
      {
        return createRichStringBoldAdapter();
      }
      @Override
      public Adapter caseRichStringUnderline(RichStringUnderline object)
      {
        return createRichStringUnderlineAdapter();
      }
      @Override
      public Adapter caseRichStringItalic(RichStringItalic object)
      {
        return createRichStringItalicAdapter();
      }
      @Override
      public Adapter caseRichStringImg(RichStringImg object)
      {
        return createRichStringImgAdapter();
      }
      @Override
      public Adapter caseRichStringMailto(RichStringMailto object)
      {
        return createRichStringMailtoAdapter();
      }
      @Override
      public Adapter caseRichStringSkype(RichStringSkype object)
      {
        return createRichStringSkypeAdapter();
      }
      @Override
      public Adapter caseRichStringMovie(RichStringMovie object)
      {
        return createRichStringMovieAdapter();
      }
      @Override
      public Adapter caseRichStringCode(RichStringCode object)
      {
        return createRichStringCodeAdapter();
      }
      @Override
      public Adapter caseRichStringTable(RichStringTable object)
      {
        return createRichStringTableAdapter();
      }
      @Override
      public Adapter caseRichStringTableRow(RichStringTableRow object)
      {
        return createRichStringTableRowAdapter();
      }
      @Override
      public Adapter caseRichStringTableCell(RichStringTableCell object)
      {
        return createRichStringTableCellAdapter();
      }
      @Override
      public Adapter caseRichStringOpenView(RichStringOpenView object)
      {
        return createRichStringOpenViewAdapter();
      }
      @Override
      public Adapter caseRichStringStartProcess(RichStringStartProcess object)
      {
        return createRichStringStartProcessAdapter();
      }
      @Override
      public Adapter caseRichStringEntityRef(RichStringEntityRef object)
      {
        return createRichStringEntityRefAdapter();
      }
      @Override
      public Adapter caseRichStringDTORef(RichStringDTORef object)
      {
        return createRichStringDTORefAdapter();
      }
      @Override
      public Adapter caseRichStringTaskRef(RichStringTaskRef object)
      {
        return createRichStringTaskRefAdapter();
      }
      @Override
      public Adapter caseRichStringProcessRef(RichStringProcessRef object)
      {
        return createRichStringProcessRefAdapter();
      }
      @Override
      public Adapter caseRichStringViewRef(RichStringViewRef object)
      {
        return createRichStringViewRefAdapter();
      }
      @Override
      public Adapter caseRichStringUIRef(RichStringUIRef object)
      {
        return createRichStringUIRefAdapter();
      }
      @Override
      public Adapter caseRichStringList(RichStringList object)
      {
        return createRichStringListAdapter();
      }
      @Override
      public Adapter caseRichStringOrderedList(RichStringOrderedList object)
      {
        return createRichStringOrderedListAdapter();
      }
      @Override
      public Adapter caseRichStringListElement(RichStringListElement object)
      {
        return createRichStringListElementAdapter();
      }
      @Override
      public Adapter caseRichStringSpan(RichStringSpan object)
      {
        return createRichStringSpanAdapter();
      }
      @Override
      public Adapter caseRichStringBox(RichStringBox object)
      {
        return createRichStringBoxAdapter();
      }
      @Override
      public Adapter caseRichStringContainer(RichStringContainer object)
      {
        return createRichStringContainerAdapter();
      }
      @Override
      public Adapter caseRichStringColumnLayout(RichStringColumnLayout object)
      {
        return createRichStringColumnLayoutAdapter();
      }
      @Override
      public Adapter caseRichStringColumn(RichStringColumn object)
      {
        return createRichStringColumnAdapter();
      }
      @Override
      public Adapter caseRichStringFooter(RichStringFooter object)
      {
        return createRichStringFooterAdapter();
      }
      @Override
      public Adapter caseRichStringHeader(RichStringHeader object)
      {
        return createRichStringHeaderAdapter();
      }
      @Override
      public Adapter caseRichStringIndex(RichStringIndex object)
      {
        return createRichStringIndexAdapter();
      }
      @Override
      public Adapter caseRichStringIndexElement(RichStringIndexElement object)
      {
        return createRichStringIndexElementAdapter();
      }
      @Override
      public Adapter caseXExpression(XExpression object)
      {
        return createXExpressionAdapter();
      }
      @Override
      public Adapter caseXBlockExpression(XBlockExpression object)
      {
        return createXBlockExpressionAdapter();
      }
      @Override
      public Adapter caseXStringLiteral(XStringLiteral object)
      {
        return createXStringLiteralAdapter();
      }
      @Override
      public Adapter caseXForLoopExpression(XForLoopExpression object)
      {
        return createXForLoopExpressionAdapter();
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
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichString <em>Rich String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichString
   * @generated
   */
  public Adapter createRichStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf <em>Rich String If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf
   * @generated
   */
  public Adapter createRichStringIfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf <em>Rich String Else If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf
   * @generated
   */
  public Adapter createRichStringElseIfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral <em>Rich String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral
   * @generated
   */
  public Adapter createRichStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop <em>Rich String For Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop
   * @generated
   */
  public Adapter createRichStringForLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup <em>Rich String Markup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup
   * @generated
   */
  public Adapter createRichStringMarkupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringExample <em>Rich String Example</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringExample
   * @generated
   */
  public Adapter createRichStringExampleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH1 <em>Rich String H1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH1
   * @generated
   */
  public Adapter createRichStringH1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH2 <em>Rich String H2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH2
   * @generated
   */
  public Adapter createRichStringH2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH3 <em>Rich String H3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH3
   * @generated
   */
  public Adapter createRichStringH3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH4 <em>Rich String H4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH4
   * @generated
   */
  public Adapter createRichStringH4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH5 <em>Rich String H5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH5
   * @generated
   */
  public Adapter createRichStringH5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH6 <em>Rich String H6</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH6
   * @generated
   */
  public Adapter createRichStringH6Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.IndexElement <em>Index Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.IndexElement
   * @generated
   */
  public Adapter createIndexElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringChapter <em>Rich String Chapter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringChapter
   * @generated
   */
  public Adapter createRichStringChapterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSection <em>Rich String Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSection
   * @generated
   */
  public Adapter createRichStringSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSubsection <em>Rich String Subsection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSubsection
   * @generated
   */
  public Adapter createRichStringSubsectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL <em>Rich String URL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL
   * @generated
   */
  public Adapter createRichStringURLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringRef <em>Rich String Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringRef
   * @generated
   */
  public Adapter createRichStringRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBold <em>Rich String Bold</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBold
   * @generated
   */
  public Adapter createRichStringBoldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUnderline <em>Rich String Underline</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUnderline
   * @generated
   */
  public Adapter createRichStringUnderlineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringItalic <em>Rich String Italic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringItalic
   * @generated
   */
  public Adapter createRichStringItalicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg <em>Rich String Img</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg
   * @generated
   */
  public Adapter createRichStringImgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto <em>Rich String Mailto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto
   * @generated
   */
  public Adapter createRichStringMailtoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSkype <em>Rich String Skype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSkype
   * @generated
   */
  public Adapter createRichStringSkypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie <em>Rich String Movie</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie
   * @generated
   */
  public Adapter createRichStringMovieAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode <em>Rich String Code</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode
   * @generated
   */
  public Adapter createRichStringCodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTable <em>Rich String Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTable
   * @generated
   */
  public Adapter createRichStringTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow <em>Rich String Table Row</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow
   * @generated
   */
  public Adapter createRichStringTableRowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableCell <em>Rich String Table Cell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableCell
   * @generated
   */
  public Adapter createRichStringTableCellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringOpenView <em>Rich String Open View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringOpenView
   * @generated
   */
  public Adapter createRichStringOpenViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringStartProcess <em>Rich String Start Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringStartProcess
   * @generated
   */
  public Adapter createRichStringStartProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef <em>Rich String Entity Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef
   * @generated
   */
  public Adapter createRichStringEntityRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef <em>Rich String DTO Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef
   * @generated
   */
  public Adapter createRichStringDTORefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTaskRef <em>Rich String Task Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTaskRef
   * @generated
   */
  public Adapter createRichStringTaskRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringProcessRef <em>Rich String Process Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringProcessRef
   * @generated
   */
  public Adapter createRichStringProcessRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringViewRef <em>Rich String View Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringViewRef
   * @generated
   */
  public Adapter createRichStringViewRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUIRef <em>Rich String UI Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUIRef
   * @generated
   */
  public Adapter createRichStringUIRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringList <em>Rich String List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringList
   * @generated
   */
  public Adapter createRichStringListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringOrderedList <em>Rich String Ordered List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringOrderedList
   * @generated
   */
  public Adapter createRichStringOrderedListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringListElement <em>Rich String List Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringListElement
   * @generated
   */
  public Adapter createRichStringListElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSpan <em>Rich String Span</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSpan
   * @generated
   */
  public Adapter createRichStringSpanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBox <em>Rich String Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBox
   * @generated
   */
  public Adapter createRichStringBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringContainer <em>Rich String Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringContainer
   * @generated
   */
  public Adapter createRichStringContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringColumnLayout <em>Rich String Column Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringColumnLayout
   * @generated
   */
  public Adapter createRichStringColumnLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringColumn <em>Rich String Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringColumn
   * @generated
   */
  public Adapter createRichStringColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringFooter <em>Rich String Footer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringFooter
   * @generated
   */
  public Adapter createRichStringFooterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringHeader <em>Rich String Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringHeader
   * @generated
   */
  public Adapter createRichStringHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIndex <em>Rich String Index</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIndex
   * @generated
   */
  public Adapter createRichStringIndexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIndexElement <em>Rich String Index Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIndexElement
   * @generated
   */
  public Adapter createRichStringIndexElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XExpression <em>XExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XExpression
   * @generated
   */
  public Adapter createXExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XBlockExpression <em>XBlock Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XBlockExpression
   * @generated
   */
  public Adapter createXBlockExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XStringLiteral <em>XString Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XStringLiteral
   * @generated
   */
  public Adapter createXStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XForLoopExpression <em>XFor Loop Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XForLoopExpression
   * @generated
   */
  public Adapter createXForLoopExpressionAdapter()
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

} //LunDocRichstringAdapterFactory