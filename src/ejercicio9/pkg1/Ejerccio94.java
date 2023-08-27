/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9.pkg1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Scanner;

/**
 *
 * @author papop
 */
public class Ejerccio94 {
    public static void main(String[] args) {
       //Ruta Archivo
        File Contactos = new File("C:\\Users\\papop\\OneDrive\\Documentos\\UMNG JOSE\\Tareas\\Programación\\Taller 1 Teoria\\Ejercicio9.1\\Datos.txt");
        
        Scanner Opcion = new Scanner(System.in); //Entrada usuario al switch
        
        // Almacener los datos leidos desde el archivo
        String nombre [ ] = new String [1000];
         String telefono [ ] = new String [1000];
         
        BuscarDatos(Contactos, nombre, telefono); // LLamar al metodo y hacer busqueda 
        
        
        while(true)
        {
        // Menu 
        
        System.out.println("\t Menu Opciones\n");
        System.out.println("\t Consulta Por Telefono: Opcion 1");
        System.out.println("\t Consulta Por Nombre: Opcion 2");
        System.out.println("\t Finalizar Consulta: Opcion 3\n");
        
        // Consulta
        Scanner Consulta = new Scanner(System.in);
        
        
        System.out.print("Digite la opcion Deseada: ");
        int Op = Opcion.nextInt();
            switch (Op)
            {
                
                case 1:
                {
                    System.out.print("Digite El Telefono a consultar: ");
                    String NombreEncontrado = Consulta.nextLine(); // Recibir el dato que se va ir a los metodos
                    BuscarTelefono(NombreEncontrado, nombre, telefono); // Cargar datos del metodo
                    break;
                }
                case 2:
                {
                    System.out.print("Digite El Nombre a consultar: ");
                    String TelefonoEncontrado = Consulta.nextLine();
                    BuscarNombre(TelefonoEncontrado, nombre, telefono); // Cargar datos del metodo
                    break;
                }
                case 3:
                {
                    System.out.print("Finalizo la consulta");
                    break;
                }
                default: 
                        {
                            System.out.print("Esta opción no esta disponible...");
                            break;
                        }
            }
                  
                    
        }
        
        
 
    }
    // Cargar Datos
    public static void BuscarDatos(File Contactos, String nombre [], String telefono[])
        {
           try{
                BufferedReader leerArchivo = new BufferedReader(new FileReader(Contactos)); // leer archivos linea por linea
               
                   
                   String LineaLeida;
                   int lineasTotales = 0;
                   
                   // Mientras no se null
                   
                   while ((LineaLeida = leerArchivo.readLine()) != null && lineasTotales < nombre.length)
                   {
                       //Aumenta el contador de lineas
                       
                       
                       // Separa la linea en un arreglo de palabras
                       //Recorres el arreglo
                       String[] partes = LineaLeida.split(","); // dividir cada linea
                       nombre[lineasTotales] = partes[0];
                       telefono[lineasTotales] = partes[1];
                       lineasTotales ++;
                       
                       
                       
                   }
                   leerArchivo.close();
               
           
               
           }catch(IOException e){
               System.out.println("Error al leer Archivo");
               e.printStackTrace();
                       
                       }
           } // Cierre main
    
    // Buscar nombre
    
    public static void BuscarNombre(String nombres, String nombre [], String telefono[] ) // buscar el valor de nombres en el arreglo nombre[]
    {
        boolean Caso = false;
        // Recorres el arreglo nombre
        for(int i=0; i<nombre.length; i++)
        {
            if(nombre[i] != null && nombre[i].equalsIgnoreCase(nombres)) // Nombre[i]Guarda cualquier nombre sin importar las mayusculas que tenga
            {
                System.out.println("Nombre:  "+nombre[i] + " - telefono:  " + telefono [i]);
                Caso = true; // ecuentra coincidencia
                break; // Cerra el cierra el ciclo
            }
            if(!Caso) // no encuentra coincidencia
            {
                System.out.println("El nombre no se encuentra en la lista");
                break;
            }
        }
    }
    // Bucar Telefono
    public static void BuscarTelefono(String telefonos, String nombre [], String telefono[] )
    {
        boolean Caso = false;
        // Recorres el arreglo telefono
        for(int i=0; i<nombre.length; i++)
        {
            if(telefono[i] != null && telefono[i].equalsIgnoreCase(telefonos)) // Nombre[i]Guarda cualquier nombre sin importar las mayusculas que tenga
            {
                System.out.println("Nombre:  " +nombre[i] + " - telefono:  " + telefono [i]);
                Caso = true;
                break; // Cerra el cierra el ciclo
            }
            if(!Caso)
            {
                System.out.println("El nombre numero telefonico en la lista");
                break;
            }
        }
    }
    
        } // Cierre clase
    
