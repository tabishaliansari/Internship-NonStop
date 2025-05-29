public class placeTilesInGrid {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        //vertically
        int vertPlacements = placeTiles(n - m, m);
        int horiPlacements = placeTiles(n - 1, m);
        return vertPlacements + horiPlacements;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(placeTiles(n, m));
    }
}
