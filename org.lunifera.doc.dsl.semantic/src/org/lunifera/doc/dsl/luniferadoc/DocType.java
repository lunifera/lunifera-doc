/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Doc Type</b></em>', and utility
 * methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage#getDocType()
 * @model
 * @generated
 */
public enum DocType implements Enumerator {
	/**
	 * The '<em><b>ENTITY</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	ENTITY(0, "ENTITY", "ENTITY"),

	/**
	 * The '<em><b>DTO</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #DTO_VALUE
	 * @generated
	 * @ordered
	 */
	DTO(1, "DTO", "DTO"),

	/**
	 * The '<em><b>BPM PROCESS</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #BPM_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	BPM_PROCESS(2, "BPM_PROCESS", ""),

	/**
	 * The '<em><b>BPM TASK</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #BPM_TASK_VALUE
	 * @generated
	 * @ordered
	 */
	BPM_TASK(3, "BPM_TASK", "BPM_TASK"),

	/**
	 * The '<em><b>VAACLIPSE VIEW</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #VAACLIPSE_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	VAACLIPSE_VIEW(4, "VAACLIPSE_VIEW", "VAACLIPSE_VIEW"),

	/**
	 * The '<em><b>UI</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #UI_VALUE
	 * @generated
	 * @ordered
	 */
	UI(5, "UI", "UI");

	/**
	 * The '<em><b>ENTITY</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENTITY</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #ENTITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_VALUE = 0;

	/**
	 * The '<em><b>DTO</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DTO</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DTO_VALUE = 1;

	/**
	 * The '<em><b>BPM PROCESS</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BPM PROCESS</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #BPM_PROCESS
	 * @model literal=""
	 * @generated
	 * @ordered
	 */
	public static final int BPM_PROCESS_VALUE = 2;

	/**
	 * The '<em><b>BPM TASK</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BPM TASK</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #BPM_TASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BPM_TASK_VALUE = 3;

	/**
	 * The '<em><b>VAACLIPSE VIEW</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VAACLIPSE VIEW</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #VAACLIPSE_VIEW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VAACLIPSE_VIEW_VALUE = 4;

	/**
	 * The '<em><b>UI</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UI</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #UI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UI_VALUE = 5;

	/**
	 * An array of all the '<em><b>Doc Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final DocType[] VALUES_ARRAY =
			new DocType[] {
					ENTITY,
					DTO,
					BPM_PROCESS,
					BPM_TASK,
					VAACLIPSE_VIEW,
					UI,
			};

	/**
	 * A public read-only list of all the '<em><b>Doc Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<DocType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Doc Type</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static DocType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Doc Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static DocType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Doc Type</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static DocType get(int value) {
		switch (value) {
		case ENTITY_VALUE:
			return ENTITY;
		case DTO_VALUE:
			return DTO;
		case BPM_PROCESS_VALUE:
			return BPM_PROCESS;
		case BPM_TASK_VALUE:
			return BPM_TASK;
		case VAACLIPSE_VIEW_VALUE:
			return VAACLIPSE_VIEW;
		case UI_VALUE:
			return UI;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private DocType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // DocType
