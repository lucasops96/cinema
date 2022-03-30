package cinema;



public class Lanchonete implements Prime {
    private String pipoca;
	private String bebida;
    private String chocolate;
	private double preço;
    
    public Lanchonete(String pipoca, String bebida,String chocolate, double preço) {
        this.pipoca = pipoca;
        this.bebida = bebida;
        this.chocolate=chocolate;
        this.preço = preço;
    }

    public Lanchonete() {
        this.pipoca = "-";
        this.bebida = "-";
        this.chocolate="-";
        this.preço =0;
    }

    public String getPipoca() {
        return pipoca;
    }

    public void setPipoca(String pipoca) {
        this.pipoca = pipoca;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String combo(){
        return "|---------PEDIDO---------|"+"\n| BEBIDA + PIPOCA PEQUENA + CHOCOLATE = R$20,00 |";
    }

    public void imprimirPedido(){
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|------PEDIDO------|"+
        "\n|Bebida: "+bebida+"|"+
        "\n|Pipoca: "+pipoca+"|"+
        "\n|Chocolate: "+chocolate+"|"+
        "\n|TOTAL:R$"+preço+"|");       
    }
    
}
