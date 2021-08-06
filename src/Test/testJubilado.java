package Test;

import Dominio.Discapacidad;
import Dominio.Patronal;
import Dominio.Vejez;
import java.util.Scanner;

public class testJubilado {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        ingresarDatos();
    }

    public static void ingresarDatos() {
        System.out.println("¿Cuántos jubilados por vejez desea registrar?");
        int n = datos.nextInt();
        Vejez vejez[] = new Vejez[n];
        llenaVejez(vejez);
        System.out.println("¿Cuántos jubilados por discapacidad desea registrar?");
        int n1 = datos.nextInt();
        Discapacidad discapacidad[] = new Discapacidad[n1];
        llenaDiscapacidad(discapacidad);
        System.out.println("¿Cuántos jubilados patronales desea registrar?");
        int n2 = datos.nextInt();
        Patronal patronal[] = new Patronal[n2];
        llenaPatronal(patronal);
        
        
        System.out.println(" ");
        System.out.println("Jubilados por vejez:");
        System.out.println(" ");
        for (int i = 0; i < vejez.length; i++) {
            System.out.println("Jubilado No." + (i + 1));
            System.out.println("Nombre: " + vejez[i].getNombre());
            System.out.println("Cedula: " + vejez[i].getCi());
            System.out.println("Años de aporte: " + vejez[i].getAporte());
            System.out.print("La pensión a recibir es: " + vejez[i].getSalarioFinal() +" dolares.");
            System.out.println("");
        }
        System.out.println(" ");
        System.out.println("Jubilados por discapacidad:");
        System.out.println(" ");
        for (int i = 0; i < discapacidad.length; i++) {
            System.out.println("Jubilado No." + (i + 1));
            System.out.println("Nombre: " + discapacidad[i].getNombre());
            System.out.println("Cedula: " + discapacidad[i].getCi());
            System.out.println("Años de aporte: " + discapacidad[i].getAporte());
            System.out.println("Discapacidad: " + discapacidad[i].getDiscapacidad() +"%");
            System.out.print("La pensión a recibir es: " + discapacidad[i].getSalarioFinal() +" dolares.");
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Jubilados patronales:");
        System.out.println(" ");
        for (int i = 0; i < patronal.length; i++) {
            System.out.println("Jubilado No." + (i + 1));
            System.out.println("Nombre: " + patronal[i].getNombre());
            System.out.println("Cedula: " + patronal[i].getCi());
            System.out.println("Años de aporte: " + patronal[i].getAporte());
            System.out.println("Inflación: " + patronal[i].getInflacion() + "%");
            System.out.println("Empresa: " + patronal[i].getEmpresa());
            System.out.print("Pensión a recibir es: " + patronal[i].getSalarioFinal() +" dolares.");
            System.out.println("");
        }
    }

    public static void llenaVejez(Vejez vejez[]) {
        long ci;
        String nombre;
        int aporte;

        for (int i = 0; i < vejez.length; i++) {
            datos.nextLine();
            System.out.println("Jubilados por vejez: ");
            System.out.println("Jubilado No." + (i + 1));
            System.out.print("Ingrese nombre: ");
            nombre = datos.nextLine();
            System.out.print("Ingrese cedula: ");
            ci = datos.nextLong();
            System.out.print("Ingrese años de aporte: ");
            aporte = datos.nextInt();
            System.out.println(" ");
            vejez[i] = new Vejez(ci, nombre, aporte);
        }
    }

    public static void llenaDiscapacidad(Discapacidad discapacidad[]) {
        long ci;
        String nombre;
        int aporte;
        int porDiscapacidad;

        for (int i = 0; i < discapacidad.length; i++) {
            datos.nextLine();
            System.out.println("Jubilados por discapacidad: ");
            System.out.println("Jubilado No." + (i + 1));
            System.out.print("Ingrese nombre: ");
            nombre = datos.nextLine();
            System.out.print("Ingrese cedula: ");
            ci = datos.nextLong();
            System.out.print("Ingrese años de aporte: ");
            aporte = datos.nextInt();
            System.out.print("Ingrese porcentaje de discapacidad: ");
            porDiscapacidad = datos.nextInt();
            System.out.println(" ");
            discapacidad[i] = new Discapacidad(ci, nombre, aporte, porDiscapacidad);
        }
    }

    public static void llenaPatronal(Patronal patronal[]) {
        long ci;
        String nombre;
        String empresa;
        int aporte;
        int inflacion;

        for (int i = 0; i < patronal.length; i++) {
            datos.nextLine();
            System.out.println("Jubilados por discapacidad: ");
            System.out.println("Jubilado No." + (i + 1));
            System.out.print("Ingrese nombre: ");
            nombre = datos.nextLine();
            System.out.print("Ingrese cedula: ");
            ci = datos.nextLong();
            System.out.print("Ingrese años de aporte: ");
            aporte = datos.nextInt();
            datos.nextLine();
            System.out.print("Ingrese tipo de empresa(Privada o Publica): ");
            empresa = datos.nextLine();
            System.out.print("Ingrese porcentaje de inflación: ");
            inflacion = datos.nextInt();
            System.out.println(" ");
            patronal[i] = new Patronal(ci, nombre, aporte, inflacion, empresa);

        }
    }

}
