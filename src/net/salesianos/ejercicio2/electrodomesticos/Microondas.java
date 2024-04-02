package net.salesianos.ejercicio2.electrodomesticos;

import net.salesianos.ejercicio2.Electrodomestico;

public class Microondas extends Electrodomestico {
  private boolean puertaAbierta;

  public Microondas(String marca, String modelo, float peso, float potencia, boolean estaEncendido,
      boolean puertaAbierta) {
    super(marca, modelo, peso, potencia, estaEncendido);
    this.puertaAbierta = puertaAbierta;
  }

  public String isPuertaAbierta() {
    return puertaAbierta? "Abierta" : "Cerrada";
  }


  public void setPuertaAbierta(boolean puertaAbierta) {
    this.puertaAbierta = puertaAbierta;
  }

  @Override
  public void encender() {
    System.out.println("Algo huele a quemado");
    if (puertaAbierta) {
      puertaAbierta = false;
    }
    super.encender();
  }

  @Override
  public String toString() {
    return "------------------------------------------------------------------------------------------------- \n" +
    "* Tipo de electrodoméstico: Microondas. \n"+
    "* Marca: " + this.getMarca() + "\n" +
    "* Modelo: " + this.getModelo() + "\n" +
    "* Peso: " + this.getPeso() + " Kg\n" +
    "* Potencia: " + this.getPotencia() + " kW\n" +
    "* Puerta: " + this.isPuertaAbierta() + "\n" +
    "* Está encendido: " + this.isEstaEncendido() + "\n" +
    "------------------------------------------------------------------------------------------------- ";
  }

  
}
