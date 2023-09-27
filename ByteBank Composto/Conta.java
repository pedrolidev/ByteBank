public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

    // criação de um método java (sem retorno)
    public void deposita(double valor) {
        this.saldo += valor;
    }

    // método com retorno
    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino, Conta origem) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
            return false;
    }

    public double getSaldo() {
        return this.saldo;
    }
}