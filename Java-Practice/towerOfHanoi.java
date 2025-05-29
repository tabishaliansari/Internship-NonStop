public class towerOfHanoi {
    static int count = 0;
    //Time Complexity = O(2^n)
    public static void hanoi(int n, String source, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transferring disk " + n + " from " + source + " to " + dest);
            count++;
            return;
        }
        hanoi(n - 1, source, dest, helper);
        System.out.println("Transferring disk " + n + " from " + source + " to " + dest);
        count++;
        hanoi(n - 1, helper, source, dest);
    }
    public static void main(String[] args) {
        hanoi(3, "Source", "Helper", "Destination");
        System.out.println("Total number of moves: " + count);
    }
}
