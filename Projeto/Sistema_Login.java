package Projeto;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Sistema_Login {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		Cliente usuario = new Cliente();
		ArrayList<String> cardapio = new ArrayList<>();
		ArrayList<String> pedido = new ArrayList<>();

		String login = "", senha = "", endereco = "", pagamento = "", nome = "", email = "", contato = "", login2 = "",
				senha2 = "";
		int acesso = 0, valorPizza = 35, valorFrete = 7, valorRefri = 0, escolha = 0, valorTotal = 0;
		boolean deslogado = false, verificar = false;

		usuario.setUsuario("fernando");
		usuario.setSenha("fernando123");

		System.out.println("------------ SEJA BEM VINDO A THIS.PIZZA CLUB ------------");
		System.out.print("\nDigite:\n\n1- Acessar uma conta existente \n2- Criar uma conta \n>");
		acesso = read.nextInt();
		// SISTEMA DE LOGIN

		if (acesso == 1) {
			System.out.println("Digite seu acesso: ");
			System.out.print("\nLogin: ");
			login = leia.nextLine();
			System.out.print("\nSenha: ");
			senha = leia.nextLine();

		}

		if (acesso == 2) {
			System.out.print("\nCrie seu login: ");
			login2 = leia.nextLine();
			usuario.setUsuario(senha2);
			System.out.print("\nCria sua senha: ");
			senha2 = leia.nextLine();
			usuario.setSenha(senha2);
			System.out.print("\nDigite seu e-mail :");
			email = leia.nextLine();
			usuario.inserirEmail(email);
			System.out.print("\nUsuário criado, confirme a conta no e-mail informado!");
			System.out.println("\n");
		}
		while (acesso == 2)
			;
		// VERIFICAR CRIAÇÃO LOGIN

		if (login.equals(usuario.getUsuario()) && senha.equals(usuario.getSenha())) {
			System.out.println("\n -USUÁRIO " + usuario.getUsuario() + " LOGADO COM SUCESSO- ");
			System.out.println("\n");
		} else {
			System.out.println("\n -Login ou senha inválidos! Tente novamente- ");
			deslogado = true;
		}
		while (deslogado == true)
			;

		// Cadastro informações

		System.out.println("\nOlá " + usuario.getUsuario() + ", nos informe seus dados: ");
		System.out.print("\nDigite seu nome completo:\n>");
		nome = leia.nextLine();
		usuario.inserirNome(nome);
		System.out.print("\nDigite seu endereço e complemento:\n>");
		endereco = leia.nextLine();
		usuario.inserirEndereco(endereco);
		System.out.print("\nDigite um telefone para contato: (DDD+Telefone)\n>");
		contato = leia.nextLine();
		usuario.inserirContato(contato);
		System.out.print("\nQual sua forma de pagamento? Cartão ou dinheiro? Quantia para troco\n> ");
		pagamento = leia.nextLine();
		usuario.inserirPagamento(pagamento);
		System.out.println("\nDados atualizados...");

		// CONTEÚDO LISTA
		// MASSA
		cardapio.add("Massa Fina");// 0
		cardapio.add("Massa Média");// 1
		cardapio.add("Massa Grossa");// 2
		cardapio.add("Molho de Tomate");// 3
		cardapio.add("Molho Pesto");// 4
		cardapio.add("Molho Alfredo");// 5
		cardapio.add("Marguerita");// 6
		cardapio.add("Bacon com queijo");// 7
		cardapio.add("Peperoni");// 8
		cardapio.add("Calabresa ralada com 3 queijos");// 9
		cardapio.add("Brócolis com queijo e alho frito");// 10
		cardapio.add("Portuguesa");// 11
		cardapio.add("Refrigerante Xamego");// 12

		try {
			do {
				System.out.println("|----------------------------------------------------------------------------------------|");
				System.out.println("\n\t\tINICIE SEU PEDIDO ESCOLHENDO OS INGREDIENTES");
				System.out.println("\n");
				System.out.print("\nDIGITE O TIPO DE MASSA: \n1- Fina \t 2- Média \t 3- Grossa \n>");
				escolha = leia.nextInt();
				escolha--;

				if (escolha == 0 || escolha == 1 || escolha == 2) {
					System.out.println(cardapio.get(escolha) + " escolhida!");
					pedido.add(cardapio.get(escolha));
					verificar = true;

				} else {
					System.out.println("Escolha inválida, digite uma opção válida!");
				}
				while (verificar == false)
					;

				do {
					System.out.println("\nDIGITE O TIPO DE MOLHO DESEJADO: \n4 - Molho de Tomate \t 5- Molho Pesto \t 6- Molho Alfredo \n>");
					escolha = leia.nextInt();
					escolha--;

					if (escolha == 3 || escolha == 4 || escolha == 5) {
						System.out.println(cardapio.get(escolha) + " escolhido!");
						pedido.add(cardapio.get(escolha));
						verificar = false;

					} else
						System.out.println("Escolha inválida, digite uma opção válida!");
				} while (verificar == true);

				System.out.println("|----------------------------------------------------------------------------------------|\n");

				// escolha sabores
				System.out.println("PROMOÇÃO!!!!! QUALQUER SABOR POR R$ 35.00");
				do {
					System.out.print("\n- Digite 7 para escolher o sabor " + cardapio.get(6));
					System.out.print("\n- Digite 8 para escolher o sabor " + cardapio.get(7));
					System.out.print("\n- Digite 9 para escolher o sabor " + cardapio.get(8));
					System.out.print("\n- Digite 10 para escolher o sabor " + cardapio.get(9));
					System.out.print("\n- Digite 11 para escolher o sabor " + cardapio.get(10));
					System.out.print("\n- Digite 12 para escolher o sabor " + cardapio.get(11));
					System.out.print("\n>");

					escolha = leia.nextInt();
					escolha--;

					if (escolha == 6 || escolha == 7 || escolha == 8 || escolha == 9 || escolha == 10 || escolha == 11) {
						System.out.println(cardapio.get(escolha) + " escolhido!");
						pedido.add(cardapio.get(escolha));
						verificar = true;
					} else {
						System.out.println("Escolha inválida");
					}
				} while (verificar == false);

				System.out.println("|----------------------------------------------------------------------------------------|");
				
				do {
					System.out.println("\nDeseja acrescentar o refrigerante Xamego no pedido por + R$ 7.00");
					System.out.println("\nDigite 1 para SIM \tDigite 2 para NÃO \n>>");
					escolha = leia.nextInt();

					if (escolha == 1) {
						pedido.add(cardapio.get(12));
						valorRefri = 7;
						valorTotal = usuario.inserirSoma(valorRefri, valorFrete, valorPizza);
						verificar = false;
						System.out.println("Refrigerante Xamego acrescentado no pedido");
					}
					if (escolha == 2) {
						verificar = false;

						valorTotal = usuario.inserirSoma(valorPizza, valorFrete);
						System.out.println("Nenhum refrigerante acrescentado no pedido");
					}

				} while (verificar == true);

				System.out.println("|----------------------------------------------------------------------------------------|");
				System.out.println("\nPEDIDO: " + "\n\n" + pedido);
				System.out.println("Endereço de envio : " + endereco);
				System.out.println("Nome: " + nome);
				System.out.println("Telefone para contato: " + contato);
				System.out.println("Forma de pagamento: " + pagamento);
				System.out.println("Valor da pizza: R$" + valorPizza + ", valor do frete: R$" + valorFrete
						+ ", valor refrigerante: R$" + valorRefri);
				System.out.println("O total do pedido foi: R$" + valorTotal);

				System.out.print("\nDigite 1 para confirmar o pedido \nDigite 2 para refazer o pedido \nDigite 3 para cancelar o pedido \n>");
				escolha = leia.nextInt();
				if (escolha == 2) {
					pedido.clear();
				}
			} while (escolha == 2);

			if (escolha == 1) {
				System.out.println("Pedido confirmado, será entregue em aproximadamente 45 minutos no endereço: \n" + endereco);
			}
			if (escolha == 3) {
				System.out.println("Pedido cancelado.");
			}
		} catch (InputMismatchException e) {
			System.out.println("VOCÊ ESBARROU EM OUTRA TECLA? ");
		}
			System.out.println("\n\nFIM DO PROGRAMA...");
	}
}
