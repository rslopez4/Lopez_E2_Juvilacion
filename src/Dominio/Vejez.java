package Dominio;


package Dominio;
public class Vejez extends Jubilado{
    
    double salario;
    double salarioFinal;
    
    public Vejez(long ci, String nombre, int aporte) {
        super(ci, nombre, aporte);
        salario=pensionInicial();
        salarioFinal();
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
    
    @Override
    public void salarioFinal() {
        salarioFinal= salario+salario*0.15;
    }
}

