package cinema;

import javax.swing.JOptionPane;

public class LerDados {
    public Sessao criarSessao(){
        
        int capacidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a capacidade: "));
        int nsala = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a SALA: "));
        String hora = JOptionPane.showInputDialog(null,"Digite a hora: ");
        String data = JOptionPane.showInputDialog(null,"Digite a data: ");
        String nome = JOptionPane.showInputDialog(null,"Digite o nome do FILME: ");
        String genero = JOptionPane.showInputDialog(null,"Digite o Gênero: ");
        String idade = JOptionPane.showInputDialog(null,"Digite a IDADE limite: ");
        double ingresso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do ingresso: "));
        
        Sessao s = new Sessao(capacidade,nsala,new Filme(nome,genero,idade),hora,data,ingresso);
        return s;
    }

    public Sessao3D criarSessao3D(){
        
        int capacidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a capacidade: "));
        int nsala = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a SALA: "));
        String hora = JOptionPane.showInputDialog(null,"Digite a hora: ");
        String data = JOptionPane.showInputDialog(null,"Digite a data: ");
        String nome = JOptionPane.showInputDialog(null,"Digite o nome do FILME: ");
        String genero = JOptionPane.showInputDialog(null,"Digite o Gênero: ");
        String idade = JOptionPane.showInputDialog(null,"Digite a IDADE limite: ");
        double ingresso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do ingresso: "));
        
        Sessao3D s3D = new Sessao3D(capacidade,nsala,new Filme(nome,genero,idade),hora,data,ingresso);
        return s3D;
    }

    public SessaoImax criarSessaoImax(){
        
        int capacidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a capacidade: "));
        int nsala = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a SALA: "));
        String hora = JOptionPane.showInputDialog(null,"Digite a hora: ");
        String data = JOptionPane.showInputDialog(null,"Digite a data: ");
        String nome = JOptionPane.showInputDialog(null,"Digite o nome do FILME: ");
        String genero = JOptionPane.showInputDialog(null,"Digite o Gênero: ");
        String idade = JOptionPane.showInputDialog(null,"Digite a IDADE limite: ");
        double ingresso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do ingresso: "));
        
        SessaoImax si = new SessaoImax(capacidade,nsala,new Filme(nome,genero,idade),hora,data,ingresso);
        return si;
    }

    public void pedido(){
        JOptionPane.showMessageDialog(null,"________BEDIDAS_______"+
        "\n    COCA-COLA  R$10,00"+
        "\n    Guarana R$10,00"+
        "\n    Sprite R$10,00"+
        "\n    Água R$5,00"+
        "\n"+
        "________Pipoca_______"+
        "\n    GRANDE R$10,00"+
        "\n    PEQUENA R$5,00"+
        "\n"+
        "_______DOCES_______"+
        "\n    kit-kat R$7,00"+
        "\n    toblorone R$7,00"+
        "\n    sneakes R$7,00"+
        "\n"+
        "_______COMBO______"+"\n"+
        "BEBIDA + PIPOCA P + CHOCOLATE = R$20,00");
        
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(null,"1-Escolher pedidos 2-COMBO"));
        if(tipo==1){
                double e=0;
                String b = JOptionPane.showInputDialog(null,"Digite r/ adicionar bebida \ne a/ adicionar água:");
                if(b.equals("r")){e+=10;b="REFRIGERANTE";}else if(b.equals("a")){e+=5;b="ÁGUA";}
                
                String pi = JOptionPane.showInputDialog(null,"Digite g/ adicionar pipoca grande \ne p/ adicionar pipoca pequena: ");
                if(pi.equals("g")){e+=10;pi="GRANDE";}else if(pi.equals("p")){e+=5;pi="PEQUENA";}
                
                String c = JOptionPane.showInputDialog(null,"Digite c/ adicionar chocolate: ");
                if(c.equals("c")){e+=7;c="CHOCOLATE";}
                
                Lanchonete p = new Lanchonete(pi,b,c,e);
                p.imprimirPedido();
        }else{
            Lanchonete c = new Lanchonete();
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println(c.combo());
        }
    }

}
