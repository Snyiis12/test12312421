
//
//  Class author:  Lucas Yelovich
//  Date created:  10/30/26
//  General description: Makes patterns.
// 
import java.util.Scanner;

class Main {
    /*
     * Precondition: Standard input contains five integers: nonnegative row counts
     * for stars, triangles, E/O lines, and pyramids, plus an odd number from 1 to 9.
     * Star and pyramid row counts are at most 1,073,741,823; other row counts are
     * less than Integer.MAX_VALUE.
     * Postcondition: Prompts for the values, prints each requested pattern in order,
     * and closes the scanner.
     */
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

    /**
     * Precondition: 0 <= rows <= 1,073,741,823.
     * Postcondition: Prints rows lines; line i contains 2*i-1 asterisks for
     * each i from 1 through rows.
     */
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

    /**
     * Precondition: 0 <= rows < Integer.MAX_VALUE.
     * Postcondition: Prints rows lines; line i contains the digit i repeated
     * i times for each i from 1 through rows.
     */
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

    /**
     * Precondition: first is an odd integer from 1 through 9.
     * Postcondition: Prints descending odd values from first to 1, with each
     * value repeated that many times on its own line.
     */
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

    /**
     * Precondition: 0 <= maxE < Integer.MAX_VALUE.
     * Postcondition: Prints an E/O pattern with maxE lines ascending in length
     * and then maxE-1 lines descending in length; each line contains one repeated
     * letter, alternating by line.
     */
    public static void eo(int maxE) {
        for (int i = 1; i <= maxE; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + maxE) % 2 == 0)
                    System.out.print("E");
                else
                    System.out.print("O");
            }
            System.out.println();
        }

        for (int i = maxE - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if ((i + maxE) % 2 == 0)
                    System.out.print("E");
                else
                    System.out.print("O");
            }
            System.out.println();
        }
    }

    /**
     * Precondition: 0 <= rows <= 1,073,741,823.
     * Postcondition: Prints rows centered lines; line k has k-1 leading spaces
     * followed by digit k repeated 2*(rows-k)+1 times.
     */
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
