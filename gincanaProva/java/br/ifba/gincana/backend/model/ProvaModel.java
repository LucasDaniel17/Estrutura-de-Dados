package br.ifba.gincana.backend.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "prova")
public class ProvaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long idProva;
	
	@Column(name = "nomeProva", nullable = true)
	private String nomeProva;
	
	@Column(name = "descricaoProva", nullable = true)
	private String descricaoProva;
	
	@Column(name = "dataProva", nullable = true)
	private Date dataProva;
	
	@Column(name = "horarioProva", nullable = true)
	private String horarioProva;
	
	@ManyToOne
	@JoinColumn(name = "idGincana")
	private GincanaModel gincana;
	
	@ManyToOne
	@JoinColumn(name = "idAgenda")
	private AgendaModel agenda;

	public long getIdProva() {
		return idProva;
	}

	public void setIdProva(long idProva) {
		this.idProva = idProva;
	}

	public String getNomeProva() {
		return nomeProva;
	}

	public void setNomeProva(String nomeProva) {
		this.nomeProva = nomeProva;
	}

	public String getDescricaoProva() {
		return descricaoProva;
	}

	public void setDescricaoProva(String descricaoProva) {
		this.descricaoProva = descricaoProva;
	}

	public Date getDataProva() {
		return dataProva;
	}

	public void setDataProva(Date dataProva) {
		this.dataProva = dataProva;
	}

	public String getHorarioProva() {
		return horarioProva;
	}

	public void setHorarioProva(String horarioProva) {
		this.horarioProva = horarioProva;
	}

	public GincanaModel getGincana() {
		return gincana;
	}

	public void setGincana(GincanaModel gincana) {
		this.gincana = gincana;
	}

	public AgendaModel getAgenda() {
		return agenda;
	}

	public void setAgenda(AgendaModel agenda) {
		this.agenda = agenda;
	}
}