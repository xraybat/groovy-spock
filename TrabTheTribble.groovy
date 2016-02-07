// a _hero_ of the species
//@singleton    // can't singleton becos' of feed()
class TrabTheTribble implements TribbleStyle, Creature {
	def name() { 'trab' }
    def decideIfNiceOrNasty() { 'i am _completely_ neutral about most things\n\t\t(*except* klingons and vulcans)' }

    def feed() {
        def tribbles = [this]
        10.times { tribbles << new TrabTheTribble() }   // returning multiple trabs, not tribbles?????
        return tribbles
    }

   	def react(VulcanStyle vulcan) {     // extra-strong individual reaction for trab the tribble (overrides species reaction)
	    println '\t' + vulcan.soothe()
	    "(${name()} the ${type()}): purr, purr, *purr*, PURR!"
	}
} // TrabTheTribble