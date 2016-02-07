class NeutralCategory extends ToStringCategory {
	static String toString(neutral) {
		super.toString(neutral) \
		+ '\n\t' + neutral.decideIfNiceOrNasty()
	}
} // NeutralCategory