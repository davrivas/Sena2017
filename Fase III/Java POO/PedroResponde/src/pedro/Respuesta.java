package pedro;
import java.util.Random;

public class Respuesta {
    private String rtaAleatoria = "";
    private int num = 0;

    public String respuestas() {
        Random random = new Random();
        num = random.nextInt(10);
        
        switch (num) {
            case 1:
                rtaAleatoria = "Te voy a halar las patas";
                break;
                
            case 2:
                rtaAleatoria = "Alguien del más allá";
                break;
                
            case 3:
                rtaAleatoria = "No quiero responder esta pregunta";
                break;
                
            case 4:
                rtaAleatoria = "Estoy detrás tuyo";
                break;
                
            case 5:
                rtaAleatoria = "Voy a matar a tu apá y a tu amá";
                break;
                
            case 6:
                rtaAleatoria = "Necesito bisio de calidad";
                break;
                
            case 7:
                rtaAleatoria = "Que te importa";
                break;
                
            case 8:
                rtaAleatoria = "No sé";
                break;
                
            default:
                rtaAleatoria = "Que pregunte otra persona, no estoy comodo";
        }
        
        return rtaAleatoria;
    }
}
