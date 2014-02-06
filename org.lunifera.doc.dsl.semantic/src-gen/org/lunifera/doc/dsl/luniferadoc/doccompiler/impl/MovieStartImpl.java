/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.MovieEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.MovieStart;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Movie Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.MovieStartImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.MovieStartImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MovieStartImpl extends LinePartImpl implements MovieStart
{
  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected RichStringMovie content;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected MovieEnd end;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MovieStartImpl()
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
    return LunDocCompilerPackage.Literals.MOVIE_START;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringMovie getContent()
  {
    if (content != null && content.eIsProxy())
    {
      InternalEObject oldContent = (InternalEObject)content;
      content = (RichStringMovie)eResolveProxy(oldContent);
      if (content != oldContent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.MOVIE_START__CONTENT, oldContent, content));
      }
    }
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringMovie basicGetContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(RichStringMovie newContent)
  {
    RichStringMovie oldContent = content;
    content = newContent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.MOVIE_START__CONTENT, oldContent, content));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MovieEnd getEnd()
  {
    if (end != null && end.eIsProxy())
    {
      InternalEObject oldEnd = (InternalEObject)end;
      end = (MovieEnd)eResolveProxy(oldEnd);
      if (end != oldEnd)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.MOVIE_START__END, oldEnd, end));
      }
    }
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MovieEnd basicGetEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(MovieEnd newEnd)
  {
    MovieEnd oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.MOVIE_START__END, oldEnd, end));
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
      case LunDocCompilerPackage.MOVIE_START__CONTENT:
        if (resolve) return getContent();
        return basicGetContent();
      case LunDocCompilerPackage.MOVIE_START__END:
        if (resolve) return getEnd();
        return basicGetEnd();
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
      case LunDocCompilerPackage.MOVIE_START__CONTENT:
        setContent((RichStringMovie)newValue);
        return;
      case LunDocCompilerPackage.MOVIE_START__END:
        setEnd((MovieEnd)newValue);
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
      case LunDocCompilerPackage.MOVIE_START__CONTENT:
        setContent((RichStringMovie)null);
        return;
      case LunDocCompilerPackage.MOVIE_START__END:
        setEnd((MovieEnd)null);
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
      case LunDocCompilerPackage.MOVIE_START__CONTENT:
        return content != null;
      case LunDocCompilerPackage.MOVIE_START__END:
        return end != null;
    }
    return super.eIsSet(featureID);
  }

} //MovieStartImpl
