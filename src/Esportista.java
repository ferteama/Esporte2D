public class Esportista extends Pessoa {
    private int IdFedrecao;

    // Construtor
    public Esportista(int IdFedrecao) {
        this.IdFedrecao = IdFedrecao;
    }

    public Esportista() {
    }

    //Método
    public String sacar(){
        return "Sacando ...";
    }

    // Getter e Setter
    public int getIdFedrecao() {
        return IdFedrecao;
    }
    public void setIdFedrecao(int IdFedrecao) {
        this.IdFedrecao = IdFedrecao;
    }
}
