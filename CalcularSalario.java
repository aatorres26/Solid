/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid_s;

/**
 *
 * @author User
 */
public class CalcularSalario {
    public double calcular(Militar militar){
        return militar.getSemanas()*militar.getPago();
    }
}
