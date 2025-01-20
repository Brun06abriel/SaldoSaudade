/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Bruno & Domênica
 */
public class Funcionario {
    private int id;
    private String nome;
    private String CPF;
    private Date DataAdmissao;
    private String cargo;   
    private double SalarioBase;
    private double HorasTrabalhadas;
    private double ValorHora;  

public double CalcularSalario(double SalarioBase,double HrsTrabalhadas){
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

    public Date getDataAdmissao() {
        return DataAdmissao;
    }

    public void setDataAdmissao(Date DataAdmissao) {
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

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public double getHorasTrabalhadas() {
        return HorasTrabalhadas;
    }

    public void setHorasTrabalhadas(double HorasTrabalhadas) {
        this.HorasTrabalhadas = HorasTrabalhadas;
    }

    public double getValorHora() {
        return ValorHora;
    }

    public void setValorHora(double ValorHora) {
        this.ValorHora = ValorHora;
    }
    
}
