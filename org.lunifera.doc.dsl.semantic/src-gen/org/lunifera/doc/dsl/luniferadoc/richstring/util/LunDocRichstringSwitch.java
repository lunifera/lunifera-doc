/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XStringLiteral;

import org.lunifera.doc.dsl.luniferadoc.richstring.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage
 * @generated
 */
public class LunDocRichstringSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LunDocRichstringPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LunDocRichstringSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LunDocRichstringPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LunDocRichstringPackage.RICH_STRING:
      {
        RichString richString = (RichString)theEObject;
        T result = caseRichString(richString);
        if (result == null) result = caseXBlockExpression(richString);
        if (result == null) result = caseXExpression(richString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_IF:
      {
        RichStringIf richStringIf = (RichStringIf)theEObject;
        T result = caseRichStringIf(richStringIf);
        if (result == null) result = caseXExpression(richStringIf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_ELSE_IF:
      {
        RichStringElseIf richStringElseIf = (RichStringElseIf)theEObject;
        T result = caseRichStringElseIf(richStringElseIf);
        if (result == null) result = caseXExpression(richStringElseIf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_LITERAL:
      {
        RichStringLiteral richStringLiteral = (RichStringLiteral)theEObject;
        T result = caseRichStringLiteral(richStringLiteral);
        if (result == null) result = caseXStringLiteral(richStringLiteral);
        if (result == null) result = caseXExpression(richStringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_FOR_LOOP:
      {
        RichStringForLoop richStringForLoop = (RichStringForLoop)theEObject;
        T result = caseRichStringForLoop(richStringForLoop);
        if (result == null) result = caseXForLoopExpression(richStringForLoop);
        if (result == null) result = caseXExpression(richStringForLoop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_MARKUP:
      {
        RichStringMarkup richStringMarkup = (RichStringMarkup)theEObject;
        T result = caseRichStringMarkup(richStringMarkup);
        if (result == null) result = caseXExpression(richStringMarkup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_EXAMPLE:
      {
        RichStringExample richStringExample = (RichStringExample)theEObject;
        T result = caseRichStringExample(richStringExample);
        if (result == null) result = caseRichStringMarkup(richStringExample);
        if (result == null) result = caseXExpression(richStringExample);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_H1:
      {
        RichStringH1 richStringH1 = (RichStringH1)theEObject;
        T result = caseRichStringH1(richStringH1);
        if (result == null) result = caseRichStringMarkup(richStringH1);
        if (result == null) result = caseXExpression(richStringH1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_H2:
      {
        RichStringH2 richStringH2 = (RichStringH2)theEObject;
        T result = caseRichStringH2(richStringH2);
        if (result == null) result = caseRichStringMarkup(richStringH2);
        if (result == null) result = caseXExpression(richStringH2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_H3:
      {
        RichStringH3 richStringH3 = (RichStringH3)theEObject;
        T result = caseRichStringH3(richStringH3);
        if (result == null) result = caseRichStringMarkup(richStringH3);
        if (result == null) result = caseXExpression(richStringH3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_H4:
      {
        RichStringH4 richStringH4 = (RichStringH4)theEObject;
        T result = caseRichStringH4(richStringH4);
        if (result == null) result = caseRichStringMarkup(richStringH4);
        if (result == null) result = caseXExpression(richStringH4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_H5:
      {
        RichStringH5 richStringH5 = (RichStringH5)theEObject;
        T result = caseRichStringH5(richStringH5);
        if (result == null) result = caseRichStringMarkup(richStringH5);
        if (result == null) result = caseXExpression(richStringH5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_H6:
      {
        RichStringH6 richStringH6 = (RichStringH6)theEObject;
        T result = caseRichStringH6(richStringH6);
        if (result == null) result = caseRichStringMarkup(richStringH6);
        if (result == null) result = caseXExpression(richStringH6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.INDEX_ELEMENT:
      {
        IndexElement indexElement = (IndexElement)theEObject;
        T result = caseIndexElement(indexElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_CHAPTER:
      {
        RichStringChapter richStringChapter = (RichStringChapter)theEObject;
        T result = caseRichStringChapter(richStringChapter);
        if (result == null) result = caseRichStringMarkup(richStringChapter);
        if (result == null) result = caseIndexElement(richStringChapter);
        if (result == null) result = caseXExpression(richStringChapter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_SECTION:
      {
        RichStringSection richStringSection = (RichStringSection)theEObject;
        T result = caseRichStringSection(richStringSection);
        if (result == null) result = caseRichStringMarkup(richStringSection);
        if (result == null) result = caseIndexElement(richStringSection);
        if (result == null) result = caseXExpression(richStringSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_SUBSECTION:
      {
        RichStringSubsection richStringSubsection = (RichStringSubsection)theEObject;
        T result = caseRichStringSubsection(richStringSubsection);
        if (result == null) result = caseRichStringMarkup(richStringSubsection);
        if (result == null) result = caseIndexElement(richStringSubsection);
        if (result == null) result = caseXExpression(richStringSubsection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_URL:
      {
        RichStringURL richStringURL = (RichStringURL)theEObject;
        T result = caseRichStringURL(richStringURL);
        if (result == null) result = caseRichStringMarkup(richStringURL);
        if (result == null) result = caseXExpression(richStringURL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_REF:
      {
        RichStringRef richStringRef = (RichStringRef)theEObject;
        T result = caseRichStringRef(richStringRef);
        if (result == null) result = caseRichStringMarkup(richStringRef);
        if (result == null) result = caseXExpression(richStringRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_BOLD:
      {
        RichStringBold richStringBold = (RichStringBold)theEObject;
        T result = caseRichStringBold(richStringBold);
        if (result == null) result = caseRichStringMarkup(richStringBold);
        if (result == null) result = caseXExpression(richStringBold);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_UNDERLINE:
      {
        RichStringUnderline richStringUnderline = (RichStringUnderline)theEObject;
        T result = caseRichStringUnderline(richStringUnderline);
        if (result == null) result = caseRichStringMarkup(richStringUnderline);
        if (result == null) result = caseXExpression(richStringUnderline);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_ITALIC:
      {
        RichStringItalic richStringItalic = (RichStringItalic)theEObject;
        T result = caseRichStringItalic(richStringItalic);
        if (result == null) result = caseRichStringMarkup(richStringItalic);
        if (result == null) result = caseXExpression(richStringItalic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_IMG:
      {
        RichStringImg richStringImg = (RichStringImg)theEObject;
        T result = caseRichStringImg(richStringImg);
        if (result == null) result = caseRichStringMarkup(richStringImg);
        if (result == null) result = caseXExpression(richStringImg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_MAILTO:
      {
        RichStringMailto richStringMailto = (RichStringMailto)theEObject;
        T result = caseRichStringMailto(richStringMailto);
        if (result == null) result = caseRichStringMarkup(richStringMailto);
        if (result == null) result = caseXExpression(richStringMailto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_SKYPE:
      {
        RichStringSkype richStringSkype = (RichStringSkype)theEObject;
        T result = caseRichStringSkype(richStringSkype);
        if (result == null) result = caseRichStringMarkup(richStringSkype);
        if (result == null) result = caseXExpression(richStringSkype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_MOVIE:
      {
        RichStringMovie richStringMovie = (RichStringMovie)theEObject;
        T result = caseRichStringMovie(richStringMovie);
        if (result == null) result = caseRichStringMarkup(richStringMovie);
        if (result == null) result = caseXExpression(richStringMovie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_CODE:
      {
        RichStringCode richStringCode = (RichStringCode)theEObject;
        T result = caseRichStringCode(richStringCode);
        if (result == null) result = caseRichStringMarkup(richStringCode);
        if (result == null) result = caseXExpression(richStringCode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_TABLE:
      {
        RichStringTable richStringTable = (RichStringTable)theEObject;
        T result = caseRichStringTable(richStringTable);
        if (result == null) result = caseRichStringMarkup(richStringTable);
        if (result == null) result = caseXExpression(richStringTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_TABLE_ROW:
      {
        RichStringTableRow richStringTableRow = (RichStringTableRow)theEObject;
        T result = caseRichStringTableRow(richStringTableRow);
        if (result == null) result = caseRichStringMarkup(richStringTableRow);
        if (result == null) result = caseXExpression(richStringTableRow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_TABLE_CELL:
      {
        RichStringTableCell richStringTableCell = (RichStringTableCell)theEObject;
        T result = caseRichStringTableCell(richStringTableCell);
        if (result == null) result = caseRichStringMarkup(richStringTableCell);
        if (result == null) result = caseXExpression(richStringTableCell);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_OPEN_VIEW:
      {
        RichStringOpenView richStringOpenView = (RichStringOpenView)theEObject;
        T result = caseRichStringOpenView(richStringOpenView);
        if (result == null) result = caseRichStringMarkup(richStringOpenView);
        if (result == null) result = caseXExpression(richStringOpenView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_START_PROCESS:
      {
        RichStringStartProcess richStringStartProcess = (RichStringStartProcess)theEObject;
        T result = caseRichStringStartProcess(richStringStartProcess);
        if (result == null) result = caseRichStringMarkup(richStringStartProcess);
        if (result == null) result = caseXExpression(richStringStartProcess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_ENTITY_REF:
      {
        RichStringEntityRef richStringEntityRef = (RichStringEntityRef)theEObject;
        T result = caseRichStringEntityRef(richStringEntityRef);
        if (result == null) result = caseRichStringMarkup(richStringEntityRef);
        if (result == null) result = caseXExpression(richStringEntityRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_DTO_REF:
      {
        RichStringDTORef richStringDTORef = (RichStringDTORef)theEObject;
        T result = caseRichStringDTORef(richStringDTORef);
        if (result == null) result = caseRichStringMarkup(richStringDTORef);
        if (result == null) result = caseXExpression(richStringDTORef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_TASK_REF:
      {
        RichStringTaskRef richStringTaskRef = (RichStringTaskRef)theEObject;
        T result = caseRichStringTaskRef(richStringTaskRef);
        if (result == null) result = caseRichStringMarkup(richStringTaskRef);
        if (result == null) result = caseXExpression(richStringTaskRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_PROCESS_REF:
      {
        RichStringProcessRef richStringProcessRef = (RichStringProcessRef)theEObject;
        T result = caseRichStringProcessRef(richStringProcessRef);
        if (result == null) result = caseRichStringMarkup(richStringProcessRef);
        if (result == null) result = caseXExpression(richStringProcessRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_VIEW_REF:
      {
        RichStringViewRef richStringViewRef = (RichStringViewRef)theEObject;
        T result = caseRichStringViewRef(richStringViewRef);
        if (result == null) result = caseRichStringMarkup(richStringViewRef);
        if (result == null) result = caseXExpression(richStringViewRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_UI_REF:
      {
        RichStringUIRef richStringUIRef = (RichStringUIRef)theEObject;
        T result = caseRichStringUIRef(richStringUIRef);
        if (result == null) result = caseRichStringMarkup(richStringUIRef);
        if (result == null) result = caseXExpression(richStringUIRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_LIST:
      {
        RichStringList richStringList = (RichStringList)theEObject;
        T result = caseRichStringList(richStringList);
        if (result == null) result = caseRichStringMarkup(richStringList);
        if (result == null) result = caseXExpression(richStringList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_ORDERED_LIST:
      {
        RichStringOrderedList richStringOrderedList = (RichStringOrderedList)theEObject;
        T result = caseRichStringOrderedList(richStringOrderedList);
        if (result == null) result = caseRichStringMarkup(richStringOrderedList);
        if (result == null) result = caseXExpression(richStringOrderedList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_LIST_ELEMENT:
      {
        RichStringListElement richStringListElement = (RichStringListElement)theEObject;
        T result = caseRichStringListElement(richStringListElement);
        if (result == null) result = caseRichStringMarkup(richStringListElement);
        if (result == null) result = caseXExpression(richStringListElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_SPAN:
      {
        RichStringSpan richStringSpan = (RichStringSpan)theEObject;
        T result = caseRichStringSpan(richStringSpan);
        if (result == null) result = caseRichStringMarkup(richStringSpan);
        if (result == null) result = caseXExpression(richStringSpan);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_BOX:
      {
        RichStringBox richStringBox = (RichStringBox)theEObject;
        T result = caseRichStringBox(richStringBox);
        if (result == null) result = caseRichStringMarkup(richStringBox);
        if (result == null) result = caseXExpression(richStringBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_CONTAINER:
      {
        RichStringContainer richStringContainer = (RichStringContainer)theEObject;
        T result = caseRichStringContainer(richStringContainer);
        if (result == null) result = caseRichStringMarkup(richStringContainer);
        if (result == null) result = caseXExpression(richStringContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_COLUMN_LAYOUT:
      {
        RichStringColumnLayout richStringColumnLayout = (RichStringColumnLayout)theEObject;
        T result = caseRichStringColumnLayout(richStringColumnLayout);
        if (result == null) result = caseRichStringMarkup(richStringColumnLayout);
        if (result == null) result = caseXExpression(richStringColumnLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_COLUMN:
      {
        RichStringColumn richStringColumn = (RichStringColumn)theEObject;
        T result = caseRichStringColumn(richStringColumn);
        if (result == null) result = caseRichStringMarkup(richStringColumn);
        if (result == null) result = caseXExpression(richStringColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_FOOTER:
      {
        RichStringFooter richStringFooter = (RichStringFooter)theEObject;
        T result = caseRichStringFooter(richStringFooter);
        if (result == null) result = caseRichStringContainer(richStringFooter);
        if (result == null) result = caseRichStringMarkup(richStringFooter);
        if (result == null) result = caseXExpression(richStringFooter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_HEADER:
      {
        RichStringHeader richStringHeader = (RichStringHeader)theEObject;
        T result = caseRichStringHeader(richStringHeader);
        if (result == null) result = caseRichStringContainer(richStringHeader);
        if (result == null) result = caseRichStringMarkup(richStringHeader);
        if (result == null) result = caseXExpression(richStringHeader);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_INDEX:
      {
        RichStringIndex richStringIndex = (RichStringIndex)theEObject;
        T result = caseRichStringIndex(richStringIndex);
        if (result == null) result = caseRichStringContainer(richStringIndex);
        if (result == null) result = caseRichStringMarkup(richStringIndex);
        if (result == null) result = caseXExpression(richStringIndex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LunDocRichstringPackage.RICH_STRING_INDEX_ELEMENT:
      {
        RichStringIndexElement richStringIndexElement = (RichStringIndexElement)theEObject;
        T result = caseRichStringIndexElement(richStringIndexElement);
        if (result == null) result = caseRichStringMarkup(richStringIndexElement);
        if (result == null) result = caseXExpression(richStringIndexElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichString(RichString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringIf(RichStringIf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Else If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Else If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringElseIf(RichStringElseIf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringLiteral(RichStringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String For Loop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String For Loop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringForLoop(RichStringForLoop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Markup</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Markup</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringMarkup(RichStringMarkup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Example</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Example</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringExample(RichStringExample object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String H1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String H1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringH1(RichStringH1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String H2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String H2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringH2(RichStringH2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String H3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String H3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringH3(RichStringH3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String H4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String H4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringH4(RichStringH4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String H5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String H5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringH5(RichStringH5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String H6</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String H6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringH6(RichStringH6 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Index Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Index Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexElement(IndexElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Chapter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Chapter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringChapter(RichStringChapter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringSection(RichStringSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Subsection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Subsection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringSubsection(RichStringSubsection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String URL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String URL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringURL(RichStringURL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringRef(RichStringRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Bold</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Bold</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringBold(RichStringBold object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Underline</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Underline</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringUnderline(RichStringUnderline object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Italic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Italic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringItalic(RichStringItalic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Img</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Img</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringImg(RichStringImg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Mailto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Mailto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringMailto(RichStringMailto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Skype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Skype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringSkype(RichStringSkype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Movie</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Movie</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringMovie(RichStringMovie object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Code</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Code</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringCode(RichStringCode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringTable(RichStringTable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Table Row</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Table Row</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringTableRow(RichStringTableRow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Table Cell</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Table Cell</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringTableCell(RichStringTableCell object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Open View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Open View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringOpenView(RichStringOpenView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Start Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Start Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringStartProcess(RichStringStartProcess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Entity Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Entity Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringEntityRef(RichStringEntityRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String DTO Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String DTO Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringDTORef(RichStringDTORef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Task Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Task Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringTaskRef(RichStringTaskRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Process Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Process Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringProcessRef(RichStringProcessRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String View Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String View Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringViewRef(RichStringViewRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String UI Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String UI Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringUIRef(RichStringUIRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringList(RichStringList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Ordered List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Ordered List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringOrderedList(RichStringOrderedList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String List Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String List Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringListElement(RichStringListElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Span</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Span</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringSpan(RichStringSpan object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringBox(RichStringBox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringContainer(RichStringContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Column Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Column Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringColumnLayout(RichStringColumnLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringColumn(RichStringColumn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Footer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Footer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringFooter(RichStringFooter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringHeader(RichStringHeader object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Index</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Index</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringIndex(RichStringIndex object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Index Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Index Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringIndexElement(RichStringIndexElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression(XExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XBlock Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XBlock Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXBlockExpression(XBlockExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XString Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XString Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXStringLiteral(XStringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XFor Loop Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XFor Loop Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXForLoopExpression(XForLoopExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LunDocRichstringSwitch
