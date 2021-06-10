package domain.usuario.acciones;

import domain.clima.Alerta;

public interface AccionPorAlerta {

  void ejecutar(Alerta alerta);

}
