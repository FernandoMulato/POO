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
public @Data class Motocicleta extends Vehiculo {

    private int cilindrada;
    private int horaDeIngreso;
    private int horaDeSalida;

    // Constructores, getters y setters
    // Otros métodos específicos para motocicletas
    public Motocicleta(int cilindrada, String marca, String modelo, String placa) {
        super(marca, modelo, placa);
        this.cilindrada = cilindrada;
        this.horaDeIngreso = 0;
        this.horaDeSalida = 0;
    }


}
