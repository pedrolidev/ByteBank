public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        // conta.numero = 1337;
        // conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente caio = new Cliente();
        // conta.titular = caio;
        caio.setNome("Caio Ferreira");

        conta.setTitular(caio);

        System.out.println(conta.getTitular().getNome());

    conta.getTitular().setProfissao("Progamador");
    // agora em duas linhas:
    Cliente titularDaConta = conta.getTitular();
    titularDaConta.setProfissao("Programador");

    System.out.println(titularDaConta);
    System.out.println(caio);
    System.out.println(conta.getTitular());

    }
}
