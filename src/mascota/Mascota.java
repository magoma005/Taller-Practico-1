/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascota;

/**
 *
 * @author Miguel
 */
public class Mascota {
    protected String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

//Hay que crear una jerarquía de clases de mascotas con: Clase base: Mascota con atributo nombre y método saludar(), Clase hija: Perro, hereda de Mascota y agrega método ladrar(), Clase hija: Gato, hereda de Mascota y agrega método maullar()
