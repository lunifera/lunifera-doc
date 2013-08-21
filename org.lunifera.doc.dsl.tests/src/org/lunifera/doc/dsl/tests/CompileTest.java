package org.lunifera.doc.dsl.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lunifera.doc.dsl.LuniferaDocGrammarInjectorProvider;
import org.lunifera.doc.dsl.api.impl.MetaPojo;
import org.lunifera.doc.dsl.api.impl.MetaPojoProperty;
import org.lunifera.doc.dsl.richstring.IDTODocumentation;

import com.google.inject.Inject;

@InjectWith(LuniferaDocGrammarInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("restriction")
public class CompileTest {

	private @Inject
	CompilationTestHelper helper;

	@Test
	public void test() throws URISyntaxException, IOException,
			InstantiationException, IllegalAccessException {

		helper.setJavaCompilerClassPath(EList.class, StringConcatenation.class,
				MetaPojo.class);

		// parse the java code from lunifera doc model
		Acceptor acceptor = new Acceptor();
		helper.compile(loadTestModel().toString(), acceptor);
		Result result = acceptor.result;

		// compile the java code to a class
		Class<?> clazz = result.getCompiledClass();

		// create a new instance and execute the serialization
		IDTODocumentation instance = (IDTODocumentation) clazz.newInstance();
		instance.setIt(createMetaPojo());
		System.out.println(instance.serialize());
	}

	/**
	 * Create test meta dto
	 * 
	 * @return
	 */
	private MetaPojo createMetaPojo() {
		MetaPojo dto = new MetaPojo();
		dto.setName("MyTestDTO");
		dto.setDocumentation("Test the test DTO");

		MetaPojoProperty prop1 = new MetaPojoProperty();
		prop1.setName("name");
		prop1.setDocumentation("Defines the name of this instance");
		dto.getProperties().add(prop1);

		MetaPojoProperty prop2 = new MetaPojoProperty();
		prop2.setName("type");
		prop2.setDocumentation("Defines the type of this instance");
		dto.getProperties().add(prop2);
		return dto;
	}

	/**
	 * Load the test model
	 * 
	 * @return
	 * @throws IOException
	 */
	private StringBuilder loadTestModel() throws IOException {
		StringBuilder builder = new StringBuilder();
		BufferedReader br = null;
		try {
			InputStreamReader reader = new InputStreamReader(getClass()
					.getResource("LayoutTest.luniferadoc").openStream());
			br = new BufferedReader(reader);

			while (br.ready()) {
				builder.append(br.readLine());
				builder.append("\n\r");
			}
		} finally {
			br.close();
		}
		return builder;
	}

	private class Acceptor implements IAcceptor<CompilationTestHelper.Result> {
		private Result result;

		@Override
		public void accept(Result result) {
			this.result = result;
		}

	}
}
