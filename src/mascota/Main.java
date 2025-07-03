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

//¿Qué pasa si se envía una clase que no hereda de Mascota? No compliaria, porque solo acepta metoodos de tipo Mascota
//¿Cómo se comporta si eliminas el instanceof y casteas directamente? Al castearlo directamente sin verificacion es peligroso, genera ClassCastException si el objeto no es de ese tipo, depende del tipo de objeto, si m es un perro, bien, si m es un gato genera un error.
//HolaMigue
