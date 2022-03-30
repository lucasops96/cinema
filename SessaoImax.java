package cinema;

import javax.swing.JOptionPane;

public class SessaoImax extends Sala implements Prime{
    private String hora;
    private String data;
    private double ingresso;
    public static int clientes;
    public static double totalVendidos;
    
    
    public SessaoImax(int capacidade,int nsala,Filme filme,String hora, String data, double ingresso) {
        super(capacidade,nsala,filme);
        this.hora = hora;
        this.data = data;
        this.ingresso = ingresso;
    }

    public SessaoImax(){
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
        return "BEBIDA + PIPOCA GRANDE + CHOCOLATE";
    }

    public String toString(){
        return "\n-----------------------------------------------------"+
        "\n-------------"+"SALA-"+getNsala()+"------------------"+
        "\n           Sessão-IMAX                             "+
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
                System.out.println("                                IMAX                                        ");
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

    public static String totalImax(){
        return "\nTOTAL VENDIDO Sessão IMAX: "+totalVendidos+"R$"+"\nTOTAL Clientes Sessão IMAX: "+clientes;
    }

    public void descrisao(){
        JOptionPane.showMessageDialog(null,"O IMAX ou Imagem Maximum é um formato de filme que abrange  e \nmaximiza  todos os pontos audiovisuais e vitais de um filme, como som,\nimagem, resolução e até o formato da tela, que é em côncava, e posições das\ncadeiras no cinema são tratados como parte do roteiro da experiência. Tudo\né pensado para que a vivência de quem está assistindo seja de imersão e\nsensação de profundidade. Você vê melhor e ouve melhor devido as\ntecnologias de alta definição que o método possui. É o famoso pegar um\ncineminha virando cinemão.");
        /*System.out.println("O IMAX ou Imagem Maximum é um formato de filme que abrange  e \nmaximiza  todos os pontos audiovisuais e vitais de um filme, como som,\nimagem, resolução e até o formato da tela, que é em côncava, e posições das\ncadeiras no cinema são tratados como parte do roteiro da experiência. Tudo\né pensado para que a vivência de quem está assistindo seja de imersão e\nsensação de profundidade. Você vê melhor e ouve melhor devido as\ntecnologias de alta definição que o método possui. É o famoso pegar um\ncineminha virando cinemão.");*/
    }
}
