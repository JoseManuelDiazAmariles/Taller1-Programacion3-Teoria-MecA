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
public class Ejercicio93 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner CantAsignaturas = new Scanner(System.in);
        System.out.println("Digite la cantidad de asignaturas");
        int CanA =CantAsignaturas.nextInt();
         
        
        Scanner CantAlumnos = new Scanner(System.in);
        System.out.println("Digite la cantidad de alumnos");
        int CanAlum =CantAlumnos.nextInt(); // Fila
        
        Scanner CantNotas = new Scanner(System.in);
        System.out.println("Digite la cantidad de notas");
        int CanNotas =CantNotas.nextInt(); // Columnas
        
        Scanner DatosNotas = new Scanner(System.in);
        double Notas[][] = new double [CanAlum][CanNotas];
        
        double MediaNotaAlumnos[] = new double [CanAlum]; // Variable para almacenar la media de cada alumno
        double MediaAsignatura[] = new double [CanA]; // Variable para almacenar la media de cada asignatura
        
        
       
            
            
            for(int j=0; j<CanAlum; j++)
            {
                double SumaNotas=0;
                System.out.println("Notas del alumno ["+j+"]");
                
                for(int p = 0; p<CanNotas; p++)
                {
                    System.out.println("Digite la Nota ["+p+"]");
                    
                    Notas[j][p]=DatosNotas.nextDouble();
                    SumaNotas = SumaNotas + Notas[j][p];
                    
                }
                MediaNotaAlumnos[j] = SumaNotas / CanNotas;
                
            }
            
            for(int j=0; j<CanA; j++)
            {
                double SumaNotas=0;
                
                for(int p = 0; p<CanAlum; p++)
                {
                    SumaNotas = SumaNotas + Notas[p][j];
                    
                }
                MediaAsignatura[j] = SumaNotas / CanAlum;
                
            }
            
               
       
        
        //Imprimir media de los alumnos
        for(int i =0; i<CanAlum; i++)
        {
            System.out.println("Notas del alumno ["+i+"]"+MediaNotaAlumnos[i]);
        }
        //Impriomir media de las asignatiras
        for(int i =0; i<CanA; i++)
        {
            System.out.println("Media de nota en la asignatura ["+i+"]"+MediaAsignatura[i]);
        }
        
        //Organizar el arreglo por el metodo Selección
        
        for(int i=0; i<CanAlum; i++)
        {
            int minimo = i;
            double Aux;
            
            for(int p= i + 1 ; p<CanAlum; p++)
            {
                if(MediaNotaAlumnos[p]<MediaNotaAlumnos[minimo])
                {
                    minimo=p;
                }
            }
            
            Aux=MediaNotaAlumnos[i];
            MediaNotaAlumnos[i] = MediaNotaAlumnos[minimo];
            MediaNotaAlumnos[minimo] = Aux; // Se termina guardando el minimo y ordena
        }
        
        for(int i = 0; i<CanAlum; i++)
        {
            System.out.print("Alumno ["+i+"]"+MediaNotaAlumnos[i]+" ");
        }
        
        
       
        
        
        
        
        
        
        
    }
}
