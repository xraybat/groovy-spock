trait VulcanStyle implements Species {		// traits are more fun than interfaces!
	def type() { 'vulcan' }

    def soothe() { 'live long and prosper' }
    def decideIfLogical(x, y) { "'${x} == ${y}' is " + ((x == y) ? 'logical' : '_illogical_, captain') }

    abstract def decideIfNiceOrNasty()

} // VulcanStyle