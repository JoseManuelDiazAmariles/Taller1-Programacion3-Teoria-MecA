/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9.pkg1;

/**
 *
 * @author papop
 */
public class Ejercicio95 {
    public static void main(String[] args) {
        int ListaA [] = new int [2000];
        
        // Llenar el Arreglo Aleaorio de Lista A
        
        for (int i= 0; i<2000; i++)
        {
            ListaA [i] = (int) (Math.random()*1999); // Llenar el arreglo hasta 2 mil posiciones con numeros aleatorios desde 0 hasta 1999
            
        }
        // Ordenar el arreglo
        
        //Organizar el arreglo por el metodo Selección
        
        for(int i=0; i<2000; i++)
        {
            int minimo = i;
            int Aux;
            
            for(int p= i + 1 ; p<2000; p++)
            {
                if(ListaA[p]<ListaA[minimo])
                {
                    minimo=p;
                }
            }
            
            Aux=ListaA[i];
            ListaA[i] = ListaA[minimo];
            ListaA[minimo] = Aux; // Se termina guardando el minimo y ordena
        }
        
        
        
        // Numeros a buscar dentro de ListaA por medio de una lista B
        
         int ListaB [] = new int [500];
         
         for(int i=0; i<500; i++)
         {
             ListaB[i]=(int) (Math.random()*1999);
         }
    // Busqueda binaria
        int n = 2000;
        int NumInf= 0;
        int Centro = 0;
        int NumSuperior = 2000 -1;
        boolean Bandera = false; //Indica que encontro el numero
        
        long TiempoInicial = System.nanoTime(); // Toma el tiempo inicial del ciclo
        for(int ValorB : ListaB) // Todos los valores de Lista B se guardan en ValorB
        {
            while(NumInf <= NumSuperior)
            {
                Centro = (NumInf + NumSuperior)/2;
                if(ListaA[Centro] == ValorB)
                {
                    Bandera = true;
                    break;
                }
                else
                {
                    if(ValorB<ListaA[Centro])
                    {
                        NumSuperior = Centro - 1; // Corre al proximo numero a la izquierda una unidad
                    }
                    else
                    {
                        NumInf = Centro + 1; // Corre un numero hacia la derecha desde el centro
                    }
                }
            }
        }
        long TiempoFinal = System.nanoTime(); // Tiempo de finalizacion de la accion
        long TiempoResultadoBinaria = TiempoFinal - TiempoInicial;
        double TiempoBinariaSegundos = TiempoResultadoBinaria * Math.pow(10, -9);
        
        //Busqueda Secuencial 
         TiempoInicial = System.nanoTime();
        for(int ValorB : ListaB) // Todos los valores de Lista B se guardan en ValorB) 
        {
            for(int i=0; i<2000; i++)
            {
                if(ListaA[i]==ValorB)
                {
                    Bandera = true;
                    break;
                }
            }
        }
        TiempoFinal = System.nanoTime();
        long TiempoResultadoSecuencial = (TiempoFinal - TiempoInicial);
        double TiempoSecuencialSegundos = TiempoResultadoSecuencial * Math.pow(10, -9);
        
        // Mostrar tiempos para ambas busquedas
        
        System.out.println("Tiempo utilizado para la busqueda Secuencial = "+TiempoSecuencialSegundos+"S");
        System.out.println("Tiempo utilizado para la busqueda Binaria    = "+TiempoBinariaSegundos+"S");
         
         
    
}
}