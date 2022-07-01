
public class Localizacion {
  private  int  id_localizacion;
  private  String pais;
  private  String provincia;
  private  String dep; 
  private  String  localidad;
  private  String cp;

  //constructor por defecto
  public Localizacion(){

  }
  //constructor normal
  public Localizacion(int id_localizacion, String pais, String provincia, String dep, String localidad, String cp){
    this.id_localizacion = id_localizacion;
    this.pais = pais;
    this.provincia = provincia;
    this.dep = dep;
    this.localidad = localidad;
    this.cp = cp;
  }
  //metodos
public String toString() {
    return "Localizacion [cp=" + cp + ", dep=" + dep + ", id_localizacion=" + id_localizacion + ", localidad="
            + localidad + ", pais=" + pais + ", provincia=" + provincia + "]";
}
  
}
