package com.mycompany.modelado;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Automovil MiAutomovil =new Automovil("dodge", "verna","verde", 5, 4, 40);
        System.out.println(MiAutomovil.toString());
        System.out.println("mensaje");
        int opc=1;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Menu operaciones basicas "
                    + "1.- suma "
                    + "2.-resta "
                    + "3.-multiplicacion "
                    + "4.- division "
                    + "5.-modulo");
            System.out.println("Dame una opcion");
            opc=scanner.nextInt();
            
            switch (var) {
                case 1:                    
                    break;
                case 2:                    
                    break;
                case 3:                    
                    break;
                case 4:                    
                    break;
                default:
                    throw new AssertionError();
            }
    
        }
        while(opc!=8); 
  
    }
}
