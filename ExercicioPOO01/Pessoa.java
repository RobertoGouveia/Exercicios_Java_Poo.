package exerciciopoo01;


public class Pessoa {
    private String nome;
    private int dataNascimento, idade;
    private float altura;

    public void calculoIdade(){
        this.idade = 2023 - this.getDataNascimento();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void STATUS(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade() + " Anos");
        System.out.println("Altura: " + this.getAltura());
    }  
}
