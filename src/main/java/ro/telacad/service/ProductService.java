/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.telacad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.telacad.dao.ProductDao;
import ro.telacad.db.Product;

/**
 *
 * @author VVA
 */
@Service//ca sa poata sa-si injecteze Dao
public class ProductService {
    //dao este pentru service o dependinta
    @Autowired//Spring ne da un productdao pe acare serviciul il poate folosi
    private ProductDao productDao;
    
    public void adaugaProdus(String nume, double pret){
        Product p=new Product();
        p.setNume(nume);
        p.setPret(pret);//trebuie sa cheme Dao pt a adaugs in baza acest produs
        productDao.adaugaProdus(p);
        //acum dam in fisir=erul xml scanul springului pt ca sa gaseasca adnotari adica
        // annotation config si scan in appContext.xml
    
    
    }
    
}
