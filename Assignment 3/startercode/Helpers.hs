module Helpers
( printBoard
, printResult
, readCaLFile
, checkIfElem
, getPos
, getLastBoardPosition
, setPos
) where

import Data.Char
import Prelude

printBoard :: [[Int]] -> IO ()
printBoard [] 	       = print ""
printBoard (row:rows)  = do
	      	       	 print row
			 printBoard rows

readCaLFile :: String -> IO ([Int], [Int], [Int], [[Int]], [Int] )
readCaLFile = readIO

printResult :: [Int] -> IO ()
printResult positions = do
	    	      	print "Positions"
			print positions

-- params: board
-- output: last board position
getLastBoardPosition :: ([[Int]]) -> Int
getLastBoardPosition board = length (head board) * (length board)

-- params: board
-- params: pos 		position that will have its value retrieved from the board
-- output: Value of the board in a given position (pos)
getPos :: [[Int]] -> Int -> Int
getPos board pos
       | pos > numRs * numCs && isF			= getRowF (head board) (pos - numRs * numCs)
       | pos > numRs * numCs && (not isF)   = getRowB (head board) (pos - numRs * numCs)
       | otherwise     	     	     		= getPos rows pos
       where rows   = tail board
	     numRs  = length rows
	     numCs  = length (head board)
   	     isF    = (mod numRs 2) == 0

-- params: row
-- params: pos 		position that will have its value retrieved from the row
-- output: goes forward in a row (list) and retrieve the value in a give position
getRowF :: [Int] -> Int -> Int
getRowF row 1 = head row
getRowF row pos = getRowF (tail row) (pos-1)

-- params: row
-- params: pos 		position that will have its value retrieved from the row
-- output: goes backward in a row (list) and retrieve the value in a give position
getRowB :: [Int] -> Int -> Int
getRowB row pos = getRowF (reverse row) pos

-- params: x	element that will be checked if it exist in a list l
-- params: l 	list that will be evaluated to check if it contains a given element x
-- output: return true if a elment x in present in a list l, otherwise false
checkIfElem :: Int -> [Int] ->Bool
checkIfElem x l 
         |x`elem` l = True
         |otherwise	= False

-- params: board
-- params: pos 		position that will have its value changed a value (new)
-- params: new		new value of the position (pos)
-- output: board with the value in the poisition pos changed to new
setPos :: [[Int]] -> Int -> Int -> [[Int]]
setPos board pos new
       | pos > numRs * numCs && isF			= (setRowF (head board) (pos - numRs * numCs) new):rows
       | pos > numRs * numCs && (not isF)   = (setRowB (head board) (pos - numRs * numCs) new):rows
       | otherwise     	     	     		= (head board):(setPos rows pos new)
       where rows   = tail board
	     numRs  = length rows
	     numCs  = length (head board)
   	     isF    = (mod numRs 2) == 0

-- goes forward in a line
setRowF :: [Int] -> Int -> Int -> [Int]
setRowF row 1 new   = new:(tail row)
setRowF row pos new = (head row):(setRowF (tail row) (pos-1) new)

-- goes backward in a line
setRowB :: [Int] -> Int -> Int -> [Int]
setRowB row pos new = reverse (setRowF (reverse row) pos new)


