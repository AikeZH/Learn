package chapter12.section12.exceptions;

import java.io.FileInputStream;

/**
 * @author ZhangHua
 * @date 2020/10/14
 */
public class MainException {
    // Pass all exceptions to the console
    public static void main(String[] args) throws Exception{
        // Open the file
        FileInputStream file = new FileInputStream("MainException.java");
        // Use the file ...
        // Close the file
        file.close();
    }
}
