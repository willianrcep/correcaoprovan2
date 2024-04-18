package prova;

public abstract class Figura {
    protected String cor;
    protected String getCor(){
        return cor;
    }
public void setCor(String cor){
    this.cor=cor;
}
public Figura(String cor){
    this.cor=cor;
}
public Figura(){
    
}
}
