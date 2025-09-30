import br.edu.unicesumar.classes.Corrente;
import br.edu.unicesumar.classes.Conta;
import br.edu.unicesumar.classes.Poupanca;

public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Poupanca();
        conta.sacar();
    }
}