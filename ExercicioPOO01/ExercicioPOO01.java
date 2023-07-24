package exerciciopoo01;

public class ExercicioPOO01 {

   
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Roberto");
        p1.setDataNascimento(1992);
        p1.setAltura(1.72f);
        p1.calculoIdade();
        
        p1.STATUS();
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Amanda");
        p2.setDataNascimento(1992);
        p2.setAltura(1.59f);
        p2.calculoIdade();
        
        p2.STATUS();
   
        
    }
    
}
