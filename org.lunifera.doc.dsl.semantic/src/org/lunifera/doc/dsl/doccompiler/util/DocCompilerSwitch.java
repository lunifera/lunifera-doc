/**
 */
package org.lunifera.doc.dsl.doccompiler.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.lunifera.doc.dsl.doccompiler.BoldEnd;
import org.lunifera.doc.dsl.doccompiler.BoldStart;
import org.lunifera.doc.dsl.doccompiler.ChapterEnd;
import org.lunifera.doc.dsl.doccompiler.ChapterStart;
import org.lunifera.doc.dsl.doccompiler.CodeEnd;
import org.lunifera.doc.dsl.doccompiler.CodeStart;
import org.lunifera.doc.dsl.doccompiler.DTORefEnd;
import org.lunifera.doc.dsl.doccompiler.DTORefStart;
import org.lunifera.doc.dsl.doccompiler.DocCompilerPackage;
import org.lunifera.doc.dsl.doccompiler.DocumentEnd;
import org.lunifera.doc.dsl.doccompiler.DocumentStart;
import org.lunifera.doc.dsl.doccompiler.ElseIfCondition;
import org.lunifera.doc.dsl.doccompiler.ElseStart;
import org.lunifera.doc.dsl.doccompiler.EndIf;
import org.lunifera.doc.dsl.doccompiler.EntityRefEnd;
import org.lunifera.doc.dsl.doccompiler.EntityRefStart;
import org.lunifera.doc.dsl.doccompiler.ExampleEnd;
import org.lunifera.doc.dsl.doccompiler.ExampleStart;
import org.lunifera.doc.dsl.doccompiler.ForLoopEnd;
import org.lunifera.doc.dsl.doccompiler.ForLoopStart;
import org.lunifera.doc.dsl.doccompiler.H1End;
import org.lunifera.doc.dsl.doccompiler.H1Start;
import org.lunifera.doc.dsl.doccompiler.H2End;
import org.lunifera.doc.dsl.doccompiler.H2Start;
import org.lunifera.doc.dsl.doccompiler.IfConditionStart;
import org.lunifera.doc.dsl.doccompiler.ImgStart;
import org.lunifera.doc.dsl.doccompiler.ItalicEnd;
import org.lunifera.doc.dsl.doccompiler.ItalicStart;
import org.lunifera.doc.dsl.doccompiler.Line;
import org.lunifera.doc.dsl.doccompiler.LineBreak;
import org.lunifera.doc.dsl.doccompiler.LinePart;
import org.lunifera.doc.dsl.doccompiler.ListElementEnd;
import org.lunifera.doc.dsl.doccompiler.ListElementStart;
import org.lunifera.doc.dsl.doccompiler.ListEnd;
import org.lunifera.doc.dsl.doccompiler.ListStart;
import org.lunifera.doc.dsl.doccompiler.Literal;
import org.lunifera.doc.dsl.doccompiler.MailtoEnd;
import org.lunifera.doc.dsl.doccompiler.MailtoStart;
import org.lunifera.doc.dsl.doccompiler.Markup;
import org.lunifera.doc.dsl.doccompiler.MovieEnd;
import org.lunifera.doc.dsl.doccompiler.MovieStart;
import org.lunifera.doc.dsl.doccompiler.OpenViewEnd;
import org.lunifera.doc.dsl.doccompiler.OpenViewStart;
import org.lunifera.doc.dsl.doccompiler.PrintedExpression;
import org.lunifera.doc.dsl.doccompiler.ProcessRefEnd;
import org.lunifera.doc.dsl.doccompiler.ProcessRefStart;
import org.lunifera.doc.dsl.doccompiler.ProcessedRichString;
import org.lunifera.doc.dsl.doccompiler.RefEnd;
import org.lunifera.doc.dsl.doccompiler.RefStart;
import org.lunifera.doc.dsl.doccompiler.SectionEnd;
import org.lunifera.doc.dsl.doccompiler.SectionStart;
import org.lunifera.doc.dsl.doccompiler.SkypeEnd;
import org.lunifera.doc.dsl.doccompiler.SkypeStart;
import org.lunifera.doc.dsl.doccompiler.StartProcessEnd;
import org.lunifera.doc.dsl.doccompiler.StartProcessStart;
import org.lunifera.doc.dsl.doccompiler.SubsectionEnd;
import org.lunifera.doc.dsl.doccompiler.SubsectionStart;
import org.lunifera.doc.dsl.doccompiler.TableDataEnd;
import org.lunifera.doc.dsl.doccompiler.TableDataStart;
import org.lunifera.doc.dsl.doccompiler.TableEnd;
import org.lunifera.doc.dsl.doccompiler.TableRowEnd;
import org.lunifera.doc.dsl.doccompiler.TableRowStart;
import org.lunifera.doc.dsl.doccompiler.TableStart;
import org.lunifera.doc.dsl.doccompiler.TaskRefEnd;
import org.lunifera.doc.dsl.doccompiler.TaskRefStart;
import org.lunifera.doc.dsl.doccompiler.UIRefEnd;
import org.lunifera.doc.dsl.doccompiler.UIRefStart;
import org.lunifera.doc.dsl.doccompiler.URLEnd;
import org.lunifera.doc.dsl.doccompiler.URLStart;
import org.lunifera.doc.dsl.doccompiler.UnderlineEnd;
import org.lunifera.doc.dsl.doccompiler.UnderlineStart;
import org.lunifera.doc.dsl.doccompiler.ViewRefEnd;
import org.lunifera.doc.dsl.doccompiler.ViewRefStart;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage
 * @generated
 */
public class DocCompilerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static DocCompilerPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocCompilerSwitch() {
		if (modelPackage == null) {
			modelPackage = DocCompilerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that
	 * result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DocCompilerPackage.DOCUMENT_START: {
			DocumentStart documentStart = (DocumentStart) theEObject;
			T result = caseDocumentStart(documentStart);
			if (result == null)
				result = caseLinePart(documentStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.DOCUMENT_END: {
			DocumentEnd documentEnd = (DocumentEnd) theEObject;
			T result = caseDocumentEnd(documentEnd);
			if (result == null)
				result = caseLinePart(documentEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.PROCESSED_RICH_STRING: {
			ProcessedRichString processedRichString = (ProcessedRichString) theEObject;
			T result = caseProcessedRichString(processedRichString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.LINE: {
			Line line = (Line) theEObject;
			T result = caseLine(line);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.LINE_PART: {
			LinePart linePart = (LinePart) theEObject;
			T result = caseLinePart(linePart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.LITERAL: {
			Literal literal = (Literal) theEObject;
			T result = caseLiteral(literal);
			if (result == null)
				result = caseLinePart(literal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.LINE_BREAK: {
			LineBreak lineBreak = (LineBreak) theEObject;
			T result = caseLineBreak(lineBreak);
			if (result == null)
				result = caseLiteral(lineBreak);
			if (result == null)
				result = caseLinePart(lineBreak);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.FOR_LOOP_START: {
			ForLoopStart forLoopStart = (ForLoopStart) theEObject;
			T result = caseForLoopStart(forLoopStart);
			if (result == null)
				result = caseLinePart(forLoopStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.FOR_LOOP_END: {
			ForLoopEnd forLoopEnd = (ForLoopEnd) theEObject;
			T result = caseForLoopEnd(forLoopEnd);
			if (result == null)
				result = caseLinePart(forLoopEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.PRINTED_EXPRESSION: {
			PrintedExpression printedExpression = (PrintedExpression) theEObject;
			T result = casePrintedExpression(printedExpression);
			if (result == null)
				result = caseLinePart(printedExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.IF_CONDITION_START: {
			IfConditionStart ifConditionStart = (IfConditionStart) theEObject;
			T result = caseIfConditionStart(ifConditionStart);
			if (result == null)
				result = caseLinePart(ifConditionStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.ELSE_IF_CONDITION: {
			ElseIfCondition elseIfCondition = (ElseIfCondition) theEObject;
			T result = caseElseIfCondition(elseIfCondition);
			if (result == null)
				result = caseLinePart(elseIfCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.ELSE_START: {
			ElseStart elseStart = (ElseStart) theEObject;
			T result = caseElseStart(elseStart);
			if (result == null)
				result = caseLinePart(elseStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.END_IF: {
			EndIf endIf = (EndIf) theEObject;
			T result = caseEndIf(endIf);
			if (result == null)
				result = caseLinePart(endIf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.MARKUP: {
			Markup markup = (Markup) theEObject;
			T result = caseMarkup(markup);
			if (result == null)
				result = caseLinePart(markup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.H1_START: {
			H1Start h1Start = (H1Start) theEObject;
			T result = caseH1Start(h1Start);
			if (result == null)
				result = caseLinePart(h1Start);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.H1_END: {
			H1End h1End = (H1End) theEObject;
			T result = caseH1End(h1End);
			if (result == null)
				result = caseLinePart(h1End);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.H2_START: {
			H2Start h2Start = (H2Start) theEObject;
			T result = caseH2Start(h2Start);
			if (result == null)
				result = caseLinePart(h2Start);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.H2_END: {
			H2End h2End = (H2End) theEObject;
			T result = caseH2End(h2End);
			if (result == null)
				result = caseLinePart(h2End);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.EXAMPLE_START: {
			ExampleStart exampleStart = (ExampleStart) theEObject;
			T result = caseExampleStart(exampleStart);
			if (result == null)
				result = caseLinePart(exampleStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.EXAMPLE_END: {
			ExampleEnd exampleEnd = (ExampleEnd) theEObject;
			T result = caseExampleEnd(exampleEnd);
			if (result == null)
				result = caseLinePart(exampleEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.URL_START: {
			URLStart urlStart = (URLStart) theEObject;
			T result = caseURLStart(urlStart);
			if (result == null)
				result = caseLinePart(urlStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.URL_END: {
			URLEnd urlEnd = (URLEnd) theEObject;
			T result = caseURLEnd(urlEnd);
			if (result == null)
				result = caseLinePart(urlEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.REF_START: {
			RefStart refStart = (RefStart) theEObject;
			T result = caseRefStart(refStart);
			if (result == null)
				result = caseLinePart(refStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.REF_END: {
			RefEnd refEnd = (RefEnd) theEObject;
			T result = caseRefEnd(refEnd);
			if (result == null)
				result = caseLinePart(refEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.BOLD_START: {
			BoldStart boldStart = (BoldStart) theEObject;
			T result = caseBoldStart(boldStart);
			if (result == null)
				result = caseLinePart(boldStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.BOLD_END: {
			BoldEnd boldEnd = (BoldEnd) theEObject;
			T result = caseBoldEnd(boldEnd);
			if (result == null)
				result = caseLinePart(boldEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.UNDERLINE_START: {
			UnderlineStart underlineStart = (UnderlineStart) theEObject;
			T result = caseUnderlineStart(underlineStart);
			if (result == null)
				result = caseLinePart(underlineStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.UNDERLINE_END: {
			UnderlineEnd underlineEnd = (UnderlineEnd) theEObject;
			T result = caseUnderlineEnd(underlineEnd);
			if (result == null)
				result = caseLinePart(underlineEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.ITALIC_START: {
			ItalicStart italicStart = (ItalicStart) theEObject;
			T result = caseItalicStart(italicStart);
			if (result == null)
				result = caseLinePart(italicStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.ITALIC_END: {
			ItalicEnd italicEnd = (ItalicEnd) theEObject;
			T result = caseItalicEnd(italicEnd);
			if (result == null)
				result = caseLinePart(italicEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.IMG_START: {
			ImgStart imgStart = (ImgStart) theEObject;
			T result = caseImgStart(imgStart);
			if (result == null)
				result = caseLinePart(imgStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.MAILTO_START: {
			MailtoStart mailtoStart = (MailtoStart) theEObject;
			T result = caseMailtoStart(mailtoStart);
			if (result == null)
				result = caseLinePart(mailtoStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.MAILTO_END: {
			MailtoEnd mailtoEnd = (MailtoEnd) theEObject;
			T result = caseMailtoEnd(mailtoEnd);
			if (result == null)
				result = caseLinePart(mailtoEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.SKYPE_START: {
			SkypeStart skypeStart = (SkypeStart) theEObject;
			T result = caseSkypeStart(skypeStart);
			if (result == null)
				result = caseLinePart(skypeStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.SKYPE_END: {
			SkypeEnd skypeEnd = (SkypeEnd) theEObject;
			T result = caseSkypeEnd(skypeEnd);
			if (result == null)
				result = caseLinePart(skypeEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.MOVIE_START: {
			MovieStart movieStart = (MovieStart) theEObject;
			T result = caseMovieStart(movieStart);
			if (result == null)
				result = caseLinePart(movieStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.MOVIE_END: {
			MovieEnd movieEnd = (MovieEnd) theEObject;
			T result = caseMovieEnd(movieEnd);
			if (result == null)
				result = caseLinePart(movieEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.CODE_START: {
			CodeStart codeStart = (CodeStart) theEObject;
			T result = caseCodeStart(codeStart);
			if (result == null)
				result = caseLinePart(codeStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.CODE_END: {
			CodeEnd codeEnd = (CodeEnd) theEObject;
			T result = caseCodeEnd(codeEnd);
			if (result == null)
				result = caseLinePart(codeEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.TABLE_START: {
			TableStart tableStart = (TableStart) theEObject;
			T result = caseTableStart(tableStart);
			if (result == null)
				result = caseLinePart(tableStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.TABLE_END: {
			TableEnd tableEnd = (TableEnd) theEObject;
			T result = caseTableEnd(tableEnd);
			if (result == null)
				result = caseLinePart(tableEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.TABLE_ROW_START: {
			TableRowStart tableRowStart = (TableRowStart) theEObject;
			T result = caseTableRowStart(tableRowStart);
			if (result == null)
				result = caseLinePart(tableRowStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.TABLE_ROW_END: {
			TableRowEnd tableRowEnd = (TableRowEnd) theEObject;
			T result = caseTableRowEnd(tableRowEnd);
			if (result == null)
				result = caseLinePart(tableRowEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.TABLE_DATA_START: {
			TableDataStart tableDataStart = (TableDataStart) theEObject;
			T result = caseTableDataStart(tableDataStart);
			if (result == null)
				result = caseLinePart(tableDataStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.TABLE_DATA_END: {
			TableDataEnd tableDataEnd = (TableDataEnd) theEObject;
			T result = caseTableDataEnd(tableDataEnd);
			if (result == null)
				result = caseLinePart(tableDataEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.CHAPTER_START: {
			ChapterStart chapterStart = (ChapterStart) theEObject;
			T result = caseChapterStart(chapterStart);
			if (result == null)
				result = caseLinePart(chapterStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.CHAPTER_END: {
			ChapterEnd chapterEnd = (ChapterEnd) theEObject;
			T result = caseChapterEnd(chapterEnd);
			if (result == null)
				result = caseLinePart(chapterEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.SECTION_START: {
			SectionStart sectionStart = (SectionStart) theEObject;
			T result = caseSectionStart(sectionStart);
			if (result == null)
				result = caseLinePart(sectionStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.SECTION_END: {
			SectionEnd sectionEnd = (SectionEnd) theEObject;
			T result = caseSectionEnd(sectionEnd);
			if (result == null)
				result = caseLinePart(sectionEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.SUBSECTION_START: {
			SubsectionStart subsectionStart = (SubsectionStart) theEObject;
			T result = caseSubsectionStart(subsectionStart);
			if (result == null)
				result = caseLinePart(subsectionStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.SUBSECTION_END: {
			SubsectionEnd subsectionEnd = (SubsectionEnd) theEObject;
			T result = caseSubsectionEnd(subsectionEnd);
			if (result == null)
				result = caseLinePart(subsectionEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.OPEN_VIEW_START: {
			OpenViewStart openViewStart = (OpenViewStart) theEObject;
			T result = caseOpenViewStart(openViewStart);
			if (result == null)
				result = caseLinePart(openViewStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.OPEN_VIEW_END: {
			OpenViewEnd openViewEnd = (OpenViewEnd) theEObject;
			T result = caseOpenViewEnd(openViewEnd);
			if (result == null)
				result = caseLinePart(openViewEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.START_PROCESS_START: {
			StartProcessStart startProcessStart = (StartProcessStart) theEObject;
			T result = caseStartProcessStart(startProcessStart);
			if (result == null)
				result = caseLinePart(startProcessStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.START_PROCESS_END: {
			StartProcessEnd startProcessEnd = (StartProcessEnd) theEObject;
			T result = caseStartProcessEnd(startProcessEnd);
			if (result == null)
				result = caseLinePart(startProcessEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.ENTITY_REF_START: {
			EntityRefStart entityRefStart = (EntityRefStart) theEObject;
			T result = caseEntityRefStart(entityRefStart);
			if (result == null)
				result = caseLinePart(entityRefStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.ENTITY_REF_END: {
			EntityRefEnd entityRefEnd = (EntityRefEnd) theEObject;
			T result = caseEntityRefEnd(entityRefEnd);
			if (result == null)
				result = caseLinePart(entityRefEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.DTO_REF_START: {
			DTORefStart dtoRefStart = (DTORefStart) theEObject;
			T result = caseDTORefStart(dtoRefStart);
			if (result == null)
				result = caseLinePart(dtoRefStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.DTO_REF_END: {
			DTORefEnd dtoRefEnd = (DTORefEnd) theEObject;
			T result = caseDTORefEnd(dtoRefEnd);
			if (result == null)
				result = caseLinePart(dtoRefEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.PROCESS_REF_START: {
			ProcessRefStart processRefStart = (ProcessRefStart) theEObject;
			T result = caseProcessRefStart(processRefStart);
			if (result == null)
				result = caseLinePart(processRefStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.PROCESS_REF_END: {
			ProcessRefEnd processRefEnd = (ProcessRefEnd) theEObject;
			T result = caseProcessRefEnd(processRefEnd);
			if (result == null)
				result = caseLinePart(processRefEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.TASK_REF_START: {
			TaskRefStart taskRefStart = (TaskRefStart) theEObject;
			T result = caseTaskRefStart(taskRefStart);
			if (result == null)
				result = caseLinePart(taskRefStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.TASK_REF_END: {
			TaskRefEnd taskRefEnd = (TaskRefEnd) theEObject;
			T result = caseTaskRefEnd(taskRefEnd);
			if (result == null)
				result = caseLinePart(taskRefEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.VIEW_REF_START: {
			ViewRefStart viewRefStart = (ViewRefStart) theEObject;
			T result = caseViewRefStart(viewRefStart);
			if (result == null)
				result = caseLinePart(viewRefStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.VIEW_REF_END: {
			ViewRefEnd viewRefEnd = (ViewRefEnd) theEObject;
			T result = caseViewRefEnd(viewRefEnd);
			if (result == null)
				result = caseLinePart(viewRefEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.UI_REF_START: {
			UIRefStart uiRefStart = (UIRefStart) theEObject;
			T result = caseUIRefStart(uiRefStart);
			if (result == null)
				result = caseLinePart(uiRefStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.UI_REF_END: {
			UIRefEnd uiRefEnd = (UIRefEnd) theEObject;
			T result = caseUIRefEnd(uiRefEnd);
			if (result == null)
				result = caseLinePart(uiRefEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.LIST_START: {
			ListStart listStart = (ListStart) theEObject;
			T result = caseListStart(listStart);
			if (result == null)
				result = caseLinePart(listStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.LIST_END: {
			ListEnd listEnd = (ListEnd) theEObject;
			T result = caseListEnd(listEnd);
			if (result == null)
				result = caseLinePart(listEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.LIST_ELEMENT_START: {
			ListElementStart listElementStart = (ListElementStart) theEObject;
			T result = caseListElementStart(listElementStart);
			if (result == null)
				result = caseLinePart(listElementStart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DocCompilerPackage.LIST_ELEMENT_END: {
			ListElementEnd listElementEnd = (ListElementEnd) theEObject;
			T result = caseListElementEnd(listElementEnd);
			if (result == null)
				result = caseLinePart(listElementEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Start</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentStart(DocumentStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentEnd(DocumentEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processed Rich String</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processed Rich String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessedRichString(ProcessedRichString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Part</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinePart(LinePart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Break</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineBreak(LineBreak object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Loop Start</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForLoopStart(ForLoopStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Loop End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForLoopEnd(ForLoopEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Printed Expression</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Printed Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrintedExpression(PrintedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Condition Start</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Condition Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfConditionStart(IfConditionStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else If Condition</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else If Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseIfCondition(ElseIfCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseStart(ElseStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End If</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndIf(EndIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkup(Markup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H1 Start</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H1 Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH1Start(H1Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H1 End</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H1 End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH1End(H1End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H2 Start</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H2 Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH2Start(H2Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H2 End</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H2 End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH2End(H2End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleStart(ExampleStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleEnd(ExampleEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLStart(URLStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL End</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLEnd(URLEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefStart(RefStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref End</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefEnd(RefEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bold Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bold Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoldStart(BoldStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bold End</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bold End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoldEnd(BoldEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Underline Start</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Underline Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnderlineStart(UnderlineStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Underline End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Underline End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnderlineEnd(UnderlineEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Italic Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Italic Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItalicStart(ItalicStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Italic End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Italic End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItalicEnd(ItalicEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Img Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Img Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImgStart(ImgStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mailto Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mailto Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMailtoStart(MailtoStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mailto End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mailto End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMailtoEnd(MailtoEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skype Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skype Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkypeStart(SkypeStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skype End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skype End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkypeEnd(SkypeEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Movie Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movie Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovieStart(MovieStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Movie End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movie End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovieEnd(MovieEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeStart(CodeStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code End</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeEnd(CodeEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableStart(TableStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableEnd(TableEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row Start</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRowStart(TableRowStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRowEnd(TableRowEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Data Start</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Data Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableDataStart(TableDataStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Data End</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Data End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableDataEnd(TableDataEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chapter Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chapter Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChapterStart(ChapterStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chapter End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chapter End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChapterEnd(ChapterEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionStart(SectionStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionEnd(SectionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsection Start</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsection Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsectionStart(SubsectionStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsection End</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsection End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsectionEnd(SubsectionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open View Start</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open View Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenViewStart(OpenViewStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open View End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open View End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenViewEnd(OpenViewEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Process Start</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Process Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartProcessStart(StartProcessStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Process End</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Process End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartProcessEnd(StartProcessEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Ref Start</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Ref Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityRefStart(EntityRefStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Ref End</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Ref End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityRefEnd(EntityRefEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTO Ref Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTO Ref Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTORefStart(DTORefStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTO Ref End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTO Ref End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTORefEnd(DTORefEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Ref Start</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Ref Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessRefStart(ProcessRefStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Ref End</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Ref End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessRefEnd(ProcessRefEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Ref Start</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Ref Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskRefStart(TaskRefStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Ref End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Ref End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskRefEnd(TaskRefEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Ref Start</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Ref Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewRefStart(ViewRefStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Ref End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Ref End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewRefEnd(ViewRefEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Ref Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Ref Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIRefStart(UIRefStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Ref End</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Ref End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIRefEnd(UIRefEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Start</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListStart(ListStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List End</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListEnd(ListEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Element Start</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Element Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListElementStart(ListElementStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Element End</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Element End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListElementEnd(ListElementEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // DocCompilerSwitch
