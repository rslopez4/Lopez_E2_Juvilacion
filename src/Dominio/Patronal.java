package Dominio;

public class Patronal extends Jubilado {

    double salario;
    double salarioFinal;
    int inflacion;
    String empresa;

    public int getInflacion() {
        return inflacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Patronal(long ci, String nombre, int aporte, int inflacion, String empresa) {
        super(ci, nombre, aporte);
        this.inflacion = inflacion;
        salario = pensionInicial();
        this.empresa=empresa;
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
        if ("Privada".equals(this.empresa)||"privada".equals(this.empresa)){
            salarioFinal = salario + (salario * (this.inflacion/100));
            salarioFinal = salarioFinal+salarioFinal*0.1;
        }else{
            salarioFinal = salario + (salario * (this.inflacion/100));
            salarioFinal = salarioFinal+salarioFinal*0.05;
        }
    }
}
