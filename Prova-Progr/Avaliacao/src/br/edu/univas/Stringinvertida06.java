package br.edu.univas;

public class Stringinvertida06 {
    static void main(String[] args) {
        String texto = "ola";
        System.out.println("Texto original: " + texto);
        inverteString(texto);
    }

    public static void inverteString(String texto) {
        StringBuilder sb = new StringBuilder(texto);
        sb.reverse();
        System.out.println("Texto invertido: " + sb.toString());
    }
}