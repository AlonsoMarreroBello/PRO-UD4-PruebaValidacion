package net.salesianos.ejercicio2;

public class Electrodomestico {
  protected String marca;
  protected String modelo;
  protected float peso;
  protected float potencia;
  protected boolean estaEncendido;
  
  public Electrodomestico(String marca, String modelo, float peso, float potencia, boolean estaEncendido) {
    this.marca = marca;
    this.modelo = modelo;
    this.peso = peso;
    this.potencia = potencia;
    this.estaEncendido = estaEncendido;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public float getPotencia() {
    return potencia;
  }

  public void setPotencia(float potencia) {
    this.potencia = potencia;
  }

  public String isEstaEncendido() {
  return estaEncendido ? "si" : "no";
  }

  public void encender() {
    this.estaEncendido = true;
  }
  
  public void apagar() {
    this.estaEncendido = false;
  }


}
