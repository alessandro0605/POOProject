package br.com.projeto;

public class ClasseConta { // Classe

	int atributoNumeroConta; //0
	double atributoSaldoConta; //0.0
	
	ClassePessoa atributoPessoaConta;

	
	void metodoDepositar(double parametroValor) { // Método
		
		this.atributoSaldoConta = this.atributoSaldoConta + parametroValor + (parametroValor * .1);
		//this.atributoSaldoConta += parametroValor;
		
	}
	
}
