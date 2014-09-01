/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rich String Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringBoxImpl#isError <em>Error</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringBoxImpl#isWarning <em>Warning</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringBoxImpl#isInfo <em>Info</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringBoxImpl#isAbstracts <em>Abstracts</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringBoxImpl#isChecklist <em>Checklist</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringBoxImpl#isBio <em>Bio</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringBoxImpl#isSidenote <em>Sidenote</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringBoxImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RichStringBoxImpl extends RichStringMarkupImpl implements RichStringBox {
	/**
	 * The default value of the '{@link #isError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isError()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ERROR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isError()
	 * @generated
	 * @ordered
	 */
	protected boolean error = ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #isWarning() <em>Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWarning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WARNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWarning() <em>Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWarning()
	 * @generated
	 * @ordered
	 */
	protected boolean warning = WARNING_EDEFAULT;

	/**
	 * The default value of the '{@link #isInfo() <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INFO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInfo() <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfo()
	 * @generated
	 * @ordered
	 */
	protected boolean info = INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #isAbstracts() <em>Abstracts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstracts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstracts() <em>Abstracts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstracts()
	 * @generated
	 * @ordered
	 */
	protected boolean abstracts = ABSTRACTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isChecklist() <em>Checklist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChecklist()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKLIST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChecklist() <em>Checklist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChecklist()
	 * @generated
	 * @ordered
	 */
	protected boolean checklist = CHECKLIST_EDEFAULT;

	/**
	 * The default value of the '{@link #isBio() <em>Bio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBio()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBio() <em>Bio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBio()
	 * @generated
	 * @ordered
	 */
	protected boolean bio = BIO_EDEFAULT;

	/**
	 * The default value of the '{@link #isSidenote() <em>Sidenote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSidenote()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIDENOTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSidenote() <em>Sidenote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSidenote()
	 * @generated
	 * @ordered
	 */
	protected boolean sidenote = SIDENOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RichStringBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LunDocRichstringPackage.Literals.RICH_STRING_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(boolean newError) {
		boolean oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_BOX__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWarning() {
		return warning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarning(boolean newWarning) {
		boolean oldWarning = warning;
		warning = newWarning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_BOX__WARNING, oldWarning, warning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(boolean newInfo) {
		boolean oldInfo = info;
		info = newInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_BOX__INFO, oldInfo, info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstracts() {
		return abstracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstracts(boolean newAbstracts) {
		boolean oldAbstracts = abstracts;
		abstracts = newAbstracts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_BOX__ABSTRACTS, oldAbstracts, abstracts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChecklist() {
		return checklist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecklist(boolean newChecklist) {
		boolean oldChecklist = checklist;
		checklist = newChecklist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_BOX__CHECKLIST, oldChecklist, checklist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBio() {
		return bio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBio(boolean newBio) {
		boolean oldBio = bio;
		bio = newBio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_BOX__BIO, oldBio, bio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSidenote() {
		return sidenote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSidenote(boolean newSidenote) {
		boolean oldSidenote = sidenote;
		sidenote = newSidenote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_BOX__SIDENOTE, oldSidenote, sidenote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_BOX__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LunDocRichstringPackage.RICH_STRING_BOX__ERROR:
				return isError();
			case LunDocRichstringPackage.RICH_STRING_BOX__WARNING:
				return isWarning();
			case LunDocRichstringPackage.RICH_STRING_BOX__INFO:
				return isInfo();
			case LunDocRichstringPackage.RICH_STRING_BOX__ABSTRACTS:
				return isAbstracts();
			case LunDocRichstringPackage.RICH_STRING_BOX__CHECKLIST:
				return isChecklist();
			case LunDocRichstringPackage.RICH_STRING_BOX__BIO:
				return isBio();
			case LunDocRichstringPackage.RICH_STRING_BOX__SIDENOTE:
				return isSidenote();
			case LunDocRichstringPackage.RICH_STRING_BOX__TITLE:
				return getTitle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LunDocRichstringPackage.RICH_STRING_BOX__ERROR:
				setError((Boolean)newValue);
				return;
			case LunDocRichstringPackage.RICH_STRING_BOX__WARNING:
				setWarning((Boolean)newValue);
				return;
			case LunDocRichstringPackage.RICH_STRING_BOX__INFO:
				setInfo((Boolean)newValue);
				return;
			case LunDocRichstringPackage.RICH_STRING_BOX__ABSTRACTS:
				setAbstracts((Boolean)newValue);
				return;
			case LunDocRichstringPackage.RICH_STRING_BOX__CHECKLIST:
				setChecklist((Boolean)newValue);
				return;
			case LunDocRichstringPackage.RICH_STRING_BOX__BIO:
				setBio((Boolean)newValue);
				return;
			case LunDocRichstringPackage.RICH_STRING_BOX__SIDENOTE:
				setSidenote((Boolean)newValue);
				return;
			case LunDocRichstringPackage.RICH_STRING_BOX__TITLE:
				setTitle((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case LunDocRichstringPackage.RICH_STRING_BOX__ERROR:
				setError(ERROR_EDEFAULT);
				return;
			case LunDocRichstringPackage.RICH_STRING_BOX__WARNING:
				setWarning(WARNING_EDEFAULT);
				return;
			case LunDocRichstringPackage.RICH_STRING_BOX__INFO:
				setInfo(INFO_EDEFAULT);
				return;
			case LunDocRichstringPackage.RICH_STRING_BOX__ABSTRACTS:
				setAbstracts(ABSTRACTS_EDEFAULT);
				return;
			case LunDocRichstringPackage.RICH_STRING_BOX__CHECKLIST:
				setChecklist(CHECKLIST_EDEFAULT);
				return;
			case LunDocRichstringPackage.RICH_STRING_BOX__BIO:
				setBio(BIO_EDEFAULT);
				return;
			case LunDocRichstringPackage.RICH_STRING_BOX__SIDENOTE:
				setSidenote(SIDENOTE_EDEFAULT);
				return;
			case LunDocRichstringPackage.RICH_STRING_BOX__TITLE:
				setTitle(TITLE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LunDocRichstringPackage.RICH_STRING_BOX__ERROR:
				return error != ERROR_EDEFAULT;
			case LunDocRichstringPackage.RICH_STRING_BOX__WARNING:
				return warning != WARNING_EDEFAULT;
			case LunDocRichstringPackage.RICH_STRING_BOX__INFO:
				return info != INFO_EDEFAULT;
			case LunDocRichstringPackage.RICH_STRING_BOX__ABSTRACTS:
				return abstracts != ABSTRACTS_EDEFAULT;
			case LunDocRichstringPackage.RICH_STRING_BOX__CHECKLIST:
				return checklist != CHECKLIST_EDEFAULT;
			case LunDocRichstringPackage.RICH_STRING_BOX__BIO:
				return bio != BIO_EDEFAULT;
			case LunDocRichstringPackage.RICH_STRING_BOX__SIDENOTE:
				return sidenote != SIDENOTE_EDEFAULT;
			case LunDocRichstringPackage.RICH_STRING_BOX__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (error: ");
		result.append(error);
		result.append(", warning: ");
		result.append(warning);
		result.append(", info: ");
		result.append(info);
		result.append(", abstracts: ");
		result.append(abstracts);
		result.append(", checklist: ");
		result.append(checklist);
		result.append(", bio: ");
		result.append(bio);
		result.append(", sidenote: ");
		result.append(sidenote);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //RichStringBoxImpl
