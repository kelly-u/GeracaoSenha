package geracaosenha.decorator;

public class SenhaSimples extends Senha {

    @Override
    public void decorarSenha() {
        System.out.println("Decorou senha simples");
    }
    
}
