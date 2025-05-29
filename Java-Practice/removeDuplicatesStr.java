public class removeDuplicatesStr {
    //program to remove all duplicates in string
    public static boolean[] map = new boolean[100];

    //Time Complexity = O(n)
    public static void removeDuplicates(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr);
        } else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abbccddeefffaabbgfgf";
        System.out.println(str);
        removeDuplicates(str, 0, "");
    }
}
