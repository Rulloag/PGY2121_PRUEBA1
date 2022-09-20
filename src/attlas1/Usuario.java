
package attlas1;

import java.util.Date;




public class Usuario {
    private int    ID;
    private String NombreUsuario;
    private int    Rut;
    private String DV;
    private String Primernombre;
    private String SegundoNombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private Date   FechaDeNacimiento;
    private String Email;
    private String contracena;
    private int    telefono;
           
    
    public Usuario(int ID, String NombreUsuario, int Rut, String DV, String Primernombre, String SegundoNombre, String ApellidoPaterno, String ApellidoMaterno, Date FechaNacimiento, String Email, String contracena, int telefono ) {
        this.ID = ID;
        this.NombreUsuario = NombreUsuario;
        this.Rut = Rut;
        this.DV = DV;
        this.Primernombre = Primernombre;
        this.SegundoNombre = SegundoNombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.FechaDeNacimiento =  new Date ();
        this.Email = Email;
        this.contracena = contracena;
        this.telefono = telefono;
        
    }
    
    public Usuario(){
        this.ID = 0;
        this.NombreUsuario = "";
        this.Rut = 0;
        this.DV = "";
        this.Primernombre = "";
        this.SegundoNombre = "";
        this.ApellidoPaterno = "";
        this.ApellidoMaterno = "";
        this.FechaDeNacimiento = new Date();
        this.Email = "";
        this.contracena = "";
        this.telefono = 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getDV() {
        return DV;
    }

    public void setDV(String DV) {
        this.DV = DV;
    }

    public String getPrimernombre() {
        return Primernombre;
    }

    public void setPrimernombre(String Primernombre) {
        this.Primernombre = Primernombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public Date getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;       
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContracena() {
        return contracena;
    }

    public void setContracena(String contracena) {
        this.contracena = contracena;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }    
    
}
