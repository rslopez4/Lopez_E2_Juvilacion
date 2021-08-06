package Dominio;

public class Jubilado implements Calculo{

    long ci;
    String nombre;
    double salario;
    int aporte;

    public Jubilado(long ci, String nombre, int aporte) {
        this.ci = ci;
        this.nombre = nombre;
        this.aporte = aporte;
    }

    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAporte() {
        return aporte;
    }

    public void setAporte(int aporte) {
        this.aporte = aporte;
    }

    @Override
    public void salarioFinal() {
        
    }

    @Override
    public double pensionInicial() {
        if (this.aporte <= 10){
            this.salario = 400*0.5;
        } else if (this.aporte >= 11 && this.aporte <= 20){
            this.salario = 400*0.6;
        } else if (this.aporte >= 21 && this.aporte <= 30){
            this.salario = 400*0.7;
        }else if (this.aporte >= 31 && this.aporte <= 35){
            this.salario = 400*0.8;
        }else if (this.aporte >= 36 && this.aporte <= 39){
            this.salario = 400*0.9;
        }else if (this.aporte >= 40){
            this.salario = 400;
        }
    return this.salario;
    }
    
}

