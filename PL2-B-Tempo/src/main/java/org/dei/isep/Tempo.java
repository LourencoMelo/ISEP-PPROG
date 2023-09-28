package org.dei.isep;

public class Tempo {

   private int hora;
   private int minuto;
   private int segundos;

   private static final int HORA_POR_OMISSAO = 0;
   private static final int MINUTO_POR_OMISSAO = 0;
   private static final int SEGUNDOS_POR_OMISSAO = 0;

   public Tempo(int hora, int minuto, int segundos){
       this.hora = hora;
       this.minuto = minuto;
       this.segundos = segundos;
   }

   public Tempo(){
       this.hora = HORA_POR_OMISSAO;
       this.minuto = HORA_POR_OMISSAO;
       this.segundos = SEGUNDOS_POR_OMISSAO;
   }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString(){
       return String.format("%02d:%02d:%02d", hora, minuto, segundos);
    }

    public String AmOrPm(){
       if(hora>= 0 && hora <= 24){
           if(hora >= 12 && hora <= 24){
               return String.format("%02d:%02d:%02d PM",hora, minuto, segundos);
           }else if(hora == 0){
               return String.format("%02d:%02d:%02d AM", hora + 12, minuto, segundos);
           }else if(hora == 24){
               return String.format("%02d:%02d:%02d PM", hora - 12, minuto, segundos);
           }else{
               return String.format("%02d:%02d:%02d PM",hora, minuto, segundos);
           }
       }
       return null;
    }

    public String add1Second(){
       if(segundos == 60){
           if(minuto == 60){
               hora ++;
               minuto = 0;
               segundos = 0;
           }
           minuto ++;
           segundos = 0;
       }else{
           segundos ++;
       }
       return String.format("%02d:%02d:%02d",hora, minuto, segundos);
    }

    public boolean isMaior(Tempo outroTempo){
       if(hora > outroTempo.hora){
            return true;
       }else if(hora == outroTempo.hora){
            if(minuto > outroTempo.minuto){
                return true;
            }else if(minuto == outroTempo.minuto){
                if(segundos > outroTempo.segundos){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
       }else{
            return false;
       }
    }

    public boolean isMaior(int horas, int minutos, int segundos){
        if(this.hora > horas){
            return true;
        }else if(this.hora == horas){
            if(this.minuto > minutos){
                return true;
            }else if(this.minuto == minutos){
                if(this.segundos > segundos){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public int diferençaSegundos(Tempo outroTempo){
       int diferençaTotal, segundoTotal1, segundoTotal2;
       segundoTotal1 = (hora *3600) + (minuto * 60) + segundos;
       segundoTotal2 = (outroTempo.hora * 3600) + (outroTempo.minuto *60) + outroTempo.segundos;
       diferençaTotal = Math.abs(segundoTotal1-segundoTotal2);
       return diferençaTotal;
    }
}
