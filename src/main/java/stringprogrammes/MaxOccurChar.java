package stringprogrammes;

public class MaxOccurChar {

    public static void main(String[] args) {

        String s = "abcaaahhhhhhhhhhhhhhhhhowareyou";
        int[] a = new int[256];
        for (int i = 0; i < s.length(); i++) {
            a[(int)s.charAt(i)]++;
        }
        int m=0;
        for (int j = 1; j < a.length; j++) {
            if (a[j] > a[m]) {
                m = j;
            }
        }
        System.out.println("max-->"+(char)m);
    }
}
