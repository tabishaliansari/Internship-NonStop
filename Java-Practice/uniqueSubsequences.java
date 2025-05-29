import java.util.HashSet;

public class uniqueSubsequences {
    //Time Complexity = O(2^n)
    public static void Subsequences(String str, int idx, String newStr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // if currChar needs to be added
        Subsequences(str, idx + 1, newStr + currChar, set);
        //if currChar needs NOT to be added
        Subsequences(str, idx + 1, newStr, set);
    }

    public static void main(String[] args) {
        String str = "aaaa";
        HashSet<String> set = new HashSet<>();
        Subsequences(str, 0, "", set);
    }
}
