/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.m06.uf1.Dades;

import dam.m06.uf1.Aplicacio.Model.Equip;
import dam.m06.uf1.Aplicacio.Model.Equips;
import dam.m06.uf1.Aplicacio.Model.Jugador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manel
 */
public class CSV {

    /**
     * Exporta tots els equips a un fitxer CSV
     *
     * @param fitx
     * @param dades
     * @throws DadesException
     */
    public static void exportaEquipsACSV(File fitx, Equips dades) throws DadesException {
        /*try {
            if (!fitx.exists()) {
                fitx.createNewFile();
            }
        } catch (IOException ex) {
            throw new DadesException("No se ha podido crear el archivo.");
        }

        ArrayList<Equip> equips = dades.getEquips();
        try {
            FileWriter texto = new FileWriter(fitx);
            BufferedWriter escritor = new BufferedWriter(texto);

            for (Equip equip : equips) {
                System.out.println(equip.toString());
                escritor.write("hola");
                escritor.newLine();
            }
        } catch (IOException ex) {
            throw new DadesException("No se pudo escrivir en el fichero");
        }*/
        
        try {
            if (!fitx.exists()) {
                fitx.createNewFile();
            }
        } catch (IOException ex) {
            throw new DadesException("No se ha podido crear el archivo.");
        }

        ArrayList<Equip> equips = dades.getEquips();
        
        try {
            FileWriter texto = new FileWriter(fitx);
            BufferedWriter escritor = new BufferedWriter(texto);

            for (Equip equip : equips) {
                    System.out.println(equip.toString());
                    escritor.write(equip.toString());
                    escritor.newLine();
            }
            escritor.close();
        } catch (IOException ex) {
            throw new DadesException("No se pudo escrivir en el fichero");
        }

    }

    /**
     * Exporta tots els jugadors a un fitxer CSV
     *
     * @param fitx
     * @param dades
     * @throws DadesException
     */
    public static void exportaJugadorsACSV(File fitx, Equips dades) throws DadesException {
        try {
            if (!fitx.exists()) {
                fitx.createNewFile();
            }
        } catch (IOException ex) {
            throw new DadesException("No se ha podido crear el archivo.");
        }

        ArrayList<Equip> equips = dades.getEquips();
        ArrayList<Jugador> jugadors;
        
        try {
            FileWriter texto = new FileWriter(fitx);
            BufferedWriter escritor = new BufferedWriter(texto);

            for (Equip equip : equips) {
                jugadors = equip.getJugadors();
                for (Jugador jugador : jugadors) {
                    System.out.println(jugador.toString());
                    escritor.write(jugador.toString());
                    escritor.newLine();
                }
            }
            escritor.close();
        } catch (IOException ex) {
            throw new DadesException("No se pudo escrivir en el fichero");
        }
    }
}
