public class WeightedQuickUnion {
    private int[] size;
    private int[] id;

    public WeightedQuickUnion(int n) {
        id = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            size[i] = 1;
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]]; // adding path compression
            i = id[i];
        }

        return i;
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        if (i == j)
            return;

        if (size[i] < size[j]) {
            id[i] = j;
            size[j] += size[i];
        } else {
            id[i] = i;
            size[i] += size[j];
        }

        id[i] = j;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
}
