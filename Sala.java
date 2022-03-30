package cinema;

public abstract class Sala{
    private int capacidade;
    private int nsala;
    private Filme filme;

    public Sala(int capacidade,int nsala,Filme filme){
        this.capacidade = capacidade;
        this.nsala = nsala;
        this.filme = filme;
    }
    public Sala(){
        this.capacidade = 0;
        this.nsala = 0;
        this.filme = new Filme();
    }
    
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public int getNsala(){
        return nsala;
    }

    public void setNsala(int nsala){
        this.nsala = nsala;
    }

    public Filme getFilme() {
        return filme;
    }
    
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    public abstract String toString();
    public abstract void imprimirIngresso(int q);

}
