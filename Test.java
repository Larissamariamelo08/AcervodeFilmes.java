
//Arquivo de teste para ver se o código roda.
public class Test {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro("João", "08417006307", 123456789, 18, "joao", "123", "Plano Simlples");
        System.out.println(cadastro.getCpf());
    }
}
