package Atv11P2;
public class Info {
    private String nome;
    private String conta;
    private double saldo;

    public double Sub(double n1, double n2){
        return n1-n2;
    }

    public double Soma(double depo,double sal){
        return depo + sal;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
