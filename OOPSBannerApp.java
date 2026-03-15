/**
 * OOPS Banner App
 *
 * UC5: Render OOPS as Banner using Inline Array Initialization
 *
 * Goal:
 * Combine array declaration and initialization in a single statement
 * using String.join() to build the banner lines.
 *
 * Key Concepts:
 * - Inline Array Initialization
 * - String.join()
 * - Enhanced For Loop
 *
 * Output:
 * Banner display of the word OOPS using '*' characters.
 */public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization with String.join()
        String[] banner = {
            String.join(" ", " ***** ", " ***** ", " ****** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*     *", "*"),
            String.join(" ", "*     *", "*     *", "*     *", "*"),
            String.join(" ", "*     *", "*     *", "****** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*      ", "     *"),
            String.join(" ", "*     *", "*     *", "*      ", "*    *"),
            String.join(" ", " ***** ", " ***** ", "*      ", " **** ")
        };

        // Print banner using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}