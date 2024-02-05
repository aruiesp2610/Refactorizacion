public class Nomina {
    private double sueldo; // Se cambia el sueldo como variable private para acceder a ella solo mediante get y set

    // Se elimina la variable 'totalPercibir' porque solo se usa dentro de un método

    // Se crea método get para acceder al atributo sueldo
    public double getSueldo() {
        return sueldo;
    }

    // Se añade el public al método para hacer énfasis en que es public
    // Se estandarizan las variables del constructor
    public Nomina (double sueldo){
        this.sueldo=sueldo;
    }

    // Se añade el public al método para hacer énfasis en que es public
    // Además, se pone la primera letra de cada palabra en mayúsculas para seguir el estándar de los nombres de los métodos.
    public double CalcularTotalPercibir(){
        //Descontamos el 20% de IRPF
        double nomina=sueldo-(sueldo * 0.2); // Se acorta el cálculo del 20%
        //Descontamos la seguridad social
        if (nomina>2000)
            nomina=nomina-256;
        else
            nomina=nomina-128;
        return nomina;
    }

    // Se añade el public al método para hacer énfasis en que es public
    // Además, se pone la primera letra de cada palabra en mayúsculas para seguir el estándar de los nombres de los métodos.
    public double RetencionIRPFAnual(){
        double irpf=sueldo*0.2; // Se acorta cálculo del porcentaje
        return irpf*14;
    }
}