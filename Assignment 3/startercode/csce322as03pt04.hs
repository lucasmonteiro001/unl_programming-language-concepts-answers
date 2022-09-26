import Prelude
import System.Environment ( getArgs )
import Data.List
import Helpers
  
-- The main method that will be used for testing / command line access
main = do
  args <- getArgs
  filename <- readFile (head args)
  (positions,chutes,ladders,board,rolls) <- readCaLFile filename
  print "Board"
  printBoard (makeBoard ((length board),(length (head board)),chutes,ladders))

-- YOUR CODE SHOULD COME AFTER THIS POINT
makeBoard :: (Int,Int,[Int],[Int]) -> [[Int]]
makeBoard (rows, columns, chutes, ladders) = boardWithChutesAndLadders
	where 
		boardNoChuteOrLadder 		= getBoardNoChuteOrLadder(rows, columns)
		boardWithChutes 			= getBoardWithChutes(boardNoChuteOrLadder, chutes, ladders)
		boardWithChutesAndLadders 	= getBoardWithLadders(boardWithChutes, chutes, ladders)

-- insert the chutes in the board and retrieve it
getBoardWithChutes :: ([[Int]], [Int], [Int]) -> [[Int]]
getBoardWithChutes (board, chutes, ladders)
	|	null chutes 		= board
	|	otherwise			= getBoardWithChutes ((setPos board chutePos newValue), (tail chutes), ladders)
	where
		chutePos	= (head chutes)
		newValue	= chutePos - findPosForChute (chutePos, chutes, ladders, 1)

-- insert the ladders in the board and retrieve it
getBoardWithLadders :: ([[Int]], [Int], [Int]) -> [[Int]]
getBoardWithLadders (board, chutes, ladders)
	|	null ladders 	= board
	|	otherwise		= getBoardWithLadders ((setPos board ladderPos newValue), chutes, (tail ladders))
	where
		ladderPos	= (head ladders)
		newValue	= ladderPos + findPosForLadder (ladderPos, chutes, ladders, 1)

-- get a board with size (rows x columns) without neither chutes nor ladders
getBoardNoChuteOrLadder :: (Int,Int) -> [[Int]]
getBoardNoChuteOrLadder (rows, columns) = setPos board (length board * (length (head board))) 0
	where
		board = mkBoardNoChuteOrLadder (rows,columns,[])

-- To use this function, counter MUST be passed as 1
findPosForLadder :: (Int, [Int], [Int], Int) -> Int
findPosForLadder (curPos, chutes, ladders, counter)
	|	isChuteOrLadder (curPos + counter, chutes, ladders) == False	= counter + 1
	|	otherwise 														= findPosForLadder (curPos, chutes, ladders, counter + 1)

-- To use this function, counter MUST be passed as 1
findPosForChute :: (Int, [Int], [Int], Int) -> Int
findPosForChute (curPos, chutes, ladders, counter)
	|	isChuteOrLadder (curPos - counter, chutes, ladders) == False	= counter
	|	otherwise 														= findPosForChute(curPos, chutes, ladders, counter + 1)

-- check whether a position (pos) is chute or ladder
isChuteOrLadder :: (Int, [Int], [Int]) -> Bool
isChuteOrLadder (pos, chutes, ladders)
	| 	(null chutes) && (null ladders)		= False
	| 	(not (null chutes)) 				= if (pos == (head chutes)) then True else (isChuteOrLadder (pos, (tail chutes),ladders))
	| 	(not (null ladders)) 				= if (pos == (head ladders)) then True else (isChuteOrLadder (pos, chutes,(tail ladders)))
	| 	otherwise							= isChuteOrLadder (pos, (tail chutes), (tail ladders))

-- make a board of (rows x columns)
mkBoardNoChuteOrLadder :: (Int, Int, [[Int]]) -> [[Int]]
mkBoardNoChuteOrLadder (rows, columns, board)
	| 	rows == 0 	= board
	| 	isF 		= board ++ [makeListF (aux, columns, [])] ++ mkBoardNoChuteOrLadder (rows - 1, columns, board)
	| 	otherwise 	= board ++ [makeListB (aux, columns, [])] ++ mkBoardNoChuteOrLadder (rows - 1, columns, board)
	where
		aux = rows * columns
		numRs  = rows - 1
		numCs  = columns
		isF    = (mod numRs 2) == 0

-- make a forward list
makeListF :: (Int, Int, [Int]) -> [Int]
makeListF (size, cols, list)
	| cols == 0 	= list
	| otherwise 	= makeListF (size, cols - 1, list ++ [aux])
	where
		aux 	= size - cols + 2

-- make a backward list
makeListB :: (Int, Int, [Int]) -> [Int]
makeListB (size, cols, list)
	| cols == 0		= list
	| otherwise		= makeListB (size - 1, cols - 1, list ++ [size + 1])
