package geracaosenha.decorator;

public abstract class Decorator extends Senha {
    
    private Senha senhaDecorator;   
     
    public Decorator(Senha senha){
        this.senhaDecorator = senha;
    }
    
    public Senha getSenha() {
        return getSenhaDecorator();
    }
    
    @Override
    public void decorarSenha(){
        getSenhaDecorator().decorarSenha();
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
