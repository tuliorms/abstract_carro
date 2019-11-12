import br.com.carros.CarroAutomatico;
import br.com.carros.CarroManual;
/**
 * Classe principal
 * @author Breno Vinicius
 * @author Túlio Ramos
 */
public abstract class Carro {
	private String modelo;
	private string numeroPlaca;
    
	public Carro(){
	}
	
	public Carro(String modelo) {
		this.modelo = modelo;
	}
	
	public abstract String getPlaca();
}
