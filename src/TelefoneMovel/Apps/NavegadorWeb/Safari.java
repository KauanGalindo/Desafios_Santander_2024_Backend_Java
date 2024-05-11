package TelefoneMovel.Apps.NavegadorWeb;

public class Safari implements VerificarConexaoComInternet, ExibirPagina, AtualizarPagina, AdicionarNovaAba {

    public void AppSafari (){
        System.out.println("\n=======================");
        System.out.println("APLICATIVO SAFARI:");
    }

    @Override
    public void verificarConexaoComInternet() {
        System.out.println("\nVerificando conexão com internet..");
        for (int i = 1; i < 3; i++){
            System.out.println(".");
        }
        System.out.println("Conectado!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina..");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina..");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba..");
        System.out.println("=======================");
    }
}
