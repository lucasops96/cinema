package cinema;

public class Filme {
    private String nome;
    private String genero;
    private String idade;
    
    public Filme(String nome, String genero, String idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public Filme() {
        this.nome = "-";
        this.genero = "-";
        this.idade ="-";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }   

}
