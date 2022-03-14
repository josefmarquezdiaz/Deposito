/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;

/**
 * Clase que gestiona los datos de una cuenta bancaria
 * @author José Franciso Márquez Díaz
 */
public class CCuenta {

    /**
     * Atributo nombre del titular de la cuenta
     */
    private String nombre;
    
    /**
     *  Atributo cuenta
     */
    private String cuenta;
    
    /**
     * Atributo que indica el saldo de la cuenta
     */
    private double saldo;
    
    /**
     * Atributo que indica el tipo de interés de la cuenta
     */
    private double tipoInterés;


    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    
//    public void asignarNombre(String nom)
//    {
//        setNombre(nom);
//    }

//    public String obtenerNombre()
//    {
//        return getNombre();
//    }

    /* Comentamos este método porque no es la forma correcta de acceder al 
    atributo de la clase */
//    public double estado()
//    {
//        return saldo;
//    }


    /**
     * Método para ingresar saldo a la cuenta
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar saldo de la cuenta
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        // if (estado()< cantidad) Utilizaremos el atributo de clase
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }


//    public String obtenerCuenta()
//    {
//        return cuenta;
//    }

    /**
     * Método que devuelve el atributo nombre
     * @return String nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que modifica el atributo nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el atributo tipo interés
     * @return double tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método que modifica el atributo tipo de interés
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Método que devuelve el atributo cuenta
     * @return String cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método que modifica el atributo cuenta
     * @param cuenta 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el atributo saldo
     * @return double saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que modifica el atributo saldo
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
