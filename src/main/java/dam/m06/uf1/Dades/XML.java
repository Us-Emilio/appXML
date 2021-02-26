/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.m06.uf1.Dades;

import dam.m06.uf1.Aplicacio.LogicEquip;
import dam.m06.uf1.Aplicacio.LogicJugador;
import dam.m06.uf1.Aplicacio.Model.Equip;
import dam.m06.uf1.Aplicacio.Model.Equips;
import dam.m06.uf1.Aplicacio.Model.Jugador;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author manel
 */
public class XML {
    
    public static void exportaDadesAXML(File fitx, Equips dades) throws DadesException
    {

        try {
           
             JAXBContext context;

            context = JAXBContext.newInstance(Equips.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(dades, fitx);

        } catch (JAXBException ex) {
            throw new DadesException (ex.getMessage());
        }
    }
    
    /**
     * Carrega equips i jugadors d'un fitxer XML
     * No verifica regles de negoci
     * @param fitx
     * @return
     * @throws DadesException 
     */
    public static Equips carregaDadesDeXML(File fitx) throws DadesException
    {
        try {
            Equips ret = new Equips();
            
            
        // JAXBContext context=JAXBContext.newInstance(Equips.class);//el contexto es la clase libreira
            
            //Objeto que permita leer el xml, pasar de xml a java
          //  Unmarshaller unmarshaller=context.createUnmarshaller();//permite leer el xml
            
            //devuelve el objeto con toda la información, devuelve libreria.
          //  Equips libreria= (Equips) unmarshaller.unmarshal(new File("futbol.xml"));//Hacemos Cast porque unmarshall devuelve Object
            
            //Muestra los datos del objeto
            
            // System.out.println(libreria.);
            
         //   ArrayList<Equip>libros=libreria.getEquips();
            //recorremos el ArrayList
          //  for(Equip e:libros){
            //    System.out.println(e.getEstadio());
          //  }
          
        //  fitx = new File("bookstore.xml");
          //  context = JAXBContext.newInstance(BookStore.class);
         //   Unmarshaller unmarshaller = context.createUnmarshaller();
         //   ret = (Equips) unmarshaller.unmarshal(fitx);
            

            
          //  fitxer = new File(fitx);
            JAXBContext  context = JAXBContext.newInstance(Equips.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            ret = (Equips) unmarshaller.unmarshal(fitx);

             
            //if (true) throw new DadesException ("No implementat");
            
            return ret;
        } catch (JAXBException ex) {
            throw new DadesException (ex.getMessage());
        }
    }
}
