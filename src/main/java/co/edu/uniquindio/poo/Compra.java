package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;

public class Compra {

    private final Cliente cliente;
    private final Funcion funcion;
    private final List<String> asientos;
    private final Combo combo;
    private final int puntosRedimidos;

    // Constructor privado
    private Compra(Builder b) {
        this.cliente = b.cliente;
        this.funcion = b.funcion;
        this.asientos = new ArrayList<>(b.asientos);
        this.combo = b.combo;
        this.puntosRedimidos = b.puntosRedimidos;
    }

    // Builder
    public static class Builder {

        // Obligatorios
        private Cliente cliente = null;
        private Funcion funcion = null;
        private List<String> asientos = new ArrayList<>();

        // Opcionales
        private Combo combo = null;
        private int puntosRedimidos = 0;

        public Builder conCliente(Cliente c) {
            this.cliente = c;
            return this;
        }

        public Builder conFuncion(Funcion f) {
            this.funcion = f;
            return this;
        }

        public Builder conAsiento(String asiento) {
            this.asientos.add(asiento);
            return this;
        }

        public Builder conCombo(Combo combo) {
            this.combo = combo;
            return this;
        }

        public Builder conPuntos(int puntos) {
            this.puntosRedimidos = puntos;
            return this;
        }

        public Compra build() {

            if (cliente == null) {
                throw new LlegaLaException("El cliente es obligatorio");
            }

            if (funcion == null) {
                throw new LlegaLaException("La función es obligatoria");
            }

            if (asientos.isEmpty()) {
                throw new LlegaLaException("Debe seleccionar al menos un asiento");
            }

            return new Compra(this);
        }
    }
}