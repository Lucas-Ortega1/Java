import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterTotalDeTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        
        System.out.println("Numero total de tarefas na lista: " + lista.obterTotalDeTarefas());

        lista.adicionarTarefa("Estudar");
        lista.adicionarTarefa("Jogar");
        lista.adicionarTarefa("Comprar pão");
        lista.adicionarTarefa("Estudar");
        System.out.println("Numero total de tarefas na lista: " + lista.obterTotalDeTarefas());

        lista.removerTarefa("EStudar");
        System.out.println("Numero total de tarefas na lista: " + lista.obterTotalDeTarefas());

        System.out.println("Descricoes das tarefas:");
        lista.obterDescricoesTarefas();
    }
}
