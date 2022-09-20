
package attlas1;

import java.util.Date;


public class Subcripcion {
    
private int NumeroSubcripcion;
private ClubDeportivo ClubDeportivo;
private Usuario Usuario;
private Date InicioSubcripcion;
private int AbonoTotal;


    public Subcripcion(int NumeroSubcripcion,Usuario Usuario,Date InicioSubcripcion,int AbonoTotal,ClubDeportivo ClubDeportivo){
        this.NumeroSubcripcion= NumeroSubcripcion;    
        this.ClubDeportivo = ClubDeportivo;
        this.Usuario = Usuario;
        this.InicioSubcripcion = InicioSubcripcion;
        this. AbonoTotal = AbonoTotal ;
    }
    
    public Subcripcion(){    
        this.NumeroSubcripcion=0;    
        this.ClubDeportivo = new ClubDeportivo();
        this.Usuario = new Usuario();
        this.InicioSubcripcion = new Date();
        this. AbonoTotal = 0 ;
    }    

    public int getNumeroSubcripcion() {
        return NumeroSubcripcion;
    }

    public void setNumeroSubcripcion(int NumeroSubcripcion) {
        this.NumeroSubcripcion = NumeroSubcripcion;
    }

    public ClubDeportivo getClubDeportivo() {
        return ClubDeportivo;
    }

    public void setClubDeportivo(ClubDeportivo ClubDeportivo) {
        this.ClubDeportivo = ClubDeportivo;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public int getAbonoTotal() {
        return AbonoTotal;
    }

    public Date getInicioSubcripcion() {
        return InicioSubcripcion;
    }

    public void setInicioSubcripcion(Date InicioSubcripcion) {
        this.InicioSubcripcion = InicioSubcripcion;
    }

    public void setAbonoTotal(int AbonoTotal) {
        this.AbonoTotal = AbonoTotal;
    }    
    
}
