
//
//  Class author:  Lucas Yelovich
//  Date created:  10/30/26
//  General description: Makes patterns.
// 
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many lines of stars you want:");
        int star = scanner.nextInt();
        stars(star);

        System.out.println("Enter how many lines of triangles you want:");
        int triangles = scanner.nextInt();
        triangle(triangles);

        System.out.println("Enter first Number thats odd up to 9:");
        int odd = scanner.nextInt();
        odds(odd);

        System.out.println("Enter how many lines of eo's you want:");
        int MaxE = scanner.nextInt();
        eo(MaxE);

        System.out.println("Enter how many lines of pyramids you want:");
        int pyramids = scanner.nextInt();
        pyramid(pyramids);
        scanner.close();
    }

    public static void stars(int rows) {
        int i = 1;
        while (i <= rows) {
            int j = 0;
            while (j < 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void triangle(int rows) {
        int i = 1;
        while (i <= rows) {
            int j = 0;
            while (j < i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void odds(int first) {
        int i = 1;
        while (i <= (first/2)+1) {
            int j = first;
            while (j + 2 > 2 * i) {
                System.out.print(first + 2 - 2 * i);
                j--;
            }
            System.out.println();
            i++;
        }
    }

    public static void eo(int maxE) {
        for (int i = 1; i <= maxE; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + maxE) % 2 == 0)
                    System.out.print("O");
                else
                    System.out.print("E");
            }
            System.out.println();
        }

        for (int i = maxE - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if ((i + maxE) % 2 == 0)
                    System.out.print("O");
                else
                    System.out.print("E");
            }
            System.out.println();
        }
    }

    public static void pyramid(int rows) {
        int k = 1;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print(k);
            }
            System.out.println();
            k++;
        }

    }

}
