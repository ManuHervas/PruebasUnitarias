
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarias;

/**
 *
 * @author Manuel
 */
public class VideoJuego {
    
    public String clasificacion(String tipo){
        
        String clasificacion="";
        
        if (tipo.equalsIgnoreCase("niños")) {
            clasificacion="+3";
            
        }else if(tipo.equalsIgnoreCase("jovenes")){
            clasificacion="+13";
            
        }else if(tipo.equalsIgnoreCase("adolescentes")){
            clasificacion="+16";
        }else if(tipo.equalsIgnoreCase("adultos")){
            clasificacion="+18";
        }else{
            clasificacion="no encontrada";
        }
        
        return clasificacion;
    }
    
    public double precioEnvio(double precio){
        double coste, impuesto, ganancias;
        impuesto= precio* 0.21;
        ganancias = precio * 0.22;
        
        coste = precio + impuesto + ganancias;
        
        return coste;
        
    }
    
}
