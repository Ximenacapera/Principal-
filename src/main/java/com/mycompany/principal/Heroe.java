
package com.mycompany.principal;

class Heroe {
private int vidas = 3;
private int x = 0;
private String nombre;
private boolean saltar = false;

public Heroe (String nombre){
    this.nombre = nombre;
    
} 
public void setMover(){
    this.x +=1; 
}
public void setSaltar (){
    this.saltar = true;
    this.x+=1;
}
public void setVidas(){
    this.vidas -= 1;
}

public int getVidas(){
    return this.vidas;
}
public int getx(){
    return x;
}
}
