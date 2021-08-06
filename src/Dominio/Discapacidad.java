package Dominio;

public class Discapacidad extends Jubilado {
    
    double salario;
    double salarioFinal;
    int discapacidad;

    public int getDiscapacidad() {
        return discapacidad;
    }
    
    public Discapacidad(long ci, String nombre, int aporte, int discapacidad) {
        super(ci, nombre, aporte);
        this.discapacidad = discapacidad;
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
        if (this.discapacidad <=10){
            this.salarioFinal = salario+salario*0.5;
        } else if (this.discapacidad >= 11 && this.discapacidad <= 20){
            this.salarioFinal = salario+salario*0.6;
        } else if (this.discapacidad >= 21 && this.discapacidad <= 30){
            this.salarioFinal = salario+salario*0.7;
        }else if (this.discapacidad >= 31 && this.discapacidad <= 35){
            this.salarioFinal = salario+salario*0.8;
        }else if (this.discapacidad >= 36 && this.discapacidad <= 39){
            this.salarioFinal = salario+salario*0.9;
        }else if (this.discapacidad >= 40){
            this.salarioFinal= salario+salario;
        }
    }
  
    
}
