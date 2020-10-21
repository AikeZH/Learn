package chapter12.section10.exceptions;

/**
 * Guaranteeing proper cleanup of a resource
 * @author zhanghua
 * @date 2020/10/12
 */
public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("D:/Learn/java.mindview/basic/src/chapter12/section10/exceptions/Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null){
                    // Perform line-by-line processing here...
                }
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }
    }
    /* Output:
    dispose() successful
     */
}
