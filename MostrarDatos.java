/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid_s;

/**
 *
 * @author User
 */
public class MostrarDatos {
    public void mostrar(Militar militar){
        CalcularSalario salario = new CalcularSalario();
        System.out.println("======REPORTE DE EMPLEADO======");
        System.out.println("Nombre: "+militar.getNombre());
        System.out.println("Departamento: "+militar.getGrado());
        System.out.println("Salario: $"+ salario.calcular(militar));
    }
}
