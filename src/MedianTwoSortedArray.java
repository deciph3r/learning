public class MedianTwoSortedArray {
    public static float median(int[] m, int[] n) {
        int i, j, m1, m2;
        i = j = m1 = m2 = 0;

        for (int k = 0; k <= (m.length + n.length) / 2; k++) {
            m2 = m1;
            if (i != m.length && j != n.length) {
                if (m[i] > n[j]) {
                    m1 = n[j++];
                } else {
                    m1 = m[i++];
                }
            } else if (i < m.length) {
                m1 = m[i++];
            } else {
                m1 = n[j++];
            }
        }
        if ((m.length + n.length) % 2 == 0) {
            return ((float) m1 + (float) m2) / 2.0f;
        }
        return m1;
    }

    public static void main(String[] args) {
        System.out.println(median(new int[]{1, 2}, new int[]{3, 4}));
    }
}
