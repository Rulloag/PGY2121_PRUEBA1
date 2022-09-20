package attlas1;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.setID(1000);
        usuario1.setNombreUsuario("dcog");
        usuario1.setRut(16191331);
        usuario1.setDV("k");
        usuario1.setNombreUsuario("roberto");
        usuario1.setSegundoNombre("jose");
        usuario1.setApellidoPaterno("mendes");
        usuario1.setApellidoMaterno("cancino");
        usuario1.setFechaDeNacimiento(new Date());
        usuario1.setEmail("roberto.dcg@gmail.com");
        usuario1.setContracena("1234gg");
        usuario1.setTelefono(999999999);

        Usuario usuario2 = new Usuario();
        usuario2.setID(1001);
        usuario2.setNombreUsuario("dcog");
        usuario2.setRut(15191331);
        usuario2.setDV("k");
        usuario2.setPrimernombre("rodrigo");
        usuario2.setSegundoNombre("alexander");
        usuario2.setApellidoPaterno("ulloa");
        usuario2.setApellidoMaterno("gonzalez");
        usuario2.setFechaDeNacimiento(new Date());
        usuario2.setEmail("rodrigo.dcg@gmail.cl");
        usuario2.setContracena("21234gj");
        usuario2.setTelefono(999999999);

        Usuario usuario3 = new Usuario();
        usuario3.setID(1002);
        usuario3.setNombreUsuario("dco");
        usuario3.setRut(17191331);
        usuario3.setDV("k");
        usuario3.setPrimernombre("joaquin");
        usuario3.setSegundoNombre("mateo");
        usuario3.setApellidoPaterno("peres");
        usuario3.setApellidoMaterno("gomez");
        usuario3.setFechaDeNacimiento(new Date());
        usuario3.setEmail("rodrigo.dcg@gmail.cl");
        usuario3.setContracena("1234gj");
        usuario3.setTelefono(999999999);
        ClubDeportivo ClubDeportivo1 = new ClubDeportivo();
        ClubDeportivo1.setNombreFundador("");
        ClubDeportivo1.setAnoFundacion(0);
        ClubDeportivo1.setRol("");
        ClubDeportivo1.setPais("");
        ClubDeportivo1.setColores("");
        ClubDeportivo1.setValorSuscripcion("0");
        ClubDeportivo1.setLema("");

        ClubDeportivo ClubDeportivo2 = new ClubDeportivo();
        ClubDeportivo2.setNombreFundador("");
        ClubDeportivo2.setAnoFundacion(0);
        ClubDeportivo2.setRol("");
        ClubDeportivo2.setPais("");
        ClubDeportivo2.setColores("");
        ClubDeportivo2.setValorSuscripcion("0");
        ClubDeportivo2.setLema("");

        ClubDeportivo ClubDeportivo3 = new ClubDeportivo();
        ClubDeportivo3.setNombreFundador("");
        ClubDeportivo3.setAnoFundacion(0);
        ClubDeportivo3.setRol("");
        ClubDeportivo3.setPais("");
        ClubDeportivo3.setColores("");
        ClubDeportivo3.setValorSuscripcion("");
        ClubDeportivo3.setLema("");

        Subcripcion subcripcion1 = new Subcripcion();

        subcripcion1.setNumeroSubcripcion(0);
        //subcripcion1.setClubDeportivo("");
        //subcripcion1.setUsuario("");
        subcripcion1.setInicioSubcripcion(new Date());
        subcripcion1.setAbonoTotal(0);

        Subcripcion subcripcion2 = new Subcripcion();

        Subcripcion2.setNumeroSubcripcion(
                0);
        {
            Subcripcion2.setClubDeportivo("");
            Subcripcion2.setUsuario("");
            Subcripcion2.setInicioSubcripcion(new Date("1000,02.08"));
            Subcripcion2.setAbonoTotal(0);

            Subcripcion subcripcion3 = new Subcripcion();
            subcripcion3.setNumeroSubcripcion(0);
            subcripcion3.setClubDeportivo(ClubDeportivo3);
            subcripcion3.setUsuario(usuario3);
            subcripcion3.setInicioSubcripcion(new Date("1000,02,08"));
            subcripcion3.setAbonoTotal(0);

        }
    }

}
