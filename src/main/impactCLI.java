package com.impactcli;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import java.util.concurrent.Callable;

public class ImpactCLI implements Callable<Integer> {
    private boolean simple;

    private static final String RESET  = "\u001B[0m";
    private static final String BOLD   = "\u001B[1m";
    private static final String CYAN   = "\u001B[36m";
    private static final String GREEN  = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String WHITE  = "\u001B[97m";

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ImpactCLI()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() {
        if (simple) {
            System.out.println("impact.com");
            return 0;
        }

        printBanner();
        return 0;
    }

    private void printBanner() {
        String c  = color ? CYAN   : "";
        String g  = color ? GREEN  : "";
        String y  = color ? YELLOW : "";
        String w  = color ? WHITE  : "";
        String b  = color ? BOLD   : "";
        String rs = color ? RESET  : "";

        System.out.println();
        System.out.println(c + b + "  ██╗███╗   ███╗██████╗  █████╗  ██████╗████████╗   ██████╗ ██████╗ ███╗   ███╗" + rs);
        System.out.println(c + b + "  ██║████╗ ████║██╔══██╗██╔══██╗██╔════╝╚══██╔══╝  ██╔════╝██╔═══██╗████╗ ████║" + rs);
        System.out.println(c + b + "  ██║██╔████╔██║██████╔╝███████║██║        ██║     ██║     ██║   ██║██╔████╔██║" + rs);
        System.out.println(c + b + "  ██║██║╚██╔╝██║██╔═══╝ ██╔══██║██║        ██║     ██║     ██║   ██║██║╚██╔╝██║" + rs);
        System.out.println(c + b + "  ██║██║ ╚═╝ ██║██║     ██║  ██║╚██████╗   ██║     ╚██████╗╚██████╔╝██║ ╚═╝ ██║" + rs);
        System.out.println(c + b + "  ╚═╝╚═╝     ╚═╝╚═╝     ╚═╝  ╚═╝ ╚═════╝   ╚═╝      ╚═════╝ ╚═════╝ ╚═╝     ╚═╝" + rs);
        System.out.println();
        System.out.println();
        System.out.println(w + "  \uD83D\uDE80  Transforming the way businesses manage partnerships." + rs);
        System.out.println();
    }
}
