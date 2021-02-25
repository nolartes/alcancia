/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import logica.Alcancia;

/**
 *
 * @author Nicolas
 */
public class Escritor {
    private String nombreArchivo;

    public Escritor() {
        this.nombreArchivo = "alcancia.bin";
    }
    
    public void guardar(Alcancia alcancia) {
        try {
            FileOutputStream escritorDeBytes = new FileOutputStream(this.nombreArchivo);
            ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(escritorDeBytes);
            
            escritorDeObjetos.writeObject(alcancia);
            escritorDeObjetos.close();
        } catch(FileNotFoundException error) {
            System.err.println("El archivo no fue encontrado...");
        } catch(IOException error) {
            System.err.println("Hubo un error en la escritura del archivo...");
        }
    }
}
