/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import lombok.Data;

/**
 *
 * @author 104623010375 Henry Fernando Mulato Llanten
 */
public @Data class Automovil extends Vehiculo {

    private int numeroPuertas;
    private int horaDeIngreso;
    private int horaDeSalida;

    public Automovil(int numeroPuertas, String marca, String modelo, String placa) {
        super(marca, modelo, placa);
        this.numeroPuertas = numeroPuertas;
    }
}
