package geracaosenha.decorator;

import java.util.Random;

public class SenhaMaiuscula extends Decorator {

    public SenhaMaiuscula(Senha decorates) {
        super(decorates);
    }

    public String decorarSenhaMaiusculo(int tam, String tipoSenha) {
        
        System.out.println("Decorou com maiúscula.");
        return super.decorarSenha(tam, tipoSenha);
    }

    @Override
    public String decorarSenha(int t, String tipoSenha) {
        super.decorarSenha(0, "");
        decorarSenhaMaiusculo(0, "");
        return "";
    }

}
