package domain.usuario;

import domain.atuendos.Prenda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Guardarropa {
  private List<Usuarie> duenios = new ArrayList<>();
  private List<Prenda> prendas = new ArrayList<>();
  private List<Prenda> sugerenciasAgregar = new ArrayList<>();
  private List<Prenda> sugerenciasEliminar = new ArrayList<>();

  public Guardarropa(Usuarie duenio) {
    this.duenios.add(duenio);
  }

  public Guardarropa(List<Usuarie> duenios) {
    this.duenios = duenios;
  }

  public void agregarPrendas(Prenda ... prendas){
    Collections.addAll(this.getPrendas(),prendas);
  }

  public void agregarDuenios(Usuarie... duenios){
    Collections.addAll(this.getDuenios(),duenios);
  }

  public List<Usuarie> getDuenios() {
    return duenios;
  }

  public List<Prenda> getSugerenciasAgregar() {
    return sugerenciasAgregar;
  }

  public List<Prenda> getSugerenciasEliminar() {
    return sugerenciasEliminar;
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void sugerirPrenda(Prenda prenda){
    this.getSugerenciasAgregar().add(prenda);
  }

  public void sugerirEliminarPrenda(Prenda prenda){
    if (!this.estaEnElGuardarropa(prenda)){
      throw new RuntimeException("ERROR! La prenda que recomienda eliminar no forma parte de las prendas del guardarropa.");
    }
    this.getSugerenciasEliminar().add(prenda);
  }

  private boolean estaEnElGuardarropa(Prenda prenda) {
    return this.getPrendas().contains(prenda);
  }

  public String listarPrendasAEliminar(){
    StringBuilder texto = new StringBuilder("Selecciona la prenda que quieras eliminar de las recomendadas por otros usuarios: \n ");
    List<Prenda> listaAEliminar = this.getSugerenciasEliminar();
    texto.append(listarPrendas(listaAEliminar));
    return texto.toString();
  }

  public String listarPrendasAAgregar(){
    StringBuilder texto = new StringBuilder("Selecciona la prenda que quieras agregar de las recomendadas por otros usuarios: \n ");
    List<Prenda> listaAAgregar = this.getSugerenciasAgregar();
    texto.append(listarPrendas(listaAAgregar));
    return texto.toString();
  }

  public String listarPrendasEnGuardarropa(){
    StringBuilder texto = new StringBuilder("Selecciona la prenda que quieras seleccionar del guardarropa: \n\n");
    List<Prenda> listaASeleccionar = this.getPrendas();
    texto.append(listarPrendas(listaASeleccionar));
    return texto.toString();
  }

  public Prenda obtenerPrendaSeleccionada(Integer seleccion){
    Integer posicion = seleccion - 1;
    return this.getPrendas().get(posicion);
  }

  public void eliminarPrendaRecomendada(Integer seleccion){
    Integer posicion = seleccion - 1;
    Prenda prendaABorrar = this.getSugerenciasEliminar().get(posicion);
    this.getSugerenciasEliminar().remove(prendaABorrar);
    this.getPrendas().remove(prendaABorrar);
  }

  public void agregarPrendaRecomendada(Integer seleccion){
    Integer posicion = seleccion - 1;
    Prenda prendaAAgregar = this.getSugerenciasAgregar().get(posicion);
    this.getSugerenciasAgregar().remove(posicion);
    this.getPrendas().add(prendaAAgregar);
  }

  private String listarPrendas(List<Prenda> listaPrendas) {
    Integer i;
    StringBuilder listadoPrendas = new StringBuilder();
    for(i = 0; i< listaPrendas.size(); i++){
      listadoPrendas.append("   Prenda N??" + (i+1) + ": " + listaPrendas.get(i).descripcion() + "\n");
    }
    return listadoPrendas.toString();
  }


}
