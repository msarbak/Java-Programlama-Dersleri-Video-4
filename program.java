package yt.video4;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        
        int []sayilar = {10,20,30,40,50,60,70,80};
        System.out.println(sayilar[2]);
        int index;
        for(index=0; index<8; index++){
            System.out.println(" "+sayilar[index]);
        }
    
        Scanner in = new Scanner(System.in);
        int sayi;
		do {
			System.out.println("asal olmayan sayi");
			sayi = in.nextInt();
			
		}while (!new String (new char[sayi]).matches(".?|(..?)\\1+")); // regex
		System.out.println("sayi asal deyil");


        
    }
}
