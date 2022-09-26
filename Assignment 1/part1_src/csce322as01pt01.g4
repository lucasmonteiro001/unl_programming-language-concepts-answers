grammar csce322as01pt01;

/*
 * Definition of all tokens
 */
BEGINNING_OF_SECTION    :   '<=' {System.out.println("Start of Section: <=");};

END_OF_SECTION          :   '=>' {System.out.println("End of Section: =>");};

BOARD                   :   'GameBoard' {System.out.println("Name of Section: GameBoard");};

LADDERS                 :   'Ladders'{System.out.println("Name of Section: Ladders");};

CHUTES                  :   'Chutes' {System.out.println("Name of Section: Chutes");};

POSITIONS               :   'Positions' {System.out.println("Name of Section: Positions");};

VALUE_ASSIGNMENT        :   '<-' {System.out.println("Assignment of Value: <-");};

NUMBER                  :   [0-9]+ {System.out.println("Chute/Ladder/Space: " + this.getText());};

ROW_SEPARATOR           :   '^' {System.out.println("End of Row: ^");};

BEGINNING_OF_BOARD      :   '[' {System.out.println("Start of Board: [");};

END_OF_BOARD            :   ']' {System.out.println("End of Board: ]");};

BEGINNING_OF_LIST       :   '{' {System.out.println("Start of List: {");};

END_OF_LIST             :   '}' {System.out.println("End of List: }");};

INVALID					: Whitespace 
						| .+? {System.out.println(this.getText() + " in Line " + this.getLine() + " is Not a Recognized Token"); System.exit(0);};

Whitespace : [ \t\n\r,]+ -> skip;

/*
 * The rule bellow follows this idea: if the given token is not any of 
 * the recognized tokens previously defined, it's a token that is not recognized.
 * Therefore, this information is printed in the INVALID token definition.
 */
chutesNladders:
	.*? EOF {System.out.println("End of File");}		
;