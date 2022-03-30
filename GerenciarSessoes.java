package cinema;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerenciarSessoes {
    
    private ArrayList<Sala> slista;

    public GerenciarSessoes(){
        slista= new ArrayList<Sala>();
    }

    public void addSessao(Sala sessao){
        this.slista.add(sessao);
    }

    public void removerSessao(int ns){
        for(int i=0;i<slista.size();i++){
            if(slista.get(i).getNsala()==(ns)){
                this.slista.remove(i);
                JOptionPane.showMessageDialog(null,"--------SESSÃO DA SALA "+ns+" REMOVIDA--------");
                return;
            }            
        }
        JOptionPane.showMessageDialog(null,"--------SESSÃO DA SALA "+ns+" NÃO ESTÁ NA LISTA--------");
    }

    public void imprimirSessao(){
        JOptionPane.showMessageDialog(null,slista,"SESSÕES",JOptionPane.PLAIN_MESSAGE);      
    }
    
    public void selecionarSessao(int ns,int q){
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        for(int i=0;i<slista.size();i++){
            
            if(slista.get(i).getNsala()==(ns)){
                
                slista.get(i).imprimirIngresso(q);
                
                if(slista.get(i).getCapacidade()!=0){
                    slista.get(i).setCapacidade(slista.get(i).getCapacidade()-q);
                }
            }
        }                 
    }

    public void descrisaoImax(int ns){
        
        for(Sala i: slista){
            if(i.getNsala()==(ns)){
               if(i instanceof SessaoImax){
                    SessaoImax c = (SessaoImax) i;
                    c.descrisao();
                    return;
                }else{
                    JOptionPane.showMessageDialog(null,"---------------Está Sessão não é IMAX----------------");
                }
            }            
        }
    }



}
