package com.edu.ec.reservas;

public class NotificacionService {

    public void Notificar(String correo , String asunto , String mensaje ) {
        System.out.println(" Correo enviado a :" + correo);
        System.out.println("Asunto :" + asunto);
        System.out.println("Mensaje :" + mensaje);
        System.out.println(" Correo enviado con exito......");
    }
}
