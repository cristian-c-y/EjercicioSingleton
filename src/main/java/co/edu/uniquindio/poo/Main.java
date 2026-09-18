package co.edu.uniquindio.poo;


public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Cristian");
        Funcion funcion = new Funcion("Spiderman");
        Combo combo = new Combo("Combo Grande");

        // Compra mínima
        Compra compraMinima = new Compra.Builder()
                .conCliente(cliente)
                .conFuncion(funcion)
                .conAsiento("A1")
                .build();

        System.out.println("Compra mínima creada correctamente");


        // Compra completa
        Compra compraCompleta = new Compra.Builder()
                .conCliente(cliente)
                .conFuncion(funcion)
                .conAsiento("A1")
                .conAsiento("A2")
                .conCombo(combo)
                .conPuntos(100)
                .build();

        System.out.println("Compra completa creada correctamente");
    }
}