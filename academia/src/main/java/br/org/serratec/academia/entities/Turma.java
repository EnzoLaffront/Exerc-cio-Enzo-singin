package br.org.serratec.academia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma")

public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "turma_id")
	private Integer turmaid;
	@Column(name = "nome_Disciplina")
	private String nomeDiscplina;
	@Column(name = "dia_Semana")
	private String diaSemana;
	
	
	@ManyToOne 
	@JoinColumn(name = "instrutor_id")
	private Instrutor instrutor;
	
	public Turma() {
		super();
	}


	public Turma(Integer turmaid, String nomeDiscplina, String diaSemana, Instrutor instrutor) {
		super();
		this.turmaid = turmaid;
		this.nomeDiscplina = nomeDiscplina;
		this.diaSemana = diaSemana;
		this.instrutor = instrutor;
	}


	public Integer getTurmaid() {
		return turmaid;
	}


	public void setTurmaid(Integer turmaid) {
		this.turmaid = turmaid;
	}


	public String getNomeDiscplina() {
		return nomeDiscplina;
	}


	public void setNomeDiscplina(String nomeDiscplina) {
		this.nomeDiscplina = nomeDiscplina;
	}


	public String getDiaSemana() {
		return diaSemana;
	}


	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}


	public Instrutor getInstrutor() {
		return instrutor;
	}


	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}


	@Override
	public String toString() {
		return "Turma [turmaid=" + turmaid + ", nomeDiscplina=" + nomeDiscplina + ", diaSemana=" + diaSemana
				+ ", instrutor=" + instrutor + ", getTurmaid()=" + getTurmaid() + ", getNomeDiscplina()="
				+ getNomeDiscplina() + ", getDiaSemana()=" + getDiaSemana() + ", getInstrutor()=" + getInstrutor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
