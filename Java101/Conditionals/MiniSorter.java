package Java101.Conditionals;

import java.util.*;

public class MiniSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;

        System.out.print("Lütfen 1. sayıyı giriniz: ");
        a = input.nextInt();

        System.out.print("Lütfen 2. sayıyı giriniz: ");
        b = input.nextInt();

        System.out.print("Lütfen 3. sayıyı giriniz: ");
        c = input.nextInt();


        if (a > b  && a > c){
            if(b > c){
                System.out.println("a > b > c");
            }else {
                System.out.println("a > c > b");
            }
        }else if(b > a && b > c){
            if(a > c){
                System.out.println("b > a > c");
            }else{
                System.out.println("b > c > a");
            }
        }else if(c > a && c > b){
            if(a > b){
                System.out.println("c > a > b");
            }else{
                System.out.println("c > b > a");
            }
        }
    }
}
