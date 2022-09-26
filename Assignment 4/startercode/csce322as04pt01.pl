:- module( csce322as04pt01,
	 [ percentChutesLadders/3
	 ]
    ).

percentChutesLadders(Chutes,Ladders,Board):-
	length(Chutes, ChutesLength),
	length(Ladders, LaddersLength),
	boardSize(Board, BoardSize),
	((ChutesLength + LaddersLength)/BoardSize) =< 0.05.