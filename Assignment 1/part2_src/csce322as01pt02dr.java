import org.antlr.v4.runtime.*;
import java.io.IOException;


class MyErrorListener extends BaseErrorListener{
    @Override
    public void syntaxError(Recognizer <?, ?> recognizer , Object offendingSymbol , int line , int position , String msg , RecognitionException e) {
        
    	// The initial syntax error message is split into words because it contains unnecessary information 
    	String[] words = msg.split(" ");
    	
    	if(msg.charAt(msg.length() - 2) == ' ') {
    		// The last word contains all needed information
        	String message = words[words.length - 2];
        	System.out.println(message.substring(1, message.length()) + " in Line " + line + " is Not a Recognized Token");
    	}
    	else {
    		// The last word contains all needed information
        	String message = words[words.length - 1];
        	System.out.println(message.substring(1, message.length() - 1) + " in Line " + line + " is Not a Recognized Token");
    	}
        
        System.exit(0);
    }
}

public class csce322as01pt02dr {
    public static void main(String args[]) {
        CharStream input = null;
        
        if( args.length == 1 )
        {
            try {
                input = new ANTLRFileStream(args[0]);
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else
        {
            System.err.println( "File Not Provided" );
            System.exit(0);
        }
        csce322as01pt02Lexer lexer = new csce322as01pt02Lexer( input );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        csce322as01pt02Parser parser = new csce322as01pt02Parser(tokens);
        
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
        lexer.addErrorListener( new MyErrorListener() );
        parser.addErrorListener( new MyErrorListener() );
        parser.chutesNladders();
    }
}