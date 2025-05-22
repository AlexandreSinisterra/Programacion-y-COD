package progra.boletines.boletin11.ejercicio2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Ejemplos de creación de fechas (algunas inválidas)
        Data fecha1 = new Data(29, 2, 2020); // Válido (año bisiesto)
        Data fecha2 = new Data(31, 4, 2022); // Inválido (mostrará error)
        Data fecha3 = new Data(15, 13, 2021); // Inválido (mostrará error)
        Data fecha4 = new Data(1, 1, 3000); // Inválido (mostrará error)

        // Mostramos las fechas
        fecha1.mostrarData();
        fecha2.mostrarData();
        fecha3.mostrarData();
        fecha4.mostrarData();
    }
}