import javax.faces.bean.ManagedBean;

@ManagedBean(name = "testeBean")
public class TesteBean {
	
	private String texto1;
	private String texto2;
	
	public String troca(){
		String aux;
		
		aux = texto1;
		texto1 = texto2;
		texto2 = aux;
		
		return null;
	}
	
	public String getTexto1() {
		return texto1;
	}
	
	public void setTexto1(String texto1) {
		this.texto1 = texto1;
	}
	
	public String getTexto2() {
		return texto2;
	}
	
	public void setTexto2(String texto2) {
		this.texto2 = texto2;
	}
	
}
