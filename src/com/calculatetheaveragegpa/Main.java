package com.calculatetheaveragegpa;
public class Main {
     public static void main(String[] args) {
        double[] gpas = {4.0, 3.4, 2.5, 1.0, 3.0};
        double average = getGpasAverage(gpas);
        System.out.println("the average of provided GPAS is " + average);
    }
    private static double getGpasAverage(double[] gpas) {
        double sum = 0.0, average = 0.0;
        //int count = gpas.length;
        for(int  count = 0; count < gpas.length; count++) {
             sum = average + gpas[count]; 

        }
        average = sum / gpas.length;
        return average;
    }
}