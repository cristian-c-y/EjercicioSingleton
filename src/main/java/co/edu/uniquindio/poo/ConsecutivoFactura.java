package co.edu.uniquindio.poo;

public class ConsecutivoFactura {

    private int ultimo;

    private static final ConsecutivoFactura INSTANCIA =
            new ConsecutivoFactura();

    private ConsecutivoFactura() {

    }

    public static ConsecutivoFactura getInstancia() {
        return INSTANCIA;
    }

    public int siguiente(){
        ultimo ++;
        return ultimo;
    }
}
