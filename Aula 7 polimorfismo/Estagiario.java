package teste;

public class Estagiario extends Funcionario{
    private int x=10;
    @Override
    public double getSalario(int horas){
        return horas*50;
    }
    public int total(){
        return this.x + super.x;
    }
    
}
