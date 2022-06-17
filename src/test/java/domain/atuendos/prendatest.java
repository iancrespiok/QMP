package domain.atuendos;
import domain.usuario.Usuarie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class prendatest {
    @Test
    public void laParteDeAbajoDeAtuendoFormalEsUnPantalonDeVestir(){
        //TODO
    }

    public void creoUnaPrendaDeAPocoYLaGuardoAlGuardarropa() throws Exception {
        Usuarie iancrespiok = new Usuarie();

        iancrespiok.setearCategoria(Categoria.CALZADO);
        iancrespiok.setearColorPrimario(new Color(123,241,233));
        ///////me pinta hacer otra cosa
        iancrespiok.setearTela(new Tela(Material.ALGODON,Trama.A_CUADROS));
        /////bueno voy a ver que onda pusheando esta prenda, capaz no es valida
        iancrespiok.guardarPrenda(0);

        assertEquals(iancrespiok.getGuardarropa(0).getPrendas().get(0).getCategoria(), Categoria.CALZADO);

    }
}
