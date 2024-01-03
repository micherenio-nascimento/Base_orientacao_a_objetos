/* Exemplo de Herança:
 * Note que “modelo”,  “marca” e “acelerar()” são itens em comum das classes 
 * Carro e Bicicleta, logo elas podem herdar essas características da classe Veículo.
 * No caso usamos "extends" para herdar essas caracterísitcas. 
 */
public class Carro extends Veiculo {
    
    /* Exemplo de Encapsulamento:
     * No caso estou protegendo o atributo "ligar" com o *atributo de visibilidade* "private"
     * para que o "ligado" não tenha o valor modificado de qualquer lugar do sistema.
     */
    private boolean ligado;	

	public Carro() {
		ligado = false;
	}

    public void ligar() {
		ligado = true;
        System.out.println("O veículo ligou!");
    }

    public void desligar() {
		ligado = false;
        System.out.println("O veículo desligou!");
    }
	
	public void acelerar() {
		if (!ligado){
            System.out.println("O carro não pode ser acelerado, pois ele está desligado.");
			//throw new Exception("O carro não pode ser acelerado, pois ele está desligado."); // Erro: o carro está desligado!
		}
		System.out.println("O carro foi acelerado");
	}
	
	public boolean estaLigado() {
		return ligado;
	}
}