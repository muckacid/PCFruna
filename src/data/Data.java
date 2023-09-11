/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.awt.List;
import java.util.ArrayList;
import model.Cliente;
import model.Producto;
import model.Proveedor;

/**
 *
 * @author morag
 */
public class Data {

    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Proveedor> proveedos;
    
    public Data() {
        productos = new ArrayList();
        clientes = new ArrayList();
        proveedos = new ArrayList();
    }
    
    public void insertarProducto(Producto producto){
        productos.add(producto);
    }

    public ArrayList<Producto> getListProduct() {
        return productos;
    }
    
    
}
