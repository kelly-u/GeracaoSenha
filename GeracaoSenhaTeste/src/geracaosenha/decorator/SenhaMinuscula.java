package geracaosenha.decorator;

import java.util.Random;

public class SenhaMinuscula extends Decorator {
    
    public SenhaMinuscula(Senha decorates) {
        super(decorates);
    }
    
    public String decorarSenhaMinusculo(int tam){

        String letras = "abcdefghijklmnopqrstuvwxyz";
        
        Random random = new Random();
       
        String armazenaChaves = "";
        int index = -1;
        for (int i = 0; i < tam; i++) {
            
            index = random.nextInt(letras.length());
    
            armazenaChaves += letras.substring(index, index + 1);
        }
        System.out.println("Decorou senha: " + armazenaChaves);
        
        return armazenaChaves;
        
    }
    
    @Override
    public void decorarSenha(){
        super.decorarSenha();
        decorarSenhaMinusculo(0);
    }    
}
