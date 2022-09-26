// Generated from chuteAndLadders.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link chuteAndLaddersParser}.
 */
public interface chuteAndLaddersListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link chuteAndLaddersParser#tail_of_numbers}.
	 * @param ctx the parse tree
	 */
	void enterTail_of_numbers(@NotNull chuteAndLaddersParser.Tail_of_numbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link chuteAndLaddersParser#tail_of_numbers}.
	 * @param ctx the parse tree
	 */
	void exitTail_of_numbers(@NotNull chuteAndLaddersParser.Tail_of_numbersContext ctx);
	/**
	 * Enter a parse tree produced by {@link chuteAndLaddersParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull chuteAndLaddersParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link chuteAndLaddersParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull chuteAndLaddersParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link chuteAndLaddersParser#row_of_numbers}.
	 * @param ctx the parse tree
	 */
	void enterRow_of_numbers(@NotNull chuteAndLaddersParser.Row_of_numbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link chuteAndLaddersParser#row_of_numbers}.
	 * @param ctx the parse tree
	 */
	void exitRow_of_numbers(@NotNull chuteAndLaddersParser.Row_of_numbersContext ctx);
	/**
	 * Enter a parse tree produced by {@link chuteAndLaddersParser#tail}.
	 * @param ctx the parse tree
	 */
	void enterTail(@NotNull chuteAndLaddersParser.TailContext ctx);
	/**
	 * Exit a parse tree produced by {@link chuteAndLaddersParser#tail}.
	 * @param ctx the parse tree
	 */
	void exitTail(@NotNull chuteAndLaddersParser.TailContext ctx);
	/**
	 * Enter a parse tree produced by {@link chuteAndLaddersParser#gameBoard_line}.
	 * @param ctx the parse tree
	 */
	void enterGameBoard_line(@NotNull chuteAndLaddersParser.GameBoard_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link chuteAndLaddersParser#gameBoard_line}.
	 * @param ctx the parse tree
	 */
	void exitGameBoard_line(@NotNull chuteAndLaddersParser.GameBoard_lineContext ctx);
}