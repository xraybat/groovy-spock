// an individual of the species
@Singleton  // new-style singleton: Spock.instance.soothe(...), etc, not 'spock.'
class Spock implements VulcanStyle, Creature {
	def name() { 'spock' }
    def decideIfNiceOrNasty() { 'i am a _nice logical_ creature' }

} // Spock