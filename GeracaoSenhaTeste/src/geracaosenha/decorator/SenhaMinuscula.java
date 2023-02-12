package geracaosenha.decorator;

import java.util.Random;

public class SenhaMinuscula extends Decorator {
    
    public SenhaMinuscula(Senha decorates) {
        super(decorates);
    }
    
    public String decorarSenhaMinusculo(int tam, String tipoSenha){
        
        Random random = new Random();
       
        String armazenaChaves = "";
        int index = -1;
        for (int i = 0; i < tam; i++) {
            
            index = random.nextInt(tipoSenha.length());
    
            armazenaChaves += tipoSenha.substring(index, index + 1);
        }
        System.out.println("Decorou senha: " + armazenaChaves);
        
        return armazenaChaves;
        
    }
    
    @Override
    public void decorarSenha(){
        super.decorarSenha();
        decorarSenhaMinusculo(0, "");
    }    
}
