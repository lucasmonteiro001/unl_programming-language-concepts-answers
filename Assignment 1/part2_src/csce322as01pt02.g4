grammar csce322as01pt02;

@headers {
	import java.util.Collections
}

@members {
	int players_counter;
	int chutes_counter;
	int ladders_counter;
	int rows_counter;
	int columns_counter;
	int isValidGame = 1;
	
	 // List that stores all the semantic errors found in the input file
	java.util.List<Integer> errorRules = new java.util.ArrayList<Integer>();
	
	/*
	 * Function that prints all semantic errors found in the input file
	 */
	private void printErrRules(java.util.List list) {
		
		java.util.Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++)
			System.out.println("Semantic Error: Rule " + list.get(i) + " Violated");
	}
	
	/*
	 * Function that prints one invalid token and the line in which it was found
	 */
	private void printInvalidToken(String token, int line) {
		
		System.out.println(token + " in Line "+ line + " is an Invalid Token");
	}
}

/*
 * Initial rule that starts to read the input to parse it.
 */
chutesNladders :
        // Read the Positions
        start_section
            positions value_assignment
                beginning_list
                    number_of_players 
                    {
                    	if(!(players_counter >= 2 && players_counter <= 4)) {
                    		errorRules.add(2);
                    		isValidGame = 0;
                    	}
                    }
                end_list
        end_section

        // Read Chutes or Ladders
        start_section
            chutesORladders 
		end_section
		
        // Read Chutes or Ladders
        start_section
            chutesORladders
        end_section

        // Read the GameBoard
        start_section
            board value_assignment
                beginning_board
                    gameBoard_line
                    {
                    	int columns = columns_counter/rows_counter;
                    	
                    	if(!(rows_counter > 4 && rows_counter < 20)) {
                    		errorRules.add(5);
                    		isValidGame = 0;
                    	}
                    	if(!(columns > 4 && columns < 20)) {
                    		errorRules.add(6);
                    		isValidGame = 0;
                    	}
                    }
                end_board
        end_section EOF 
        	{
        		/*
        		 * After checking the whole board and non-semantic error was found, 
        		 * it's considered that the input is totally correct and the final line 
        		 * is printed out. Otherwise, a semantic error may be printed out.
        		 */
        		if(isValidGame == 1)
        			System.out.println("The board has " + chutes_counter + " chutes and " + ladders_counter + " ladders");
        		else {
        			if (!errorRules.isEmpty())
        				printErrRules(errorRules);
        		}
        	};
        	


/*
 * As stated in the specification, the order of Chutes and Ladders may be one of the following:
 * First: Chutes, Then: Ladders 
 * or 
 * First: Ladders, Then: Chutes
 * The rule below intends to handle any of the orders above. 
 */
chutesORladders :
		CHUTES value_assignment
                beginning_list
                    number_of_chutes
                    {
                    	if(!(chutes_counter > 2 && chutes_counter < 11)) {
                    		errorRules.add(3);
                    		isValidGame = 0;
                    	}
                    }
            	end_list
	|	LADDERS value_assignment
                beginning_list
                    number_of_ladders
                    {
                    	if(!(ladders_counter > 2 && ladders_counter < 11)) {
                    		errorRules.add(4);
                    		isValidGame = 0;
                    	}
                    }
                end_list
	;

/*
 * Count the number of PLAYERS in the Positions's row
 */               
number_of_players	: NUMBER pos_tail {players_counter++;};	

pos_tail			: ',' NUMBER pos_tail {players_counter++;} 
					| ',' NUMBER {players_counter++;}
					| valid_token {System.exit(0);};
					
/*
 * Count the number of CHUTES
 */                
number_of_chutes	: NUMBER chutes_tail {chutes_counter++;};
					
chutes_tail			: ',' NUMBER chutes_tail {chutes_counter++;} 
					| ',' NUMBER {chutes_counter++;} 
					| ;

/* 
 * Count the number of LADDERS
 */                
number_of_ladders	: NUMBER ladders_tail {ladders_counter++;}; 
					
ladders_tail		: ',' NUMBER ladders_tail {ladders_counter++;}
					| ',' NUMBER  {ladders_counter++;} 
					| ;
					
/* 
 * Count the amount of columns and rows of the GameBoard
 */
gameBoard_line : NUMBER {columns_counter++;} tail;
tail: ',' NUMBER {columns_counter++;} tail
    | ',' NUMBER {columns_counter++;} ROW_SEPARATOR {rows_counter++;} gameBoard_line
    | ',' NUMBER {columns_counter++; rows_counter++;};
 
/* 
 * Define the rules to check if a given token is valid
 */   
start_section	: BEGINNING_OF_SECTION
				| valid_token {System.exit(0);};
end_section		: END_OF_SECTION
				| valid_token {System.exit(0);};
board			: BOARD
				| valid_token {System.exit(0);};
ladders			: LADDERS
				| valid_token {System.exit(0);};
chutes			: CHUTES
				| valid_token {System.exit(0);};
positions		: POSITIONS
				| valid_token {System.exit(0);};
value_assignment: VALUE_ASSIGNMENT  
				| valid_token {System.exit(0);};
number			: NUMBER
				| valid_token {System.exit(0);};
row_separator	: ROW_SEPARATOR
				| valid_token {System.exit(0);};
beginning_board	: BEGINNING_OF_BOARD
				| valid_token {System.exit(0);};
end_board		: END_OF_BOARD
				| valid_token {System.exit(0);};
beginning_list  : BEGINNING_OF_LIST
				| valid_token {System.exit(0);};
end_list		: END_OF_LIST
				| valid_token {System.exit(0);};
				
/* 
 * The following rule defines all valid tokens.
 * This rule is called when the input token is valid but 
 * it's not in the correct order.
 */
valid_token		: 
	  BEGINNING_OF_SECTION  { printInvalidToken($BEGINNING_OF_SECTION.text, $BEGINNING_OF_SECTION.line); }
	| END_OF_SECTION 		{ printInvalidToken($END_OF_SECTION.text, $END_OF_SECTION.line); }
	| BOARD 				{ printInvalidToken($BOARD.text, $BOARD.line); }
	| LADDERS 				{ printInvalidToken($LADDERS.text, $LADDERS.line); }
	| CHUTES				{ printInvalidToken($CHUTES.text, $CHUTES.line); }
	| POSITIONS 			{ printInvalidToken($POSITIONS.text, $POSITIONS.line); }
	| VALUE_ASSIGNMENT 		{ printInvalidToken($VALUE_ASSIGNMENT.text, $VALUE_ASSIGNMENT.line); }
	| NUMBER 				{ printInvalidToken($NUMBER.text, $NUMBER.line); }
	| ROW_SEPARATOR 		{ printInvalidToken($ROW_SEPARATOR.text, $ROW_SEPARATOR.line); }
	| BEGINNING_OF_BOARD 	{ printInvalidToken($BEGINNING_OF_BOARD.text, $BEGINNING_OF_BOARD.line); }
	| END_OF_BOARD 			{ printInvalidToken($END_OF_BOARD.text, $END_OF_BOARD.line); }
	| BEGINNING_OF_LIST 	{ printInvalidToken($BEGINNING_OF_LIST.text, $BEGINNING_OF_LIST.line); }
	| END_OF_LIST 			{ printInvalidToken($END_OF_LIST.text, $END_OF_LIST.line); };


/*
 * The tokens bellow are all allowed tokens of the game.
 */
BEGINNING_OF_SECTION    :   '<=' ;

END_OF_SECTION          :   '=>' ;

BOARD                   :   'GameBoard' ;

LADDERS                 :   'Ladders' ;

CHUTES                  :   'Chutes' ;

POSITIONS               :   'Positions' ;

VALUE_ASSIGNMENT        :   '<-' ;

NUMBER                  :   [0-9]+ ;

ROW_SEPARATOR           :   '^' ;

BEGINNING_OF_BOARD      :   '[' ;

END_OF_BOARD            :   ']' ;

BEGINNING_OF_LIST       :   '{' ;

END_OF_LIST             :   '}' ;

WS : [ \t\r\n]+ -> skip ;