package geracaosenha.decorator;

public class SenhaSimples extends Senha {

    @Override
    public String decorarSenha(int t, String tipoSenha) {
        System.out.println("Decorou senha simples");
        return "";
    }
    
}
