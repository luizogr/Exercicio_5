package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();

        for (int i=palavra.length()-1; i>=0; i--) {
            System.out.print(palavra.charAt(i));
        }

        sc.close();
    }
}
