# 🐶🐱 Proyecto Mascotas – Taller POO en Java

## 📚 Descripción

Este proyecto implementa una **jerarquía de clases de mascotas** utilizando conceptos de Programación Orientada a Objetos (POO) en Java, aplicando:

- Herencia
- Modificadores de acceso
- Casteo seguro con `instanceof`

---

## 📝 **Estructura del proyecto**

src/
├── Mascota.java
├── Perro.java
├── Gato.java
├── ClinicaVeterinaria.java
└── Main.java


---

## 🧩 **Clases implementadas**

### 🔹 **Mascota (clase base)**
- Atributo: `nombre` (protected)
- Método: `saludar()`

### 🔹 **Perro (subclase de Mascota)**
- Método específico: `ladrar()`

### 🔹 **Gato (subclase de Mascota)**
- Método específico: `maullar()`

### 🔹 **ClinicaVeterinaria**
- Método `recibirMascota(Mascota m)`:
  - Usa `instanceof` para identificar el tipo de mascota.
  - Realiza casteo seguro y ejecuta métodos específicos.

### 🔹 **Main**
- Prueba la funcionalidad creando instancias de `Perro` y `Gato` y enviándolas a la clínica veterinaria.

---

## 💻 **Cómo ejecutar**

1. **Abre el proyecto en IntelliJ IDEA o NetBeans.**

2. Ejecuta la clase `Main.java`.

---

## ✅ **Salida esperada**

Recibiendo a: Toby
Hola, soy Toby
Toby dice: ¡Guau!
Recibiendo a: Pelusa
Hola, soy Pelusa
Pelusa dice: ¡Miau!


---

## 🎯 **Aprendizajes clave**

- Uso de `instanceof` y casteo seguro
- Jerarquía de clases y herencia en Java
- Modificadores de acceso (`protected`, `public`)
- Encapsulamiento y buenas prácticas en POO

---

## 👤 **Autor**

> ✏️ **Miguel Angel Guarin**  
> 📧 mago123005@gmail.com  
> 🗓️ Julio 2025

---

## 📝 **Licencia**

Este proyecto es de uso educativo para la asignatura de **Programación Orientada a Objetos (POO)**. Puedes adaptarlo y ampliarlo libremente con fines de aprendizaje.

---

