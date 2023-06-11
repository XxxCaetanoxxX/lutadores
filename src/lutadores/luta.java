package lutadores;

import java.util.Random;

public class luta {
    //atributos
    private lutador desafiado;
    private lutador desafiante;
    private int round;
    private boolean aprovada;
    
    //metodos 
    public void marcarLuta(lutador lut1, lutador lut2){
    if(lut1.getCategoria().equals(lut2.getCategoria()) && lut1 != lut2){
            this.aprovada=true;
            this.desafiado=lut1;
            this.desafiante=lut2;
        } else{
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }
    }
    
    public void lutar(){
        if(this.aprovada==true){
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor= aleatorio.nextInt(3); //0 1 2
            System.out.println("===== Resultado da luta =====");
            switch(vencedor){
                case 0: // empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado vence
                    System.out.println("Vitória do "+ this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante vence
                    System.out.println("Vitória do "+ this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("============================");
            
        } else{
            System.out.println("A luta não pode acontecer.");
        }
    }

    public lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(lutador desafiado) {
        this.desafiado = desafiado;
    }

    public lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
