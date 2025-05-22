package progra.boletines.boletin12;

import java.io.*;

public class Agenda {

    private Cliente[] listado;

    public Agenda() {
        this.listado = CargarClientes();
    }

    public Cliente[] getListado() {

        return listado;
    }

    public void setListado(Cliente[] listado) {
        this.listado = listado;
    }



    public static int ContaClientes(){
        int contador = 0;
        try(BufferedReader br= new BufferedReader(new FileReader("Notas.txt"))){
            String linea;
            while ((linea= br.readLine())!=null){
                contador++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contador;
    }

    public static Cliente[] CargarClientes(){
        Cliente[] clientes = new Cliente[ContaClientes()];
        try(BufferedReader br = new BufferedReader(new FileReader("Notas.txt"))){
            String linea;
            int i = 0;
            while ((linea=br.readLine())!=null){
                String [] datos = linea.split(" ");
                clientes[i] = new Cliente(Integer.parseInt(datos[0]),(datos[1]),Integer.parseInt(datos[2]));
                i++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return clientes;
    }

    public void ModificarDatos(int id, Cliente novosDatos) {

        for (int i = 0; i < this.listado.length; i++) {
            if (listado[i].getId() == id) {

                listado[i] = novosDatos;
            }
        }
        EscribirDatos(listado);
        listado = CargarClientes();


    }
    public void EscribirDatos(Cliente[] lista){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Notas.txt"))){

            for (int i = 0; i<lista.length;i++){
                if(lista[i].getId()==-1){
                    continue;
                }
                String linea=lista[i].getId()+" "+lista[i].getNome()+" "+lista[i].getTelefono();
                bw.append(linea);
                bw.newLine();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void EliminarCliente(int id){

        for (int i = 0; i < this.listado.length; i++) {
            if (listado[i].getId() == id) {

                listado[i].setId(-1);
            }
        }
        EscribirDatos(listado);
    }

    public void MostrarCliente (){

        try(BufferedReader br = new BufferedReader(new FileReader("Notas.txt"))){
            String linea ;
            while ((linea=br.readLine())!=null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void AñadirCliente(Cliente novosDatos){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Notas.txt",true))){
            bw.append(novosDatos.getId()+" "+novosDatos.getNome()+" "+novosDatos.getTelefono());
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        listado=CargarClientes();
    }

}