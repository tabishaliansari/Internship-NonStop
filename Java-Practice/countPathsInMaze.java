public class countPathsInMaze {
    public static int countPaths(int i, int j, int m, int n) {
        if (i == m || j == n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        //move downwards
        int downPaths = countPaths(i + 1, j, m, n);
        //move right
        int rightPaths = countPaths(i, j + 1, m, n);
        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(countPaths(0, 0, m, n));
    }
}
