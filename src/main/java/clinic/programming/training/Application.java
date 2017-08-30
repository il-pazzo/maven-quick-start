package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;


public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    public int countWords( String sentence ) {

    	String[] words = StringUtils.split( sentence, ' ' );

	return ( words == null ? 0 : words.length );
    }

    public void greet() {

    	List<String> greetings = new ArrayList<>();
	greetings.add( "Hello" );
	greetings.add( "Howdy" );

	for( String greeting: greetings ) {
		p( "Greeting: " + greeting );
	}
    }

    // method main(): ALWAYS the APPLICATION entry point
    //
    public static void main (String[] args) {

    	System.out.println ("Starting Application");
	Application app = new Application();
	app.greet();

	int numWords	= app.countWords( "I have four words" );
	p( "Word count: " + numWords );
    }
    static void p( String s ) { System.out.println( s ); }
}
