package controlador;

import javax.swing.table.DefaultTableModel;
import vista.OrdenesProduccion;


public class ControladorOrdenes {
    
    public static void parar(OrdenesProduccion vista){
        int idx = vista.getTablaOrden().getSelectedRow();
        if (idx > -1){
            DefaultTableModel datos = (DefaultTableModel) vista.getTablaOrden().getModel();
            Object[] fila = new Object[4];
            fila[3] = "PAUSADO";
            datos.addRow(fila);             
        }        
    }
    
}
