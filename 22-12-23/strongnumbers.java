import java.util.Scanner;

public class strongnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

    for (int i = s; i <= e; i++) {
            int on = i;
            int sumoffact = 0;
            while (on > 0) {
                int digit = on % 10;
                int fact = 1;
                for (int j = 1; j <= digit; j++) {
                    fact *= j;
                }
                sumoffact += fact;
                on /= 10;
            }
            if (sumoffact == i) {
                System.out.print(i + " ");
            }
        }
}
}