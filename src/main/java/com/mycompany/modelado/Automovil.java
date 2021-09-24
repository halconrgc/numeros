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
public class Automovil {
    private String marca, modelo, color;
    private int capPasajeros, noPuertas, noPasajeros;
    private float noLitros,capTanque,rendimiento;
    private boolean encendido;
    
    public Automovil(){}

    public Automovil(String marca, String modelo, String color, int capPasajeros, int noPuertas, float capTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.capPasajeros = capPasajeros;
        this.noPuertas = noPuertas;
        this.capTanque = capTanque;
        this.noPasajeros=0;
        this.encendido=false;
        this.noLitros=5;
        this.rendimiento=18;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapPasajeros() {
        return capPasajeros;
    }

    public void setCapPasajeros(int capPasajeros) {
        this.capPasajeros = capPasajeros;
    }

    public int getNoPuertas() {
        return noPuertas;
    }

    public void setNoPuertas(int noPuertas) {
        this.noPuertas = noPuertas;
    }

    public int getNoPasajeros() {
        return noPasajeros;
    }

    public void setNoPasajeros(int noPasajeros) {
        this.noPasajeros = noPasajeros;
    }

    public float getNoLitros() {
        return noLitros;
    }

    public void setNoLitros(float noLitros) {
        this.noLitros = noLitros;
    }

    public float getCapTanque() {
        return capTanque;
    }

    public void setCapTanque(float capTanque) {
        this.capTanque = capTanque;
    }

    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public float getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(float rendimiento) {
        this.rendimiento = rendimiento;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", capPasajeros=" + capPasajeros + ", noPuertas=" + noPuertas + ", noPasajeros=" + noPasajeros + ", noLitros=" + noLitros + ", capTanque=" + capTanque + ", rendimiento=" + rendimiento + ", encendido=" + encendido + '}';
    }
    
    public void encender(){
        if(!isEncendido()){
            System.out.println("El coche se esta encendiendo");
            setEncendido(true);
            System.out.println("listo");
        }else{
            System.out.println("No se puede encender, porque ya esta encendido");
        }
    }
    public void apagar(){
        if(isEncendido()){
            System.out.println("El coche se esta apagando");
            setEncendido(false);
            System.out.println("Listo");
        }else{
            System.out.println("Error...\nNo se puede apagar porque ya esta apagado");
        }
    }
    public boolean tanqueLleno(){
        if(getNoLitros()==getCapTanque()){
            return true;
        }else{
            return false;
        }
    }
    public void llenarTanque(){
        float litros;
        if(!tanqueLleno()){
            litros=getCapTanque()-getNoLitros();
            System.out.println("El tanque se esta llenando");
            setNoLitros(getCapTanque());
            System.out.println("Vas a pagar "+litros+" litros");
            System.out.println("Listo");
        }else{
            System.out.println("No se puede llenar porque el tanque esta lleno ");
        }
    }
    //capacidad 40litros tengo en el tanque 30litros  voy a cargar 20litros
    public void llenarLitros(float litros){
        float LitrosRestantes;
        if(!tanqueLleno()){
            if((getCapTanque()-getNoLitros())>litros){
                System.out.println("Se esta cargando el tanque");
                setNoLitros(getNoLitros()+litros);
                System.out.println("Listo");
            }else{
                LitrosRestantes=(getNoLitros()+litros)-getCapTanque();
                System.out.println("El tanque se lleno");
                setNoLitros(getCapTanque());
                System.out.println("Te sobraron "+LitrosRestantes+" litros");
            }
        }else{
            System.out.println("El tanque esta lleno");
            System.out.println("Te sobraron "+litros+" litros");
        }
        
    }
    //capacidad 5 personas y tengo 4 personas
    public boolean autoLleno(){
        if(getNoPasajeros()==getCapPasajeros())
            return true;
        return false;
    }
    public void subirPersona(){
        if(!autoLleno()){
            System.out.println("Es subiendo una persona");
            setNoPasajeros(getNoPasajeros()+1);
            System.out.println("Listo");
        }else{
            System.out.println("Error, el auto esta lleno, no cabe otro pasajero");
        }
     //otro
    }
    
}
