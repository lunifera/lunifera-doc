/*
* generated by Xtext
*/
package org.lunifera.doc.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LuniferaDocGrammarAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/lunifera/doc/dsl/parser/antlr/internal/InternalLuniferaDocGrammar.tokens");
	}
}