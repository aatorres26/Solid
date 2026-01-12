/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solid_s;

/**
 *
 * @author User
 */
public class SOLID_S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Militar militar = new Militar();
        militar.ingresarMilitar();
        GuardarEmpleado guardar= new GuardarEmpleado();
        guardar.guardar();
        MostrarDatos mostrar = new MostrarDatos();
        mostrar.mostrar(militar);
    }
    
}
