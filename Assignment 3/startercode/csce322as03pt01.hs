import Prelude
import System.Environment ( getArgs )
import Data.List
import Helpers
  
-- The main method that will be used for testing / command line access
main = do
  args <- getArgs
  filename <- readFile (head args)
  (positions,chutes,ladders,board,rolls) <- readCaLFile filename
  printResult  [(onePlayerOneMove ((head positions),chutes,ladders,board,(head rolls)))]

-- YOUR CODE SHOULD COME AFTER THIS POINT
onePlayerOneMove :: (Int,[Int],[Int],[[Int]],Int) -> Int
onePlayerOneMove (position, chutes, ladders, board, roll) 
	|	nextPosition >  lastPosition 		= position
	| 	checkIfElem nextPosition chutes 	= onePlayerOneMove ((getPos board nextPosition), [], [], board, 0)
	| 	checkIfElem nextPosition ladders 	= onePlayerOneMove ((getPos board nextPosition), [], [], board, 0)
	|   otherwise 							= nextPosition
	where 
		lastPosition = getLastBoardPosition(board)
		nextPosition = position + roll
