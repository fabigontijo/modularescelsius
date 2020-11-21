/*
 * Converte temperatura de Celsius em Fahrenheit de 10 em 10 até 100.
 */
package celsius_fabiana.java;

import java.util.Scanner;

/**
 *
 * @Fabiana Gontijo
 */
public class Celsius_FabianaJava {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float temC, tempF, i;
        
        System.out.println("Informe a temperatura em celsius:");
        
        float tempC = leitor.nextFloat();
        
        for(i=0;i<=100;i+=10)
        {
            tempF=(float)(((tempC+i)*1.8)+32);
            
            System.out.println(tempF+"Temperatura em Fahrenheit:"+tempF);
            
        }
    }
    
}
