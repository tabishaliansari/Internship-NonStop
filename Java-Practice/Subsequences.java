public class Subsequences {
    //Time Complexity = O(2^n)
    public static void Subsequences(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        // if currChar needs to be added
        Subsequences(str, idx + 1, newStr + currChar);
        //if currChar needs NOT to be added
        Subsequences(str, idx + 1, newStr);
    }

    public static void main(String[] args) {
        String str = "aaa";
        Subsequences(str, 0, "");
    }
}
