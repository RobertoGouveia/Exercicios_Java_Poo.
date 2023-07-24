package ContaCorrente;


public class ContaCorrente {
        
    private int numConta;
    private String nome;
    private int saldo;
    
    //Métodos
    public void alterarNome(){
    
    }
    public void deposito(){
    
    }
    public void saque(){
    
    }

    public ContaCorrente(int numConta, String nome, int saldo) {
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
}
