class NastyCategory extends ToStringCategory {
	static String toString(nasty) {
		super.toString(nasty) \
		+ '\n\t' + nasty.fight() \
		+ '\n\t' + nasty.howlAtDeath() \
		+ '\n\t' + nasty.decideIfNiceOrNasty()
	}
} // NastyCategory