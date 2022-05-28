import java.util.HashSet;
import java.util.Set;

public class Palindrome {
    public static void main(String[] args) {
        String słowo = "mama";
        czyjestpalindromem(słowo);

        char[] słowodotablicy = słowo.toCharArray();

        for (int i = 0; i < słowodotablicy.length; i++) {
            System.out.println(słowodotablicy[i]);
        }


    }

    private static void czyjestpalindromem(String słowo) {
        String s1 = "";
        int N = słowo.length(), count = 0;
        Set<String> palindromtablica = new HashSet<String>();

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                int k = i + j - 1;
                if (k >= N)
                    continue;
                s1 = słowo.substring(j, i + j);
                if (s1.equals(new StringBuilder(s1).reverse().toString())) {
                    palindromtablica.add(s1);
                }
            }

        }
        for (String s : palindromtablica)
            System.out.println(s);

    }
}
