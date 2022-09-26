:- module( helpers,
	 [ readGame/5
	 , printGame/4
     , boardSize/2
     , ourGet/3
	 ]
    ).

readGame(File,Positions,Chutes,Ladders,Board):-
    open(File,read,Input),
    read(Input,Positions),
    read(Input,Chutes),
    read(Input,Ladders),
    readBoard(Input,Board),
    close(Input).

readBoard(Input,[]):-
    at_end_of_stream(Input),
    !.
readBoard(Input,[Row|Rows]):-
    \+ at_end_of_stream(Input),
    read(Input,Row),
    readBoard(Input,Rows).

printGame(Positions,Chutes,Ladders,Board):-
    writeln(positions),
    writeln(Positions),
    writeln(chutes),
    writeln(Chutes),
    writeln(ladders),
    writeln(Ladders),
    writeln(board),
    printBoard(Board).

printBoard([]).
printBoard([Row|Rows]):-
    writeln(Row),
    printBoard(Rows).

boardSize([], 0).
boardSize([H|T], N):-
    length(H, RowLength),
    boardSize(T, N1), N is N1 + RowLength.

ourGet([Row|Rows],Where,What):-
    length(Rows,RowsLength),
    0 is mod(RowsLength,2),
    length(Row,Cols),
    ourGetFRow(Row,RowWhere,What),
    Where is RowWhere + RowsLength * Cols.
ourGet([Row|Rows],Where,What):-
    length(Rows,RowsLength),
    1 is mod(RowsLength,2),
    length(Row,Cols),
    ourGetBRow(Row,RowWhere,What),
    Where is RowWhere + RowsLength * Cols.
ourGet([_|Rows],Where,What):-
    ourGet(Rows,Where,What).

ourGetFRow([What|_],1,What).
ourGetFRow([_|Tail],Where,What):-
    ourGetFRow(Tail,TailWhere,What),
    Where is TailWhere + 1.

ourGetBRow([What|T],Where,What):-
    length([What|T],Where).
ourGetBRow([_|T],Where,What):-
    ourGetBRow(T,Where,What).
