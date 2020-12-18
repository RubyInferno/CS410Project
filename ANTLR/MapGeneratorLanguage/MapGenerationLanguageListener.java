// Generated from experiment.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link experimentParser}.
 */
public interface experimentListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link experimentParser#chat}.
	 * @param ctx the parse tree
	 */
	void enterChat(experimentParser.ChatContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#chat}.
	 * @param ctx the parse tree
	 */
	void exitChat(experimentParser.ChatContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(experimentParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(experimentParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(experimentParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(experimentParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#opinion}.
	 * @param ctx the parse tree
	 */
	void enterOpinion(experimentParser.OpinionContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#opinion}.
	 * @param ctx the parse tree
	 */
	void exitOpinion(experimentParser.OpinionContext ctx);
}