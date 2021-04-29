package domain.atuendos;
import com.sun.xml.internal.bind.v2.TODO;
import domain.usuario.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class prendatest {
    @Test
    public void laParteDeAbajoDeAtuendoFormalEsUnPantalonDeVestir(){
        //TODO
    }

    public void creoUnaPrendaDeAPocoYLaGuardoAlGuardarropa() throws Exception {
        Usuario iancrespiok = new Usuario();
        iancrespiok.setearCategoria(Categoria.CALZADO);
        iancrespiok.setearColorPrimario(new Color(123,241,233));
        ///////me pinta hacer otra cosa
        iancrespiok.setearTela(new Tela(Material.ALGODON,Trama.A_CUADROS));
        /////bueno voy a ver que onda pusheando esta prenda, capaz no es valida
        iancrespiok.guardarPrenda();

        assertEquals(iancrespiok.getGuardarropa().get(0).getCategoria(), Categoria.CALZADO);

    }
}
