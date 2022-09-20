
package attlas1;

import java.util.Date;

public class ClubDeportivo {
    
    private String NombreDelClub;
    private String NombreFundador;
    private int    AnoFundacion;
    private String Rol;
    private String Pais;
    private String Colores;
    private String valorSuscripcion;
    private String Lema;
    

    public ClubDeportivo(String NombreDelClub, String NombreFundador, int AnoFundacion, String Rol, String Pais, String Colores, String valorSuscripcion, String Lema) {
        this.NombreDelClub = NombreDelClub;
        this.NombreFundador = NombreFundador;
        this.AnoFundacion = AnoFundacion;
        this.Rol = Rol;
        this.Pais = Pais;
        this.Colores = Colores;
        this.valorSuscripcion = valorSuscripcion;
        this.Lema = Lema;
    }
    public ClubDeportivo(){
        this.NombreDelClub ="";
        this.NombreFundador = "";
        this.AnoFundacion = 0;
        this.Rol = "";
        this.Pais = "";
        this.Colores = "";
        this.valorSuscripcion ="";
        this.Lema = "";
    }

    public String getNombreDelClub() {
        return NombreDelClub;
    }

    public void setNombreDelClub(String NombreDelClub) {
        this.NombreDelClub = NombreDelClub;
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public int getAnoFundacion() {
        return AnoFundacion;
    }

    public void setAnoFundacion(int AnoFundacion) {
        this.AnoFundacion = AnoFundacion;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }

    public String getValorSuscripcion() {
        return valorSuscripcion;
    }

    public void setValorSuscripcion(String valorSuscripcion) {
        this.valorSuscripcion = valorSuscripcion;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    
}
