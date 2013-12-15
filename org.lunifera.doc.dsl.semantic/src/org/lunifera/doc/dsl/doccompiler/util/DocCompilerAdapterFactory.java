/**
 */
package org.lunifera.doc.dsl.doccompiler.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.lunifera.doc.dsl.doccompiler.BoldEnd;
import org.lunifera.doc.dsl.doccompiler.BoldStart;
import org.lunifera.doc.dsl.doccompiler.ChapterEnd;
import org.lunifera.doc.dsl.doccompiler.ChapterStart;
import org.lunifera.doc.dsl.doccompiler.CodeEnd;
import org.lunifera.doc.dsl.doccompiler.CodeStart;
import org.lunifera.doc.dsl.doccompiler.DocCompilerPackage;
import org.lunifera.doc.dsl.doccompiler.DocumentEnd;
import org.lunifera.doc.dsl.doccompiler.DocumentStart;
import org.lunifera.doc.dsl.doccompiler.ElseIfCondition;
import org.lunifera.doc.dsl.doccompiler.ElseStart;
import org.lunifera.doc.dsl.doccompiler.EndIf;
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
import org.lunifera.doc.dsl.doccompiler.Literal;
import org.lunifera.doc.dsl.doccompiler.MailtoEnd;
import org.lunifera.doc.dsl.doccompiler.MailtoStart;
import org.lunifera.doc.dsl.doccompiler.Markup;
import org.lunifera.doc.dsl.doccompiler.MovieEnd;
import org.lunifera.doc.dsl.doccompiler.MovieStart;
import org.lunifera.doc.dsl.doccompiler.PrintedExpression;
import org.lunifera.doc.dsl.doccompiler.ProcessedRichString;
import org.lunifera.doc.dsl.doccompiler.RefEnd;
import org.lunifera.doc.dsl.doccompiler.RefStart;
import org.lunifera.doc.dsl.doccompiler.SectionEnd;
import org.lunifera.doc.dsl.doccompiler.SectionStart;
import org.lunifera.doc.dsl.doccompiler.SkypeEnd;
import org.lunifera.doc.dsl.doccompiler.SkypeStart;
import org.lunifera.doc.dsl.doccompiler.SubsectionEnd;
import org.lunifera.doc.dsl.doccompiler.SubsectionStart;
import org.lunifera.doc.dsl.doccompiler.TableDataEnd;
import org.lunifera.doc.dsl.doccompiler.TableDataStart;
import org.lunifera.doc.dsl.doccompiler.TableEnd;
import org.lunifera.doc.dsl.doccompiler.TableRowEnd;
import org.lunifera.doc.dsl.doccompiler.TableRowStart;
import org.lunifera.doc.dsl.doccompiler.TableStart;
import org.lunifera.doc.dsl.doccompiler.URLEnd;
import org.lunifera.doc.dsl.doccompiler.URLStart;
import org.lunifera.doc.dsl.doccompiler.UnderlineEnd;
import org.lunifera.doc.dsl.doccompiler.UnderlineStart;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage
 * @generated
 */
public class DocCompilerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static DocCompilerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocCompilerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DocCompilerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc --> This
	 * implementation returns <code>true</code> if the object is either the model's package or is an instance object of
	 * the model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DocCompilerSwitch<Adapter> modelSwitch = new DocCompilerSwitch<Adapter>() {
		@Override
		public Adapter caseDocumentStart(DocumentStart object) {
			return createDocumentStartAdapter();
		}

		@Override
		public Adapter caseDocumentEnd(DocumentEnd object) {
			return createDocumentEndAdapter();
		}

		@Override
		public Adapter caseProcessedRichString(ProcessedRichString object) {
			return createProcessedRichStringAdapter();
		}

		@Override
		public Adapter caseLine(Line object) {
			return createLineAdapter();
		}

		@Override
		public Adapter caseLinePart(LinePart object) {
			return createLinePartAdapter();
		}

		@Override
		public Adapter caseLiteral(Literal object) {
			return createLiteralAdapter();
		}

		@Override
		public Adapter caseLineBreak(LineBreak object) {
			return createLineBreakAdapter();
		}

		@Override
		public Adapter caseForLoopStart(ForLoopStart object) {
			return createForLoopStartAdapter();
		}

		@Override
		public Adapter caseForLoopEnd(ForLoopEnd object) {
			return createForLoopEndAdapter();
		}

		@Override
		public Adapter casePrintedExpression(PrintedExpression object) {
			return createPrintedExpressionAdapter();
		}

		@Override
		public Adapter caseIfConditionStart(IfConditionStart object) {
			return createIfConditionStartAdapter();
		}

		@Override
		public Adapter caseElseIfCondition(ElseIfCondition object) {
			return createElseIfConditionAdapter();
		}

		@Override
		public Adapter caseElseStart(ElseStart object) {
			return createElseStartAdapter();
		}

		@Override
		public Adapter caseEndIf(EndIf object) {
			return createEndIfAdapter();
		}

		@Override
		public Adapter caseMarkup(Markup object) {
			return createMarkupAdapter();
		}

		@Override
		public Adapter caseH1Start(H1Start object) {
			return createH1StartAdapter();
		}

		@Override
		public Adapter caseH1End(H1End object) {
			return createH1EndAdapter();
		}

		@Override
		public Adapter caseH2Start(H2Start object) {
			return createH2StartAdapter();
		}

		@Override
		public Adapter caseH2End(H2End object) {
			return createH2EndAdapter();
		}

		@Override
		public Adapter caseExampleStart(ExampleStart object) {
			return createExampleStartAdapter();
		}

		@Override
		public Adapter caseExampleEnd(ExampleEnd object) {
			return createExampleEndAdapter();
		}

		@Override
		public Adapter caseURLStart(URLStart object) {
			return createURLStartAdapter();
		}

		@Override
		public Adapter caseURLEnd(URLEnd object) {
			return createURLEndAdapter();
		}

		@Override
		public Adapter caseRefStart(RefStart object) {
			return createRefStartAdapter();
		}

		@Override
		public Adapter caseRefEnd(RefEnd object) {
			return createRefEndAdapter();
		}

		@Override
		public Adapter caseBoldStart(BoldStart object) {
			return createBoldStartAdapter();
		}

		@Override
		public Adapter caseBoldEnd(BoldEnd object) {
			return createBoldEndAdapter();
		}

		@Override
		public Adapter caseUnderlineStart(UnderlineStart object) {
			return createUnderlineStartAdapter();
		}

		@Override
		public Adapter caseUnderlineEnd(UnderlineEnd object) {
			return createUnderlineEndAdapter();
		}

		@Override
		public Adapter caseItalicStart(ItalicStart object) {
			return createItalicStartAdapter();
		}

		@Override
		public Adapter caseItalicEnd(ItalicEnd object) {
			return createItalicEndAdapter();
		}

		@Override
		public Adapter caseImgStart(ImgStart object) {
			return createImgStartAdapter();
		}

		@Override
		public Adapter caseMailtoStart(MailtoStart object) {
			return createMailtoStartAdapter();
		}

		@Override
		public Adapter caseMailtoEnd(MailtoEnd object) {
			return createMailtoEndAdapter();
		}

		@Override
		public Adapter caseSkypeStart(SkypeStart object) {
			return createSkypeStartAdapter();
		}

		@Override
		public Adapter caseSkypeEnd(SkypeEnd object) {
			return createSkypeEndAdapter();
		}

		@Override
		public Adapter caseMovieStart(MovieStart object) {
			return createMovieStartAdapter();
		}

		@Override
		public Adapter caseMovieEnd(MovieEnd object) {
			return createMovieEndAdapter();
		}

		@Override
		public Adapter caseCodeStart(CodeStart object) {
			return createCodeStartAdapter();
		}

		@Override
		public Adapter caseCodeEnd(CodeEnd object) {
			return createCodeEndAdapter();
		}

		@Override
		public Adapter caseTableStart(TableStart object) {
			return createTableStartAdapter();
		}

		@Override
		public Adapter caseTableEnd(TableEnd object) {
			return createTableEndAdapter();
		}

		@Override
		public Adapter caseTableRowStart(TableRowStart object) {
			return createTableRowStartAdapter();
		}

		@Override
		public Adapter caseTableRowEnd(TableRowEnd object) {
			return createTableRowEndAdapter();
		}

		@Override
		public Adapter caseTableDataStart(TableDataStart object) {
			return createTableDataStartAdapter();
		}

		@Override
		public Adapter caseTableDataEnd(TableDataEnd object) {
			return createTableDataEndAdapter();
		}

		@Override
		public Adapter caseChapterStart(ChapterStart object) {
			return createChapterStartAdapter();
		}

		@Override
		public Adapter caseChapterEnd(ChapterEnd object) {
			return createChapterEndAdapter();
		}

		@Override
		public Adapter caseSectionStart(SectionStart object) {
			return createSectionStartAdapter();
		}

		@Override
		public Adapter caseSectionEnd(SectionEnd object) {
			return createSectionEndAdapter();
		}

		@Override
		public Adapter caseSubsectionStart(SubsectionStart object) {
			return createSubsectionStartAdapter();
		}

		@Override
		public Adapter caseSubsectionEnd(SubsectionEnd object) {
			return createSubsectionEndAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.DocumentStart
	 * <em>Document Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentStart
	 * @generated
	 */
	public Adapter createDocumentStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.DocumentEnd
	 * <em>Document End</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentEnd
	 * @generated
	 */
	public Adapter createDocumentEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.ProcessedRichString
	 * <em>Processed Rich String</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.ProcessedRichString
	 * @generated
	 */
	public Adapter createProcessedRichStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.Line <em>Line</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.LinePart
	 * <em>Line Part</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.LinePart
	 * @generated
	 */
	public Adapter createLinePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.LineBreak
	 * <em>Line Break</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.LineBreak
	 * @generated
	 */
	public Adapter createLineBreakAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.ForLoopStart
	 * <em>For Loop Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.ForLoopStart
	 * @generated
	 */
	public Adapter createForLoopStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.ForLoopEnd
	 * <em>For Loop End</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.ForLoopEnd
	 * @generated
	 */
	public Adapter createForLoopEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.PrintedExpression
	 * <em>Printed Expression</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.PrintedExpression
	 * @generated
	 */
	public Adapter createPrintedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.IfConditionStart
	 * <em>If Condition Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.IfConditionStart
	 * @generated
	 */
	public Adapter createIfConditionStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.ElseIfCondition
	 * <em>Else If Condition</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.ElseIfCondition
	 * @generated
	 */
	public Adapter createElseIfConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.ElseStart
	 * <em>Else Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.ElseStart
	 * @generated
	 */
	public Adapter createElseStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.EndIf <em>End If</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.EndIf
	 * @generated
	 */
	public Adapter createEndIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.Markup <em>Markup</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.Markup
	 * @generated
	 */
	public Adapter createMarkupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.H1Start <em>H1 Start</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.H1Start
	 * @generated
	 */
	public Adapter createH1StartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.H1End <em>H1 End</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.H1End
	 * @generated
	 */
	public Adapter createH1EndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.H2Start <em>H2 Start</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.H2Start
	 * @generated
	 */
	public Adapter createH2StartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.H2End <em>H2 End</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.H2End
	 * @generated
	 */
	public Adapter createH2EndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.ExampleStart
	 * <em>Example Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.ExampleStart
	 * @generated
	 */
	public Adapter createExampleStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.ExampleEnd
	 * <em>Example End</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.ExampleEnd
	 * @generated
	 */
	public Adapter createExampleEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.URLStart
	 * <em>URL Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.URLStart
	 * @generated
	 */
	public Adapter createURLStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.URLEnd <em>URL End</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.URLEnd
	 * @generated
	 */
	public Adapter createURLEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.RefStart
	 * <em>Ref Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.RefStart
	 * @generated
	 */
	public Adapter createRefStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.RefEnd <em>Ref End</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.RefEnd
	 * @generated
	 */
	public Adapter createRefEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.BoldStart
	 * <em>Bold Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.BoldStart
	 * @generated
	 */
	public Adapter createBoldStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.BoldEnd <em>Bold End</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.BoldEnd
	 * @generated
	 */
	public Adapter createBoldEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.UnderlineStart
	 * <em>Underline Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.UnderlineStart
	 * @generated
	 */
	public Adapter createUnderlineStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.UnderlineEnd
	 * <em>Underline End</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.UnderlineEnd
	 * @generated
	 */
	public Adapter createUnderlineEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.ItalicStart
	 * <em>Italic Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.ItalicStart
	 * @generated
	 */
	public Adapter createItalicStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.ItalicEnd
	 * <em>Italic End</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.ItalicEnd
	 * @generated
	 */
	public Adapter createItalicEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.ImgStart
	 * <em>Img Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.ImgStart
	 * @generated
	 */
	public Adapter createImgStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.MailtoStart
	 * <em>Mailto Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.MailtoStart
	 * @generated
	 */
	public Adapter createMailtoStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.MailtoEnd
	 * <em>Mailto End</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.MailtoEnd
	 * @generated
	 */
	public Adapter createMailtoEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.SkypeStart
	 * <em>Skype Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.SkypeStart
	 * @generated
	 */
	public Adapter createSkypeStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.SkypeEnd
	 * <em>Skype End</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.SkypeEnd
	 * @generated
	 */
	public Adapter createSkypeEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.MovieStart
	 * <em>Movie Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.MovieStart
	 * @generated
	 */
	public Adapter createMovieStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.MovieEnd
	 * <em>Movie End</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.MovieEnd
	 * @generated
	 */
	public Adapter createMovieEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.CodeStart
	 * <em>Code Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.CodeStart
	 * @generated
	 */
	public Adapter createCodeStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.CodeEnd <em>Code End</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.CodeEnd
	 * @generated
	 */
	public Adapter createCodeEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.TableStart
	 * <em>Table Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.TableStart
	 * @generated
	 */
	public Adapter createTableStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.TableEnd
	 * <em>Table End</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.TableEnd
	 * @generated
	 */
	public Adapter createTableEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.TableRowStart
	 * <em>Table Row Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.TableRowStart
	 * @generated
	 */
	public Adapter createTableRowStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.TableRowEnd
	 * <em>Table Row End</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.TableRowEnd
	 * @generated
	 */
	public Adapter createTableRowEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.TableDataStart
	 * <em>Table Data Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.TableDataStart
	 * @generated
	 */
	public Adapter createTableDataStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.TableDataEnd
	 * <em>Table Data End</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.TableDataEnd
	 * @generated
	 */
	public Adapter createTableDataEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.ChapterStart
	 * <em>Chapter Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.ChapterStart
	 * @generated
	 */
	public Adapter createChapterStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.ChapterEnd
	 * <em>Chapter End</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.ChapterEnd
	 * @generated
	 */
	public Adapter createChapterEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.SectionStart
	 * <em>Section Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.SectionStart
	 * @generated
	 */
	public Adapter createSectionStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.SectionEnd
	 * <em>Section End</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.SectionEnd
	 * @generated
	 */
	public Adapter createSectionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.SubsectionStart
	 * <em>Subsection Start</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.SubsectionStart
	 * @generated
	 */
	public Adapter createSubsectionStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.doccompiler.SubsectionEnd
	 * <em>Subsection End</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.doccompiler.SubsectionEnd
	 * @generated
	 */
	public Adapter createSubsectionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // DocCompilerAdapterFactory
