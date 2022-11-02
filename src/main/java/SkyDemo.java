import java.util.HashSet;
import java.util.Set;

public class SkyDemo {
    public static void main(String[] args) {
        int[] array = {76,2,3,4};
        System.out.println(solution(array));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 11
        int fin = -1;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }

        for (int i = 1; i < 1000001; i++) {
            if (!set.contains(i)) {
                fin = i;
                break;
            }
        }

        return fin;
    }
}
