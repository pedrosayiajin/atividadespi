package atividades.pi.atividades.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity

public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String data;
	private String local;
	private String horário;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getHorário() {
		return horário;
	}
	public void setHorário(String horário) {
		this.horário = horário;
	}
	@Override
	public String toString() {
		return "Evento [nome=" + nome + ", data=" + data + ", local=" + local + ", horário=" + horário + "]";
	}
	
	

}
