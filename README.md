# Orientação a objetos com java 

## Encapsulamento
```java
    // Carro.java
    // Uso do atributo de visibilidade "private"
    private boolean ligado;	
```
## Herança
```java
    // Bicicleta.java
    // Uso do "extends"
    public class Bicicleta extends Veiculo {

	}
```
## Abstração
```java
    // Veiculo.java
    // A class não precisa saber como faz tal ação.
    // Uso do "abstract"
    public abstract void acelerar();
```
## Polimorfismo
```java
    // VeiculoTeste.java
    // O objeto assumir diferentes formas:
    Veiculo carro = new Carro();
    Veiculo carro = new Bicicleta();
```