package teste;

public class Diretor extends Funcionario{
    @Override
    public double getSalario(int horas){
        return horas*200;
    }
}
