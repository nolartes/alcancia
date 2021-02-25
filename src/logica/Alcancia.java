/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Nicolas
 */
public class Alcancia implements Serializable {

    // private ArrayList<Integer> monedas;
    private Map<Integer, Integer> monedas = new HashMap<>();

    public Alcancia() {
        this.monedas.put(50, 0);
        this.monedas.put(100, 0);
        this.monedas.put(200, 0);
        this.monedas.put(500, 0);
        this.monedas.put(1000, 0);
    }

    public void agregarMoneda(Integer valor, Integer cantidad) {
        this.monedas.put(valor, this.monedas.get(valor) + cantidad);
    }
    
    public int contarMonedas() {
        int aux = 0;
        for(Integer key : this.monedas.keySet()) {
            aux += this.monedas.get(key);
        }
        return aux;
    }

    public int getMonedas(int valor) {
        return this.monedas.get(valor);
    }
    
    public int calcularTotal() {
        int total = 0;
        for(Integer key : this.monedas.keySet()) {
            total += key*this.monedas.get(key);
        }
        return total;
    }
}
