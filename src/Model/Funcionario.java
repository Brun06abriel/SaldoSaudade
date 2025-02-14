/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.text.DecimalFormat;
import java.time.*;

public class Funcionario {
 private int id;
 private String nome;
 private String CPF;
 private LocalDate DataAdmissao;
 private int cargo;
 private String cargoDesc; 
 private Float SalarioBase;
 private int HorasDeTrabalho;
 private Float ValorHora;
 private int turno;
 private String turnoDesc;
    
    // Getters e Setters
    public String getCargoDesc() {
        return cargoDesc;
    }

    public void setCargoDesc(String cargoDesc) {
        this.cargoDesc = cargoDesc;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public String getTurnoDesc() {
        return turnoDesc;
    }

    public void setTurnoDesc(String turnoDesc) {
        this.turnoDesc = turnoDesc;
    }
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDate getDataAdmissao() {
        return DataAdmissao;
    }

    public void setDataAdmissao(LocalDate DataAdmissao) {
        this.DataAdmissao = DataAdmissao;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(Float SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public double getHorasDeTrabalho() {
        return HorasDeTrabalho;
    }

    public void setHorasDeTrabalho(int HorasTrabalhadas) {
        this.HorasDeTrabalho = HorasTrabalhadas;
    }

    public Float getValorHora() {
        return ValorHora;
    }

    public void setValorHora(Float ValorHora) {
        this.ValorHora = ValorHora;
    }
}