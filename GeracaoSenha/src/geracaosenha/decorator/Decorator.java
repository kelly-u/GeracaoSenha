package geracaosenha.decorator;

import java.util.Random;

public abstract class Decorator extends Senha {
    
    private Senha senhaDecorator;   
     
    public Decorator(Senha senha){
        this.senhaDecorator = senha;
    }
    
    public Senha getSenha() {
        return getSenhaDecorator();
    }
    
    @Override
    public String decorarSenha(int tam, String tipoSenha){
        
        Random random = new Random();
       
        String armazenaChaves = "";
        int index = -1;
        for (int i = 0; i < tam; i++) {
            
            index = random.nextInt(tipoSenha.length());
    
            armazenaChaves += tipoSenha.substring(index, index + 1);
        }
        System.out.println("Decorou senha: " + armazenaChaves);
        
        getSenhaDecorator().decorarSenha(tam, armazenaChaves);
        
        return armazenaChaves;
        
    }
    
    
    
    
    
    /**
     * @return the senhaDecorator
     */
    public Senha getSenhaDecorator() {
        return senhaDecorator;
    }

    /**
     * @param senhaDecorator the senhaDecorator to set
     */
    public void setSenhaDecorator(Senha senhaDecorator) {
        this.senhaDecorator = senhaDecorator;
    }
    
}
