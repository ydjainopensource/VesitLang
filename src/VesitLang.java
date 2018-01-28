

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.property.HorizontalAlignment;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;



import static org.antlr.v4.runtime.CharStreams.fromStream;

/******************************************************************************
 *
 *
 ******************************************************************************/
public class VesitLang {

    /**
     * processFile is the main compilation function
     * It internally generates a CharStream passes it to a lexer,
     * which generates a token stream which is then passed to the parser
     * which creates a parse tree which is then walked by the walker.
     * Changes while walking the tree are heard by the EvalListener
     * which then invokes the corresponding function
     * @param in the InputStream to read from
     * @throws IOException
     */

    static void processFile(InputStream in) throws IOException {

//        System.setErr(out);
        // Create a CharStream from the given InputStream
        CharStream input = fromStream(in);

        // A lexer for parsing ANTLRInputStream
        VesitLangLexer lexer = new VesitLangLexer(input);

        // Generate Tokens from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // generate a parser from the tokens

        VesitLangParser parser =new VesitLangParser(tokens);

        // Create a Parse tree
        ParseTree tree = parser.graph();

        // Walker
        ParseTreeWalker walker = new ParseTreeWalker();

        // Create a Listener
        EvalListener elistener = new EvalListener();

        // Start walking notifing the listener about changes
        walker.walk(elistener,tree);

        // if generate graphs according to the specs
        traversal(elistener);
    }


    /**
     * displays images
     * Only used for inputs without bfs or dfs parameters
     * @param imageFileName the name of the image file to be displayed
     * @throws Exception
     */
    static void showImage(String imageFileName) throws Exception{
        ShowImage.display(imageFileName,imageFileName);
    }

    /**
     * Writes a byte array to file
     * @param img the byte array representation of the graph
     * @param to the destination file
     * @return 1 if successful -1 otherwise
     */

    public static int writeGraphToFile(byte[] img, File to)
    {
        try {
            FileOutputStream fos = new FileOutputStream(to);
            fos.write(img);
            fos.close();
        } catch (java.io.IOException ioe) { return -1; }
        return 1;
    }

    /**
     * generates PDF file from images inside imageDirName
     * Images must be labelled sequentially from 0 to iterNumber
     * @param iterNumber number of images
     * @param imageDirName Path to the output directory
     * @param outFileName Name of the generated PDF
     * @throws Exception
     */
    public static void generatePdf(int iterNumber, String imageDirName,
                                   String outFileName) throws Exception {

        PdfWriter writer = new PdfWriter(outFileName);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
//        pdf.addNewPage(PageSize.A0.rotate());
        for(int i=0;i<iterNumber;i++) {
            pdf.addNewPage(PageSize.A0);
            Image image = new Image(ImageDataFactory.create(imageDirName + i + ".png"));
            image.scaleToFit(PageSize.A0.getHeight(), PageSize.A0.getWidth());
            image.setHorizontalAlignment(HorizontalAlignment.CENTER);
            document.add(image);
        }
        document.close();
    }

    /**
     * Creates a temp.pdf from images naned 0.png to iternumber.png
     * @param iterNumber last image number
     * @throws Exception
     */

    public static void generatePdf(int iterNumber) throws Exception {
        PdfWriter writer = new PdfWriter("temp.pdf");
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
        for(int i=0;i<iterNumber;i++) {
//            pdf.addNewPage(PageSize.A4.rotate());
            pdf.addNewPage(PageSize.A0);
            Image image = new Image(ImageDataFactory.create("images/" + i + ".png"));
            image.scaleToFit(PageSize.A0.getHeight(), PageSize.A0.getWidth());
            image.setHorizontalAlignment(HorizontalAlignment.CENTER);
            document.add(image);
        }
        document.close();
    }

    /**
     * Function to manage traversal calls
     * @param elistener the listener which has the graph to traverse on
     */

    public static void traversal(EvalListener elistener){


        if(elistener.isBfs()){
//            System.err.println("call bfs");
            BFS.loadBfsConfig(elistener.getBfsConfig());
            BFS.bfs(elistener.getGraph(),elistener.getBfsStartNode());
        }
        if(elistener.isDfs()){
//            System.err.println("call dfs");
            DFS.loadDfsConfig(elistener.getDfsConfig());
            DFS.dfs(elistener.getGraph(),elistener.getDfsStartNode());
        }
        if(!(elistener.isBfs() || elistener.isDfs())){
            System.err.println("Default location is imagesDfs/0.png , dfs.pdf");

            try{
                Graphviz gv = new Graphviz();
                byte[] graphByteArray = gv.getGraphByteArray(elistener.getGraph(), "png","100");
                File outFile = new File("image.png");
                VesitLang.writeGraphToFile(graphByteArray, outFile);
            }catch (Exception ec){
                System.err.println(ec.toString());
                System.err.println("Error while generating image");
                System.err.println("Aborting");
            }
            try {
                showImage("image.png");
            }catch (Exception e){
                e.printStackTrace();
                System.err.println("error while displaying image");
            }

        }

    }


}
