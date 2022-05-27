/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitarias;

/**
 *
 * @author SI
 */
public class Barañon {
    
    public void compra(String bebida, double litros){
        double precioLitro;
        double total;
        if (bebida.equalsIgnoreCase("coca cola")) {
            precioLitro=0.80;
            total = litros * precioLitro;
            System.out.println("El precio será: " + total);
        }else if(bebida.equalsIgnoreCase("fanta toronja")){
            precioLitro=0.70;
            total= litros * precioLitro;
            System.out.println("El precio será: " + total);
        }else if(bebida.equalsIgnoreCase("fanta limon")){
            precioLitro=0.75;
            total=litros*precioLitro;
            System.out.println("El precio será: " + total);
        }else if(bebida.equalsIgnoreCase("nestea")){
            precioLitro=0.90;
            total=litros * precioLitro;
            System.out.println("El precio será: " + total);
        }else{
            
            System.out.println("Bebida no disponible");
        }
    }
    
}
