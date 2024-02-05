public class Main {
    // Se organiza el código con nuevas líneas
    public static void main(String[] args) {
        Nomina n=new Nomina(3200.50); // Se simplifica el parámetro que pasamos al constructor

        String texto=new String("El sueldo bruto es: "+ n.getSueldo()); // Se accede al atributo sueldo con el get
        System.out.println(texto);

        n.CalcularTotalPercibir();
        texto=new String("El sueldo neto es: "+ n.CalcularTotalPercibir()); // Se llama a la función creada para calcular el sueldo neto
        System.out.println(texto);

        texto=new String("El IRPF anual es: "+n.RetencionIRPFAnual());
        System.out.println(texto);
    }
}