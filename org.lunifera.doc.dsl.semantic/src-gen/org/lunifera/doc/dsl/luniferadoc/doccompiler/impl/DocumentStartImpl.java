/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument;

import org.lunifera.doc.dsl.luniferadoc.doccompiler.DocumentEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.DocumentStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ProcessedRichString;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.DocumentStartImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.DocumentStartImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.DocumentStartImpl#getDocument <em>Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentStartImpl extends LinePartImpl implements DocumentStart
{
  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected ProcessedRichString content;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected DocumentEnd end;

  /**
   * The cached value of the '{@link #getDocument() <em>Document</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocument()
   * @generated
   * @ordered
   */
  protected LDocNamedDocument document;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentStartImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LunDocCompilerPackage.Literals.DOCUMENT_START;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessedRichString getContent()
  {
    if (content != null && content.eIsProxy())
    {
      InternalEObject oldContent = (InternalEObject)content;
      content = (ProcessedRichString)eResolveProxy(oldContent);
      if (content != oldContent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.DOCUMENT_START__CONTENT, oldContent, content));
      }
    }
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessedRichString basicGetContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(ProcessedRichString newContent)
  {
    ProcessedRichString oldContent = content;
    content = newContent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.DOCUMENT_START__CONTENT, oldContent, content));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentEnd getEnd()
  {
    if (end != null && end.eIsProxy())
    {
      InternalEObject oldEnd = (InternalEObject)end;
      end = (DocumentEnd)eResolveProxy(oldEnd);
      if (end != oldEnd)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.DOCUMENT_START__END, oldEnd, end));
      }
    }
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentEnd basicGetEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(DocumentEnd newEnd)
  {
    DocumentEnd oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.DOCUMENT_START__END, oldEnd, end));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocNamedDocument getDocument()
  {
    if (document != null && document.eIsProxy())
    {
      InternalEObject oldDocument = (InternalEObject)document;
      document = (LDocNamedDocument)eResolveProxy(oldDocument);
      if (document != oldDocument)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.DOCUMENT_START__DOCUMENT, oldDocument, document));
      }
    }
    return document;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocNamedDocument basicGetDocument()
  {
    return document;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocument(LDocNamedDocument newDocument)
  {
    LDocNamedDocument oldDocument = document;
    document = newDocument;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.DOCUMENT_START__DOCUMENT, oldDocument, document));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LunDocCompilerPackage.DOCUMENT_START__CONTENT:
        if (resolve) return getContent();
        return basicGetContent();
      case LunDocCompilerPackage.DOCUMENT_START__END:
        if (resolve) return getEnd();
        return basicGetEnd();
      case LunDocCompilerPackage.DOCUMENT_START__DOCUMENT:
        if (resolve) return getDocument();
        return basicGetDocument();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LunDocCompilerPackage.DOCUMENT_START__CONTENT:
        setContent((ProcessedRichString)newValue);
        return;
      case LunDocCompilerPackage.DOCUMENT_START__END:
        setEnd((DocumentEnd)newValue);
        return;
      case LunDocCompilerPackage.DOCUMENT_START__DOCUMENT:
        setDocument((LDocNamedDocument)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LunDocCompilerPackage.DOCUMENT_START__CONTENT:
        setContent((ProcessedRichString)null);
        return;
      case LunDocCompilerPackage.DOCUMENT_START__END:
        setEnd((DocumentEnd)null);
        return;
      case LunDocCompilerPackage.DOCUMENT_START__DOCUMENT:
        setDocument((LDocNamedDocument)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LunDocCompilerPackage.DOCUMENT_START__CONTENT:
        return content != null;
      case LunDocCompilerPackage.DOCUMENT_START__END:
        return end != null;
      case LunDocCompilerPackage.DOCUMENT_START__DOCUMENT:
        return document != null;
    }
    return super.eIsSet(featureID);
  }

} //DocumentStartImpl
