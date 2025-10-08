public class UniqueSubsequences {

    public static void printUnique(String str, int idx, String newString) {
        // Base case: reached end of string
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // 1. Include current character
        printUnique(str, idx + 1, newString + currChar);

        // 2. Exclude current character
        // Skip duplicate if the same character repeats consecutively
        int nextIdx = idx + 1;
        while (nextIdx < str.length() && str.charAt(nextIdx) == currChar) {
            nextIdx++;
        }
        printUnique(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "aaba";
        printUnique(str, 0, "");
    }
}
 