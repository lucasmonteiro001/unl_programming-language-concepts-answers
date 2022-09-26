import Prelude
import System.Environment ( getArgs )
import Data.List
import Helpers
  
-- The main method that will be used for testing / command line access
main = do
  args <- getArgs
  filename <- readFile (head args)
  (positions,chutes,ladders,board,rolls) <- readCaLFile filename
  printResult (manyPlayersManyMovesSixes (positions,chutes,ladders,board,rolls))

-- YOUR CODE SHOULD COME AFTER THIS POINT
manyPlayersManyMovesSixes :: ([Int],[Int],[Int],[[Int]],[Int]) -> [Int]
manyPlayersManyMovesSixes (positions, chutes, ladders, board, rolls) = manyPlayerManyMovesExec (positions, chutes, ladders, board, rolls, 0, [0,0,0])


-- positions 	current players position
-- chutes
-- ladders
-- rolls
-- count		for the first  call of this function, count MUST be 0
-- output		list with players current position
manyPlayerManyMovesExec :: ([Int],[Int],[Int],[[Int]],[Int], Int, [Int]) -> [Int]
manyPlayerManyMovesExec (positions, chutes, ladders, board, rolls, count, listOfSixes)
 	-- If no rolls, return the current positions
	|	null rolls							= printList (positions, count, 0)
	-- If no more rolls and the last roll is greater than last position, do nothing and return the current positions
	|	(nextPosition == lastPosition)		= printList (newListNewPos, count + 1, 0)
	-- From now on, the positions list needs to be updated.
	-- Now, if no movement needs to be done, just update the positions list
	|	nextPosition >  lastPosition		= manyPlayerManyMovesExec (newListSamePos, chutes, ladders, board, tail rolls, count + 1, listOfSixes)
	| 	checkIfElem nextPosition chutes 	= manyPlayerManyMovesExec (newListChuteOrLadder, chutes, ladders, board, tail rolls, count + 1, listOfSixes)
	|	checkIfElem nextPosition ladders 	= manyPlayerManyMovesExec (newListChuteOrLadder, chutes, ladders, board, tail rolls, count + 1, listOfSixes)
	|   otherwise 							= manyPlayerManyMovesExec (newListNewPos, chutes, ladders, board, tail rolls, count + 1, listOfSixes)
	where 
		lastPosition 			= getLastBoardPosition(board)
		nextPosition 			= calculateNewPosition( ((head positions) + (head rolls)), count + 1, listOfSixes )
		newListSamePos 			= (updatePositions positions)
		newListChuteOrLadder	= (updatePositions ([(getPos board nextPosition)] ++ tail positions))
		newListNewPos 			= (updatePositions ([nextPosition] ++ tail positions))
		isOneRoundComplete	 	= if (count > 0 && count `mod` length positions == 0) then True else False

calculateNewPosition :: (Int, Int, [Int]) -> Int
calculateNewPosition (curPosPlusRoll, count, listOfSixes)
	|	_mod == 0 && (head listOfSixes == 3)	= 0
	|	_mod == 0 && (head listOfSixes < 3)		= curPosPlusRoll
	| 	otherwise								= calculateNewPosition
	where 
		_mod 	= count `mod` length listOfSixes
		val 	= length positions - _mod

-- list 	list that will be updated
-- output	this function outputs the tail of the list followed by the first element of the list (e.g., updatePostions(abc) -> (bca))
updatePositions :: [Int] -> [Int]
updatePositions (list) = (tail list) ++ [(head list)]

-- positions 	list that will be printed
-- count		Number of times that the list was updated
-- aux			for the first  call of this function, aux MUST be 0
printList :: ([Int], Int, Int) -> [Int]
printList (positions, count, aux)
	|	_mod == 0 	= positions
	|	val > aux	= printList (updatePositions positions, count, aux + 1)
	| 	otherwise 	= positions
	where
		_mod 	= count `mod` length positions
		val 	= length positions - _mod
