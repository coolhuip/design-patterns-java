/**
 * If (it's broke) fix it;
 * <br>
 * If (it ain't broke) leave it;
 * <br>
 * If (it works) fantastic;
 * <br>
 * If (it's too slow) patch it;
 */
package app.codge.utilities;


/**
 * This is a utility class.
 * <br>
 * I.e., all methods are STATIC.
 */
public class Utils {

    // The print() functions below are a practice known as OVERLOADING.
    // ----------------------------------------------------------------
    /**
     * Python-style print() function.
     * @param obj Object
     */
    public static void print(Object obj) {
        System.out.println(obj);
    }
    /**
     * Python-style print() function.
     * Pass ANY integer value to <b>(delNewline)</b> to remove newline.
     * @param obj Object
     * @param delNewline int
     */
    public static void print(Object obj, int delNewline) {
        System.out.print(obj);
    }
    /**
     * Python-style print() function.
     */
    public static void print() {
        System.out.println();
    }
    // ----------------------------------------------------------------

    /**
     * Print a newline character on the console output.
     */
    public static void newline() {
        System.out.println();
    }
    
}
