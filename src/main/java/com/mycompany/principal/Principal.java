package com.mycompany.principal;

import java.util.Scanner;

public class Principal {
    static Heroe mario;

    public static void main(String[] args) {
        mario = new Heroe ("mario");
        Scanner consola = new Scanner (System.in);
        System.out.println("Usa x para saltar y esquivar los obstaculos, v para moverse");
        
      char tecla;
        do{
            tecla = consola.next().toLowerCase().charAt(0);
            switch (tecla){
                case 'x':
                    mario.setSaltar();
                    break;
                case 'v':
                    mario.setMover();
                    if (mario.getx()% 10 == 0) {
                        System.out.println("¡Salta!");
                        System.out.println("Presiona 'x' para saltarlo.");
                        char teclaObstaculo = consola.next().toLowerCase().charAt(0);
                        if (teclaObstaculo == 'x') {
                            mario.setSaltar();
                        } else {
                            System.out.println("¡Te chocaste con el obstáculo! Pierdes una vida.");
                            mario.setVidas();
                        }
                    }
                    break;
                default:
                    System.out.println("Tecla inválida");
            } 
        }while(mario.getVidas() > 0);
            System.out.println("game over"); 
        }    
    }

