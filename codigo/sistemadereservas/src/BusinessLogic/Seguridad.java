package BussinessLogic;

import Common.Usuario;

public class Seguridad {

    public Seguridad() {
        registroDeUsuarios();
    }


    public Usuario[] arregloUsuarios = new Usuario[5];


    public void registroDeUsuarios() {


        Usuario usuarioAdmin = new Usuario();
        usuarioAdmin.setVgNombreDeUsuario("Admin");
        usuarioAdmin.setVgPassword("123");
        System.out.println("Ingrese su nombre");
        System.out.println(Ingrese su apellido);

        Usuario usuarioClienteOscar = new Usuario("Oscar", "123");
        Usuario usuarioHillary = new Usuario("Hillary", "123");
        Usuario usuarioClienteMelvin = new Usuario("Melvin", "123");
        Usuario usuarioClienteLuis = new Usuario("Luis", "123");
    
        arregloUsuarios[0] = usuarioAdmin;
        arregloUsuarios[1] = usuarioClienteOscar;
        arregloUsuarios[2] = usuarioClienteHillary;
        arregloUsuarios[3] = usuarioClienteMelvin;
        arregloUsuarios[4] = usuarioClienteLuis;
    }

    
    public boolean buscarPorUsuarioClave(String vpUsuario, String vpClave) {
        
         */
        for (int indice = 0; indice < arregloUsuarios.length; indice++) {

        
            String vlUsuario = arregloUsuarios[indice].getVgNombreDeUsuario();
            String vlClave = arregloUsuarios[indice].getVgPassword();

            if (vlClave.equals(vpClave) && vlUsuario.equals(vpUsuario)) {

            
                return true;
            }
        }

        
        return false;
    }

}
