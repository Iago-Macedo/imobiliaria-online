import java.util.ArrayList;
import java.util.List;
public class ProcessosDaImobiliaria {

    private List<ProcessosDaImobiliaria> processos;

    public ProcessosDaImobiliaria() {
        this.processos = new ArrayList<>();
    }

    public void adicionarProcesso(ProcessosDaImobiliaria processo) {
        processos.add(processo);
    }

    public List<ProcessosDaImobiliaria> getProcessos() {
        return processos;
    }
}
