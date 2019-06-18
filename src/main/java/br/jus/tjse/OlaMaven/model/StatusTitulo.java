package br.jus.tjse.OlaMaven.model;

public enum StatusTitulo {
	
	PENDENTE("Pendente"),
	APROVADO("Aprovado"),
	NEGADO("Negado");
	
	private String descricao;
	
	StatusTitulo(String desc) {
		this.descricao = desc;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

}
