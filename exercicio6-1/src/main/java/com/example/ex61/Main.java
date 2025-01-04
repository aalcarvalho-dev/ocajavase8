package com.example.ex61;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Main {

/*     public Main(){
        temperaturasArrayPadrao = new float[7];
        temperaturasArrayPadrao[0] = 32.4f;
        temperaturasArrayPadrao[1] = 31.9f;
        temperaturasArrayPadrao[2] = 32.0f;
        temperaturasArrayPadrao[3] = 29.7f;
        temperaturasArrayPadrao[4] = 30.2f;
        temperaturasArrayPadrao[5] = 28.5f;
        temperaturasArrayPadrao[6] = 34.2f;

        temperaturasArrayList = new ArrayList<>();
        temperaturasArrayList.add(32.4f);
        temperaturasArrayList.add(31.9f);
        temperaturasArrayList.add(32.0f);
        temperaturasArrayList.add(29.7f);
        temperaturasArrayList.add(30.2f);
        temperaturasArrayList.add(28.5f);
        temperaturasArrayList.add(34.2f);
    }; */
    public static void main(String[] args) {
        Main main = new Main();
        float[] temperaturasArrayPadrao;
        temperaturasArrayPadrao = new float[7];
        temperaturasArrayPadrao[0] = 32.4f;
        temperaturasArrayPadrao[1] = 31.9f;
        temperaturasArrayPadrao[2] = 32.0f;
        temperaturasArrayPadrao[3] = 29.7f;
        temperaturasArrayPadrao[4] = 30.2f;
        temperaturasArrayPadrao[5] = 28.5f;
        temperaturasArrayPadrao[6] = 34.2f;

        List<Float> temperaturasArrayList;
        temperaturasArrayList = new ArrayList<>();
        temperaturasArrayList.add(32.4f);
        temperaturasArrayList.add(31.9f);
        temperaturasArrayList.add(32.0f);
        temperaturasArrayList.add(29.7f);
        temperaturasArrayList.add(30.2f);
        temperaturasArrayList.add(28.5f);
        temperaturasArrayList.add(34.2f);

        List<BigDecimal> temperaturasBigDecimail;
        temperaturasBigDecimail = new ArrayList<>();
        temperaturasBigDecimail.add(new BigDecimal(32.4));
       /*  temperaturasBigDecimail.add(31.9);
        temperaturasBigDecimail.add(32.0);
        temperaturasBigDecimail.add(29.7);
        temperaturasBigDecimail.add(30.2);
        temperaturasBigDecimail.add(28.5);
        temperaturasBigDecimail.add(34.2); */

        float mediaArrayPadrao = main.encontraTemperaturaMediaArrayPadrao(temperaturasArrayPadrao);
        System.out.println(mediaArrayPadrao);

        Float mediaArrayList = main.encontraTemperaturaMediaArrayList(temperaturasArrayList);
        System.out.println(mediaArrayList);

        BigDecimal mediaBigDecimal= main.encontraTemperaturaMediaBigDecimal(temperaturasBigDecimail);
        System.out.println(mediaBigDecimal);
    }

    private float encontraTemperaturaMediaArrayPadrao(float[] temperaturas){
        float somaTemperaturas = 0f;
        float mediaTemperaturas = 0f;
        for(int i=0; i < temperaturas.length; i++){
            somaTemperaturas+=temperaturas[i];
        };
        System.out.println(temperaturas.length);
        mediaTemperaturas=somaTemperaturas/temperaturas.length;
        return mediaTemperaturas;
    }

    public Float encontraTemperaturaMediaArrayList(List<Float> temperaturas){
        float somaTemperaturas = 0f;
        float mediaTemperaturas = 0f;
        for (Float temperatura : temperaturas){
            somaTemperaturas+=temperatura;
        };
        System.out.println(temperaturas.size());
        mediaTemperaturas=somaTemperaturas/temperaturas.size();
        return mediaTemperaturas;
    }

    public BigDecimal encontraTemperaturaMediaBigDecimal(List<BigDecimal> temperaturas){
        BigDecimal somaTemperaturas = new BigDecimal(0.0);
        BigDecimal mediaTemperaturas = new BigDecimal(0.0);
        for (BigDecimal temperatura : temperaturas){
            somaTemperaturas=somaTemperaturas.add(temperatura);
        };
        System.out.println(temperaturas.size());
        mediaTemperaturas=somaTemperaturas.divide(BigDecimal.valueOf(temperaturas.size()));
        return mediaTemperaturas;
    }
}