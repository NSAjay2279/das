import java.util.Scanner;

public class Euclid {
    public static int gcd(int u, int v) {
      /*
        (5,4),(4,5),(1,0),(0,1)
        (4,1),(5,4)      ,(1,0)
        (1,0),(4,1)
             ,(1,0)
       */
        while (v != 0) {
            int t = v;
            v = u % v;
            u = t;
        }
        return u;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) { 
            int x = scanner.nextInt();
            if (!scanner.hasNextInt()) break;
            int y = scanner.nextInt();
            if (x >= 0 && y >= 0) {
                System.out.printf("%d %d %d\n", x, y, Euclid.gcd(x, y));
            }
        }
        scanner.close();
    }
}