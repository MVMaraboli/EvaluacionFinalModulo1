/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acitividades_curso.evaluacionfinalmodulo1;

/**
 *
 * @author Leon DeBurgh
 */
public class television extends electrodomesticos {
    private int resolucion;
    private boolean sint;

    public television() {
        
    }

    public television(int resolucion, boolean sint) {
        this.resolucion = resolucion;
        this.sint = sint;
    }

    public television(int resolucion, boolean sint, int precio_base, int peso, String consumo, String color, String descrip) {
        super(precio_base, peso, consumo, color, descrip);
        this.resolucion = resolucion;
        this.sint = sint;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSint() {
        return sint;
    }

    public void setSint(boolean sint) {
        this.sint = sint;
    }

    public int getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(int precio_base) {
        this.precio_base = precio_base;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
    
}
