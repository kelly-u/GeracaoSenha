package geracaosenha.decorator;

import java.util.Random;

public class SenhaCaractereEsp extends Decorator {
    
    public SenhaCaractereEsp(Senha decorates) {
        super(decorates);
    }
    
    public String decorarSenhaCaracE(int tam){        
        
        String caracteres = "!@#$%&*";
        
        Random random = new Random();
       
        String armazenaChaves = "";
        int index = -1;
        for (int i = 0; i < tam; i++) {
            
            index = random.nextInt(caracteres.length());
    
            armazenaChaves += caracteres.substring(index, index + 1);
        }
        System.out.println("Decorou senha: " + armazenaChaves);
        
        return armazenaChaves;
    }
    
    @Override
    public void decorarSenha(){
        super.decorarSenha();
        decorarSenhaCaracE(0);
    }
    
}
