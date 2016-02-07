// an "individual" of two species
@Singleton  // new-style singleton: SamTheSchizo.instance.sayNameLoudly(...), etc, not 'sam.'
class SamTheSchizo implements VulcanStyle,
							  KlingonStyle,		// klingon species overrides vulcan!??????
							  Creature {		// multiple "interfaces" (actually traits with default impls!)
	def name() { 'sam the schizo' }
    def decideIfNiceOrNasty() { 'i can\'t decide *what* i am!\n\t\t(but apparently i\'m a little more ' + type() + ',' \
    							+ '\n\t\teven tho i can still ' +  soothe() + '?)' }

	def explainDiagnosis() { "i'm split personality, not schizoid! there are only two like me!" }
    def sayNameLoudly() { "i'm ${name()}!!".toUpperCase() }

} // SamTheSchizo