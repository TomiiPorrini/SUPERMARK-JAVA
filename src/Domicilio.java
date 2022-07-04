public class Domicilio{
    //Atributos
    private int id;
    private String calle1;
    private String calle2;
    private int numero;
    private String ruta;
    private int km;
    private int depNumero;
    private int piso;
    private int id_localidad;

    //Constructor por defecto
    public Domicilio(){

    }
    //Constructor normal
    public Domicilio(int id, String calle1, String calle2, int numero, String ruta, int km, int depNumero, int piso, int id_localidad){
        this.id = id;
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.numero = numero;
        this.ruta = ruta;
        this.km = km;
        this.depNumero = depNumero;
        this.piso = piso;
        this.id_localidad = id_localidad;
    }
    //getters y setters
  
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCalle1() {
        return calle1;
    }
    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }
    public String getCalle2() {
        return calle2;
    }
    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getRuta() {
        return ruta;
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
    public int getDepNumero() {
        return depNumero;
    }
    public void setDepNumero(int depNumero) {
        this.depNumero = depNumero;
    }
    public int getPiso() {
        return piso;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }
    public int getId_localidad() {
        return id_localidad;
    }
    public void setId_localidad(int id_localidad) {
        this.id_localidad = id_localidad;
    }

}