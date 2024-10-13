package org.example;

public class Geometria {

    // Método para calcular a área do retângulo
    public int area(int base, int altura) {
        return base * altura;
    }

    // Método para calcular o perímetro do retângulo
    public int perimetro(int base, int altura) {
        return 2 * (base + altura);
    }

    // Método para verificar se um triângulo é possível
    public int isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return 1; // Triângulo possível
        }
        return 0; // Triângulo impossível
    }
}