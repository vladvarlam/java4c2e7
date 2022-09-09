/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.telacad.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import ro.telacad.service.ProductService;

/**
 *
 * @author VVA
 */
public class Main {
    
    public static void main(String[] args){
    
    //am copiat din propertiesul lui appContext calea catre appcontext cu \\ in loc de \
    
    FileSystemXmlApplicationContext context;
    context= new FileSystemXmlApplicationContext("C:\\Users\\Vlad\\Desktop\\JAVA\\JAVA1\\java4c2e7\\src\\main\\java\\ro\\telacad\\config\\appContext.xml");
    ProductService service=context.getBean(ProductService.class);//facem by type pt ca e osingura instanta
    service.adaugaProdus("pere",10);
    //vom inlocui acest main cu un proxy care va fi un exporter de RMI sau webservice astfel incat
    //o aplicatie client, prin proxy, sa apeleze serverul nostru
    }
    
}
