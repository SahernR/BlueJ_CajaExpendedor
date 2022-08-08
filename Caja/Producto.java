import java.util.*;
/**
 * Write a description of class Producto here.
 *Cuando se empezó a hacer el inventario de los productos de la máquina expendedora, 
 *se decidió también solicitar al reemplazo del desarrollador crear una clase que represente 
 *a un producto.
 *
 *Se sabe que un producto debe identificarse de acuerdo a un código alfanumérico, 
 *como también tener un nombre, descripción y valor.
 *
 *Por otra parte los objetos que se crean de esta clase solo se podrán crear si se tiene 
 *todas las características del producto.
 * @author (Sebastian Ahern)
 * @version (1.0)
 */
public class Producto
{
    // instance variables - replace the example below with your own
    private int codigo;
    private String nombre;
    private String descripcion;
    private int valor;
    private String alert; 
    /**
     * Constructor for objects of class Producto
     */
    public Producto()
    {
        // initialise instance variables
        this.codigo=0;
        this.nombre="";
        this.descripcion="";
        this.valor=0;
    }

    public Producto(int codigo, String nombre, String descripcion, int valor)
    {
        // initialise instance variables
        this.codigo=codigo;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.valor=valor;
    }
     // Getter
    public int getCodigo()
    {
    return this.codigo;
    }
    // Setter
    public void setCodigo()
    {
    this.codigo=codigo;
    }
     // Getter
    public String getNombre()
    {
    return this.nombre;
    }
    // Setter
    public void setNombre()
    {
    this.nombre=nombre;
    }
     // Getter
    public String getDescripcion()
    {
    return this.descripcion;
    }
    // Setter
    public void setDescripcion()
    {
    this.descripcion=descripcion;
    }
     // Getter
    public int getValor()
    {
    return this.valor;
    }
    // Setter
    public void setValor()
    {
    this.valor=valor;
    }
    
    public String insertProducto(int codigo, String nombre, String descripcion, int valor)
    {
    
        if (this.codigo == 0)
            {
                alert = "debe ingresar todos los campos.";
            } 
                else if ((this.nombre.length() == 0 ) || (this.nombre == ""))
                    {
                        alert = "debe ingresar todos los campos.";
                    } 
                else if ((this.descripcion.length() == 0) || (this.descripcion == ""))
                    {
                        alert = "debe ingresar todos los campos.";
                    } 
                else if (this.valor == 0) 
                    {
                        alert = "debe ingresar todos los campos.";
                    } 
                        else 
                            {
                                alert = "Producto guardado exitosamente.";
                            }
    
     return alert;
    }
}