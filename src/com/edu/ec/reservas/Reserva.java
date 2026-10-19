package com.edu.ec.reservas;

public class Reserva {
    private String cliente ;
    private String Habitaciones;
    private double total ;
    private String correo;
    private int parqueadero;


    
    public Reserva(String cliente, String habitaciones, double total, String correo, int parqueadero) {
        this.cliente = cliente;
        Habitaciones = habitaciones;
        this.total = total;
        this.correo = correo;
        this.parqueadero = parqueadero;
    }
    public String getCliente() {
        return cliente;
    }
    public String getHabitaciones() {
        return Habitaciones;
    }
    public double getTotal() {
        return total;
    }
    public String getCorreo() {
        return correo;
    }
    public int getParqueadero() {
        return parqueadero;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public void setHabitaciones(String habitaciones) {
        Habitaciones = habitaciones;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setParqueadero(int parqueadero) {
        this.parqueadero = parqueadero;
    }
    

}
