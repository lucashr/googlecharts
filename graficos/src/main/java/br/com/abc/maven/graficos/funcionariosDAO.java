package br.com.abc.maven.graficos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class funcionariosDAO {
	// a conexão com o banco de dados
	private Connection connection;

	public funcionariosDAO() throws Exception {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adicionaCursos(funcionarios funcionario) {	
		String sq1 = "insert into funcionarios " + "(nomeFuncionario, matricula)" + " values (?,?)";		
		try {
			// prepared statement para inserção
			PreparedStatement stmt1 = connection.prepareStatement(sq1);				
			
			//seta os valores dos cursos realizados	
			Object matriculaFunc;
			matriculaFunc = funcionario.getMatricula();
			
			stmt1.setString(1, funcionario.getNomeFuncionario());
			stmt1.setString(2, matriculaFunc.toString());			
			// executa
			
			stmt1.execute();
			stmt1.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<funcionarios> getListaFunc() {		
		try {
			List<funcionarios> funcionario = new ArrayList<funcionarios>();
			
			// prepared statement para inserção
			PreparedStatement stmt1 = this.connection.prepareStatement("select * from funcionarios");
			
			ResultSet rs1 = stmt1.executeQuery();

			while (rs1.next()) {		
				
				    //criando o objeto funcionario	
				
				    funcionarios funcionarioFunc = new funcionarios();					
				    funcionarioFunc.setNomeFuncionario(rs1.getString("nomeFuncionario"));
				    funcionarioFunc.setMatricula(rs1.getInt("matricula"));
	
	
					// adicionando o objeto à lista
				    funcionario.add(funcionarioFunc);	
				
			}
			
			
			rs1.close();
			stmt1.close();
			return funcionario;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
}