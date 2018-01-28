// Generated from /media/a/common/vesitLang/src/VesitLang.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VesitLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VesitLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#bfs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfs(VesitLangParser.BfsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#dfs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDfs(VesitLangParser.DfsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph(VesitLangParser.GraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#bfsproperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfsproperties(VesitLangParser.BfspropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#dfsproperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDfsproperties(VesitLangParser.DfspropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#edges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdges(VesitLangParser.EdgesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge(VesitLangParser.EdgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(VesitLangParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo(VesitLangParser.ToContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#dfsStackNodeColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDfsStackNodeColor(VesitLangParser.DfsStackNodeColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#dfsStackNodeShape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDfsStackNodeShape(VesitLangParser.DfsStackNodeShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#dfsVisitedNodeColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDfsVisitedNodeColor(VesitLangParser.DfsVisitedNodeColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#dfsVisitedNodeShape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDfsVisitedNodeShape(VesitLangParser.DfsVisitedNodeShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#dfsDpi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDfsDpi(VesitLangParser.DfsDpiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#dfsOutImageDir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDfsOutImageDir(VesitLangParser.DfsOutImageDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#dfsPptName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDfsPptName(VesitLangParser.DfsPptNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#bfsQueuedNodeColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfsQueuedNodeColor(VesitLangParser.BfsQueuedNodeColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#bfsVisitedNodeColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfsVisitedNodeColor(VesitLangParser.BfsVisitedNodeColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#bfsCurrentNodeColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfsCurrentNodeColor(VesitLangParser.BfsCurrentNodeColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#bfsCurrentNodeShape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfsCurrentNodeShape(VesitLangParser.BfsCurrentNodeShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#bfsQueuedNodeShape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfsQueuedNodeShape(VesitLangParser.BfsQueuedNodeShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#bfsVisitedNodeShape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfsVisitedNodeShape(VesitLangParser.BfsVisitedNodeShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#bfsDpi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfsDpi(VesitLangParser.BfsDpiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#bfsOutImageDir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfsOutImageDir(VesitLangParser.BfsOutImageDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link VesitLangParser#bfsPptName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfsPptName(VesitLangParser.BfsPptNameContext ctx);
}