public class Professor extends Pessoa {

    public Professor(String nome) {
        super(nome);
    }

    public void darAula() {
        System.out.println("O professor " + nome + " está dando aula.");
    }
}