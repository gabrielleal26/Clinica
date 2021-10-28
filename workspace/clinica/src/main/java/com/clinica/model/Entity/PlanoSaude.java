package com.clinica.model.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;




@Entity
@Table(name="planosaude")
public class PlanoSaude {
	
	private Long id;
	private String nomePlanoSaude;
	private LocalDateTime dataCadastro;
	private LocalDateTime dataAtualizacao;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomePlanoSaude() {
		return nomePlanoSaude;
	}
	public void setNomePlanoSaude(String nomePlanoSaude) {
		this.nomePlanoSaude = nomePlanoSaude;
	}
	@PrePersist
	public void prePersist() {
		this.dataCadastro = LocalDateTime.now();
	}
	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	@PreUpdate
	public void preUpdate() {
		this.dataAtualizacao = LocalDateTime.now();
	}
	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataAtualizacao == null) ? 0 : dataAtualizacao.hashCode());
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomePlanoSaude == null) ? 0 : nomePlanoSaude.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlanoSaude other = (PlanoSaude) obj;
		if (dataAtualizacao == null) {
			if (other.dataAtualizacao != null)
				return false;
		} else if (!dataAtualizacao.equals(other.dataAtualizacao))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomePlanoSaude == null) {
			if (other.nomePlanoSaude != null)
				return false;
		} else if (!nomePlanoSaude.equals(other.nomePlanoSaude))
			return false;
		return true;
	}
	
}
