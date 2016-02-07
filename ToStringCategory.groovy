class ToStringCategory {	// "obj-c" category or groovy "expando" class to add custom logic to classes we don't own
	// 'static' and first param as type instance allows method to be called off any instance;
	// the first parameter is the instance (and is critical) while other params follow
	static String toString(creature) {
		"(creature): i'm a ${creature.type()} named ${creature.name()}"
	}
} // ToStringCategory