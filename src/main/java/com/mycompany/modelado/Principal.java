/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelado;

/**
 *
 * @author halco
 */
public class Principal {
    public static void main(String[] args) {
        Automovil MiAutomovil =new Automovil("dodge", "verna","verde", 5, 4, 40);
        System.out.println(MiAutomovil.toString());
    }
}
