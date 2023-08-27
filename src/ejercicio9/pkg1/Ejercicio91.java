/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9.pkg1;

import java.util.Scanner;

/**
 *
 * @author papop
 */
public class Ejercicio91 { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner CantidadNumeros = new Scanner(System.in);
        System.out.println("Ingrese La cantidad de numeros a ordenar:");
        int Num=CantidadNumeros.nextInt();
        
        
        Scanner Numeros = new Scanner(System.in);
        int Arreglo [] = new int [Num];
        
        // Leer Arreglo
        
        for(int i = 0; i<Num; i++)
        {
            System.out.println("Ingrese el numero ["+i+"] a ordenar:");
            Arreglo[i]=Numeros.nextInt();
        }
        System.out.println(" ");
        
        //Organizar el arreglo por el metodo Selección
        
        for(int i=0; i<Num; i++)
        {
            int minimo = i;
            int Aux;
            
            for(int p= i + 1 ; p<Num; p++)
            {
                if(Arreglo[p]>Arreglo[minimo])
                {
                    minimo=p;
                }
            }
            
            Aux=Arreglo[i];
            Arreglo[i] = Arreglo[minimo];
            Arreglo[minimo] = Aux; // Se termina guardando el minimo y ordena
        }
        
        //Imprimir el arreglo en orden
        
        for(int i = 0; i<Num; i++)
        {
            System.out.print(Arreglo[i]+" ");
        }
        
    }
    
}
