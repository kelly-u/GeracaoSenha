package geracaosenha.decorator;

public class Main {

    public static void main1(String[] args) {
    /*  SenhaSimples ss = new SenhaSimples();
        SenhaCaractereEsp sce = new SenhaCaractereEsp(ss);
        SenhaNumero sn = new SenhaNumero(sce);
        SenhaMaiuscula sma = new SenhaMaiuscula(sn);
        SenhaMinuscula smi = new SenhaMinuscula(sma);
        smi.decorarSenha();
    */
        SenhaSimples ss = new SenhaSimples();
        SenhaCaractereEsp sce = new SenhaCaractereEsp(ss);
        SenhaNumero sn = new SenhaNumero(sce);
        SenhaMaiuscula sma = new SenhaMaiuscula(sn);
        SenhaMinuscula smi = new SenhaMinuscula(sma);
        smi.decorarSenha();
    }
}
