package com.java;

public class Coche {
    // Caracteristicas de un objeto
    // 1- Estado: se representa con instancias de variables
    // 2- Comportamiento: se representa con metodos
    // 3- Identidad: permite que los objetos interactuen entre si

    public String color;
    public String marca;
    public String motor;
    public int llantas;
    public int asientos;

    // Constructores
    // 1- Tiene el mismo nombre que la clase
    // 2- No se hereda
    // 3- No puede devolver ningun valor
    // 4- Puede haber mas de un constructor por clase (Sobrecarga)
    // 5- Puede no definirse de manera explicita un constructor

    public Coche() {

    }

    public Coche(String color, String marca, String motor, int llantas, int asientos) {
        this.color = color;
        this.marca = marca;
        this.motor = motor;
        this.llantas = llantas;
        this.asientos = asientos;
    }

    public Coche (String color, String marca) {
        this.color = color;
        this.marca = marca;
        this.motor = "electrico";
        this.llantas = 4;
        this.asientos = 5;
    }

    public void encender() {
        System.out.println("El coche esta encendido");
    }

    public void acelerar() {
        System.out.println("El coche esta acelerando");
    }

    public void frenar() {
        System.out.println("El coche esta frenando");
    }

}
