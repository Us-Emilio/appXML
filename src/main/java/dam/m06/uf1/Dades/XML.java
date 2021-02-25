/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.m06.uf1.Dades;

import dam.m06.uf1.Aplicacio.Model.Equips;
import java.io.File;
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
       throw new DadesException ("No implementat");
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
        Equips ret = new Equips();
        
        if (true) throw new DadesException ("No implementat");
        
        return ret;
    }
}
