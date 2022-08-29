
package POO2;

import static java.lang.System.in;
import java.util.Scanner;


public class Main2 
{
    public static void main(String [] args)
    {
        int opcion = 0 ;
        int contador = 0; //Para ver en que numero de elemento va el arreglo
        Scanner entrada = new Scanner(System.in);
        Dispositivo[] arreglo1 = new Dispositivo[20]; //Arreglo
        String tipo = "";
        String folio = "";
        float medidaPantalla = 0;
               
        for(int i = 0; i < arreglo1.length; i++)
        {
            arreglo1[i] = new Dispositivo(tipo,folio,medidaPantalla);
        }
        
        do
        {

            //int opcion2 = 0;
            
            System.out.println("\n\t\t\tBienvenido al programa de arreglos");
            System.out.println("\n\n\t\tQue opcion desea realizar?");
            System.out.println("1. Registar");
            System.out.println("2. Buscar");
            System.out.println("3. Consultar");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcion)
            {
                //Registrar
                case 1:
                  if(contador == 20) //Para que no se pase a mas de 20 
                  {
                      System.out.println("\tUsted ha colocado mas elementos registrados");
                  }
                  else{
                    System.out.println("\tComience a registrar los elementos (Recuerde que hay un limite de elementos)\n");
                    
                    System.out.println("\n\tEl Dispositivo en el que esta es: N = "+contador);
                    
                    System.out.println("\n\tDe que tipo es el dispositivo?.");                   
                    arreglo1[contador].setTipo(entrada.nextLine()); //Guarda la variable
                    entrada.nextLine();    
                    
                    
                    System.out.println("\n\tCual es el folio del dispositivo?");
                    arreglo1[contador].setFolio(entrada.nextLine());
                    entrada.nextLine();    
                    
                    System.out.println("\n\tCual es la medida de pantalla?(en pulgadas)");                   
                    arreglo1[contador].setMedidaPantalla(entrada.nextFloat());
                    entrada.nextLine(); //Este sirve para que no se salte las variables
                    
                    System.out.println("\n\tTipo:"+arreglo1[contador].getTipo()); //Este lo pongo para que pueda guardar correctamente el atributo
                    contador++;
                  }
                    break;
                  
                
                //Buscar
                case 2:
                    
                    int opcion2 = 0;
                    
                    //El atributo al que desea buscar
                    System.out.println("\n");
                    System.out.println("Que atributo desea buscar?"); 
                    System.out.println("1. tipo");
                    System.out.println("2. Folio");
                    System.out.println("3. medida de pantalla");
                    System.out.println("4. Salir");
                    opcion2 = entrada.nextInt();
                    entrada.nextLine();
                    
                    switch(opcion2)
                    {
                        case 1:
                            String tipoBusqueda;
                            
                            System.out.println("\n\tBusqueda del tipo de dispositivo ");
                            System.out.println("El tipo de dispositivo que se va a buscar");
                            tipoBusqueda = entrada.nextLine(); //Aqui se busca la variable
                            
                           //Despues imprime los valores del atributo al que estamos buscando y recorre el arreglo
                            for(int i = 0; i < contador ; i++) 
                            {
                                //Este sirve para si coincide el elemento que estamos buscando pueda pasar lo de la parte de abajo
                                if(tipoBusqueda.equals(arreglo1[i].getTipo()))
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Tipo: "+arreglo1[i].getTipo());
                                    System.out.println("Folio: "+arreglo1[i].getFolio());
                                    System.out.println("Medida de pantalla: "+arreglo1[i].getMedidaPantalla());
                                    System.out.println("\n");
                                    
                                    //Para modificar los datos de los atributos menos el que buscas
                                    System.out.println("Cambiar Folio: ");
                                    arreglo1[i].setFolio(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar la Medida de pantalla: ");
                                    arreglo1[i].setMedidaPantalla(entrada.nextFloat());
                                    
                                }
                                else{}   
                            }
                            break;
                        
                        case 2:
                            String FolioBusqueda;
                            System.out.println("\n");
                            System.out.println("\n\tBusqueda del Folio de dispositivo ");
                            System.out.println("El Folio del dispositivo que se va a buscar");
                            FolioBusqueda = entrada.nextLine();
  
                            for(int i = 0; i < contador ; i++)
                            {
                                if(FolioBusqueda.equals(arreglo1[i].getFolio()))
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Tipo: "+arreglo1[i].getTipo());
                                    System.out.println("Folio: "+arreglo1[i].getFolio());
                                    System.out.println("Medida de pantalla: "+arreglo1[i].getMedidaPantalla());
                                    System.out.println("\n");
                                    
                                    //Para modificar los datos de los atributos menos el que buscas
                                    System.out.println("Cambiar Tipo: ");
                                    arreglo1[i].setTipo(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar la Medida de pantalla: ");
                                    arreglo1[i].setMedidaPantalla(entrada.nextFloat());
                                    
                                }
                                else{}
                            }   
                            break;
                        
                        case 3:
                            float pantallaBusqueda;
                            System.out.println("\n");
                            System.out.println("\n\tBusqueda de la medida de pantalla del dispositivo ");
                            System.out.println("cual es la medida de pantalla del dispositivo que se va a buscar");
                            pantallaBusqueda = entrada.nextFloat();
  
                            for(int i = 0; i < contador ; i++)
                            {
                                if(pantallaBusqueda == arreglo1[i].getMedidaPantalla())
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Tipo: "+arreglo1[i].getTipo());
                                    System.out.println("Folio: "+arreglo1[i].getFolio());
                                    System.out.println("Medida de pantalla: "+arreglo1[i].getMedidaPantalla());
                                    System.out.println("\n");
                                    
                                    //Para modificar los datos de los atributos menos el que buscas
                                    System.out.println("Cambiar Tipo: ");
                                    arreglo1[i].setTipo(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar el Folio: ");
                                    arreglo1[i].setFolio(entrada.nextLine());  
                                    entrada.nextLine();
                                }
                                else{}
                            }   
                            break;
                        
                        case 4:
                            break;
                    
                        default: System.out.println("Ustede escribio inserto un numero o caracter incorrecto");
                    }
                            
                    break;
                    
                    
                //Mostrar    
                case 3:
                    //Imprime todos los elementos del arreglo
                    for(int i = 0; i < contador; i++)
                    {   
                    System.out.println("\t\t\nLos datos del arreglo son:");    
                    System.out.println("El tipo de dispositivo es : "+arreglo1[i].getTipo()+" , "+" La posicion es: "+i);   
                    System.out.println("El folio es : "+arreglo1[i].getFolio()+" , "+" La posicion es: "+i);
                    System.out.println("La medida de la pantalla es pulgada es : "+arreglo1[i].getMedidaPantalla()+" , "+" La posicion es: "+i);       
                    }                 
                    break;
                    
                //Salir    
                case 4:
                    System.out.println("Que tenga buen dia:)");
                    
                    break;
                    
                default: System.out.println("Ustede escribio inserto un numero o caracter incorrecto");
            }
            
        }while(opcion != 4);
             
    }
}
