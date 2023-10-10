public class Cliente {
    private String numeroProcesso;
    private String chaveDeAcesso;

    public Cliente(String numeroProcesso, String chaveDeAcesso){
        this.numeroProcesso = numeroProcesso;
        this.chaveDeAcesso = chaveDeAcesso;
    }

    public void setChaveDeAcesso(String chaveDeAcesso) {
        this.chaveDeAcesso = chaveDeAcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public String getChaveDeAcesso() {
        return chaveDeAcesso;
    }
}
