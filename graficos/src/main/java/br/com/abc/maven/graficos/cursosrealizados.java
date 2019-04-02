package br.com.abc.maven.graficos;


public class cursosrealizados {
	
	private Long id;
	private String nomeCurso;
	private int matricula;
	private int tempoDeCurso;
	private static String dataRealizacao;
	
	public static String getDataRealizacao() {
		return dataRealizacao;
	}

	public static void setDataRealizacao(String dataRealizacao) {
		cursosrealizados.dataRealizacao = dataRealizacao;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}	
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public int getTempoDeCurso() {
		return tempoDeCurso;
	}
	
	public void setTempoDeCurso(int tempoDeCurso) {
		this.tempoDeCurso = tempoDeCurso;
	}
	
	
	
	
}
