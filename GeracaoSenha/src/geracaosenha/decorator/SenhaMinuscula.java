package geracaosenha.decorator;

import java.util.Random;

public class SenhaMinuscula extends Decorator {
    
    public SenhaMinuscula(Senha decorates) {
        super(decorates);
    }
    
    public String decorarSenhaMinusculo(int tam, String tipoSenha){
        System.out.println("Decorou com minuscula.");
        return super.decorarSenha(tam, tipoSenha);
    }
    
    @Override
    public String decorarSenha(int t, String tipoSenha){
        super.decorarSenha(0, "");
        decorarSenhaMinusculo(0, "");
        return "";
    }    
}
