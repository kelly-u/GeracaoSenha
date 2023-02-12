package geracaosenha.decorator;

import java.util.Random;

public class SenhaNumero extends Decorator {
    
    public SenhaNumero(Senha decorates) {
        super(decorates);
    }
    
    public String decorarSenhaNumero(int tam){

        String numeros = "0123456789";
        
        Random random = new Random();
       
        String armazenaChaves = "";
        int index = -1;
        for (int i = 0; i < tam; i++) {
            
            index = random.nextInt(numeros.length());
    
            armazenaChaves += numeros.substring(index, index + 1);
        }
        System.out.println("Decorou senha: " + armazenaChaves);
        
        return armazenaChaves;
    }
    
    @Override
    public void decorarSenha() {
        super.decorarSenha();
        decorarSenhaNumero(0);
    }
    
}
