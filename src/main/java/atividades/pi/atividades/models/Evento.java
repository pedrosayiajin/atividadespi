package atividades.pi.atividades.models;

public class Evento {
	
	private String nome;
	private String data;
	private String local;
	private String horário;
	
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
