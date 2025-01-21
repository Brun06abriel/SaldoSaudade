/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.*;
import java.time.LocalDateTime;



/**
 *
 * @author Bruno & Domênica
 */
public class Funcionario {
    private int id;
    private String nome;
    private String CPF;
    private LocalDate DataAdmissao;
    private String cargo;   
    private Float SalarioBase;
    private Float HorasTrabalhadas;
    private Float ValorHora;  

public double CalcularSalario(Float SalarioBase, Float HrsTrabalhadas){
  double TotalSalario;
   ValorHora = (SalarioBase / 30);
   TotalSalario = ValorHora * this.getHorasTrabalhadas();
   return TotalSalario;
};

    

// Getters e Setters  
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(Float SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public double getHorasTrabalhadas() {
        return HorasTrabalhadas;
    }

    public void setHorasTrabalhadas(Float HorasTrabalhadas) {
        this.HorasTrabalhadas = HorasTrabalhadas;
    }

    public double getValorHora() {
        return ValorHora;
    }

    public void setValorHora(Float ValorHora) {
        this.ValorHora = ValorHora;
    }

    public void setDataAdmissao(java.util.Date dataAdmissao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
