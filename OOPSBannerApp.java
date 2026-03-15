/**
 * OOPS Banner App
 *
 * UC4: Render OOPS as Banner using String Array and Loop
 *
 * Goal:
 * Store banner lines inside a String array and use a loop
 * to print each line of the banner.
 *
 * Key Concepts:
 * - String Array
 * - Array Initialization
 * - String.join()public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create a String array to store banner lines
        String[] banner = new String[7];

        banner[0] = String.join(" ", " ***** ", " ***** ", " ****** ", " ***** ");
        banner[1] = String.join(" ", "*     *", "*     *", "*     *", "*");
        banner[2] = String.join(" ", "*     *", "*     *", "*     *", "*");
        banner[3] = String.join(" ", "*     *", "*     *", "****** ", " ***** ");
        banner[4] = String.join(" ", "*     *", "*     *", "*      ", "     *");
        banner[5] = String.join(" ", "*     *", "*     *", "*      ", "*    *");
        banner[6] = String.join(" ", " ***** ", " ***** ", "*      ", " **** ");

        // Print banner using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
 * - Enhanced For Loop
 *
 * Output:
 * Banner display of the word OOPS using '*' characters.
 */