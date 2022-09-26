module.exports = {
    withoutCaL: withoutCaL
}

function withoutCaL(game){

	var board = game.slice(3);
  
    /*
      Returns a function that, given the position of a piece and a roll will determine where the piece will move
      The presence of chutes and ladders is ignored.
     */
    function whatever(position,roll){
    	var goToPosition = -1;
    	var counter		 = 0;
    	var rows		 = board.length;
    	var cols		 = board[0].length;
    	var current_row	 = 1;
    	var current_pos	 = 1;
    	
    	for (var i = rows - 1; i >= 0; i--) {
    		// Look for the position in the LEFT-TO-RIGHT order
    		if (i % 2 != 0) {
    			while (counter < cols) {
    				current_pos ++;
    				counter ++;
    				// Position found
    				if (current_pos == position) {
    					// Walk as many slots as needed to find the next position
    					while (current_pos != position + roll) {
    						// If the row number is odd
    						if (current_row % 2 != 0) {
    							counter ++; // Go to the next slot in the board
    							current_pos ++;
    							while (counter <= cols) {
    								if (current_pos == position + roll) { // Found the next position
    									return board[rows - current_row][counter - 1];
    								}
    								counter ++;
    								current_pos ++;
    							}
    							counter = 0;
    							// If the position wasn't found, go to the next line
    							current_row ++;
    						}
    						// If the row number is even
    						else {
    							return 777;
    						}
    					}
    					// IMPORTANTE return board[i][counter]; // Position found
    				}
    				
    			}
    		}
    		// Look for the position in the RIGHT-TO-LEFT order
    		else {
    			counter = cols - 1;
    			while (counter >= 0) {
    				current_pos++;
    				if (current_pos == position) {
    					return board[i][counter]; // Position found
    				}
    				counter--;
    			}
    		}
    		counter = 0;
    		current_row++;
    	}
    }

    return whatever;
}
