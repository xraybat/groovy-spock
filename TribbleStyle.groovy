trait TribbleStyle implements Species {
	def type() { 'tribble' }
	
	def react(KlingonStyle klingon) {	// species reaction to a species
	    println '\t' + klingon.annoy()
	    "(${type()}-stylee): wheep! wheep!"
	}
	 
	def react(VulcanStyle vulcan) {		// species reaction to a species
	    println '\t' + vulcan.soothe()
	    "(${type()}-stylee): purr, purr"
	}

	def react(SamTheSchizo sam) {		// species reaction to an individual
	    println '\t' + sam.explainDiagnosis() \
	    	  + '\n\t' + sam.sayNameLoudly()
	    "(${type()}-stylee): /bemused/"
	}

	def say(msg) {
		"(${type()}-stylee): ${msg}"
	}
} // TribbleStyle