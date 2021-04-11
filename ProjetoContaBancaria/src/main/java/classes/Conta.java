package classes;

public class Conta {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    public  boolean status;

    //Construtor
    public Conta(){
        saldo = this.getSaldo();
        status =this.getStatus();
    }

    //Métodos
    public void estadoAtual(){
        System.out.println("----------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abriConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50f);
        }else if(tipo == "CP"){
            this.setSaldo(150F);
            System.out.println("Conta aberta com sucesso!!!");
        }

    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada (ainda tem saldo)");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada (contém débitos)");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }

    }

    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposto realizado com sucesso! Conta: " + this.getDono());
        }else {
            System.out.println("Impossível depositar em uma conta fechada");
        }

    }

    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
            }else {
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada");
        }

    }

    public void pagarMensal(){
        float v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }else if (this.getTipo() == "CP"){
            v = 20;
        }

        if (getStatus()){
                this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso " + this.getDono());
            }else{
            System.out.println("Impossivel pagar com conta fechada");
        }
    }

    //Métodos especiais
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int nC) {
        this.numConta = nC;
    }


    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }


    public String getDono() {
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }


    public Float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(Float s) {
        this.saldo = s;
    }


    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean stt) {
        this.status = stt;
    }





}

