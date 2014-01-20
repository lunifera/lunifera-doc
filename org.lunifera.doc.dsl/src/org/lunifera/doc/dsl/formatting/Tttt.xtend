package org.lunifera.doc.dsl.formatting

class Tttt {

	def String to() '''
		«FOR i : 0 .. 10»
			«IF i > 7»
			«ELSE»
			«ENDIF»
		«ENDFOR»
	'''

}
