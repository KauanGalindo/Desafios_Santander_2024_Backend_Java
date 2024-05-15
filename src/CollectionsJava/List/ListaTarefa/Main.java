package CollectionsJava.List.ListaTarefa;

public class Main {
    public static void main(String[] args) {

        // Lista de Tarefa tarefas
        ListaTarefa tarefas = new ListaTarefa();

        // Adicionando Tarefas
        tarefas.addTarefa("Caminhar");
        tarefas.addTarefa("Estudar");
        tarefas.addTarefa("Dormir");

        // Exibindo a descrição das Tarefas
        tarefas.descricaoDasTarefas();

        // Numero total de Tarefas
        System.out.println("Número total de tarefas: " + tarefas.obterNumeroTotalDeTarefas());

        // Removendo Tarefa
        tarefas.removeTarefa("Estudar");

        System.out.println(""); // Pula linha
        tarefas.descricaoDasTarefas(); // Exibindo a descrição das Tarefas
        System.out.printf("Número total de tarefas: " + tarefas.obterNumeroTotalDeTarefas()); // Número total de Tarefas atualizado

    }
}
