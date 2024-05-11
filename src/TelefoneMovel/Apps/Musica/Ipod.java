package TelefoneMovel.Apps.Musica;

public class Ipod implements SelecionarMusica, Tocar, Pausar{

    public void AppIpod(){
        System.out.println("\nAPLICATIVO IPOD:");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("\nSelecionando música..");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música..");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }
}
