    //@Grab(group='org.spockframework', module='spock-core', version='0.7-groovy-2.0')  // works...
    //@Grab(group='org.spockframework', module='spock-core', version='1.0-groovy-2.4')  // ...doesn't?
@Grapes(
    @Grab(group='org.spockframework', module='spock-core', version='0.7-groovy-2.0')
)

import spock.lang.Specification
import java.lang.Void as Should // haha!

class TrabTheTribbleSpec extends Specification {
    // setup main object; mocks done within "features"
    def trab = new TrabTheTribble()
 
    Should 'feed a tribble, and get more tribbles'() {
        when:
            def result = trab.feed()
 
        then:
            result.size() == 11 // test...
            result.each {       // ...type
                it instanceof TrabTheTribble
           }
    }

    Should 'react well to Vulcans'() {
        setup:
            VulcanStyle vulcan = Mock()       // mock an interface
     
        when:
            String reaction = trab.react(vulcan)
     
        then:
            reaction == '(trab the tribble): purr, purr, *purr*, PURR!'    // test
            1 * vulcan.soothe()          // invoked once?
    }

    Should 'react badly to Klingons (wrong)'() {
        setup:
            KlingonStyle klingon = Mock()                    // mock an interface
            klingon.annoy() >> { throw new KlingonException() }     // klingons throw an exception when confronted by tribbles! (called global)
     
        when:
            def reaction = trab.react(klingon)
     
        then:
            0 * klingon.howlAtDeath()       // not invoked?
            1 * klingon.annoy()             // invoked once?
            reaction == '(tribble-stylee): wheep! wheep!' // test
            notThrown(KlingonException)     // wrong: exception *should* be thrown! (but behaviour declared in 'then' is local to 'when', and local > global)
    }

    Should 'react badly to Klingons (done right)'() {
        setup:
            KlingonStyle klingon = Mock()                               // mock an interface; declare cardinality and reaction outside local 'then'/'when' block 
            1 * klingon.annoy() >> { throw new KlingonException() }     // throw exception if invoked once? note: klingons throw an exception when confronted by tribbles!
            0 * klingon.howlAtDeath()                                   // not invoked?

        when:
            def reaction = trab.react(klingon)
     
        then:
            def ignored = println '~~~ helloooo! ~~~'   // allows us to print as condition
            reaction == null            // no reaction? (because of exception)
            thrown(KlingonException)    // right: exception thrown? (not overriden in 'then', unlike above)
    }
} // TrabTheTribbleSpec