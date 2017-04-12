/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;

/**
 *
 * @author familia
 */
public abstract class Salario  {
    private long salarioBase;
    private long bono;
    private long deducciones;
    private long extras;
    private long salarioDevengado;
    
    public abstract long calcularSalario(String tipoContrato);
    
    
}
