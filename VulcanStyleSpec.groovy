    //@Grab(group='org.spockframework', module='spock-core', version='0.7-groovy-2.0')  // works...
    //@Grab(group='org.spockframework', module='spock-core', version='1.0-groovy-2.4')  // ...doesn't?
@Grapes(
    @Grab(group='org.spockframework', module='spock-core', version='0.7-groovy-2.0')
)

import spock.lang.Specification
import java.lang.Void as Should // haha!

class VulcanStyleSpec extends Specification {
    // setup main object; mocks done within "features"
    VulcanStyle vulcan = new Object() as VulcanStyle    // coerce trait to object so we can test

    Should 'be vulcan'() {
        expect:
            vulcan.type() == 'vulcan'
            vulcan.soothe() == 'live long and prosper'
    }

    Should 'decide if logical'() {
        when:
            def reaction = vulcan.decideIfLogical(20, 20)
     
        then:
            reaction == "'20 == 20' is logical"
    }

    Should 'decide if illogical'() {
        when:
            def reaction = vulcan.decideIfLogical(20, 'an apple')
     
        then:
            reaction == "'20 == an apple' is _illogical_, captain"
    }
} // VulcanStyleSpec