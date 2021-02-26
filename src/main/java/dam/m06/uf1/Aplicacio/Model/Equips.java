/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.m06.uf1.Aplicacio.Model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author manel
 */
@XmlRootElement (name = "Equips")
@XmlAccessorType (XmlAccessType.FIELD)
public class Equips {
    
    @XmlElement(name = "Equip")
    private ArrayList<Equip> equips = new ArrayList<>();

    public Equips() {
    }

    public ArrayList<Equip> getEquips() {
        return equips;
    }

    public void setEquips(ArrayList<Equip> equips) {
        this.equips = equips;
    }
}
