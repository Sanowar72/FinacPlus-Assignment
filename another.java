public class another {
    static int minCoins(int coins[], int m, int V) {
        int table[] = new int[V + 1];
        table[0] = 0;
        for (int i = 1; i <= V; i++)
            table[i] = Integer.MAX_VALUE;
        for (int i = 1; i <= V; i++) {
            for (int j = 0; j < m; j++)
                if (coins[j] <= i) {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE
                            && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                }
        }
        if (table[V] == Integer.MAX_VALUE)
            return -1;

        return table[V];
    }

    public static void main(String args[]) {
        int coins[] = { 1, 2, 5, 10, 20, 50 };
        int m = coins.length;
        int output = 0;
        int len = 100;
        for (int i = 1; i < len; i++) {
            output += minCoins(coins, m, i);
            // System.out.println("Minimum coins required for " + i + "is " + "" +
            // minCoins(coins, m, i) + "");
        }
        // System.out.println("OUTPUT " + output);
        float answer = (float) output / len;
        System.out.printf("Average :- " + answer);
    }
}