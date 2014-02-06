/**
 */
package org.lunifera.doc.dsl.luniferadoc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.doc.dsl.luniferadoc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LunDocFactoryImpl extends EFactoryImpl implements LunDocFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LunDocFactory init()
  {
    try
    {
      LunDocFactory theLunDocFactory = (LunDocFactory)EPackage.Registry.INSTANCE.getEFactory(LunDocPackage.eNS_URI);
      if (theLunDocFactory != null)
      {
        return theLunDocFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LunDocFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LunDocFactoryImpl()
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
      case LunDocPackage.LDOC_INCLUDE: return createLDocInclude();
      case LunDocPackage.LDOC_ENTITY_DOCUMENT: return createLDocEntityDocument();
      case LunDocPackage.LDOC_ENTITY_FIELD: return createLDocEntityField();
      case LunDocPackage.LDOC_DTO_DOCUMENT: return createLDocDtoDocument();
      case LunDocPackage.LDOC_DTO_PROPERTY: return createLDocDtoProperty();
      case LunDocPackage.LDOC_BPM_PROCESS_DOCUMENT: return createLDocBPMProcessDocument();
      case LunDocPackage.LDOC_HUMAN_TASK_DOCUMENT: return createLDocHumanTaskDocument();
      case LunDocPackage.LDOC_VIEW_DOCUMENT: return createLDocViewDocument();
      case LunDocPackage.LDOC_UI_DOCUMENT: return createLDocUIDocument();
      case LunDocPackage.LDOC_LAYOUTER: return createLDocLayouter();
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
      case LunDocPackage.LDOC_TYPE:
        return createLDocTypeFromString(eDataType, initialValue);
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
      case LunDocPackage.LDOC_TYPE:
        return convertLDocTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocInclude createLDocInclude()
  {
    LDocIncludeImpl lDocInclude = new LDocIncludeImpl();
    return lDocInclude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocEntityDocument createLDocEntityDocument()
  {
    LDocEntityDocumentImpl lDocEntityDocument = new LDocEntityDocumentImpl();
    return lDocEntityDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocEntityField createLDocEntityField()
  {
    LDocEntityFieldImpl lDocEntityField = new LDocEntityFieldImpl();
    return lDocEntityField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocDtoDocument createLDocDtoDocument()
  {
    LDocDtoDocumentImpl lDocDtoDocument = new LDocDtoDocumentImpl();
    return lDocDtoDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocDtoProperty createLDocDtoProperty()
  {
    LDocDtoPropertyImpl lDocDtoProperty = new LDocDtoPropertyImpl();
    return lDocDtoProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocBPMProcessDocument createLDocBPMProcessDocument()
  {
    LDocBPMProcessDocumentImpl lDocBPMProcessDocument = new LDocBPMProcessDocumentImpl();
    return lDocBPMProcessDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocHumanTaskDocument createLDocHumanTaskDocument()
  {
    LDocHumanTaskDocumentImpl lDocHumanTaskDocument = new LDocHumanTaskDocumentImpl();
    return lDocHumanTaskDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocViewDocument createLDocViewDocument()
  {
    LDocViewDocumentImpl lDocViewDocument = new LDocViewDocumentImpl();
    return lDocViewDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocUIDocument createLDocUIDocument()
  {
    LDocUIDocumentImpl lDocUIDocument = new LDocUIDocumentImpl();
    return lDocUIDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocLayouter createLDocLayouter()
  {
    LDocLayouterImpl lDocLayouter = new LDocLayouterImpl();
    return lDocLayouter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocType createLDocTypeFromString(EDataType eDataType, String initialValue)
  {
    LDocType result = LDocType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLDocTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LunDocPackage getLunDocPackage()
  {
    return (LunDocPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LunDocPackage getPackage()
  {
    return LunDocPackage.eINSTANCE;
  }

} //LunDocFactoryImpl
