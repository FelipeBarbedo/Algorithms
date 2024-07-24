public class QuickUnion {
    protected int[] id;

    public QuickUnion(int n) {
        id = new int[n];

        for (int i = 0; i < n; i++)
            id[i] = i;
    }

    protected int root(int i) {
        while (i != id[i])
            i = id[i];

        return i;
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        id[i] = j;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
}
