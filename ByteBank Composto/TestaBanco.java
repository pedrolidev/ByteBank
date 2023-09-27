public class TestaBanco {

    public static void main(String[] args) {
        Cliente  pedro = new Cliente();
        pedro.nome = "Pedro Oliveira";
        pedro.cpf = "222.222.222-22";
        pedro.profissao = "programador";

        Conta contaDoPedro = new Conta();
        contaDoPedro.deposita(100);

        // Associa o cliente pedro a conta contaDoPedro
        contaDoPedro.titular = pedro;
        
        System.out.println(contaDoPedro.titular.nome);
        System.out.println(contaDoPedro.titular);
        System.out.println(pedro);

    }
}
