var helpers = require( './helpers' );
var p01 = require( './csce322as02pt01' );
var p02 = require( './csce322as02pt02' );
var p03 = require( './csce322as02pt03' );

var game = helpers.readFile('game01.cal');
var part01 = p01.withoutCaL(game);
var part02 = p02.withoutL(game);
var part03 = p03.withCaL(game);

var board = game.slice(3);
console.log(board);
console.log(part01(2, 5)); // pos + roll - 1  / cols
// ex: 3 + 5

// for (var i = 2; i < 30; i++)
//     console.log("position" + i + " = " + part01(i,0));


// console.log( "Moves without Chutes or Ladders" );
// for( var space = 1; space <= board.length * board[0].length; space++ ){
//     var moves = new Array();
//     for( var roll = 1; roll <= 6; roll++ ){
//  moves.push( part01( space , roll ) );
//     }
//     console.log( space + "\t:" + moves );
// }
// console.log( "Moves without Ladders" );
// for( var space = 1; space <= board.length * board[0].length; space++ ){
//     var moves = new Array();
//     for( var roll = 1; roll <= 6; roll++ ){
//  moves.push( part02( space , roll ) );
//     }
//     console.log( space + "\t:" + moves );
// }
// console.log( "Moves with Chutes and Ladders" );
// for( var space = 1; space <= board.length * board[0].length; space++ ){
//     var moves = new Array();
//     for( var roll = 1; roll <= 6; roll++ ){
//  moves.push( part03( space , roll ) );
//     }
//     console.log( space + "\t:" + moves );
//}
