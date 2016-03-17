/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Estudiante;
import Modelo.Registro;
import Vista.GUI_Botones;
import Vista.ManipulaEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Controlador_Mantenimiento_Estudiante implements ActionListener {

   
    
    Estudiante estudiante;
    private ManipulaEstudiantes manipulaEstudiantes;
    Registro registro;
    
    public Controlador_Mantenimiento_Estudiante(Estudiante estudiante,ManipulaEstudiantes manipulaEstudiantes, Registro registro) {
        this.manipulaEstudiantes = manipulaEstudiantes;  
        this.registro = registro;
        this.estudiante = estudiante;
        
    }//Fin constructor

    public Controlador_Mantenimiento_Estudiante(Estudiante estudiante, GUI_Botones aThis, Registro registro) {
        
    }

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getActionCommand().equals("Agregar")){
       
            estudiante= new Estudiante(manipulaEstudiantes.getTxtCarnet(),manipulaEstudiantes.getTxtNombre(),manipulaEstudiantes.getTxtCorreo());   
            registro.ingresarEstudiante(estudiante);
           
             JOptionPane.showMessageDialog(null,"Se ha ingresado un estudiante");
       }
        if(ae.getActionCommand().equals("Buscar")){
            
           registro.verificarID(manipulaEstudiantes.getTxtCarnet());
           estudiante = registro.buscarEstudiante(manipulaEstudiantes.getTxtCarnet());
           manipulaEstudiantes.setTxtNombre(estudiante.getNombre());
           manipulaEstudiantes.setTxtCarnet(estudiante.getCarnet());
            manipulaEstudiantes.setTxtCorreo(estudiante.getCorreo());
            
       
       }
        
          if(ae.getActionCommand().equals("Eliminar")){
       
        registro.eliminarEstudiante(manipulaEstudiantes.getTxtCarnet());
        JOptionPane.showMessageDialog(null, "Eliminado exitosamente");	
       }
          
            if(ae.getActionCommand().equals("Modificar")){
        
                manipulaEstudiantes.jtCarnet.setEditable(true);
		
                 registro.verificarID(manipulaEstudiantes.getTxtCarnet());
		 
                     estudiante.setNombre(manipulaEstudiantes.getTxtNombre());
                    estudiante.setNombre(manipulaEstudiantes.getTxtCorreo());
                    JOptionPane.showMessageDialog(null, "Modificado exitosamente");
       
       }
       
        
      
    }//Fin ActionPerformed///
    
}
