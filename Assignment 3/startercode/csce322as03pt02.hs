import Prelude
import System.Environment ( getArgs )
import Data.List
import Helpers
  
-- The main method that will be used for testing / command line access
main = do
  args <- getArgs
  filename <- readFile (head args)
  (positions,chutes,ladders,board,rolls) <- readCaLFile filename
  printResult  [(onePlayerManyMoves ((head positions),chutes,ladders,board,rolls))]

-- YOUR CODE SHOULD COME AFTER THIS POINT
onePlayerManyMoves :: (Int,[Int],[Int],[[Int]],[Int]) -> Int
onePlayerManyMoves (position, chutes, ladders, board, rolls)
	|	null rolls 							= position
	|	nextPosition >  lastPosition		= onePlayerManyMoves (position, chutes, ladders, board, tail rolls)
	| 	checkIfElem nextPosition chutes 	= onePlayerManyMoves ((getPos board nextPosition), chutes, ladders, board, tail rolls)
	| 	checkIfElem nextPosition ladders 	= onePlayerManyMoves ((getPos board nextPosition), chutes, ladders, board, tail rolls)
	|   otherwise 							= onePlayerManyMoves (nextPosition, chutes, ladders, board, tail rolls)
	where 
		lastPosition = getLastBoardPosition(board)
		nextPosition = position + (head rolls)