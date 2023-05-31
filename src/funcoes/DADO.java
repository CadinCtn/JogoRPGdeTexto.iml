package funcoes;
import java.util.Random;

public class DADO {

    public static byte dado = (byte) d20();
    public static int d20() {
        Random d20 = new Random();
        return d20.nextInt(19)+1;
    }
}