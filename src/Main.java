import java.util.Scanner;

public class Main {
    public static void main(String[] args){ ;
    Scanner inp = new Scanner(System.in);
    int a,h;
    double c,cevre,alan;
    System.out.println("Dik kenarları a ve h olan üçgen söz konusudur.");
     System.out.print("a Dik Kenarının Uzunluğu:...");
     a = inp.nextInt();
     System.out.print("h Dik Kenarının Uzunluğu:...");
     h = inp.nextInt();
     c = Math.sqrt((a*a) + (h*h));
     System.out.println("Hipotenüs:  " + c);
     cevre = (a+h+c) ;
     alan = (a*h) / 2 ;
     System.out.println("Üçgenin Çevresi " + cevre );
     System.out.println("Üçgenin Alanı " + alan );

    }}