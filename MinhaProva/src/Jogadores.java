public class Jogadores {
    private String nome;
    private int votos = 0;

    public Jogadores(String nome, int votos) {
        this.nome = nome;
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Jogadores" +
                "nome='" + nome + '\'' +
                ", votos=" + votos +
                '\n';
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public Jogadores(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void incrementaUmVoto(){

        this.votos = getVotos() + 1;
    }


}
