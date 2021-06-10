package domain.clima;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAlertasMeteoreologicas {
  private static final RepositorioAlertasMeteoreologicas INSTANCE = new RepositorioAlertasMeteoreologicas();
  private RepositorioAlertasMeteoreologicas(){};
  public static RepositorioAlertasMeteoreologicas getInstance() {
    return INSTANCE;
  }

  private List<Alerta> listadoAlertas = new ArrayList<>();

  public Alerta ultimaAlerta(){
    return listadoAlertas.get(listadoAlertas.size()-1);
  }
}
