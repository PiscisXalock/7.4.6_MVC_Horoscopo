/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Utilidades {
    public static ArrayList<String> getMeses(){
        ArrayList<String> meses = new ArrayList<String>();
        for(int i = 1; i <= 12; i++){
            meses.add(String.valueOf(i));
        }
        return meses;
    }
    
    public static ArrayList<String> getDias(){
        ArrayList<String> dias = new ArrayList<String>();
        for(int i = 1; i <= 31; i++){
            dias.add(String.valueOf(i));
        }
        return dias;
    }
    
    public static String getHoroscopo( int dia, int mes ){
        String signo = "";
        switch (mes){
            case 1: 
                if(dia > 20){
                    signo="Acuario";
                }else{
                    signo="Capricornio";
                }
                break;
            case 2: 
                if(dia>20){
                    if(dia <= 29){
                        signo="Piscis";
                    }
                    else{
                        signo = "La fecha introducida es invalida, Febrero no puede tener más de 29 días";
                    }
                }else{
                    signo="Acuario";
                }
                break;
            case 3: 
                if(dia > 20){
                    signo="Aries";
                }else{
                    signo="Piscis";
                }
                break;
            case 4:
                if(dia > 20){
                    if(dia <= 30){
                        signo = "Tauro";
                    }else{
                        signo = "La fecha introducida es invalida, Abril no puede tener más de 30 días";
                    }
                }else{
                    signo = "Aries";
                }
                break;
            case 5:
                if(dia > 20){
                    signo = "Géminis";
                }else{
                    signo = "Tauro";
                }
                break;
            case 6:
                if(dia > 21){
                    if(dia <= 30){
                        signo = "Cáncer";
                    }else{
                        signo = "La fecha introducida es invalida, Junio no puede tener más de 30 días";
                    }
                }else{
                    signo = "Géminis";
                }
                break;
            case 7:
                if(dia > 22){
                    signo = "Leo";
                }else{
                    signo = "Cáncer";
                }
                break;
            case 8:
                if(dia > 22){
                    signo = "Virgo";
                }else{
                    signo = "Leo";
                }
                break;
            case 9:
                if(dia > 22){
                    if(dia <= 30){
                        signo = "Libra";
                    }else{
                        signo = "La fecha introducida es invalida, Septiembre no puede tener más de 30 días";
                    }
                }else{
                    signo = "Virgo";
                }
                break;
            case 10:
                if(dia > 22){
                    signo = "Escorpio";
                }else{
                    signo = "Libra";
                }
                break;
            case 11:
                if(dia > 22){
                    if(dia <= 30){
                        signo = "Sagitario";
                    }else{
                        signo = "La fecha introducida es invalida, Noviembre no puede tener más de 30 días";
                    }
                }else{
                    signo = "Escorpio";
                }
                break;
            case 12:
                if(dia > 21){
                    signo = "Capricornio";
                }else{
                    signo = "Sagitario";
                }
                break;
        }
        return signo;
    }
    
}
