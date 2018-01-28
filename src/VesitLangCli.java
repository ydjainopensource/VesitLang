

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

    @CommandLine.Parameters(arity = "1", paramLabel = "FILE", description = "File(s) to process.")
    private static File inputFiles[];

    public static void main(String args[]) throws Exception{

        String[] aargs = {"-v","infile" };

        // Initialize picocli
        VesitLangCli vesitLangCli = CommandLine.populateCommand(new VesitLangCli(), aargs);

        // help requested
        if(usageHelpRequested){
            CommandLine.usage(new VesitLangCli(), System.out);
            return;
        }


        String IROutName = "/dev/null";
        System.setErr(new PrintStream(new FileOutputStream(IROutName)));

        if(verbose){
            System.out.println("Outputting logs to <filename>.log");
        }


        for (File inputFile: inputFiles) {
            if(verbose) {
                IROutName = inputFile.getName() + ".log";
                FileOutputStream IRout = new FileOutputStream(IROutName);
                System.setErr(new PrintStream(IRout));
            }

            VesitLang.processFile(new FileInputStream(inputFile));
        }
    }

}
