/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package unitarias;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        videoJuegos();
        
    }
    
    public static void videoJuegos(){
        Scanner sc = new Scanner(System.in);
        String nombre, publico, clasificacion;
        double precio, total;
        System.out.println("Clasificador de video juegos");
        System.out.println("Ingrese el titulo del juego");
        nombre = sc.next();
        System.out.println("Ingrese quienes pueden jugarlo: niños, jovenes, adolescentes, adultos");
        publico= sc.next();
        System.out.println("Ingrese el precio del juego");
        precio = sc.nextDouble();
        VideoJuego meto = new VideoJuego();
        clasificacion = meto.clasificacion(publico);
        total = meto.precioEnvio(precio);
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Los datos del video juego son: ");
        
        System.out.println("titulo: " + nombre);
        System.out.println("clasificación: " + clasificacion);
        System.out.println("precio total: " + total);
        
        System.out.println("-----------------------------------");
        
        
        
        
    }
    
    public static void cesta(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba la bebida que quiere comprar, opciones:");
        System.out.println("cocacola, fanta, 7up, nestea");
        String bebida= sc.next();
        System.out.println("Escriba los litros que quiere comprar");
        double litros= sc.nextDouble();
        Barañon bara = new Barañon();
        bara.compra(bebida, litros);
    }
    
}


