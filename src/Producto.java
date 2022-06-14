import java.sql.Date;

public class Producto {
    
    // Atributos
    private Integer id;
    private String nombre;
    private String marca;
    private Date f_venc;
    private double precio;
    private Integer stock;
    private static final int maximo=30; //consultar

    // Constructor
    public Producto(String nombre, String marca, Date f_venc, double precio, Integer stock){
        this.nombre = nombre;
        this.marca = marca;
        this.f_venc = f_venc;
        this.precio = precio;
        this.stock = stock;
    }

    // getters y setters
    public Integer getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }
    
    public Date getF_venc() {
        return f_venc;
    }

    public double getPrecio() {
        return precio;
    }
    
    public Integer getStock() {
        return stock;
    }
    // Metodos
}
