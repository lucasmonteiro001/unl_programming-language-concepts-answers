ourSet :: [[Int]] -> Int -> Int -> [[Int]]
ourSet board pos new
       | pos > numRs * numCs && isF			= (setRowF (head board) (pos - numRs * numCs) new):rows
       | pos > numRs * numCs && (not isF)   = (setRowB (head board) (pos - numRs * numCs) new):rows
       | otherwise     	     	     		= (head board):(ourSet rows pos new)
       where rows   = tail board
	     numRs  = length rows
	     numCs  = length (head board)
   	     isF    = (mod numRs 2) == 0


setRowF :: [Int] -> Int -> Int -> [Int]
setRowF row 1 new   = new:(tail row)
setRowF row pos new = (head row):(setRowF (tail row) (pos-1) new)

setRowB :: [Int] -> Int -> Int -> [Int]
setRowB row pos new = reverse (setRowF (reverse row) pos new)
