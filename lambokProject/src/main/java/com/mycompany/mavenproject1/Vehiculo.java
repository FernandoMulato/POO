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
public @Data class Vehiculo {

    private String marca;
    private String modelo;
    private String placa;

    public Vehiculo(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
}
