package TelefoneMovel.Apps.Telefone;

public class Phone implements VerificarSinal, Ligar, Atender ,IniciarCorreioDeVoz {

    public void AppPhone(){
        System.out.println("APLICATIVO PHONE:");
    }

    @Override
    public void verificarSinal() {
        System.out.println("\nVerificando sinal..");
        for (int i = 1; i < 3; i++){
            System.out.println(".");
        }
        System.out.println("Aparelho com sinal!.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para outro celular..");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação..");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz..");
    }

}
