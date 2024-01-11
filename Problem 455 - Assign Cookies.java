import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int i = 0;
        int j = 0;
        int gLength = g.length;
        int sLength = s.length;

        while (i < gLength && j < sLength) {
            if (s[j] >= g[i]) {
                count++;
                i++;
            }
            j++;
        }

        return count;
    }
}
