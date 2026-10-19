package com.edu.ec.reservas;

public class ReservaService {

    public void Realizar_Reserva(Reserva reserva) {
        System.out.println(" Realizando Reserva del Hotel ");
        System.out.println("Reserva realizada por el cliente :" + reserva.getCliente());
        System.out.println("Reserva :" + reserva.getHabitaciones());
        System.out.println("Total a cancelar: "+ reserva.getTotal());
        System.out.println(" Correo :" + reserva.getCorreo());
        System.out.println(" Parqueadero N :" + reserva.getParqueadero());

        NotificacionService notificacionService = new NotificacionService();
        String Asunto = " Confirmacion del pedido";
        String mensaje = "Estimado " + reserva.getCliente() + ", su reserva de " + reserva.getHabitaciones() + " habitaciones por el total de " + reserva.getTotal() + " ha sido realizado con exito" ;
        notificacionService.Notificar(reserva.getCorreo(), Asunto, mensaje);
    }


}
