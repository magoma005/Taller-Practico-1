package mascota;

public class Main {
    public static void main(String[] args) {
        ClinicaVeterinaria c = new ClinicaVeterinaria();

        Mascota m1 = new Perro("Toby");
        Mascota m2 = new Gato("Pelusa");

        c.recibirMascota(m1);
        c.recibirMascota(m2);
    }
}

//Preguntas para reflexion:

//¿Qué pasa si se envía una clase que no hereda de Mascota? No compliaria, porque solo acepta metoodos de tipo Mascota
//¿Cómo se comporta si eliminas el instanceof y casteas directamente? En resumen el compilador permite el casteo si hay relación de herencia, pero en runtime, si no es realmente de ese tipo, Java lanza un ClassCastException.

//Preguntas para cierre:
//¿Qué modificadores son accesibles desde una subclase en otro paquete? Protected y Public.
//¿Qué modificadores permiten acceder desde cualquier clase del mismo paquete? Public, Protected, Default.
//¿Qué pasaría si todos los atributos fueran public? Serian accesibles desde cualquier clase en cualquier paquete.
