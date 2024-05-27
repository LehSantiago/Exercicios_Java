package caneta;

public class Caneta {
    //Atributos

     public String modelo;
     private float ponta;
     private boolean tampada;
     private String cor;

    //Métodos
    //void = sem retorno
    public Caneta(String m, String c, float p){ //Método construtor
        this.tampar();
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada? " + this.tampada);
        System.out.println("Cor: " + this.cor);
    }
}
