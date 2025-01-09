package org.example.springin;

public class Vodka extends Alko{
    private int gradus;
    private double chena;
    private String sortYada;

    public static class Builder{
        private int gradus;
        private double chena;
        private String sortYada;

        public Builder(int gradus) {
            this.gradus = gradus;
        }

        public Builder(String sortYada) {
            this.sortYada = sortYada;
        }


        public Builder(double chena) {
            this.chena = chena;
        }


    }
    private Vodka(Builder builder){
        gradus= builder.gradus;
        chena= builder.chena;
        sortYada= builder.sortYada;

    }
}
