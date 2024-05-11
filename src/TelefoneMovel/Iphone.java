package TelefoneMovel;

import TelefoneMovel.Apps.Musica.Ipod;
import TelefoneMovel.Apps.NavegadorWeb.Safari;
import TelefoneMovel.Apps.Telefone.Phone;

public class Iphone {
    public static void main(String[] args) {

        Ipod ipod = new Ipod(); // Instancia Ipod
        ipod.AppIpod();
        ipod.selecionarMusica();
        ipod.tocar();
        ipod.pausar();

        Safari safari = new Safari(); // Instancia Safari
        safari.AppSafari();
        safari.verificarConexaoComInternet();
        safari.exibirPagina();
        safari.atualizarPagina();
        safari.adicionarNovaAba();

        Phone phone = new Phone(); // Instancia Iphone
        phone.AppPhone();
        phone.verificarSinal();
        phone.ligar();
        phone.atender();
        phone.iniciarCorreioDeVoz();
    }

}

