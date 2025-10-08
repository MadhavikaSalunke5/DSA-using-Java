public class Subsequences {

    public static void printSubseq(String str, int idx, String newString) {
        // Base case: end of string
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // 1. Include current character
        printSubseq(str, idx + 1, newString + currChar);

        // 2. Exclude current character
        printSubseq(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubseq(str, 0, "");
    }
}
