package cinema;

import javax.swing.JOptionPane;

public class Sessao3D extends Sala implements Prime{
    private String hora;
    private String data;
    private double ingresso;
    public static int clientes;
    public static double totalVendidos;
    
    
    public Sessao3D(int capacidade,int nsala,Filme filme,String hora, String data, double ingresso) {
        super(capacidade,nsala,filme);
        this.hora = hora;
        this.data = data;
        this.ingresso = ingresso;
    }

    public Sessao3D(){
        super();
        this.hora = "-";
        this.data = "-";
        this.ingresso = 0;
    }
    
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public double getIngresso() {
        return ingresso;
    }
    public void setIngresso(double ingresso) {
        this.ingresso = ingresso;
    }

    public String combo(){
        return "BEBIDA + PIPOCA PEQUENA + CHOCOLATE";
    }

    public String toString(){
        return "\n-----------------------------------------------------"+
        "\n-------------"+"SALA-"+getNsala()+"------------------"+
        "\n           Sessão-3D                             "+
        "\nFilme: "+getFilme().getNome()+
        "\nGênero: "+getFilme().getGenero()+"\nIdade: "+getFilme().getIdade()+
        "\nData e hora: "+data+" "+hora+
        "\nValor do ingresso: "+ingresso+"R$"+
        "\nCapacidade da Sala: "+getCapacidade()+
        "\n-----------------------------------------------------";
    }

    public void imprimirIngresso(int quant){
        int cont = quant;
        int ningresso = getCapacidade();
        
        while(getCapacidade()!=0){
            
            for(int i=0;i<cont;i++){
                System.out.println("------------------------------BOM FILME------------------------------------");
                System.out.println("                                 3D                                        ");
                System.out.println("SALA-"+getNsala());
                System.out.println("INGRESSO-"+ningresso+"\nFilme: "+getFilme().getNome()+"\nData e hora: "+data+" "+hora);
                System.out.println("-----------------------------"+combo()+"----------------------------------");
                System.out.println("---------------------------------------------------------------------------");
                clientes++;
                totalVendidos+=getIngresso();
                ningresso-=1;
            }
            return;
        }

        JOptionPane.showMessageDialog(null,getFilme().getNome()+"-INGRESSOS ESGOTADOS NESTA SESSÃO");
    }

    public static String total3D(){
        return "\nTOTAL VENDIDO Sessão 3D: "+totalVendidos+"R$"+"\nTOTAL Clientes Sessão 3D: "+clientes;
    }

}
