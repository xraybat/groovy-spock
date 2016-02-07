// an individual of the species
@Singleton  // new-style singleton: Koloth.instance.name(...), etc, not 'koloth.'
class Koloth implements KlingonStyle, Creature {
	def name() { 'koloth' }
    def decideIfNiceOrNasty() { 'i am a *nasty, nasty* creature!' }

} // Koloth