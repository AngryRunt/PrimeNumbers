import java.util.ArrayList;


public class Main {
    public static int divisorscounting(int start, int end) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                lst.add(i);
            }
        }
        return lst.size();
    }
    public static int eratosphen(int start, int end) {
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0; i <= end; i++) {
            tmp.add(i);
        }
        tmp.set(1, 0);
       int i = start;
        while (i <= end) {
            if (tmp.get(i) != 0) {
                lst.add(i);
                for (int j = i; j <= end; j+= i) {
                    tmp.set(j, 0);
                }
            }
            i++;
        }
        return lst.size();
    }
    public static void main(String[] args) {
        System.out.println("от 1 до 100 " + String.valueOf(Main.divisorscounting(2, 100)));
        System.out.println("от 100 до 1000 " + String.valueOf(Main.divisorscounting(101, 1000)));
        int count = Main.eratosphen(2, 100);
        System.out.println("Решето Эратосфена от 1 до 100 " + String.valueOf(count));
        System.out.println("Решето Эратосфена от 100 до 1000 " + String.valueOf(Main.eratosphen(2, 1000) - count));
    }

}