import com.edu.ec.reservas.Reserva;
import com.edu.ec.reservas.ReservaService;

public class App {
    public static void main(String[] args) throws Exception {
        Reserva reserva = new Reserva("Erick Capa", "dos", 300.00, "erickcapa@uce.edu.ec", 20);
        ReservaService reservaService = new ReservaService();
        reservaService.Realizar_Reserva(reserva);
    }
}
