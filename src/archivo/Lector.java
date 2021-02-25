/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import logica.Alcancia;

/**
 *
 * @author Nicolas
 */
public class Lector {
    private String nombreArchivo;

    public Lector() {
        this.nombreArchivo = "alcancia.bin";
    }
    
    public Alcancia leer() {
        Alcancia alcancia = null;
        
        try {
            FileInputStream lectorDeBytes = new FileInputStream(this.nombreArchivo);
            ObjectInputStream lectorDeObjetos = new ObjectInputStream(lectorDeBytes);
            
            alcancia = (Alcancia) lectorDeObjetos.readObject();
        } catch(FileNotFoundException error) {
            System.err.println("Hubo un error, archivo no encontrado para lectura...");
        } catch(IOException error) {
            System.err.println("Hubo un error leyendo el archivo...");
        } catch(ClassNotFoundException error) {
            System.err.println("Hubo un error en la conversión del objeto leído...");
        } finally {
            return alcancia;
        }
    }
}
