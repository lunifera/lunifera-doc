/**
 */
package org.lunifera.doc.dsl.luniferadoc.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.doc.dsl.luniferadoc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage
 * @generated
 */
public class LunDocAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LunDocPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LunDocAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LunDocPackage.eINSTANCE;
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
  protected LunDocSwitch<Adapter> modelSwitch =
    new LunDocSwitch<Adapter>()
    {
      @Override
      public Adapter caseLDocNamedDocument(LDocNamedDocument object)
      {
        return createLDocNamedDocumentAdapter();
      }
      @Override
      public Adapter caseLDocInclude(LDocInclude object)
      {
        return createLDocIncludeAdapter();
      }
      @Override
      public Adapter caseLDocDocument(LDocDocument object)
      {
        return createLDocDocumentAdapter();
      }
      @Override
      public Adapter caseLDocEntityDocument(LDocEntityDocument object)
      {
        return createLDocEntityDocumentAdapter();
      }
      @Override
      public Adapter caseLDocEntityField(LDocEntityField object)
      {
        return createLDocEntityFieldAdapter();
      }
      @Override
      public Adapter caseLDocDtoDocument(LDocDtoDocument object)
      {
        return createLDocDtoDocumentAdapter();
      }
      @Override
      public Adapter caseLDocDtoProperty(LDocDtoProperty object)
      {
        return createLDocDtoPropertyAdapter();
      }
      @Override
      public Adapter caseLDocBPMProcessDocument(LDocBPMProcessDocument object)
      {
        return createLDocBPMProcessDocumentAdapter();
      }
      @Override
      public Adapter caseLDocHumanTaskDocument(LDocHumanTaskDocument object)
      {
        return createLDocHumanTaskDocumentAdapter();
      }
      @Override
      public Adapter caseLDocViewDocument(LDocViewDocument object)
      {
        return createLDocViewDocumentAdapter();
      }
      @Override
      public Adapter caseLDocUIDocument(LDocUIDocument object)
      {
        return createLDocUIDocumentAdapter();
      }
      @Override
      public Adapter caseLDocLayouter(LDocLayouter object)
      {
        return createLDocLayouterAdapter();
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
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument <em>LDoc Named Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument
   * @generated
   */
  public Adapter createLDocNamedDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude <em>LDoc Include</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.LDocInclude
   * @generated
   */
  public Adapter createLDocIncludeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.LDocDocument <em>LDoc Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.LDocDocument
   * @generated
   */
  public Adapter createLDocDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument <em>LDoc Entity Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument
   * @generated
   */
  public Adapter createLDocEntityDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityField <em>LDoc Entity Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.LDocEntityField
   * @generated
   */
  public Adapter createLDocEntityFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument <em>LDoc Dto Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument
   * @generated
   */
  public Adapter createLDocDtoDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty <em>LDoc Dto Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty
   * @generated
   */
  public Adapter createLDocDtoPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument <em>LDoc BPM Process Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument
   * @generated
   */
  public Adapter createLDocBPMProcessDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument <em>LDoc Human Task Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument
   * @generated
   */
  public Adapter createLDocHumanTaskDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.LDocViewDocument <em>LDoc View Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.LDocViewDocument
   * @generated
   */
  public Adapter createLDocViewDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.LDocUIDocument <em>LDoc UI Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.LDocUIDocument
   * @generated
   */
  public Adapter createLDocUIDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.LDocLayouter <em>LDoc Layouter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.doc.dsl.luniferadoc.LDocLayouter
   * @generated
   */
  public Adapter createLDocLayouterAdapter()
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

} //LunDocAdapterFactory
