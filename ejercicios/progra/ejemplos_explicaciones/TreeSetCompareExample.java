import java.util.TreeSet;
import java.util.Comparator;

// Clase Persona con nombre y edad
class Persona {
    String nome;
    int idade;

    public Persona(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + ")";
    }
}

// Implementamos Comparator para comparar Personas por idade
class ComparadorPorIdade implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        int compIdade = Integer.compare(p1.idade, p2.idade);
        if (compIdade != 0) {
            return compIdade;
        }
        // Si la edad es igual, comparar por nombre para diferenciar
        return p1.nome.compareTo(p2.nome);
    }
}


public class TreeSetCompareExample {
    public static void main(String[] args) {
        // Creamos un TreeSet que ordena Personas por su edad usando el comparador definido
        TreeSet<Persona> persoas = new TreeSet<>(new ComparadorPorIdade());

        persoas.add(new Persona("Ana", 30));
        persoas.add(new Persona("Luis", 25));
        persoas.add(new Persona("Carlos", 30));
        persoas.add(new Persona("Bea", 20));

        // Imprimir el TreeSet
        System.out.println("Personas ordenadas por idade:");
        for (Persona p : persoas) {
            System.out.println(p);
        }
    }
}

