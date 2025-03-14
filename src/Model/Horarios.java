/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Horarios {
 private int id ;
 private String turno;
 private String diaSemana;
 private String HEntrada;
 private String HSaida;
 private int cargaHoraria;
 private int Diastrabalhomes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHEntrada() {
        return HEntrada;
    }

    public void setHEntrada(String HEntrada) {
        this.HEntrada = HEntrada;
    }

    public String getHSaida() {
        return HSaida;
    }

    public void setHSaida(String HSaida) {
        this.HSaida = HSaida;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getDiastrabalhomes() {
        return Diastrabalhomes;
    }

    public void setDiastrabalhomes(int Diastrabalhomes) {
        this.Diastrabalhomes = Diastrabalhomes;
    }
 

    
    
}
