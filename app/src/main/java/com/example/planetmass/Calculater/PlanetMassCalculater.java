package com.example.planetmass.Calculater;

import android.widget.TextView;

public class PlanetMassCalculater{

    double Kilo_TO_POUND=2.2045;
    double POUND_TO_KILO=0.45359237;
    double Mars= 0.38;
    double Venus=0.91;
    double Jupiter=2.34;
    double Saturn=1.06;
    double Uranus=0.90;
    double Neptun=1.14;
    double Mercure=0.38;



    public double calculateGravity(double personGravity, int position){

        double result=0.0;
        switch (position){
            case 0:result=personGravity*Mercure;
                break;
            case 1:result=personGravity*Venus;
                break;
            case 2:result=personGravity*Mars;
                break;
            case 3:result=personGravity*Jupiter;
                break;
            case 4:result=personGravity*Saturn;
                break;
            case 5:result=personGravity*Uranus;
                break;
            case 6:result=personGravity*Neptun;
                break;
        }

        return poundToKilo(result);
    }

    public double kiloToPound(double kilo){

        return kilo*Kilo_TO_POUND;

    }

    public double poundToKilo(double pound){

        return pound*POUND_TO_KILO;
    }

}
