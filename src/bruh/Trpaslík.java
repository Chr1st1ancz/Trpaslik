package bruh;

import java.util.Scanner;

public class Trpaslík {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("zadej bruh");
        int bruh = sc.nextInt();
        if(bruh<151){
            System.out.println("Lmao jsi small");

        }
        else if(bruh>149 && bruh<176){
            System.out.println("Ok");
        }
        else if(bruh>174){
            System.out.println("you big");

        }
        else{
            System.out.println("idk");
        }

    }
}
