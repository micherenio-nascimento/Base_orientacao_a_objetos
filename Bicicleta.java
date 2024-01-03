/* Exemplo de Herança:
 * Note que “modelo”,  “marca” e “acelerar()” são itens em comum das classes 
 * Carro e Bicicleta, logo elas podem herdar essas características da classe Veículo.
 * No caso usamos "extends" para herdar essas caracterísitcas. 
 */
public class Bicicleta extends Veiculo {

	// Aqui, a classe Bicicleta define como ela deve exercer o ato de acelerar
	@Override
	public void acelerar() {
		System.out.println("A bicicleta acelerou!");
	}

}