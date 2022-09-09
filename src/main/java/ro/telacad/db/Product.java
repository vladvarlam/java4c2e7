/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.telacad.db;
//aceasta clasa nu va fi controlata de spring nu are sens, poate va fi controlata de JPA 
//daca folosesc java persistence API, dar atat. Deci nici component, nici @bean, nici definitii XML
//pt a pune aceste instante in context de spring

import org.springframework.context.annotation.ComponentScan;


public class Product {
    private String nume;
    private double pret;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
    
    
    
}
