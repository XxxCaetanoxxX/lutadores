package lutadores;


public class Lutadores {
    public static void main(String[] args) {
        
        //vetor de lutadores
        lutador l[]= new lutador[6];
        
        
        l[0] = new lutador("Joao", "brasileiro",20,1.80,70,5,0,1);
        l[0].status();
        
        l[1] = new lutador("Pedro", "Franca",25,1.82,72,4,1,2);
        l[1].status();
        
        l[2] = new lutador("Lucas", "Mongolia",21,1.75,71,3,4,0);
        l[2].status();
        
        l[3] = new lutador("Gustavo", "Portugal",19,1.81,69,2,3,3);
        l[3].status();
        
        l[4] = new lutador("Jose", "Espanha",24,1.79,70.5,5,2,1);
        l[4].status();
        
        l[5] = new lutador("Micael", "Alemanha",23,1.76,71.2,4,2,0);
        l[5].status();
        
    }
    
}
