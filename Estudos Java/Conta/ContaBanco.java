package Conta;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Métodos
    public ContaBanco(){
        saldo = 0;
        status = false;
    }
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if(t == "CC"){
            saldo = 50;
        }else if(t == "CP"){
            saldo = 150;
        }
    }
    public void fecharConta(){
        if (saldo > 0){
            System.out.println("A conta tem dinheiro");
        }else if(saldo < 0){
            System.out.println("A conta esta em débito");
        }else{
            setStatus(false);
        }
    }
    public void depositar(float v){
        if(status == true){
            setSaldo(getSaldo()+v);
        }else{
            System.out.print("Impossivel depositar!");
        }
    }
    public void sacar( float v){
        if(status == true){
            if(saldo >= v){
                setSaldo(getSaldo() - v);
            }else{
                System.out.println("Saldo insuficiente!");
            }{
                System.out.println("Impossivel sacar!");
            }
        }
    }
    public void pagarMensal(){
        float v = 0;
        if(tipo == "CC"){
            v = 12;
        }else if(tipo == "CP"){
            v = 20;
        }if(saldo > v) {
           saldo =  saldo - v;
        }else{
            System.out.println("Saldo insuficiente!");
        }else{
            System.out.println("Impossivel pagar!");
        }
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return this.dono;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
    public boolean getStatus(){
        return this.status;
    }
}
