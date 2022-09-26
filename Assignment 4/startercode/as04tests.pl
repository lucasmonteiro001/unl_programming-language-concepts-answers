printPaths([]).
printPaths([Path|Paths]):-
    writeln(Path),
    printPaths(Paths).

loadHelpers:-
    ['helpers'], % replace HELPERS with path/filename of your helpers file
    ['csce322as04pt01'].    % replace PART with path/filename of your .pl file for this part

% replace GAME with path/filename for given .cal file
part01:-
    readGame('part1/part01test10.cal.txt',Positions,Chutes,Ladders,Board),
    printGame(Positions,Chutes,Ladders,Board),
    percentChutesLadders(Chutes,Ladders,Board).

part02:-
    readGame('part2/part02test01.cal.txt',[Position|Positions],Chutes,Ladders,Board),
    printGame([Position|Positions],Chutes,Ladders,Board),
    %setof(Path,pathOfPlayer(Position,Chutes,Ladders,Board,Path),Paths),
    pathOfPlayer(Position,Chutes,Ladders,Board,Path),
    writeln(paths),
    printPaths(Paths).

part03:-
    readGame('part1/part01test01.cal.txt',[Position|Positions],Chutes,Ladders,Board),
    printGame([Position|Positions],Chutes,Ladders,Board),
    clearPath(Position,Chutes,Ladders,Board,Path).

part04:-
    readGame('part1/part01test01.cal.txt',Positions,Chutes,Ladders,Board),
    printGame(Positions,Chutes,Ladders,Board),
    validGame(Positions,Chutes,Ladders,Board).
