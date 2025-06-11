import java.util.Scanner;

public class GCD {
	static bux {
	}
	
    static int gcd(int u, int v) {
        int t;
        /*
         * (4,5),(5,4)
         * (5,4),(1,4)
         * (1,4),(4,1)
         * (4,1),(3,1)
         * (3,1)
         * (2,1)
         * (1,1)(0,1)
         * (0,1)
         */
        while (u > 0) {
            if (u < v) {
                t = u;
                u = v;
                v = t;
            }
            u = u - v;
        }
        return v;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (!scanner.hasNextInt())
                break;
            int y = scanner.nextInt();
            if (x > 0 && y > 0) {
                System.out.printf("%d %d %d\n", x, y, gcd(x, y));
            }
        }
        scanner.close();
    }
}