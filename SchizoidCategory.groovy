class SchizoidCategory extends ToStringCategory {
	static String toString(schizo) {
		super.toString(schizo) \
		+ '\n\t' + schizo.soothe() \
		+ '\n\t' + schizo.fight() + ' unto ' + schizo.howlAtDeath() \
		+ '\n\t' + schizo.decideIfNiceOrNasty()
	}
} // SchizoidCategory