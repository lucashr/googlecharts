//package graficos;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.List;
//
//import br.com.abc.maven.graficos.ContatoDao;
//import br.com.abc.maven.graficos.cursosrealizados;
//
//public class TestaLista {
//	
//	public static void main(String[] args) throws Exception {
//		ContatoDao dao = new ContatoDao();
//		List<cursosrealizados> contatos = dao.getListaCursos();
//		ArrayList<String> dadosLinhas = new ArrayList<String>();
//		ArrayList<String> dadosColunas = new ArrayList<String>();
//		
//	   Object tempoCurso, dataRealizacao;
//
//		for (cursosrealizados contato : contatos) {
//			  dadosColunas.add(contato.getNomeFuncionario());			  
//			  //dadosColunas.add(contato.getNomeCurso());
//			  //tempoCurso = contato.getTempoDeCurso();
//			  //dadosColunas.add(tempoCurso.toString());
//			 
//			  dataRealizacao = contato.getDataRealizacao().getTime();
//			  
//			  SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
//			  String dataFormatada = formato.format(dataRealizacao);
//	          
//	      }
//		
//		//criaColuna(dadosColunas);		
//		 
//		System.out.println("Colunas:\n");
//        System.out.println(dadosColunas);
//
//	}
//
//	private static void criaColuna(ArrayList<String> colun) {
//		System.out.println(colun.toString());
//		List<String> coluna = new ArrayList<String>();
//		
//		int i = 0;
//
//		String concatFinal = "\"cols\":";
//		for (String var : colun) {		
//			int tamanhoDosDados;
//			tamanhoDosDados = colun.size();
//			
//			
//			if(i == 0){
//				coluna.add("{\"label\":" + "\"" + var + "\"");
//				i++;
//			}
//			else {
//				coluna.add("\"" + var + "\"");				
//				i++;
//			}
//			
//			if(i == tamanhoDosDados) {
//				coluna.add("\"type\":\"string\"},");
//			}
//			
//		}
//		
//		int t = i;
//		concatFinal = concatFinal + coluna;
//		coluna.add(t, coluna.toString());
//		
//		System.out.println("Depois");
//		System.out.println(coluna);
//	}
//
//}
//
//
////
////"cols": [
////         {"label": "Nome Funcionario", "type":"string"},
////         {"label": "Tempo de estudo", "type":"number"}
//// ],
//
//
