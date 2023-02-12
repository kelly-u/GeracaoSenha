package geracaosenha.decorator;

import java.util.Random;

public class SenhaMaiuscula extends Decorator {

    public SenhaMaiuscula(Senha decorates) {
        super(decorates);
    }

    public String decorarSenhaMaiusculo(int tam) {

        String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
        
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
    public void decorarSenha() {
        super.decorarSenha();
        decorarSenhaMaiusculo(0);
    }

}
