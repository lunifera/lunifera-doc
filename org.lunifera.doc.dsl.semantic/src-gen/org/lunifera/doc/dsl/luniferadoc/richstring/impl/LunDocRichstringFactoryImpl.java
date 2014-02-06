/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.doc.dsl.luniferadoc.richstring.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LunDocRichstringFactoryImpl extends EFactoryImpl implements LunDocRichstringFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LunDocRichstringFactory init()
  {
    try
    {
      LunDocRichstringFactory theLunDocRichstringFactory = (LunDocRichstringFactory)EPackage.Registry.INSTANCE.getEFactory(LunDocRichstringPackage.eNS_URI);
      if (theLunDocRichstringFactory != null)
      {
        return theLunDocRichstringFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LunDocRichstringFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LunDocRichstringFactoryImpl()
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
      case LunDocRichstringPackage.RICH_STRING: return createRichString();
      case LunDocRichstringPackage.RICH_STRING_IF: return createRichStringIf();
      case LunDocRichstringPackage.RICH_STRING_ELSE_IF: return createRichStringElseIf();
      case LunDocRichstringPackage.RICH_STRING_LITERAL: return createRichStringLiteral();
      case LunDocRichstringPackage.RICH_STRING_FOR_LOOP: return createRichStringForLoop();
      case LunDocRichstringPackage.RICH_STRING_EXAMPLE: return createRichStringExample();
      case LunDocRichstringPackage.RICH_STRING_H1: return createRichStringH1();
      case LunDocRichstringPackage.RICH_STRING_H2: return createRichStringH2();
      case LunDocRichstringPackage.RICH_STRING_H3: return createRichStringH3();
      case LunDocRichstringPackage.RICH_STRING_H4: return createRichStringH4();
      case LunDocRichstringPackage.RICH_STRING_H5: return createRichStringH5();
      case LunDocRichstringPackage.RICH_STRING_H6: return createRichStringH6();
      case LunDocRichstringPackage.RICH_STRING_CHAPTER: return createRichStringChapter();
      case LunDocRichstringPackage.RICH_STRING_SECTION: return createRichStringSection();
      case LunDocRichstringPackage.RICH_STRING_SUBSECTION: return createRichStringSubsection();
      case LunDocRichstringPackage.RICH_STRING_URL: return createRichStringURL();
      case LunDocRichstringPackage.RICH_STRING_REF: return createRichStringRef();
      case LunDocRichstringPackage.RICH_STRING_BOLD: return createRichStringBold();
      case LunDocRichstringPackage.RICH_STRING_UNDERLINE: return createRichStringUnderline();
      case LunDocRichstringPackage.RICH_STRING_ITALIC: return createRichStringItalic();
      case LunDocRichstringPackage.RICH_STRING_IMG: return createRichStringImg();
      case LunDocRichstringPackage.RICH_STRING_MAILTO: return createRichStringMailto();
      case LunDocRichstringPackage.RICH_STRING_SKYPE: return createRichStringSkype();
      case LunDocRichstringPackage.RICH_STRING_MOVIE: return createRichStringMovie();
      case LunDocRichstringPackage.RICH_STRING_CODE: return createRichStringCode();
      case LunDocRichstringPackage.RICH_STRING_TABLE: return createRichStringTable();
      case LunDocRichstringPackage.RICH_STRING_TABLE_ROW: return createRichStringTableRow();
      case LunDocRichstringPackage.RICH_STRING_TABLE_CELL: return createRichStringTableCell();
      case LunDocRichstringPackage.RICH_STRING_OPEN_VIEW: return createRichStringOpenView();
      case LunDocRichstringPackage.RICH_STRING_START_PROCESS: return createRichStringStartProcess();
      case LunDocRichstringPackage.RICH_STRING_ENTITY_REF: return createRichStringEntityRef();
      case LunDocRichstringPackage.RICH_STRING_DTO_REF: return createRichStringDTORef();
      case LunDocRichstringPackage.RICH_STRING_TASK_REF: return createRichStringTaskRef();
      case LunDocRichstringPackage.RICH_STRING_PROCESS_REF: return createRichStringProcessRef();
      case LunDocRichstringPackage.RICH_STRING_VIEW_REF: return createRichStringViewRef();
      case LunDocRichstringPackage.RICH_STRING_UI_REF: return createRichStringUIRef();
      case LunDocRichstringPackage.RICH_STRING_LIST: return createRichStringList();
      case LunDocRichstringPackage.RICH_STRING_ORDERED_LIST: return createRichStringOrderedList();
      case LunDocRichstringPackage.RICH_STRING_LIST_ELEMENT: return createRichStringListElement();
      case LunDocRichstringPackage.RICH_STRING_SPAN: return createRichStringSpan();
      case LunDocRichstringPackage.RICH_STRING_BOX: return createRichStringBox();
      case LunDocRichstringPackage.RICH_STRING_CONTAINER: return createRichStringContainer();
      case LunDocRichstringPackage.RICH_STRING_COLUMN_LAYOUT: return createRichStringColumnLayout();
      case LunDocRichstringPackage.RICH_STRING_COLUMN: return createRichStringColumn();
      case LunDocRichstringPackage.RICH_STRING_FOOTER: return createRichStringFooter();
      case LunDocRichstringPackage.RICH_STRING_HEADER: return createRichStringHeader();
      case LunDocRichstringPackage.RICH_STRING_INDEX: return createRichStringIndex();
      case LunDocRichstringPackage.RICH_STRING_INDEX_ELEMENT: return createRichStringIndexElement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case LunDocRichstringPackage.MARKUP_ORIENTATION:
        return createMarkupOrientationFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case LunDocRichstringPackage.MARKUP_ORIENTATION:
        return convertMarkupOrientationToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichString createRichString()
  {
    RichStringImpl richString = new RichStringImpl();
    return richString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringIf createRichStringIf()
  {
    RichStringIfImpl richStringIf = new RichStringIfImpl();
    return richStringIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringElseIf createRichStringElseIf()
  {
    RichStringElseIfImpl richStringElseIf = new RichStringElseIfImpl();
    return richStringElseIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringLiteral createRichStringLiteral()
  {
    RichStringLiteralImpl richStringLiteral = new RichStringLiteralImpl();
    return richStringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringForLoop createRichStringForLoop()
  {
    RichStringForLoopImpl richStringForLoop = new RichStringForLoopImpl();
    return richStringForLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringExample createRichStringExample()
  {
    RichStringExampleImpl richStringExample = new RichStringExampleImpl();
    return richStringExample;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringH1 createRichStringH1()
  {
    RichStringH1Impl richStringH1 = new RichStringH1Impl();
    return richStringH1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringH2 createRichStringH2()
  {
    RichStringH2Impl richStringH2 = new RichStringH2Impl();
    return richStringH2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringH3 createRichStringH3()
  {
    RichStringH3Impl richStringH3 = new RichStringH3Impl();
    return richStringH3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringH4 createRichStringH4()
  {
    RichStringH4Impl richStringH4 = new RichStringH4Impl();
    return richStringH4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringH5 createRichStringH5()
  {
    RichStringH5Impl richStringH5 = new RichStringH5Impl();
    return richStringH5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringH6 createRichStringH6()
  {
    RichStringH6Impl richStringH6 = new RichStringH6Impl();
    return richStringH6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringChapter createRichStringChapter()
  {
    RichStringChapterImpl richStringChapter = new RichStringChapterImpl();
    return richStringChapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringSection createRichStringSection()
  {
    RichStringSectionImpl richStringSection = new RichStringSectionImpl();
    return richStringSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringSubsection createRichStringSubsection()
  {
    RichStringSubsectionImpl richStringSubsection = new RichStringSubsectionImpl();
    return richStringSubsection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringURL createRichStringURL()
  {
    RichStringURLImpl richStringURL = new RichStringURLImpl();
    return richStringURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringRef createRichStringRef()
  {
    RichStringRefImpl richStringRef = new RichStringRefImpl();
    return richStringRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringBold createRichStringBold()
  {
    RichStringBoldImpl richStringBold = new RichStringBoldImpl();
    return richStringBold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringUnderline createRichStringUnderline()
  {
    RichStringUnderlineImpl richStringUnderline = new RichStringUnderlineImpl();
    return richStringUnderline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringItalic createRichStringItalic()
  {
    RichStringItalicImpl richStringItalic = new RichStringItalicImpl();
    return richStringItalic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringImg createRichStringImg()
  {
    RichStringImgImpl richStringImg = new RichStringImgImpl();
    return richStringImg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringMailto createRichStringMailto()
  {
    RichStringMailtoImpl richStringMailto = new RichStringMailtoImpl();
    return richStringMailto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringSkype createRichStringSkype()
  {
    RichStringSkypeImpl richStringSkype = new RichStringSkypeImpl();
    return richStringSkype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringMovie createRichStringMovie()
  {
    RichStringMovieImpl richStringMovie = new RichStringMovieImpl();
    return richStringMovie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringCode createRichStringCode()
  {
    RichStringCodeImpl richStringCode = new RichStringCodeImpl();
    return richStringCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringTable createRichStringTable()
  {
    RichStringTableImpl richStringTable = new RichStringTableImpl();
    return richStringTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringTableRow createRichStringTableRow()
  {
    RichStringTableRowImpl richStringTableRow = new RichStringTableRowImpl();
    return richStringTableRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringTableCell createRichStringTableCell()
  {
    RichStringTableCellImpl richStringTableCell = new RichStringTableCellImpl();
    return richStringTableCell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringOpenView createRichStringOpenView()
  {
    RichStringOpenViewImpl richStringOpenView = new RichStringOpenViewImpl();
    return richStringOpenView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringStartProcess createRichStringStartProcess()
  {
    RichStringStartProcessImpl richStringStartProcess = new RichStringStartProcessImpl();
    return richStringStartProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringEntityRef createRichStringEntityRef()
  {
    RichStringEntityRefImpl richStringEntityRef = new RichStringEntityRefImpl();
    return richStringEntityRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringDTORef createRichStringDTORef()
  {
    RichStringDTORefImpl richStringDTORef = new RichStringDTORefImpl();
    return richStringDTORef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringTaskRef createRichStringTaskRef()
  {
    RichStringTaskRefImpl richStringTaskRef = new RichStringTaskRefImpl();
    return richStringTaskRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringProcessRef createRichStringProcessRef()
  {
    RichStringProcessRefImpl richStringProcessRef = new RichStringProcessRefImpl();
    return richStringProcessRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringViewRef createRichStringViewRef()
  {
    RichStringViewRefImpl richStringViewRef = new RichStringViewRefImpl();
    return richStringViewRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringUIRef createRichStringUIRef()
  {
    RichStringUIRefImpl richStringUIRef = new RichStringUIRefImpl();
    return richStringUIRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringList createRichStringList()
  {
    RichStringListImpl richStringList = new RichStringListImpl();
    return richStringList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringOrderedList createRichStringOrderedList()
  {
    RichStringOrderedListImpl richStringOrderedList = new RichStringOrderedListImpl();
    return richStringOrderedList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringListElement createRichStringListElement()
  {
    RichStringListElementImpl richStringListElement = new RichStringListElementImpl();
    return richStringListElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringSpan createRichStringSpan()
  {
    RichStringSpanImpl richStringSpan = new RichStringSpanImpl();
    return richStringSpan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringBox createRichStringBox()
  {
    RichStringBoxImpl richStringBox = new RichStringBoxImpl();
    return richStringBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringContainer createRichStringContainer()
  {
    RichStringContainerImpl richStringContainer = new RichStringContainerImpl();
    return richStringContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringColumnLayout createRichStringColumnLayout()
  {
    RichStringColumnLayoutImpl richStringColumnLayout = new RichStringColumnLayoutImpl();
    return richStringColumnLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringColumn createRichStringColumn()
  {
    RichStringColumnImpl richStringColumn = new RichStringColumnImpl();
    return richStringColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringFooter createRichStringFooter()
  {
    RichStringFooterImpl richStringFooter = new RichStringFooterImpl();
    return richStringFooter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringHeader createRichStringHeader()
  {
    RichStringHeaderImpl richStringHeader = new RichStringHeaderImpl();
    return richStringHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringIndex createRichStringIndex()
  {
    RichStringIndexImpl richStringIndex = new RichStringIndexImpl();
    return richStringIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringIndexElement createRichStringIndexElement()
  {
    RichStringIndexElementImpl richStringIndexElement = new RichStringIndexElementImpl();
    return richStringIndexElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkupOrientation createMarkupOrientationFromString(EDataType eDataType, String initialValue)
  {
    MarkupOrientation result = MarkupOrientation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMarkupOrientationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LunDocRichstringPackage getLunDocRichstringPackage()
  {
    return (LunDocRichstringPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LunDocRichstringPackage getPackage()
  {
    return LunDocRichstringPackage.eINSTANCE;
  }

} //LunDocRichstringFactoryImpl
