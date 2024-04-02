package net.salesianos.ejercicio2.electrodomesticos;

import net.salesianos.ejercicio2.Electrodomestico;

public class Nevera extends Electrodomestico {
  private float temperatura;

  public Nevera(String marca, String modelo, float peso, float potencia, boolean estaEncendido, float temperatura) {
    super(marca, modelo, peso, potencia, estaEncendido);
    this.temperatura = temperatura;
  }

  public float getTemperatura() {
    if (!estaEncendido) {
      return 23;
    } else {
      return temperatura;
    }
  }

  public void setTemperatura(float temperatura) {
    this.temperatura = temperatura;
  }

  @Override
  public void encender() {
    System.out.println("¡Ños, Fuerte pelete!");
    super.encender();
  }

  @Override
  public String toString() {
    return "------------------------------------------------------------------------------------------------- \n" +
    "* Tipo de electrodoméstico: Nevera. \n"+
    "* Marca: " + this.getMarca() + "\n" +
    "* Modelo: " + this.getModelo() + "\n" +
    "* Peso: " + this.getPeso() + " Kg\n" +
    "* Potencia: " + this.getPotencia() + " kW\n" +
    "* Temperatura: " + this.getTemperatura() + " Cº\n" +
    "* Está encendido: " + this.isEstaEncendido() + "\n" +
    "------------------------------------------------------------------------------------------------- ";
  }
}
