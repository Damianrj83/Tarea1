/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ArrayList{
    
    private ArrayList<Estudiante> arrayList;
            

public ArrayList(){
    
arrayList = new ArrayList<Estudiante>(); 

}//Fin del constructor

//*************************************************************************************************************
public void ingresarEstudiante(Estudiante estudiante){
arrayList.add(estudiante); 
JOptionPane.showMessageDialog(null,"Ingreso Correcto");
}


public boolean verificarID(String carnet){
Boolean existe= false;
for(int index=0;index<arrayList.size();index++){
  if(arrayList.get(index).getCarnet().equals(carnet)){
  existe=true;
  }//Fin del if
  break;
}//Fin del for
 if(existe==false){
  JOptionPane.showMessageDialog(null,"Este numero de cedula no pertenece a nigun registro.\nIngrese de nuevo el numero de cedula por favor.");
 }//Fin del if
return existe;
}//Fin del meetodo verificarID
//*************************************************************************************************************

public Estudiante buscarEstudiante(String carnet){
    
  Estudiante estudiante= null;
  for(int i=0;i<arrayList.size();i++){
  if(arrayList.get(i).getCedula().equals(carnet)){
  estudiante= arrayList.get(i);
     }//Fin del if
  }//Fin del for
return estudiante;
}//Fin del metodo BuscarCliente
    }//Fin clase
