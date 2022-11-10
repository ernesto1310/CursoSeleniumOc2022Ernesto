package com.java;

public class Main {

    public static void main(String[] args) {

        Coche coche1 = new Coche();
        coche1.llantas = 4;
        coche1.asientos = 2;
        coche1.motor = "gasolina";

        System.out.println("El coche tiene " + coche1.llantas + " llantas y tiene un motor de " + coche1.motor );

        Coche coche2 = new Coche("azul", "honda", "gasolina", 4, 2);
        System.out.println("La marca del coche es: " + coche2.marca + " y tiene " + coche2.asientos + " asientos");

        coche1.encender();
        coche1.acelerar();

        // Actividad
        // Crear una clase que se llama Moto y vamos a crear 3 diferentes tipos de motos con estados y comportamientos
    }
}
