import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class EvalListener extends VesitLangBaseListener {

    boolean bfs=false;
    boolean dfs =false;
    boolean kruskal =false;
    boolean prim =false;
    private Graph graph;
    private Set<Edge> edges = new TreeSet<>(new WeightComparator());
    private Set<Node> nodes = new TreeSet<>(Comparator.comparing(Node::getId));
    private String bfsNodeName;
    private Node dfsStartNode;
    private String dfsNodeName;
    private Node bfsStartNode;
    private BfsConfig bfsConfig = new BfsConfig();
    private DfsConfig dfsConfig = new DfsConfig();
    private KruskalConfig kruskalConfig = new KruskalConfig();
    private PrimConfig primConfig = new PrimConfig();

    public void setKruskal(boolean kruskal) {
        this.kruskal = kruskal;
    }

    public boolean isPrim() {
        return prim;
    }

    public void setPrim(boolean prim) {
        this.prim = prim;
    }

    public PrimConfig getPrimConfig() {
        return primConfig;
    }

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

    public boolean isKruskal() {
        return kruskal;
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
        System.out.println("inside exit edge ");

        String fromName = ctx.from().STRING().toString();
        String toName = ctx.to().STRING().toString();
        Node from, to;

        try{
            from = graph.getNodeById(fromName);
        }catch (BaseGraphObjectNotFoundException e)
        {
            from = new Node(fromName);
        }

        try {
            to = graph.getNodeById(toName);
        } catch (BaseGraphObjectNotFoundException e) {
            to = new Node(toName);
        }

        Edge edge = new Edge(from,to);
        if(ctx.INT() != null) {
            edge.addAttribute(new Attribute("label",ctx.INT().toString()));
            edge.addAttribute(new Attribute("fontsize","12"));
            edge.setWeight(new Integer(ctx.INT().toString()));
            System.out.println("edge weight "+ edge.getWeight());
        }
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
        System.out.println("in enter graph" );
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
        bfsConfig.setQueuedNodeColor(ctx.STRING().toString());
    }

    @Override
    public void enterBfsQueuedNodeShape(VesitLangParser.BfsQueuedNodeShapeContext ctx) {
        bfsConfig.setQueuedNodeShape(ctx.STRING().toString());
    }

    @Override
    public void enterBfsVisitedNodeColor(VesitLangParser.BfsVisitedNodeColorContext ctx) {
        bfsConfig.setVisitedNodeColor(ctx.STRING().toString());
    }

    @Override
    public void enterBfsCurrentNodeColor(VesitLangParser.BfsCurrentNodeColorContext ctx) {
        bfsConfig.setCurrentNodeColor(ctx.STRING().toString());
    }

    @Override
    public void enterBfsCurrentNodeShape(VesitLangParser.BfsCurrentNodeShapeContext ctx) {
        bfsConfig.setCurrentNodeShape(ctx.STRING().toString());
    }


    @Override
    public void enterBfsVisitedNodeShape(VesitLangParser.BfsVisitedNodeShapeContext ctx) {
        bfsConfig.setVisitedNodeShape(ctx.STRING().toString());
    }

    @Override
    public void enterBfsDpi(VesitLangParser.BfsDpiContext ctx) {
        bfsConfig.setDpi(ctx.INT().toString());
    }

    @Override
    public void enterBfsOutImageDir(VesitLangParser.BfsOutImageDirContext ctx) {
        bfsConfig.setOutImageDir(ctx.PATH().toString());
    }

    @Override
    public void enterDfsStackNodeColor(VesitLangParser.DfsStackNodeColorContext ctx) {
        dfsConfig.setStackNodeColor(ctx.STRING().toString());
    }

    @Override
    public void enterDfsStackNodeShape(VesitLangParser.DfsStackNodeShapeContext ctx) {
        dfsConfig.setStackNodeShape(ctx.STRING().toString());
    }

    @Override
    public void enterDfsVisitedNodeColor(VesitLangParser.DfsVisitedNodeColorContext ctx) {
        dfsConfig.setVisitedNodeColor(ctx.STRING().toString());
    }

    @Override
    public void enterDfsVisitedNodeShape(VesitLangParser.DfsVisitedNodeShapeContext ctx) {
        dfsConfig.setVisitedNodeShape(ctx.STRING().toString());
    }

    @Override
    public void enterDfsDpi(VesitLangParser.DfsDpiContext ctx) {
        dfsConfig.setDpi(ctx.INT().toString());
    }

    @Override
    public void enterDfsOutImageDir(VesitLangParser.DfsOutImageDirContext ctx) {
        dfsConfig.setOutImageDir(ctx.PATH().toString());
    }

    @Override
    public void enterPrim(VesitLangParser.PrimContext ctx) {
        setPrim(true);
    }

    @Override
    public void enterDfsPptName(VesitLangParser.DfsPptNameContext ctx) {
        String filename = ctx.STRING().get(0).toString() +"." + ctx.STRING().get(1).toString();
        System.out.println("setting DFS PPT name to " + filename);
        dfsConfig.setPptName(filename);

    }

    @Override
    public void enterBfsPptName(VesitLangParser.BfsPptNameContext ctx) {
        System.out.println("bfs ppt name : " + ctx.STRING().get(0).toString() +"." + ctx.STRING().get(1).toString() );
        bfsConfig.setPptName(ctx.STRING().get(0).toString() +"." + ctx.STRING().get(1).toString());
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
        System.out.println("enterEveryRule "+ctx.getRuleContext().getText());
    }

    public BfsConfig getBfsConfig() {
        return bfsConfig;
    }

    @Override
    public void enterBfs(VesitLangParser.BfsContext ctx){
        System.out.println("exit bfs");
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
    public void enterKruskalVisitedNodeColor(VesitLangParser.KruskalVisitedNodeColorContext ctx) {
        kruskalConfig.setVisitedNodeColor(ctx.STRING().toString());
    }

    @Override
    public void enterKruskalCurrentNodeColor(VesitLangParser.KruskalCurrentNodeColorContext ctx) {
        kruskalConfig.setCurrentNodeColor(ctx.STRING().toString());
    }

    @Override
    public void enterKruskalCurrentNodeShape(VesitLangParser.KruskalCurrentNodeShapeContext ctx) {
        kruskalConfig.setCurrentNodeShape(ctx.STRING().toString());
    }


    @Override
    public void enterKruskalVisitedNodeShape(VesitLangParser.KruskalVisitedNodeShapeContext ctx) {
        kruskalConfig.setVisitedNodeShape(ctx.STRING().toString());
    }

    @Override
    public void enterKruskalDpi(VesitLangParser.KruskalDpiContext ctx) {
        kruskalConfig.setDpi(ctx.INT().toString());
    }

    @Override
    public void enterKruskalOutImageDir(VesitLangParser.KruskalOutImageDirContext ctx) {
        kruskalConfig.setOutImageDir(ctx.PATH().toString());
    }

    @Override
    public void enterKruskal(VesitLangParser.KruskalContext ctx) {
        setKruskal(true);
    }

    public KruskalConfig getKruskalConfig() {
        return kruskalConfig;
    }

    @Override
    public void enterKruskalPptName(VesitLangParser.KruskalPptNameContext ctx) {
        System.out.println("kruskal ppt name : " + ctx.STRING().get(0).toString() +"." + ctx.STRING().get(1).toString() );
        kruskalConfig.setPptName(ctx.STRING().get(0).toString() +"." + ctx.STRING().get(1).toString());
    }

    @Override
    public void enterKruskalCurrentEdgeColor(VesitLangParser.KruskalCurrentEdgeColorContext ctx) {
        kruskalConfig.setCurrentEdgeColor(ctx.STRING().toString());
    }

    @Override
    public void enterKruskalCurrentEdgeWidth(VesitLangParser.KruskalCurrentEdgeWidthContext ctx) {
        kruskalConfig.setCurrentEdgeWidth(ctx.STRING().toString());
    }

    @Override
    public void enterKruskalVisitedEdgeWidth(VesitLangParser.KruskalVisitedEdgeWidthContext ctx) {
        kruskalConfig.setVisitedEdgeWidth(ctx.STRING().toString());
    }

    @Override
    public void enterKruskalVisitedEdgeColor(VesitLangParser.KruskalVisitedEdgeColorContext ctx) {
        kruskalConfig.setVisitedEdgeColor(ctx.STRING().toString());
    }

    @Override
    public void enterPrimVisitedNodeColor(VesitLangParser.PrimVisitedNodeColorContext ctx) {
        primConfig.setVisitedNodeColor(ctx.STRING().toString());
    }

    @Override
    public void enterPrimCurrentNodeColor(VesitLangParser.PrimCurrentNodeColorContext ctx) {
        primConfig.setCurrentNodeColor(ctx.STRING().toString());
    }

    @Override
    public void enterPrimCurrentNodeShape(VesitLangParser.PrimCurrentNodeShapeContext ctx) {
        primConfig.setCurrentNodeShape(ctx.STRING().toString());
    }

    @Override
    public void enterPrimVisitedNodeShape(VesitLangParser.PrimVisitedNodeShapeContext ctx) {
        primConfig.setVisitedNodeShape(ctx.STRING().toString());
    }

    @Override
    public void enterPrimDpi(VesitLangParser.PrimDpiContext ctx) {
        primConfig.setDpi(ctx.INT().toString());
    }

    @Override
    public void enterPrimOutImageDir(VesitLangParser.PrimOutImageDirContext ctx) {
        primConfig.setOutImageDir(ctx.PATH().toString());
    }

    @Override
    public void enterPrimPptName(VesitLangParser.PrimPptNameContext ctx) {
        String filename = ctx.STRING().get(0).toString() +"." + ctx.STRING().get(1).toString();
        primConfig.setPptName(filename);
    }

    @Override
    public void enterPrimCurrentEdgeColor(VesitLangParser.PrimCurrentEdgeColorContext ctx) {
        primConfig.setCurrentEdgeColor(ctx.STRING().toString());
    }

    @Override
    public void enterPrimCurrentEdgeWidth(VesitLangParser.PrimCurrentEdgeWidthContext ctx) {
        primConfig.setCurrentEdgeWidth(ctx.STRING().toString());
    }

    @Override
    public void enterPrimVisitedEdgeWidth(VesitLangParser.PrimVisitedEdgeWidthContext ctx) {
        primConfig.setVisitedEdgeWidth(ctx.STRING().toString());
    }

    @Override
    public void enterPrimVisitedEdgeColor(VesitLangParser.PrimVisitedEdgeColorContext ctx) {
        primConfig.setVisitedEdgeColor(ctx.STRING().toString());
        System.err.println(primConfig.getVisitedEdgeColor());
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
//        System.err.println(node.getText().length());
        System.err.println("Error in input file");
        System.err.println("Aborting !!!");
        System.exit(1);
    }


}