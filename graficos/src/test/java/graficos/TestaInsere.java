//package graficos;
//
//import java.util.Calendar;
//
//import br.com.abc.maven.graficos.cursosrealizados;
//import br.com.abc.maven.graficos.ContatoDao;
//
//public class TestaInsere {
//	
//	public static void main(String[] args) throws Exception {
//		// pronto para gravar
//	       cursosrealizados contato = new cursosrealizados();
//	       contato.setNomeFuncionario("Jose Henrique");
//	       contato.setNomeCurso("SELENIUM");
//	       contato.setTempoDeCurso(80);
//	       contato.setDataRealizacao(Calendar.getInstance());
//
//	       // grave nessa conex�o!!!
//	       ContatoDao dao = new ContatoDao();
//
//	       // m�todo elegante
//	       dao.adiciona(contato);
//
//	       System.out.println("Gravado!");
//	}
//
//}