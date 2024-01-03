public class VeiculoTeste {
    public static void main(String[] args) {
        
        /* Exemplo de Polimorfismo: 
         * Essa é a capacidade de um objeto assumir diferentes formas
         * Veiculo carro = new Carro();
         * Veiculo carro = new Bicicleta();
         */
        
        Carro carro = new Carro();
        
        carro.ligar();
        System.out.println(carro.estaLigado());
        carro.acelerar();

        Bicicleta bicicleta = new Bicicleta();
        bicicleta.acelerar();


    }   
}