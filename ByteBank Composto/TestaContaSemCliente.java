public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta contaDoLuiz = new Conta();
        System.out.println(contaDoLuiz.getSaldo());

        contaDoLuiz.titular = new Cliente();
        System.out.println(contaDoLuiz.titular);

        contaDoLuiz.titular.nome = "Luiz";
        System.out.println(contaDoLuiz.titular.nome); //
    }
}
