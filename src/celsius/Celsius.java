package celsius;

import java.util.Scanner;

public class Celsius {

    public static void main(String[] args) {
        double f, c;
        System.out.println("Digite a temperatura em Fahrenheit: ");
        Scanner scan = new Scanner(System.in);
        f = scan.nextDouble();
       
        c = (f-32)/1.8;
        
        System.out.println("Celsius: "+c);
    }
    
}
