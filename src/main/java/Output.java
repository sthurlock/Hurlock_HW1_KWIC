package se575.kwic;

import se575.kwic.LineStorage;

import java.io.FileWriter;
import java.io.IOException;

public class Output {
    public void writeToOutput(LineStorage lineStorage, String outputFilename) throws IOException {
        String[] lines = lineStorage.getSortedLines();
        if (outputFilename == null || outputFilename.equals("null")) {
            // write to console
            for (int i = 0; i < lines.length; i++) {
                System.out.println(lines[i]);
            }
        } else {
            FileWriter fw = new FileWriter(outputFilename);
            for (int i = 0; i < lines.length; i++) {
                // write each line to the file.
                fw.write(lines[i] + "\n");
            }
            fw.close();
        }
    }
}

