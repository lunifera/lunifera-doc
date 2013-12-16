/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage
 * @generated
 */
public interface DocCompilerFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	DocCompilerFactory eINSTANCE = org.lunifera.doc.dsl.doccompiler.impl.DocCompilerFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Document Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Document Start</em>'.
	 * @generated
	 */
	DocumentStart createDocumentStart();

	/**
	 * Returns a new object of class '<em>Document End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Document End</em>'.
	 * @generated
	 */
	DocumentEnd createDocumentEnd();

	/**
	 * Returns a new object of class '<em>Processed Rich String</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Processed Rich String</em>'.
	 * @generated
	 */
	ProcessedRichString createProcessedRichString();

	/**
	 * Returns a new object of class '<em>Line</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
	Line createLine();

	/**
	 * Returns a new object of class '<em>Line Part</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Line Part</em>'.
	 * @generated
	 */
	LinePart createLinePart();

	/**
	 * Returns a new object of class '<em>Literal</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>Line Break</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Line Break</em>'.
	 * @generated
	 */
	LineBreak createLineBreak();

	/**
	 * Returns a new object of class '<em>For Loop Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>For Loop Start</em>'.
	 * @generated
	 */
	ForLoopStart createForLoopStart();

	/**
	 * Returns a new object of class '<em>For Loop End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>For Loop End</em>'.
	 * @generated
	 */
	ForLoopEnd createForLoopEnd();

	/**
	 * Returns a new object of class '<em>Printed Expression</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Printed Expression</em>'.
	 * @generated
	 */
	PrintedExpression createPrintedExpression();

	/**
	 * Returns a new object of class '<em>If Condition Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>If Condition Start</em>'.
	 * @generated
	 */
	IfConditionStart createIfConditionStart();

	/**
	 * Returns a new object of class '<em>Else If Condition</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Else If Condition</em>'.
	 * @generated
	 */
	ElseIfCondition createElseIfCondition();

	/**
	 * Returns a new object of class '<em>Else Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Else Start</em>'.
	 * @generated
	 */
	ElseStart createElseStart();

	/**
	 * Returns a new object of class '<em>End If</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>End If</em>'.
	 * @generated
	 */
	EndIf createEndIf();

	/**
	 * Returns a new object of class '<em>Markup</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Markup</em>'.
	 * @generated
	 */
	Markup createMarkup();

	/**
	 * Returns a new object of class '<em>H1 Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>H1 Start</em>'.
	 * @generated
	 */
	H1Start createH1Start();

	/**
	 * Returns a new object of class '<em>H1 End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>H1 End</em>'.
	 * @generated
	 */
	H1End createH1End();

	/**
	 * Returns a new object of class '<em>H2 Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>H2 Start</em>'.
	 * @generated
	 */
	H2Start createH2Start();

	/**
	 * Returns a new object of class '<em>H2 End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>H2 End</em>'.
	 * @generated
	 */
	H2End createH2End();

	/**
	 * Returns a new object of class '<em>Example Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Example Start</em>'.
	 * @generated
	 */
	ExampleStart createExampleStart();

	/**
	 * Returns a new object of class '<em>Example End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Example End</em>'.
	 * @generated
	 */
	ExampleEnd createExampleEnd();

	/**
	 * Returns a new object of class '<em>URL Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>URL Start</em>'.
	 * @generated
	 */
	URLStart createURLStart();

	/**
	 * Returns a new object of class '<em>URL End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>URL End</em>'.
	 * @generated
	 */
	URLEnd createURLEnd();

	/**
	 * Returns a new object of class '<em>Ref Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Ref Start</em>'.
	 * @generated
	 */
	RefStart createRefStart();

	/**
	 * Returns a new object of class '<em>Ref End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Ref End</em>'.
	 * @generated
	 */
	RefEnd createRefEnd();

	/**
	 * Returns a new object of class '<em>Bold Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bold Start</em>'.
	 * @generated
	 */
	BoldStart createBoldStart();

	/**
	 * Returns a new object of class '<em>Bold End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bold End</em>'.
	 * @generated
	 */
	BoldEnd createBoldEnd();

	/**
	 * Returns a new object of class '<em>Underline Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Underline Start</em>'.
	 * @generated
	 */
	UnderlineStart createUnderlineStart();

	/**
	 * Returns a new object of class '<em>Underline End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Underline End</em>'.
	 * @generated
	 */
	UnderlineEnd createUnderlineEnd();

	/**
	 * Returns a new object of class '<em>Italic Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Italic Start</em>'.
	 * @generated
	 */
	ItalicStart createItalicStart();

	/**
	 * Returns a new object of class '<em>Italic End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Italic End</em>'.
	 * @generated
	 */
	ItalicEnd createItalicEnd();

	/**
	 * Returns a new object of class '<em>Img Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Img Start</em>'.
	 * @generated
	 */
	ImgStart createImgStart();

	/**
	 * Returns a new object of class '<em>Mailto Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Mailto Start</em>'.
	 * @generated
	 */
	MailtoStart createMailtoStart();

	/**
	 * Returns a new object of class '<em>Mailto End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Mailto End</em>'.
	 * @generated
	 */
	MailtoEnd createMailtoEnd();

	/**
	 * Returns a new object of class '<em>Skype Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Skype Start</em>'.
	 * @generated
	 */
	SkypeStart createSkypeStart();

	/**
	 * Returns a new object of class '<em>Skype End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Skype End</em>'.
	 * @generated
	 */
	SkypeEnd createSkypeEnd();

	/**
	 * Returns a new object of class '<em>Movie Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Movie Start</em>'.
	 * @generated
	 */
	MovieStart createMovieStart();

	/**
	 * Returns a new object of class '<em>Movie End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Movie End</em>'.
	 * @generated
	 */
	MovieEnd createMovieEnd();

	/**
	 * Returns a new object of class '<em>Code Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Code Start</em>'.
	 * @generated
	 */
	CodeStart createCodeStart();

	/**
	 * Returns a new object of class '<em>Code End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Code End</em>'.
	 * @generated
	 */
	CodeEnd createCodeEnd();

	/**
	 * Returns a new object of class '<em>Table Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Table Start</em>'.
	 * @generated
	 */
	TableStart createTableStart();

	/**
	 * Returns a new object of class '<em>Table End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Table End</em>'.
	 * @generated
	 */
	TableEnd createTableEnd();

	/**
	 * Returns a new object of class '<em>Table Row Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Table Row Start</em>'.
	 * @generated
	 */
	TableRowStart createTableRowStart();

	/**
	 * Returns a new object of class '<em>Table Row End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Table Row End</em>'.
	 * @generated
	 */
	TableRowEnd createTableRowEnd();

	/**
	 * Returns a new object of class '<em>Table Data Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Table Data Start</em>'.
	 * @generated
	 */
	TableDataStart createTableDataStart();

	/**
	 * Returns a new object of class '<em>Table Data End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Table Data End</em>'.
	 * @generated
	 */
	TableDataEnd createTableDataEnd();

	/**
	 * Returns a new object of class '<em>List Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>List Start</em>'.
	 * @generated
	 */
	ListStart createListStart();

	/**
	 * Returns a new object of class '<em>List End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>List End</em>'.
	 * @generated
	 */
	ListEnd createListEnd();

	/**
	 * Returns a new object of class '<em>Ordered List Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Ordered List Start</em>'.
	 * @generated
	 */
	OrderedListStart createOrderedListStart();

	/**
	 * Returns a new object of class '<em>Ordered List End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Ordered List End</em>'.
	 * @generated
	 */
	OrderedListEnd createOrderedListEnd();

	/**
	 * Returns a new object of class '<em>List Element Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>List Element Start</em>'.
	 * @generated
	 */
	ListElementStart createListElementStart();

	/**
	 * Returns a new object of class '<em>List Element End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>List Element End</em>'.
	 * @generated
	 */
	ListElementEnd createListElementEnd();

	/**
	 * Returns a new object of class '<em>Chapter Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Chapter Start</em>'.
	 * @generated
	 */
	ChapterStart createChapterStart();

	/**
	 * Returns a new object of class '<em>Chapter End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Chapter End</em>'.
	 * @generated
	 */
	ChapterEnd createChapterEnd();

	/**
	 * Returns a new object of class '<em>Section Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Section Start</em>'.
	 * @generated
	 */
	SectionStart createSectionStart();

	/**
	 * Returns a new object of class '<em>Section End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Section End</em>'.
	 * @generated
	 */
	SectionEnd createSectionEnd();

	/**
	 * Returns a new object of class '<em>Subsection Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Subsection Start</em>'.
	 * @generated
	 */
	SubsectionStart createSubsectionStart();

	/**
	 * Returns a new object of class '<em>Subsection End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Subsection End</em>'.
	 * @generated
	 */
	SubsectionEnd createSubsectionEnd();

	/**
	 * Returns a new object of class '<em>Open View Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Open View Start</em>'.
	 * @generated
	 */
	OpenViewStart createOpenViewStart();

	/**
	 * Returns a new object of class '<em>Open View End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Open View End</em>'.
	 * @generated
	 */
	OpenViewEnd createOpenViewEnd();

	/**
	 * Returns a new object of class '<em>Start Process Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Start Process Start</em>'.
	 * @generated
	 */
	StartProcessStart createStartProcessStart();

	/**
	 * Returns a new object of class '<em>Start Process End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Start Process End</em>'.
	 * @generated
	 */
	StartProcessEnd createStartProcessEnd();

	/**
	 * Returns a new object of class '<em>Entity Ref Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Entity Ref Start</em>'.
	 * @generated
	 */
	EntityRefStart createEntityRefStart();

	/**
	 * Returns a new object of class '<em>Entity Ref End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Entity Ref End</em>'.
	 * @generated
	 */
	EntityRefEnd createEntityRefEnd();

	/**
	 * Returns a new object of class '<em>DTO Ref Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>DTO Ref Start</em>'.
	 * @generated
	 */
	DTORefStart createDTORefStart();

	/**
	 * Returns a new object of class '<em>DTO Ref End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>DTO Ref End</em>'.
	 * @generated
	 */
	DTORefEnd createDTORefEnd();

	/**
	 * Returns a new object of class '<em>Process Ref Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Process Ref Start</em>'.
	 * @generated
	 */
	ProcessRefStart createProcessRefStart();

	/**
	 * Returns a new object of class '<em>Process Ref End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Process Ref End</em>'.
	 * @generated
	 */
	ProcessRefEnd createProcessRefEnd();

	/**
	 * Returns a new object of class '<em>Task Ref Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Task Ref Start</em>'.
	 * @generated
	 */
	TaskRefStart createTaskRefStart();

	/**
	 * Returns a new object of class '<em>Task Ref End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Task Ref End</em>'.
	 * @generated
	 */
	TaskRefEnd createTaskRefEnd();

	/**
	 * Returns a new object of class '<em>View Ref Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>View Ref Start</em>'.
	 * @generated
	 */
	ViewRefStart createViewRefStart();

	/**
	 * Returns a new object of class '<em>View Ref End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>View Ref End</em>'.
	 * @generated
	 */
	ViewRefEnd createViewRefEnd();

	/**
	 * Returns a new object of class '<em>UI Ref Start</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>UI Ref Start</em>'.
	 * @generated
	 */
	UIRefStart createUIRefStart();

	/**
	 * Returns a new object of class '<em>UI Ref End</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>UI Ref End</em>'.
	 * @generated
	 */
	UIRefEnd createUIRefEnd();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	DocCompilerPackage getDocCompilerPackage();

} // DocCompilerFactory
