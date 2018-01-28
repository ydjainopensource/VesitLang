import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;

import java.util.HashSet;
import java.util.Set;


public class EvalListener extends VesitLangBaseListener {

    boolean bfs=false;
    boolean dfs =false;
    private Graph graph;
    private Set<Edge> edges = new HashSet<>();
    private Set<Node> nodes = new HashSet<>();
    private String bfsNodeName;
    private Node dfsStartNode;
    private String dfsNodeName;
    private Node bfsStartNode;
    private BfsConfig bfsConfig = new BfsConfig();
    private DfsConfig dfsConfig = new DfsConfig();

    public boolean isBfs() {
        return bfs;
    }

    public void setBfs(boolean bfs) {
        this.bfs = bfs;
    }

    public DfsConfig getDfsConfig() {
        return dfsConfig;
    }

    public boolean isDfs() {
        return dfs;
    }

    public void setDfs(boolean dfs) {
        this.dfs = dfs;
    }

    public String getBfsNodeName() {
        return bfsNodeName;
    }

    public void setBfsNodeName(String bfsNodeName) {
        this.bfsNodeName = bfsNodeName;
    }

    public String getDfsNodeName() {
        return dfsNodeName;
    }

    public void setDfsNodeName(String dfsNodeName) {
        this.dfsNodeName = dfsNodeName;
    }
    public Node getBfsStartNode() {
        return bfsStartNode;
    }

    public void setBfsStartNode(Node bfsStartNode) {
        this.bfsStartNode = bfsStartNode;
    }

    public Graph getGraph() {
        return graph;
    }

    @Override
    public void exitEdge(VesitLangParser.EdgeContext ctx) {
        System.err.println("inside exit edge ");
        Node from = new Node(ctx.from().STRING().toString());
        Node to = new Node(ctx.to().STRING().toString());
        Edge edge = new Edge(from,to);
        if(!nodes.contains(from)) {
            graph.addNode(from);
            nodes.add(from);
        }
        if(!nodes.contains(to)) {
            graph.addNode(to);
            nodes.add(to);
        }
        if(!edges.contains(edge)) {
            edges.add(edge);
            graph.addEdge(edge);
        }
    }

    @Override
    public void enterGraph(VesitLangParser.GraphContext ctx) {
        System.err.println("in enter graph" );
        graph = new Graph("g1", GraphType.GRPAH);
    }

    public Node getDfsStartNode() {
        return dfsStartNode;
    }

    public void setDfsStartNode(Node dfsStartNode) {
        this.dfsStartNode = dfsStartNode;
    }

    @Override
    public void enterDfs(VesitLangParser.DfsContext ctx) {
        String startNodeName;
        startNodeName =  ctx.STRING().toString();
        setDfsNodeName(startNodeName);
        setDfs(true);
        for(Node n :graph.getNodeList()){
            if(n.getId().equals(getDfsNodeName()))
                setDfsStartNode(n);
        }
    }

    @Override
    public void enterBfsQueuedNodeColor(VesitLangParser.BfsQueuedNodeColorContext ctx) {
        BfsConfig.setQueuedNodeColor(ctx.STRING().toString());
    }

    @Override
    public void enterBfsQueuedNodeShape(VesitLangParser.BfsQueuedNodeShapeContext ctx) {
        BfsConfig.setQueuedNodeShape(ctx.STRING().toString());
    }

    @Override
    public void enterBfsVisitedNodeColor(VesitLangParser.BfsVisitedNodeColorContext ctx) {
        BfsConfig.setVisitedNodeColor(ctx.STRING().toString());
    }

    @Override
    public void enterBfsCurrentNodeColor(VesitLangParser.BfsCurrentNodeColorContext ctx) {
        BfsConfig.setCurrentNodeColor(ctx.STRING().toString());
    }

    @Override
    public void enterBfsCurrentNodeShape(VesitLangParser.BfsCurrentNodeShapeContext ctx) {
        BfsConfig.setCurrentNodeShape(ctx.STRING().toString());
    }


    @Override
    public void enterBfsVisitedNodeShape(VesitLangParser.BfsVisitedNodeShapeContext ctx) {
        BfsConfig.setVisitedNodeShape(ctx.STRING().toString());
    }

    @Override
    public void enterBfsDpi(VesitLangParser.BfsDpiContext ctx) {
        BfsConfig.setDpi(ctx.STRING().toString());
    }

    @Override
    public void enterBfsOutImageDir(VesitLangParser.BfsOutImageDirContext ctx) {
        BfsConfig.setOutImageDir(ctx.PATH().toString());
    }

    @Override
    public void enterDfsStackNodeColor(VesitLangParser.DfsStackNodeColorContext ctx) {
        DfsConfig.setStackNodeColor(ctx.STRING().toString());
    }

    @Override
    public void enterDfsStackNodeShape(VesitLangParser.DfsStackNodeShapeContext ctx) {
        DfsConfig.setStackNodeShape(ctx.STRING().toString());
    }

    @Override
    public void enterDfsVisitedNodeColor(VesitLangParser.DfsVisitedNodeColorContext ctx) {
        DfsConfig.setVisitedNodeColor(ctx.STRING().toString());
    }

    @Override
    public void enterDfsVisitedNodeShape(VesitLangParser.DfsVisitedNodeShapeContext ctx) {
        DfsConfig.setVisitedNodeShape(ctx.STRING().toString());
    }

    @Override
    public void enterDfsDpi(VesitLangParser.DfsDpiContext ctx) {
        DfsConfig.setDpi(ctx.STRING().toString());
    }

    @Override
    public void enterDfsOutImageDir(VesitLangParser.DfsOutImageDirContext ctx) {
        DfsConfig.setOutImageDir(ctx.PATH().toString());
    }

    @Override
    public void enterDfsPptName(VesitLangParser.DfsPptNameContext ctx) {
        String filename = ctx.STRING().get(0).toString() +"." + ctx.STRING().get(1).toString();
        System.err.println("setting DFS PPT name to " + filename);
        DfsConfig.setPptName(filename);

    }

    @Override
    public void enterBfsPptName(VesitLangParser.BfsPptNameContext ctx) {
        System.err.println("bfs ppt name : " + ctx.STRING().get(0).toString() +"." + ctx.STRING().get(1).toString() );
        BfsConfig.setPptName(ctx.STRING().get(0).toString() +"." + ctx.STRING().get(1).toString());
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
        System.err.println("enterEveryRule "+ctx.getRuleContext().getText());
    }

    public BfsConfig getBfsConfig() {
        return bfsConfig;
    }

    @Override
    public void enterBfs(VesitLangParser.BfsContext ctx){
        System.err.println("exit bfs");
        String startNodeName;
        startNodeName = ctx.STRING().toString();
        setBfsNodeName(startNodeName);
        setBfs(true);
        for(Node n :graph.getNodeList()) {
            if (n.getId().equals(getBfsNodeName()))
                setBfsStartNode(n);
        }
    }

    @Override
    public void enterDigraph(VesitLangParser.DigraphContext ctx) {
        graph = new Graph("g1", GraphType.DIGRAPH);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        System.err.println("Error in input file");
        System.err.println("Aborting !!!");
        System.exit(1);
    }


}