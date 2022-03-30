package cinema;

import javax.swing.JOptionPane;

public class Cinema {
    public static void main(String[] args) {
               
        GerenciarSessoes l = new GerenciarSessoes();
        
        int op=0;
        do{
            // A lista de Sessões vai está vazia no início, portanto aperte OK para iniciar o menu do programa.
            l.imprimirSessao();            
            
            op = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite:\n1-Adicionar Sessão\n2-Selecionar Sessão e Comprar ingressos\n3-Remover Sessão\n4-IMAX\n5-Total vendido e clientes\n6-Cine FOOD\n7-Fechar Cinema"));
            
            switch(op) {
            case 1:
                int s = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite:\n1-Adicionar Sessão Normal\n2-Adicionar Sessão 3D\n3-Adicionar Sessão IMAX"));
                if(s==1){
                    l.addSessao(new LerDados().criarSessao());
                    JOptionPane.showMessageDialog(null,"Sessão Normal Adicionada");
                }else if(s==2){
                    l.addSessao(new LerDados().criarSessao3D());
                    JOptionPane.showMessageDialog(null,"Sessão 3D Adicionada");
                }else{
                    l.addSessao(new LerDados().criarSessaoImax());
                    JOptionPane.showMessageDialog(null,"Sessão IMAX Adicionada");
                }
                break;
            case 2:
                int ns = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número da SALA:"));
                int quant = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade INGRESSOS:"));
                JOptionPane.showMessageDialog(null,"Venda confirmada para sala "+ns+"\nQuantidade de ingressos: "+quant);
                l.selecionarSessao(ns,quant);
                //Os ingressos vão ser imprimidos no console, pois a ideia é de parece como uma impressora dos ingressos.
                break;
            case 3:
                int re = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número da SALA para remover:"));
                l.removerSessao(re);
                break;
            case 4:
                int nsimax = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número da SALA IMAX:"));
                l.descrisaoImax(nsimax);
                break;
            case 5:
                JOptionPane.showMessageDialog(null,Sessao.totalNormal()+Sessao3D.total3D()+SessaoImax.totalImax());
                break;
            case 6:
                new LerDados().pedido();
                //Os pedidos vão ser imprimidos no console, pois a ideia é de parece como uma impressora dos pedidos.
                //Digite 0 caso não quera algo no cardapío.
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"Cinema Fechado");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Digite uma operação válida!");
                break;
            }
      }while(op!=7);
            

        
    }
}
