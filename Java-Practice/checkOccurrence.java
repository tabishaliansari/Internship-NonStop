public class checkOccurrence {
    public static int first = -1;
    public static int last = -1;

    //Time Complexity = O(n)
    public static void findOccurrence(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first + " " + last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurrence(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdbaefaah";
        findOccurrence(str, 0, 'b');
    }
}
