class Main {                                    
    static void main(String... args) {          

		////////////////////////////////////////////////////
		def trab = new TrabTheTribble()
		use (NeutralCategory) {
			println trab.toString()
		}

		println ''

		////////////////////////////////////////////////////
		use (NiceCategory) {
			println Spock.instance.toString()
		}

		println '\t' + trab.react(Spock.instance)
		println ''

		////////////////////////////////////////////////////
		use (NastyCategory) {
			println Koloth.instance.toString()
		}

		try {
			println Koloth.instance.annoy()
		}

		catch (KlingonException e1) {
			println '\t' + trab.say('nasty creature spazzed out _exceptionally_!')

			try {
				println trab.react(Koloth.instance)
			}

			catch (KlingonException e2) {
				println '\t' + trab.say('nasty creature spazzed out _exceptionally_ again!')
			}
		}
		println ''

		////////////////////////////////////////////////////
		use (SchizoidCategory) {
			println SamTheSchizo.instance.toString()
		}

		try {
			println '\t' + trab.react(SamTheSchizo.instance)
		}

		catch (GroovyRuntimeException e) {
			println '\tterrible result: ' + e.toString()
		}
		println ''

    } // main
} // Main