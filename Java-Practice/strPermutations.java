public class strPermutations {
    public static void printAllPermutations(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printAllPermutations(newStr, permutation + currChar);
        }
    }
    public static void main (String[] args) {
        //print all permutations of a string
        String str = "abcd";
        printAllPermutations(str, "");
    }
}
