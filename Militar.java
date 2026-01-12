/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid_s;
import java.util.*;
/**
 *
 * @author User
 */
public class Militar{
    private String nombre;
    private String grado;
    private double semanas;
    private double pago;

    Scanner sc= new Scanner(System.in);

    public Militar() {
    }

    public Militar(String nombre, String grado, double semanas, double pago) {
        this.nombre = nombre;
        this.grado = grado;
        this.semanas = semanas;
        this.pago = pago;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getSemanas() {
        return semanas;
    }

    public void setSemanas(double semanas) {
        this.semanas = semanas;
    }

 


 
    public void ingresarMilitar(){
        System.out.println("Ingresa el nombre del militar: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa su grado: ");
       grado= sc.nextLine();
        System.out.println("Ingresa el pago que recibira cada semana segun su grado: ");
        pago= sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresa las semanas trabajadas");
        semanas= sc.nextDouble();
        sc.nextLine();
    }
    
    
    
    
    
    
    
}
