import java.util.ArrayList;

public class subsetOfSet {

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void subsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }

        //elem will be added
        subset.add(n);
        subsets(n - 1, subset);

        //elem will not be added
        subset.remove(subset.size() - 1);
        subsets(n - 1, subset);
    }

    //print all the subsets of a set of first n natural numbers
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<Integer>();
        subsets(n, subset);
    }
}
