/**
 * OOPS Banner App
 *
 * UC8: Use Map for Character Patterns and Render via Function
 *
 * Goal:
 * Store banner patterns for characters in a HashMap for efficient lookup.
 *
 * Key Concepts:
 * - HashMap
 * - Java Collections Framework
 * - Static Utility Methods
 * - Nested Loops
 * - StringBuilder
 *
 * Output:
 * Banner display of the word OOPS using '*' characters.
 */import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Utility method to create character pattern map
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    // Utility method to print banner
    public static void printBanner(String message, Map<Character, String[]> patternMap) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                line.append(patternMap.get(ch)[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = buildCharacterPatterns();

        String message = "OOPS";

        printBanner(message, patterns);
    }
}