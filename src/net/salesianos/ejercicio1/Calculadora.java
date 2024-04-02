package net.salesianos.ejercicio1;

public class Calculadora {
  public static int sumarElevadosN(int numero) {
    int resultado = 0;
    for (int i = 0; i <= numero; i++) {
      resultado += Math.pow(i, 2);
    }
    return resultado;
  }

  public static float calcularMediaNotas(float[] numeros) {
    float sumatorio = 0;
    for (int i = 0; i < numeros.length; i++) {
      sumatorio += numeros[i];
    }
    float resultado = (sumatorio / numeros.length);
    return resultado;
  }
}
