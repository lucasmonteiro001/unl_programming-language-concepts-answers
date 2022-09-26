grammar chuteAndLadders;

// Read Chutes before reading Ladders
init :
        // Read the Positions
        BEGINNING_OF_SECTION
            POSITIONS VALUE_ASSIGNMENT
                BEGINNING_OF_LIST
                    row_of_numbers
                END_OF_LIST

        // Read the Chutes
        END_OF_SECTION
        BEGINNING_OF_SECTION
            CHUTES VALUE_ASSIGNMENT
                BEGINNING_OF_LIST
                    row_of_numbers
            END_OF_LIST

        // Read the Ladders
        END_OF_SECTION
        BEGINNING_OF_SECTION
            LADDERS VALUE_ASSIGNMENT
                BEGINNING_OF_LIST
                    row_of_numbers
                END_OF_LIST

        // Read the GameBoard
        END_OF_SECTION
        BEGINNING_OF_SECTION
            BOARD VALUE_ASSIGNMENT
                BEGINNING_OF_BOARD
                    gameBoard_line
                END_OF_BOARD
        END_OF_SECTION

// Read Ladders before reading Chutes
      | // Read the Positions
        BEGINNING_OF_SECTION
            POSITIONS VALUE_ASSIGNMENT
                BEGINNING_OF_LIST
                    row_of_numbers
                END_OF_LIST
        END_OF_SECTION

        // Read the Ladders
        BEGINNING_OF_SECTION
            LADDERS VALUE_ASSIGNMENT
                BEGINNING_OF_LIST
                    row_of_numbers
                END_OF_LIST
        END_OF_SECTION

        // Read the Chutes
        BEGINNING_OF_SECTION
            CHUTES VALUE_ASSIGNMENT
                BEGINNING_OF_LIST
                    row_of_numbers
                END_OF_LIST
        END_OF_SECTION

        // Read the GameBoard
        BEGINNING_OF_SECTION
            BOARD VALUE_ASSIGNMENT
                BEGINNING_OF_BOARD
                    gameBoard_line
                END_OF_BOARD
        END_OF_SECTION;


// Identify the lines for Positions, Chutes and Ladders
row_of_numbers : NUMBER tail_of_numbers
                | ;
tail_of_numbers : ',' NUMBER tail_of_numbers
                | ;

// Identify the lines for the GameBoard
gameBoard_line : NUMBER tail;
tail: ',' NUMBER tail
    | ',' NUMBER ROW_SEPARATOR gameBoard_line
    | ',' NUMBER {System.out.println("End of File");};


// Define all tokens needed
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

//OTHER                   : 	. {System.out.println( this.getText() + " in Line " + this.getLine() + " is Not a Recognized Token"); System.exit(0);};

WS : [ \t\r\n]+ -> skip ;