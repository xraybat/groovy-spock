class NiceCategory extends ToStringCategory {
	static String toString(nice) {
		super.toString(nice) \
		+ '\n\t' + nice.soothe() \
		+ '\n\t' + nice.decideIfLogical(2 * 10, 4 * 5) \
		+ '\n\t' + nice.decideIfLogical(2 * 10, 'an apple') \
		+ '\n\t' + nice.decideIfNiceOrNasty()
	}
} // NiceCategory