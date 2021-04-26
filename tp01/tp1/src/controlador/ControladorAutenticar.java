
package controlador;

import vista.ActualizarOrdenes;
import vista.AutenticacionUsuario;
import vista.OrdenesProduccion;


public class ControladorAutenticar {

    public static void botonAcceso(ActualizarOrdenes actualiza) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       AutenticacionUsuario autenticar = new AutenticacionUsuario();
       
       public static void botonAcceso(AutenticacionUsuario autenticar){
           
           String user = autenticar.getTxtUsuario().getText();
           String pass = autenticar.getTxtContraseña().getText();


        if(user.equals(autenticar.getUsuario()) && pass.equals(autenticar.getContraseña())){
            
            OrdenesProduccion orden = new OrdenesProduccion();
            orden.setVisible(true);
            System.out.println("Conecto con mensajeria satisfractoriamente ...");
            
        }           
           
       }
    
}
