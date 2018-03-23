

import picocli.CommandLine;
import picocli.CommandLine.Option;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class VesitLangCli {
    @Option(names = {"-h", "--help"}, usageHelp = true, description = "display this help message")
    static boolean usageHelpRequested=false;

    @CommandLine.Option(names = { "-v", "--verbose" }, description = "Be verbose.")
    private static boolean verbose = false;

    @CommandLine.Parameters(arity = "1..*", paramLabel = "FILE", description = "File(s) to process.")
    private static File inputFiles[];

    public static void main(String args[]) throws Exception{

        String[] aargs = {"-v","infile" };

        // Initialize picocli
        VesitLangCli vesitLangCli = CommandLine.populateCommand(new VesitLangCli(), args);

        // help requested
        if(usageHelpRequested){
            CommandLine.usage(new VesitLangCli(), System.out);
            return;
        }


        // By default don't output anything
        String IROutName = "/dev/null";
        System.setOut(new PrintStream(new FileOutputStream(IROutName)));

        if(verbose){
            System.err.println("Outputting logs to <filename>.log");
        }


        for (File inputFile: inputFiles) {
            if(verbose) {
                IROutName = inputFile.getName() + ".log";
                FileOutputStream IRout = new FileOutputStream(IROutName);
                System.setOut(new PrintStream(IRout));
            }

            System.out.println("Started Processing file : " + inputFile.getName());
            VesitLang.processFile(new FileInputStream(inputFile));
            System.out.println("Proccessed File : "+ inputFile.getName() );
        }
    }

}
