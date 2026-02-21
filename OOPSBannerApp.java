/**
 * OOPSBannerApp
 *
 * UC1: Print OOPS to Console
 * UC2: Render OOPS as Banner using Print Statements
 * UC3: Render OOPS as Banner using String.join()
 *
 * @author Kishan
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC1
        System.out.println("OOPS");
        System.out.println();

        // UC3 - Banner using String.join()

        System.out.println(String.join(" ",
                " *****  ",
                " *****  ",
                " ****** ",
                " ****** "));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * "));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*       "));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "******  ",
                " ****** "));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*       ",
                "      * "));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*       ",
                "*     * "));

        System.out.println(String.join(" ",
                " *****  ",
                " *****  ",
                "*       ",
                " *****  "));
    }
}