package org.culpan.bin2ihex;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

/**
 * Created by USUCUHA on 2/4/2016.
 */
public class bin2ihexmain {
    public static void main(String [] args) {
        System.out.println("Hello");
    }

    public static Options getOptions() {
        Options result = new Options();

        result.addOption("s", true, "Specifies starting location, optional only if PRG file");
        result.addOption("o", true, "Output file, optional; default is incoming file with .ihex extension");

        return result;
    }
}
