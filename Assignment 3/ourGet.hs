ourGet :: [[Int]] -> Int -> Int
ourGet board pos
       | pos > numRs * numCs && isF			= getRowF (head board) (pos - numRs * numCs)
       | pos > numRs * numCs && (not isF)   = getRowB (head board) (pos - numRs * numCs)
       | otherwise     	     	     		= ourGet rows pos
       where rows   = tail board
	     numRs  = length rows
	     numCs  = length (head board)
   	     isF    = (mod numRs 2) == 0


getRowF :: [Int] -> Int -> Int
getRowF row 1 = head row
getRowF row pos = getRowF (tail row) (pos-1)

getRowB :: [Int] -> Int -> Int
getRowB row pos = getRowF (reverse row) pos
