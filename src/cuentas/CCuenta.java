/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;


public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;


    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    public String obtenerNombre()
    {
        return getNombre();
    }

    /* Comentamos este método porque no es la forma correcta de acceder al 
    atributo de la clase */
//    public double estado()
//    {
//        return saldo;
//    }


    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        // if (estado()< cantidad) Utilizaremos el atributo de clase
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }


    public String obtenerCuenta()
    {
        return cuenta;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getTipoInterés() {
        return tipoInterés;
    }


    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}