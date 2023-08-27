/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9.pkg1;

import java.util.Scanner;

/**
 *
 * @author papop
 */
public class Ejercicio92 {
   public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner CantNum = new Scanner (System.in);
        System.out.print("Cantidad de numeros a calcular la mediana: ");
        int Num =CantNum.nextInt();
        
        Scanner datos = new Scanner(System.in);
        double Vector[] = new double [Num];
        
        // leer el arreglo
        
        for(int i=0; i<Num; i++)
        {
            System.out.println("Digite el numero ["+i+"]: ");
            Vector[i] = datos.nextDouble();
        }
        
        // Imprimir Arreglo
        
        System.out.println("Numeros a calcular mediana ");
        
        for(int i=0; i<Num; i++)
        {
            System.out.print(Vector[i]+" ");
            
        }
        System.out.println(" ");
        // Calcular medidad
        
        double N=0; // Suma de todos los elementos 
        for (int i=0; i<Num; i++)
        {
            N= N + Vector[i];
        }
        System.out.println("N = "+N);
        
        double Mediana;
        
        Mediana = (N+1)/2; // Calculo de la mediana
        
        System.out.println("La mediana del Vector"+Num+"Es Igual a: "+Mediana); // Imprimir Resultado
        
        
   }
}
