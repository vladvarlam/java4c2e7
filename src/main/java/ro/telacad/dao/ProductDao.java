/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.telacad.dao;

import org.springframework.stereotype.Repository;
import ro.telacad.db.Product;
// cand voi avea un datasource, pun spring sa mi-l injecteze in aceasta instanta
// cu repository se vede clar ca e dao
@Repository
public class ProductDao {
    
    public void adaugaProdus(Product p){
    System.out.println("A fost adaugat in baza. Deocamdata nu am baza"+p.getNume());
    }
}
