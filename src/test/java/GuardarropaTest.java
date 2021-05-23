import domain.atuendos.*;
import domain.usuario.Guardarropa;
import domain.usuario.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuardarropaTest {
  Color negro;
  Color blanco;
  Color rojo;
  Color verde;
  Color azul;
  RangoDeTemperaturas frio;
  RangoDeTemperaturas calor;
  List<Prenda> prendasGuardarropa;
  Guardarropa guardarropa;
  Usuario ian;
  List<Usuario> dueniosGuardarropa;

  @BeforeEach
  public void setup() throws Exception {
    negro = new Color(256,256,256);
    blanco = new Color(0,0,0);
    rojo = new Color(256,0,0);
    verde = new Color(0,256,0);
    azul = new Color(0,0,256);
    frio = new RangoDeTemperaturas(-10.00,20.00);
    calor = new RangoDeTemperaturas(20.00,100.00);

    ian = new Usuario();
    dueniosGuardarropa = new ArrayList<>();
    dueniosGuardarropa.add(ian);
    prendasGuardarropa = new ArrayList<>();
    guardarropa = new Guardarropa(dueniosGuardarropa, prendasGuardarropa);

    Prenda camperaInvernal = new Prenda(Categoria.PARTE_SUPERIOR, Tipo.CAMPERA, new Tela(Material.FRIZA),frio, negro);
    Prenda musculosaRoja = new Prenda(Categoria.PARTE_SUPERIOR, Tipo.MUSCULOSA, new Tela(Material.ALGODON), calor, rojo);
    Prenda sweaterVerde = new Prenda(Categoria.PARTE_SUPERIOR, Tipo.SWEATER, new Tela(Material.LANA), frio, verde);
    Prenda bermudaAzul = new Prenda(Categoria.PARTE_INFERIOR, Tipo.BERMUDA, new Tela(Material.JEAN), calor, azul);
    Prenda jeanNegro = new Prenda(Categoria.PARTE_INFERIOR, Tipo.PANTALON, new Tela(Material.JEAN), frio, negro);
    Prenda shortBlanco = new Prenda(Categoria.PARTE_INFERIOR, Tipo.SHORT, new Tela(Material.ALGODON), calor, blanco);
    Prenda zapatosDeCuero = new Prenda(Categoria.CALZADO, Tipo.ZAPATO, new Tela(Material.CUERO), new RangoDeTemperaturas(), negro);
    Prenda ojotasBlancas = new Prenda(Categoria.CALZADO, Tipo.OJOTA, new Tela(Material.PLASTICO), calor, blanco);
    Prenda bufandaNegra = new Prenda(Categoria.ACCESORIO, Tipo.BUFANDA, new Tela(Material.LANA), frio, negro);
    Prenda anillo = new Prenda(Categoria.ACCESORIO, Tipo.ANILLO, new Tela(Material.SEDA), new RangoDeTemperaturas(), negro);

    guardarropa.agregarPrendas(camperaInvernal,musculosaRoja,sweaterVerde,bermudaAzul,jeanNegro,shortBlanco,zapatosDeCuero,ojotasBlancas,bufandaNegra);
  }

  @Test
  public void testImpresionPrendas(){
    System.out.println(guardarropa.listarPrendasEnGuardarropa());
    Integer a = 6;
    guardarropa.sugerirEliminarPrenda(guardarropa.obtenerPrendaSeleccionada(a));
    System.out.println(guardarropa.listarPrendasAEliminar());
    guardarropa.eliminarPrendaRecomendada(1);
    System.out.println(guardarropa.listarPrendasAEliminar());
    System.out.println(guardarropa.listarPrendasEnGuardarropa());
  }
}
