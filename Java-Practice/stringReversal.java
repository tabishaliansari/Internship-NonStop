public class stringReversal {
    //Time Complexity = O(n)
    public static void reverse(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverse(str, idx - 1);
    }

    public static void reverse(String str) {
        for (int len = str.length(); len > 0; len--) {
            System.out.print(str.charAt(len - 1));
        }
    }

    public static void main(String[] args) {
        String name = "Hello";
        System.out.println(name);
        reverse(name, name.length() - 1);
    }
}
