package br.com.projeto;

public class ClasseProjeto {

	public static void main(String[] args) {
		
		ClasseConta objetoConta1 = new ClasseConta(); //Instância um objeto 
		objetoConta1.atributoPessoaConta = new ClassePessoa();
		
		objetoConta1.atributoPessoaConta.atributoNomePessoa = "Vitor Hugo";
		objetoConta1.atributoPessoaConta.atributoCPFPessoa = 1234;
		objetoConta1.atributoPessoaConta.atributoRGPessoa = 121212;
		objetoConta1.atributoNumeroConta = 1234;
		//objetoConta1.atributoSaldoConta = 450000.00 + (450000.00 * 0.20); //20%
		//objetoConta1.atributoSaldoConta = 450000.00; //20%
		objetoConta1.metodoDepositar(450000.00);
		
		System.out.println(objetoConta1.atributoNumeroConta);
		System.out.println(objetoConta1.atributoSaldoConta);
		System.out.println(objetoConta1.atributoPessoaConta.atributoNomePessoa);
		System.out.println(objetoConta1.atributoPessoaConta.atributoCPFPessoa);
		System.out.println(objetoConta1.atributoPessoaConta.atributoRGPessoa);
		
		ClasseConta objetoConta2 = new ClasseConta(); //Instância um objeto 
		objetoConta2.atributoPessoaConta = new ClassePessoa();
		
		objetoConta2.atributoPessoaConta.atributoNomePessoa = "Handreya";
		objetoConta2.atributoPessoaConta.atributoCPFPessoa = 1111;
		objetoConta2.atributoPessoaConta.atributoRGPessoa = 444444;
		objetoConta2.atributoNumeroConta = 4321;
		//objetoConta2.atributoSaldoConta = 14000.50 + (14000.50 * 0.20); //20%
		//objetoConta2.atributoSaldoConta = 14000.50;
		objetoConta2.metodoDepositar(14000.50);
				
		System.out.println(objetoConta2.atributoNumeroConta);
		System.out.println(objetoConta2.atributoSaldoConta);
		System.out.println(objetoConta2.atributoPessoaConta.atributoNomePessoa);
		System.out.println(objetoConta2.atributoPessoaConta.atributoCPFPessoa);
		System.out.println(objetoConta2.atributoPessoaConta.atributoRGPessoa);
		
	}

}
