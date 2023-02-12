package geracaosenha.decorator;

public class SenhaCaractereEsp extends Decorator {
    
    public SenhaCaractereEsp(Senha decorates) {
        super(decorates);
    }
        
    public String decorarSenhaCaracE(int tam, String tipoSenha){        
        System.out.println("Decorou com caractere.");
        return super.decorarSenha(tam, tipoSenha);
    }
    
    @Override
    public String decorarSenha(int t, String tipoSenha){
        super.decorarSenha(0, "");
        decorarSenhaCaracE(0, "");
        return "";
    }
    
}
