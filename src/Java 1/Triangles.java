// FloydS Triangles........

import java.util.*;

public class Triangles {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // int number = 1;

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(number + " ");
        // number++;
        // }
        // System.out.print("\n");
        // }

        // 0-1 Triangle......

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
    }
}