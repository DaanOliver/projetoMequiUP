package ProjetoMC;

import java.util.Scanner;

public class mc {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Menu*/
	
		System.out.print("Bem Vindo ao McDonalds! \nEscolha suas opções abaixo(1-7). "
+ "\nCardapio: 1 \nLancamento: 2 \nQuem Somos: 3\nFamilia: 4 \nPromoções: 5 "
+ "\nMequi pra Voce: 6 \nMcDia Feliz: 7 \nColoque sua opção: ");	
		int numDoHome=ler.nextInt();
		
		switch(numDoHome) 
		{
		case 1: 
			System.out.println("\nLançamentos: 1");
			System.out.println("Sanduíches Premium: 2");
			System.out.println("Sanduíches de Carne Bovina: 3");
			System.out.println("Familia Tasty: 4");
			System.out.println("Sanduiches de Frango: 5");
			System.out.println("Seleções do Méqui: 6");
			System.out.println("McLanche Feliz: 7");
			System.out.println("Méqui 1000: 8");
			System.out.println("Acompanhamentos: 9");
			System.out.println("Sobremesas: 10");
			System.out.println("Bebidas Frias: 11");
			System.out.println("Café da Manhã: 12");
			System.out.println("Bebidas Quentes: 13");
			System.out.println("McOferta: 14");
			System.out.println("Méqui Box: 15");
			System.out.print("Coloque sua opção: ");
			break;
		}
		int numCardapio=ler.nextInt();

		
				//LANÇAMENTOS//
				switch(numCardapio) 
				{
				case 1:
					System.out.println("\nMcBrasil: 1");
					System.out.println("McFlurry: 2");
					System.out.println("McEspanha: 3");
					System.out.println("McArgentina: 4");
					System.out.println("McAlemanha: 5");
					System.out.println("McMéxico: 6");
					System.out.println("McFrança: 7");
					System.out.println("McEUA: 8");
					System.out.println("McCatar: 9");
					System.out.println("McFlurry Espetaculo Kopenhagen Morango: 10");
					System.out.println("McFlurry Espetaculo Kopenhagen Chocolate: 11");
					System.out.println("McFlurry Espetaculo Kopenhagen Caramelo: 12");
					System.out.print("Coloque sua opção: ");
					int lancamento=ler.nextInt();
					
					switch(lancamento) 
						{
					case 1:
						System.out.println("\nMcBrasil!\nNosso grandioso e inigualável McBrasil, composto por pão tipo brioche, um hamburguer (carne 100% bovina), molho temperado, empanado de queijo, alface, tomate e bacon.");
						break;
					case 2:
						System.out.println("\nMcFlurry Brasil!\nPara compor a Seleção do Méqui trouxemos a sobremesa que tem a cara do Brasil, composta por massa gelada de baunilha, calda de banana com um toque de canela, cobertura de caramelo e farofa crocante de amendoim. Você precisa experimentar!");
						break;
					case 3:
						System.out.println("\nMcEspanha!\nO maravilhoso McEspanha, mais um craque da Seleções do Méqui, é composto por pão tipo brioche, um hamburguer (carne 100% bovina), copa fatiada, molho temperado, alface e queijo sabor emental.");
						break;
					case 4:
						System.out.println("\nMcArgentina!\nPara compor a Seleção do Méqui trouxemos o maravilhoso McArgentina, composto por pão tipo brioche, um hamburguer (carne 100% bovina), maionese sabor chimichurri, cebola fresca, alface, tomate, bacon, e queijo sabor cheddar.");
						break;
					case 5:
						System.out.println("\nMcAlemanha!\nO novo McAlemanha, parte da Seleções do Méqui, é composto por pão tipo brioche, um hamburguer (carne 100% bovina), salame com borda de pimenta, maionese, mostarda, cebola fresca e queijo sabor emental.");
						break;
					case 6:
						System.out.println("\nMcMéxico!\nO McMéxico, parte da Seleções do Méqui, é especialmente composto por pão tipo brioche com batata, peito de frango temperado empanado, a nova maionese sabor pimenta jalapeño, alface e queijo sabor cheddar.");
						break;
					case 7:
						System.out.println("\nMcFrança!\nPara compor a Seleção do Méqui trouxemos o incrível McFrança, composto por pão tipo brioche, um hamburguer (carne 100% bovina), molho sabor queijo brie, cebola crispy, tomate, bacon e queijo sabor emental.");
						break;
					case 8:
						System.out.println("\nMcEUA!\nMcEUA, parte da Seleções do Méqui, é composto por pão tipo brioche com batata, peito de frango temperado empanado, molho barbecue, cebola crispy, bacon, picles crinkle e queijo sabor cheddar.");
						break;
					case 9:
						System.out.println("\\nMcCatar!\\nO incrível McCatar é composto por pão tipo brioche, um hamburguer (carne 100% bovina), molho árabe, cebola crispy, tomate e queijo sabor emental.");
						break;
					case 10:
						System.out.println("\nMcFlurry Espetáculo Kopenhagen Morango!\nA massa geladinha de baunilha, cobertura de morango e o delicioso tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e trazem o sabor único que só o chocolate ao leite Kopenhagen têm.");
						break;
					case 11:
						System.out.println("\nMcFlurry Espetáculo Kopenhagen Chocolate!\nA massa geladinha de baunilha, cobertura sabor chocolate e o delicioso tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e trazem o sabor único que só o chocolate ao leite Kopenhagen têm.");
						break;
					case 12:
						System.out.println("\nMcFlurry Espetáculo Kopenhagen Caramelo\nA massa geladinha de baunilha, cobertura de caramelo e o delicioso tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e trazem o sabor único que só o chocolate ao leite Kopenhagen têm.");
						break;
						}
						
					
						//SANDUICHE PREMINUM//
					case 2:
						System.out.println("McClub: 1");
						System.out.println("Coloque sua opção: ");
						int preminum=ler.nextInt();
						switch(preminum)
						{
							case 1:
							System.out.println("\nMcClub!\nSanduíche composto por pão tipo brioche, bacon crispy, molho especial, carne 100% bovina, queijo sabor emental, tomate e alface.");
						}
					
						
						//SANDUICHES DE CARNE BOVINA//
					case 3:
						System.out.println("\nBig Mac: 1");
						System.out.println("Duplo Quarteirão: 2");
						System.out.println("Quarterão com Queijo: 3");
						System.out.println("McNífico Bacon: 4");
						System.out.println("Duplo Cheddar McMelt: 5");
						System.out.println("Cheddar McMelt: 6");
						System.out.println("Duplo Burger Bacon: 7");
						System.out.println("Duplo Burguer com Queijo: 8");
						System.out.println("Triplo Cheeseburger: 9");
						System.out.println("McFiesta: 10");
						System.out.println("Cheeseburger: 11");
						System.out.println("Hamburger: 12");
						System.out.print("Coloque sua opção: ");
						int bovino=ler.nextInt();
						
						switch(bovino)
						{
						case 1:
							System.out.println("\nBig Mac!\nDois hambúrgueres (100% carne bovina), alface americana, queijo sabor cheddar, molho especial, cebola, picles e pão com gergelim.");
							break;
						case 2:
							System.out.println("\nDuplo Quarterão!\nDois hambúrgueres (100% carne bovina), mostarda, ketchup, cebola, queijo sabor cheddar e pão com gergelim.");
							break;
						case 3:
							System.out.println("\nQuarterão com Queijo!\nUm hambúrguer (100% carne bovina), queijo sabor cheddar, picles, cebola, ketchup, mostarda e pão com gergelim.");
							break;
						case 4:
							System.out.println("\nMcNífico Bacon!\nUm hambúrguer (100% carne bovina), bacon, alface americana, cebola, queijo sabor cheddar, tomate, maionese, ketchup, mostarda e pão com gergelim.");
							break;
						case 5:
							System.out.println("\nDuplo Cheddar McMelt!\nDois hambúrgueres (100% carne bovina), molho sabor cheddar, cebola ao molho shoyu e pão escuro com gergelim.");
							break;
						case 6:
							System.out.println("\nCheddar McMelt!\nUm hambúrguer (100% carne bovina), molho sabor cheddar, cebola ao molho shoyu e pão escuro com gergelim.");
							break;
						case 7:
							System.out.println("\nDuplo Burger Bacon!\nDois hambúrgueres (100% carne bovina), queijo sabor cheddar, cebola, fatias de bacon, ketchup, mostarda e pão com gergelim.");
							break;
						case 8:
							System.out.println("\nDuplo Burguer com Queijo!\nDois hambúrgueres, uma explosão de sabor. Dois deliciosos hambúrgueres de carne 100% bovina, queijo sabor cheddar derretido, picles, cebola picada, ketchup, mostarda e pão com gergelim.");
							break;
						case 9:
							System.out.println("\nTriplo Cheeseburger!\nTrês hambúrgueres (100% carne bovina), queijo sabor cheddar, cebola, picles, ketchup, mostarda e pão com gergelim.");
							break;
						case 10:
							System.out.println("\nMcFiesta!\nHambúrguer de carne 100% bovina, alface, tomate e maionese no pão quentinho.");
							break;
						case 11:
							System.out.println("\nCheeseburger!\nUm hamburguer (100% carne bovina), queijo sabor cheddar, cebola, picles, ketchup, mostarda e pão sem gergelim.");
							break;
						case 12:
							System.out.println("\nHamburger!\nUm Hamburguer (100% carne bovina), cebola, picles, ketchup, mostarda e pão sem gergelim.");
							break;
						}
						
						//FAMILIA TASTY//
					case 4:
						System.out.println("\nBig Tasty: 1");
						System.out.println("Big Tasty Turbo Bacon: 2");
						System.out.print("Coloque sua opção: ");
						int tasty=ler.nextInt();
						
						switch(tasty)
						{
						case 1:
							System.out.println("\nBig Tasty!\nUm hambúrguer (100% carne bovina), queijo sabor emental, tomate, alface americana, cebola, molho Tasty e pão com gergelim.");
							break;
						case 2:
							System.out.println("\nBig Tasty Turbo Bacon!\nUm Hambúrguer (100% carne bovina), bacon em fatias, bacon crispy, queijo sabor emental, tomate, alface americana, cebola, molho Tasty e pão com gergelim.");
							break;
						}
					
						//Sanduíches de Frango//
					case 5:
						System.out.println("\nMcCrispy Chicken Deluxe: 1");
						System.out.println("McCrispy Chicken Classic: 2");
						System.out.println("McCrispy Chicken Spicy: 3");
						System.out.println("McChicken Bacon: 4");
						System.out.println("McChicken: 5");
						System.out.println("Chicken Jr: 6");
						System.out.print("Coloque sua opção: ");
						int sanFrango=ler.nextInt();
						
						switch(sanFrango) 
						{
						case 1:
							System.out.println("\nMcCrispy Chicken Deluxe!\nSanduiche composto por tipo brioche com batata, carne 100% de peito de frango, temperada e empanada, maionese, alface americana e tomate.");
							break;
						case 2:
							System.out.println("\nMcCrispy Chicken Classic!\nSanduiche composto por pão tipo brioche com batata, carne 100% de peito de frango, temperada e empanada, manteiga e picles crinkle.");
							break;
						case 3:
							System.out.println("\nMcCrispy Chicken Spicy!\nSanduiche composto por tipo brioche com batata, carne 100% de peito de frango, temperada e empanada, molho de pimenta e picles crinkle.");
							break;
						case 4:
							System.out.println("\nMcChicken Bacon!\nFrango empanado, maionese, bacon, alface americana e pão com gergelim.");
							break;
						case 5:
							System.out.println("\nMcChicken!\nFrango empanado, maionese, alface americana e pão com gergelim.");
							break;
						case 6:
							System.out.println("\nChicken Jr!\nFrango empanado, maionese, alface americana e pão com gergelim.");
							break;
						}
						
						//Seleções do Méqui//
					case 6:
						System.out.println("\nMcBrasil: 1");
						System.out.println("McFlurry: 2");
						System.out.println("McEspanha: 3");
						System.out.println("McArgentina: 4");
						System.out.println("McAlemanha: 5");
						System.out.println("McMéxico: 6");
						System.out.println("McFrança: 7");
						System.out.println("McEua: 8");
						System.out.println("McCatar: 9");
						System.out.print("Coloque sua opção: ");
						int selecoes=ler.nextInt();
						
						switch(selecoes)
						{
						case 1:
							System.out.println("\nMcBrasil!\nNosso grandioso e inigualável McBrasil, composto por pão tipo brioche, um hamburguer (carne 100% bovina), molho temperado, empanado de queijo, alface, tomate e bacon.");
							break;
						case 2:
							System.out.println("\nMcFlurry Brasil!\nPara compor a Seleção do Méqui trouxemos a sobremesa que tem a cara do Brasil, composta por massa gelada de baunilha, calda de banana com um toque de canela, cobertura de caramelo e farofa crocante de amendoim. Você precisa experimentar!");
							break;
						case 3:
							System.out.println("\nMcEspanha!\nO maravilhoso McEspanha, mais um craque da Seleções do Méqui, é composto por pão tipo brioche, um hamburguer (carne 100% bovina), copa fatiada, molho temperado, alface e queijo sabor emental.");
							break;
						case 4:
							System.out.println("\nMcArgentina!\nPara compor a Seleção do Méqui trouxemos o maravilhoso McArgentina, composto por pão tipo brioche, um hamburguer (carne 100% bovina), maionese sabor chimichurri, cebola fresca, alface, tomate, bacon, e queijo sabor cheddar.");
							break;
						case 5:
							System.out.println("\nMcAlemanha!\nO novo McAlemanha, parte da Seleções do Méqui, é composto por pão tipo brioche, um hamburguer (carne 100% bovina), salame com borda de pimenta, maionese, mostarda, cebola fresca e queijo sabor emental.");
							break;
						case 6:
							System.out.println("\nMcMéxico!\nO McMéxico, parte da Seleções do Méqui, é especialmente composto por pão tipo brioche com batata, peito de frango temperado empanado, a nova maionese sabor pimenta jalapeño, alface e queijo sabor cheddar.");
							break;
						case 7:
							System.out.println("\nMcFrança!\nPara compor a Seleção do Méqui trouxemos o incrível McFrança, composto por pão tipo brioche, um hamburguer (carne 100% bovina), molho sabor queijo brie, cebola crispy, tomate, bacon e queijo sabor emental.");
							break;
						case 8:
							System.out.println("\nMcEUA!\nMcEUA, parte da Seleções do Méqui, é composto por pão tipo brioche com batata, peito de frango temperado empanado, molho barbecue, cebola crispy, bacon, picles crinkle e queijo sabor cheddar.");
							break;
						case 9:
							System.out.println("\\nMcCatar!\\nO incrível McCatar é composto por pão tipo brioche, um hamburguer (carne 100% bovina), molho árabe, cebola crispy, tomate e queijo sabor emental.");
							break;
						}
						
						//McLanche Feliz//
					case 7:
						System.out.println("\nProdutos: 1");
						System.out.println("Acompanhamentos: 2");
						System.out.println("Bebidas: 3");
						System.out.println("Sobremesa: 4");
						System.out.print("Coloque sua opção: ");
						int prod=ler.nextInt();
						
						switch(prod) 
						{
						case 1: System.out.println("\nChicken McNuggets 4 unidades: 1");
						case 2: System.out.println("McFiesta: 2");
						case 3: System.out.println("Hamburger: 3");
							break;
						}
						int acomp=ler.nextInt();
						switch(acomp)
						{
						case 1: System.out.println("\nMcFritas Kids: 1");
						case 2: System.out.println("Tomatinho: 2");
						break;
						}
						int bebi=ler.nextInt();
						switch(bebi)
						{
						case 1: System.out.println("\nÁgua Mineral: 1");
						case 2: System.out.println("Del Valle 100% Uva (McLanche Feliz): 2");
						break;
						}
						int sobre=ler.nextInt();
						switch(sobre)
						{
						case 1: System.out.println("\nPetit Suisse Sabor Morango: 1");
						}
						System.out.println("Seu McLanche Feliz ficou como "+prod+", "+bebi+", "+acomp+" e "+sobre);
		}
		
		
}
}
