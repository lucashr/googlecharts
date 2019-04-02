package br.com.abc.maven.graficos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class cursosrealizadosDAO {
	// a conexão com o banco de dados
	private Connection connection;

	public cursosrealizadosDAO() throws Exception {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adicionaFunc(cursosrealizados cursos) {
		String sq2 = "insert into cursosrealizados " + "(nomeCurso, matricula, tempoDeCurso, dataRealizacao)" + " values (?,?,?,?)";
		
		try {
			// prepared statement para inserção
			PreparedStatement stmt2 = connection.prepareStatement(sq2);				
			
			//seta os valores dos cursos realizados			
			Object matricula, tempoCurso, id;
			
			id = cursos.getId();
			matricula = cursos.getMatricula();
			tempoCurso = cursos.getTempoDeCurso();
			
			stmt2.setString(1, cursos.getNomeCurso());
			stmt2.setString(2, matricula.toString());
			stmt2.setInt(3, cursos.getTempoDeCurso());
			stmt2.setString(4, cursos.getDataRealizacao());
			
			// executa
			stmt2.execute();
			stmt2.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public List<cursosrealizados> getListaCursos() {
		try {
			List<cursosrealizados> cursos = new ArrayList<cursosrealizados>();
			
			PreparedStatement stmt2 = this.connection.prepareStatement("select * from cursosrealizados");
			
			ResultSet rs2 = stmt2.executeQuery();

			while (rs2.next()) {		
				
				    //criando o objeto cursos realizados	
				
				    cursosrealizados cursosFunc = new cursosrealizados();
				    cursosFunc.setNomeCurso(rs2.getString("nomeCurso"));
				    cursosFunc.setMatricula(rs2.getInt("matricula"));
				    cursosFunc.setTempoDeCurso(rs2.getInt("tempoDeCurso"));
				    cursosFunc.setDataRealizacao(rs2.getString("dataRealizacao"));
	
					// adicionando o objeto à lista
				    cursos.add(cursosFunc);				
				
			}			
			
			rs2.close();
			stmt2.close();
			return cursos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
}