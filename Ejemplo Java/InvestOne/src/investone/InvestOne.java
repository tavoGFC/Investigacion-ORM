/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investone;

import com.invest.entidades.DetallesRevistas;
import org.hibernate.Session;

/**
 *
 * @author ranmartz
 */
public class InvestOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creacion del objeto 'revistaUno'. 
        DetallesRevistas revistaUno = new DetallesRevistas();
        revistaUno.setNombre("NatGeo");
        revistaUno.setEdicion("32");
        revistaUno.setAño("2012");
        
        
        //Creacion de la sesion (session), objeto del tipo HibernateUtil
        //para el procesamiento en a base.
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        
        //Inicio transaccion a la base con el objeto creado previamente.
        session.beginTransaction();
        session.save(revistaUno); 
        session.getTransaction().commit();  
        
        //Cierre de la sesion (session) ya que los objetos fueron enlazados
        //a la base. 
        HibernateUtil.getSessionFactory().close();
        
    }
    
}
