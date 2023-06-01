package lutadores;


public class lutador {
     private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //construtor
    public lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso<52.2){
        this.categoria="Invalido";
        }else if(this.peso<=70.3){
        this.categoria="leve";
        }else if(this.peso<=83.9){
        this.categoria="medio";
        }else if(this.peso<=120.2){
        this.categoria="pesado";
        } else{
        this.categoria="invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //metodos personalizados    
      
    
    public void apresentar(){
        System.out.println("----------------------------");
        System.out.println("Lutador: "+getNome());
        System.out.println("Origem: "+getNacionalidade());
        System.out.println("Idade: "+getIdade());
        System.out.println("Altura: "+getAltura());
        System.out.println("Peso: "+getPeso());
        System.out.println("Vitorias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpates());
    }
    public void status(){
        System.out.println("-----------------------------");
        System.out.println(getNome());
        System.out.println("e um peso: "+ getCategoria());
        System.out.println(getVitorias()+" vitorias");
        System.out.println(getDerrotas()+" derrotas");
        System.out.println(getEmpates()+" empates");
    }
    
    public void ganharLuta(){
        this.setVitorias(getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(getEmpates()+1);
    }
}
