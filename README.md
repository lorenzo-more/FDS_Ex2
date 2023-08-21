# FSD_Ex2
Exercício sobre padrões de criação

Em um determinado banco cada cliente possui dois saldos: o saldo livre para movimentações de depósitos e retiradas e o saldo em investimentos. Para poder movimentar o saldo investido o cliente deve solicitar que todo ou parte do valor investido seja transferido para o saldo livre com 2 dias de antecedência. Cada cliente – de acordo com seu perfil – tem uma taxa de remuneração para os investimentos. Da mesma forma tem uma taxa de juros que é cobrada caso seu saldo livre fique negativo (o banco admite saques a descoberto até um certo limite). Um desenvolvedor criou uma classe Java para modelar esta conta bancária, porém, o uso do seu método construtor tornou-se um tormento. São muitos os parâmetros e na verdade apenas o número da conta e o nome do correntista são necessários na abertura. Os demais podem ou não ser indicados na abertura ou mais tarde visto que podem ser utilizados valores padrão (os saldos iniciais podem ser zero assim como as taxas e o limite para saques a descoberto; a categoria inicial pode ser Categoria.Normal). Utilize o padrão Builder para melhorar a usabilidade na criação de instâncias desta classe. Refatore ela usando este padrão e apresente diferentes exemplos de uso.

enum Categoria { NORMAL, ADVANCED, PREMIUM }; 
public class Conta{ 
... 
public Conta(Long numero, String nomeCorrentista, int saldoLivreInicial, int salAplicacaoInicial, double taxaRemuneracao, double taxaSaldoNegativo, Categoria categoriaInicial){ 
... 
} 
}
