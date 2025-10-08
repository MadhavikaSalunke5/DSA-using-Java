public class Removeduplicate {
    public static boolean[] map = new boolean[26]; // To track visited characters (a-z)

    public static void removeDup(String str, int idx, String newString) {
        // Base condition: if we reach the end of the string
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // If character is already seen → skip it
        if (map[currChar - 'a']) {
            removeDup(str, idx + 1, newString);
        } else {
            // Mark character as seen
            map[currChar - 'a'] = true;
            removeDup(str, idx + 1, newString + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "aabbccdd";
        removeDup(str, 0, "");
    }
}
