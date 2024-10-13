package org.example;

public class Media {

    public double mediaDigitos(int numero) {
        if (numero == 0) {
            return 0.0;
        }

        int soma = 0;
        int quantidade = 0;
        int n = numero;

        if (n < 0) {
            n = -n;
        }

        while (n > 0) {
            soma += n % 10;
            quantidade++;
            n /= 10;
        }

        return (double) soma / quantidade;
    }
}
