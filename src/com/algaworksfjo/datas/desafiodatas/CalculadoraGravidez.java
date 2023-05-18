package com.algaworksfjo.datas.desafiodatas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
    private Date dataUltimoPeriodoMenstrual;

    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }
    private Calendar converterDateParaCalendar(Date data){
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }
    public Date calcularDataEstimadaConcepcao(){
      Calendar calculo = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
        calculo.add(Calendar.WEEK_OF_YEAR,2);
        return calculo.getTime();

    }
    public Date calcularDataEstimadaParto(){
        Calendar calculo = converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
        calculo.add(Calendar.WEEK_OF_YEAR,40);
        return calculo.getTime();
    }
}
