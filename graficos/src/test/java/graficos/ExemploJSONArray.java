package graficos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import br.com.abc.maven.graficos.cursosrealizados;
import br.com.abc.maven.graficos.cursosrealizadosDAO;
import br.com.abc.maven.graficos.funcionarios;
import br.com.abc.maven.graficos.funcionariosDAO;

public class ExemploJSONArray {

	public static void main(String[] args) throws Exception {
		criaObjJson();
	}

	private static void criaObjJson() throws Exception {

		cursosrealizadosDAO cursosDao = new cursosrealizadosDAO();
		funcionariosDAO funcDao = new funcionariosDAO();
		
		List<cursosrealizados> lc = cursosDao.getListaCursos();		
		List<funcionarios> lf = funcDao.getListaFunc();

		List<String> cursosUsuario = new ArrayList<String>();         
		List<String> listaFuncionario = new ArrayList<String>();
		
		//instancia um novo JSONObject
        JSONObject mostraDadosUsuario = new JSONObject();
		
		for (cursosrealizados usuarioCursos : lc) {			
			int teste;
			teste = usuarioCursos.getMatricula();
			if(teste == 2346) {
				Object tempCurso, id, matriculausuario;				
				tempCurso = usuarioCursos.getTempoDeCurso();
				matriculausuario = usuarioCursos.getMatricula();
				id = usuarioCursos.getId();
				
				cursosUsuario.add(matriculausuario.toString());
				cursosUsuario.add(usuarioCursos.getNomeCurso());
				cursosUsuario.add(tempCurso.toString());
				cursosUsuario.add(usuarioCursos.getDataRealizacao());
				
				mostraDadosUsuario.put(listaFuncionario.toString());
				
				break;
			}	
			
		}
		
		for (funcionarios func : lf) {			
			int teste;
			Object matricuFunc;
			matricuFunc= func.getMatricula();			
			teste = func.getMatricula();
			
			if(teste == 2346) {				
				listaFuncionario.add(func.getNomeFuncionario());
				//listaFuncionario.add(matricuFunc.toString());
				
				break;
			}	
			
		}

		listaFuncionario.addAll(cursosUsuario);
		
		System.out.println(listaFuncionario);


	}

}