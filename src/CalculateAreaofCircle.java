import java.util.Scanner;

public class CalculateAreaofCircle {
    public static void main(String[] args) {
        /* Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;
        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

        // Declare int variables
        double r, a, area, perimeter, area2;

        // Create a new object
        Scanner input = new Scanner(System.in);

        // Prompt the user to input int radius
        System.out.print( " Enter radius : " );
        r = input.nextInt();

        // Calculate area and perimeters of circle
        area = Math.PI * r * r;
        System.out.println( " Area of circle is " + area );
        perimeter = 2 * Math.PI * r;
        System.out.println( " Perimeter of circle is " + perimeter );

        // Prompt the user to input int a
        System.out.print( " Enter central angle of circle : " );
        a = input.nextInt();

        // Calculate area of the circle segment
        area2= ( Math.PI * ( r * r ) * a ) / 360;

        System.out.println ( " Area of the circle segment : " + area2);

    }
}