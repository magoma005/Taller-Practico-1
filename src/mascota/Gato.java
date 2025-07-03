/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascota;

/**
 *
 * @author Miguel
 */
public class Gato extends Mascota {
    public Gato(String nombre) {
        super(nombre);
    }

    public void maullar() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}
