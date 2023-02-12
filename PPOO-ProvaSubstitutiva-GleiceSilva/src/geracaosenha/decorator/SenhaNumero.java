package geracaosenha.decorator;

public class SenhaNumero extends Decorator {
    
    public SenhaNumero(Senha decorates) {
        super(decorates);
    }
    
    public String decorarSenhaNumero(int tam, String tipoSenha){
        return super.decorarSenha(tam, tipoSenha);
    }
    
    @Override
    public String decorarSenha(int t, String tipoSenha) {
        super.decorarSenha(0, "");
        decorarSenhaNumero(0, "");
        return "";
    }
    
}
