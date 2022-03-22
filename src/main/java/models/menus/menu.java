package models.menus;

import models.productos.producto;

import java.util.ArrayList;

public class menu {
    private int id;
    private String nombre;
    private String descripcion;
    private ArrayList<producto> productos = new ArrayList<producto>();

    public menu(int id, String nombre, String descripcion, ArrayList<producto> productos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<producto> productos) {
        this.productos = productos;
    }
}
