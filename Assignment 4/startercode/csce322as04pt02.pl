:- module( csce322as04pt02,
	 [ pathOfPlayer/5
	 ]
    ).

pathOfPlayer(Position,Chutes,Ladders,Board,Path):-
	boardSize(Board, LastPosition),
	Roll = [6,5,4,3,2,1],
	writeln(LastPosition),
	writeln(Roll).

