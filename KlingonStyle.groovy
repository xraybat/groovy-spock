trait KlingonStyle implements Species {		// traits are more fun than interfaces!
	def type() { 'klingon' }
	
    def annoy() throws KlingonException { throw new KlingonException() }	// 'throws' clause required for spock
    def fight() { 'fight! fight! fight!'.toUpperCase() }
    def howlAtDeath() { 'deatthhhh!'.toUpperCase() }

} // KlingonStyle