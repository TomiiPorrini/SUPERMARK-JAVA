public class Domicilio {

    // Atributos
    private int id_domicilio;
    private String barrio;
    private String calle;
    private boolean dep;
    private String piso;
    private String altura;
    private String manzana;
    private String obs;

    // Constructor por defecto
    public Domicilio() {

    }

    // Constructor normal
    public Domicilio(int id_domicilio, String barrio, String calle, boolean dep, String piso, String altura,
            String manzana, String obs) {
        this.calle = calle;
        this.id_domicilio = id_domicilio;
        this.dep = dep;
        this.piso = piso;
        this.barrio = barrio;
        this.altura = altura;
        this.manzana = manzana;
        this.obs = obs;
    }
    // getters y setters
    public int getId_domicilio() {
        return id_domicilio;
    }

    public void setId_domicilio(int id_domicilio) {
        this.id_domicilio = id_domicilio;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public boolean isDep() {
        return dep;
    }

    public void setDep(boolean dep) {
        this.dep = dep;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    // Metodos
  
    public String toString() {
        return "Domicilio [altura=" + altura + ", barrio=" + barrio + ", calle=" + calle + ", dep=" + dep
                + ", id_domicilio=" + id_domicilio + ", manzana=" + manzana + ", obs=" + obs + ", piso=" + piso + "]";
    }

}
