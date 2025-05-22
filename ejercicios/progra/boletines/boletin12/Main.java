package progra.boletines.boletin12;

import com.sun.security.jgss.GSSUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.AñadirCliente(new Cliente(8,"Guimacancro",1421223));
        agenda.AñadirCliente(new Cliente(10,"Anton",14223));
        agenda.AñadirCliente(new Cliente(11,"Saul",1223));
        agenda.AñadirCliente(new Cliente(12,"Pato",123));
        agenda.MostrarCliente();
        System.out.println();
        agenda.EliminarCliente(8);
        agenda.EliminarCliente(10);
        agenda.EliminarCliente(11);
        agenda.MostrarCliente();

    }
}