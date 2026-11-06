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

System.out.println("Enter how many lines of odds you want:");
int odd = scanner.nextInt();
odds(odd);

System.out.println("Enter how many lines of eo's you want:");
int eos = scanner.nextInt();
eo(eos);

System.out.println("Enter how many lines of pyramids you want:");
int pyramids = scanner.nextInt();
pyramid(pyramids);
scanner.close();
}
    public static void stars(int rows){
    int i = 1;
    while (i <= rows) { 
        int j = 0;
        while (j < 2 * i -1) {
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
    }
    }
    public static void triangle(int rows){}


    public static void odds(int start){}


    public static void eo(int maxE){}

    
    public static void pyramid(int rows){}

}
