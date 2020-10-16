package chapter12.section10.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Paying attention to exceptions in constructors
 *
 * @author zhanghua
 * @date 2020/10/12
 */
public class InputFile {
    private BufferedReader in;

    public InputFile(String fName) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fName));
            // Other code that might throw exceptions
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fName);
            // Wasn't open, so don't close it
            throw e;
        } catch (Exception e) {
            // All other exceptions must close it
            try {
                in.close();
            } catch (IOException e1) {
                System.out.println("in.close() unsuccessful");
            }
            // Rethrow
            throw e;
        } finally {
            // Don't close it here!!!
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch (IOException e) {
            System.out.println("in.close() failed");
        }
    }
}
