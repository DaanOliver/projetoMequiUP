package ProjetoMC;

import java.util.Scanner;

public class mc {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Menu*/
	
		System.out.println("BATEU AQUELA #FOMEDEMÉQUI?");
		System.out.println("1 - Cardápio | 2 - Lançamentos | 3 - Quem Somos | 4 - Familia | 5 - Promoçoes | 6 - Méqui pra você | 7 - McDia Feliz\n");
		System.out.println("Escolha sua opção: ");	
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
						
						
						//Méqui 1000//
					case 8:
						System.out.println("\nSuperMc: 1");
						System.out.println("McRings Cheddar Bacon: 2");
						System.out.println("Caldo&Freddo Chocolate: 3");
						System.out.println("Caldo&Freddo Morango: 4");
						System.out.println("Caldo&Freddo Caramelo: 5");
						System.out.println("McRings Bacon: 6");
						System.out.print("Coloque sua opção: ");
						int meq=ler.nextInt();
						
						switch(meq)
						{
						case 1:
							System.out.println("\nSuperMc!\nUm hamburguer (100% bovino), alface americana, cebola, ketchup, molho tasty, maionese, picles, queijo sabor cheddar, tomate e pão com gergelim");
							break;
						case 2:
							System.out.println("\nMcRings Cheddar Bacon!\nA crocante e deliciosa cebola empanada do Méqui, agora com melt sabor cheddar e bacon crispy. Não dá para resistir, experimente! Produto exclusivo da loja Méqui 1000 (Avenida Paulista, 1811 –São Paulo - SP).");
							break;
						case 3:
							System.out.println("\nCaldo&Freddo Chocolate!\nSobremesa composta por mix de baunilha, cobertura sabor chocolate e torta de maçã.");
							break;
						case 4:
							System.out.println("\nCaldo&Freddo Morango!\nSobremesa composta por mix de baunilha, cobertura de morango e torta de maçã.");
							break;
						case 5:
							System.out.println("\nCaldo&Freddo Caramelo!\nSobremesa composta por mix de baunilha, cobertura de caramelo e torta de maçã.");
							break;
						case 6:
							System.out.println("\nMcRings Bacon!\nEsse delicioso sanduiche é composto por um hambúrguer (100% carne bovina), queijo sabor emental, bacon, cebola frita empanada, maionese, ketchup e pão tipo brioche. Produto exclusivo da loja Méqui 1000 (Avenida Paulista, 1811 –São Paulo -SP.)");
							break;
						}
						
						
						//ACOMPANHAMENTOS (A FAZER)//
					case 9: 
					
					
					//Sobremesas//
					case 10:
						System.out.println("\nCasquinha Baunilha: 1");
						System.out.println("Casquinha Chocolate: 2");
						System.out.println("Casquinha Mista: 3");
						System.out.println("Sundae Morango: 4");
						System.out.println("Sundae Chocolate: 5");
						System.out.println("Sundae Caramelo: 6");
						System.out.println("Top Sundae Morango: 7");
						System.out.println("Top Sundae Chocolate: 8");
						System.out.println("Top Sundae Caramelo: 9");
						System.out.println("McColosso Chocolate: 10");
						System.out.println("McColosso Caramelo: 11");
						System.out.println("Petit Suisse Sabor Morango: 12");
						System.out.println("Torta de Maçã: 13");
						System.out.println("Torda de Banana: 14");
						System.out.println("McShake Morango: 15");
						System.out.println("McShake Ovomaltine: 16");
						System.out.println("McShake Kopenhagen: 17");
						System.out.println("McFlurry M&Ms: 18");
						System.out.println("McFlurry Espetáculo Kopenhagen Chocolate: 19");
						System.out.println("McFlurry Espetáculo Kopenhagen Morango: 20");
						System.out.println("McFlurry Espetáculo Kopenhagen Caramelo: 21");
						System.out.println("McFlurry Ovomaltine: 22");
						System.out.println("McFlurry Prestígio Chocolate: 23");
						System.out.println("McFlurry Prestígio Morango: 24");
						System.out.println("McFlurry Prestígio Caramelo: 25");
						System.out.print("Escolha sua opção: ");
						int sobre1=ler.nextInt();
						
						switch(sobre1)
						{
						case 1: System.out.println("\nCasquinha Baunilha!\nA sobremesa que o Brasil todo adora. Uma casquinha supercrocante, com massa gelada de baunilha que vai bem a qualquer hora.");
						break;
						case 2: System.out.println("\nCasquinha Chocolate!\nA sobremesa que o Brasil todo adora. Uma casquinha supercrocante, com massa gelada chocolate que vai bem a qualquer hora.");
						break;
						case 3: System.out.println("\nCasquinha Mista!\nA sobremesa que o Brasil todo adora. Uma casquinha supercrocante, com massa gelada de mista que vai bem a qualquer hora.");
						break;
						case 4: System.out.println("\nSundae Morango!\nA medida certa entre cobertura de morango e massa gelada de baunilha que pode fazer você viver uma experiência explosiva, além de amendoins crocantes. Desfrute dessa combinação perfeita!");
						break;
						case 5: System.out.println("\nSundae Chocolate!\nA medida certa entre cobertura sabor chocolate e massa gelada de baunilha que pode fazer você viver uma experiência explosiva, além de amendoins crocantes. Desfrute dessa combinação perfeita!");
						break;
						case 6: System.out.println("\nSundae Caramelo!\nA medida certa entre cobertura de caramelo e massa gelada de baunilha que pode fazer você viver uma experiência explosiva, além de amendoins crocantes. Desfrute dessa combinação perfeita!");
						break;
						case 7: System.out.println("\nTop Sundae Morango!\nMassa gelada de baunilha com uma supercamada de cobertura de morango e ainda por cima com farofa de paçoca. O canudo completa a tentação.");
						break;
						case 8: System.out.println("\nTop Sundae Chocolate!\nMassa gelada de baunilha com uma supercamada de cobertura sabor chocolate e ainda por cima com farofa de paçoca. O canudo completa a tentação.");
						break;
						case 9: System.out.println("\nTop Sundae Caramelo!\nMassa gelada de baunilha com uma supercamada de cobertura de caramelo e ainda por cima com farofa de paçoca. O canudo completa a tentação.");
						break;
						case 10: System.out.println("\nMcColosso Chocolate!\nNão é uma sobremesa qualquer, é um verdadeiro colosso. Uma supercasquinha de biscoito em forma de cone, recheada com massa gelada de baunilha e uma sensacional cobertura sabor chocolate. E, além de todo esse sabor, um canudinho de biscoito supercrocante.");
						break;
						case 11: System.out.println("\nMcColosso Caramelo!\nNão é uma sobremesa qualquer, é um verdadeiro colosso. Uma supercasquinha de biscoito em forma de cone, recheada com massa gelada de baunilha e uma sensacional cobertura de caramelo. E, além de todo esse sabor, um canudinho de biscoito supercrocante.");
						break;
						case 12: System.out.println("\nPetit Suisse Sabor Morango!\nO mais delicioso iogurte desnatado sabor morango.");
						break;
						case 13: System.out.println("\nTorta de Maçã!\nBoa demais. Parece a receita lá de casa. Massa quentinha e crocante envolvendo deliciosos recheios de banana ou maçã com gostinho de doce caseiro.");
						break;
						case 14: System.out.println("\nTorta de Banana!\nBoa demais! Parece a receita lá de casa. Massa quentinha e crocante envolvendo um delicioso recheio de banana com gostinho de doce caseiro.");
						break;
						case 15: System.out.println("\nMcShake Morango!\nDeliciosamente cremoso. O novo McShake Morango é feito com leite e batido na hora. Uma delícia!");
						break;
						case 16: System.out.println("\nMcShake Ovomaltine!\nDeliciosamente cremoso. O novo McShake Ovomaltine é feito com leite e batido na hora. Uma delícia!");
						break;
						case 17: System.out.println("\nMcShake Kopenhagen!\nDeliciosamente cremoso. O novo McShake Chocolate Kopenhagen é feito com leite e batido na hora. Uma delícia!");
						break;
						case 18: System.out.println("\nMcFlurry M&Ms!\nSobremesa dentro da sobremesa? Temos! Pra sua #FomeGeladinhadeMéqui, chegou o novo McFlurry M&Ms, com massa gelada sabor baunilha, deliciosos e coloridos M&Ms ao leite e calda de chocolate.");
						break;
						case 19: System.out.println("\nMcFlurry Espetáculo Kopenhagen Chocolate!\nA massa geladinha de baunilha, cobertura sabor chocolate e o delicioso tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e trazem o sabor único que só o chocolate ao leite Kopenhagen têm.");
						break;
						case 20: System.out.println("\nMcFlurry Espetáculo Kopenhagen Morango!\nA massa geladinha de baunilha, cobertura de morango e o delicioso tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e trazem o sabor único que só o chocolate ao leite Kopenhagen têm.");
						break;
						case 21: System.out.println("\nMcFlurry Espetáculo Kopenhagen Caramelo!\nA massa geladinha de baunilha, cobertura de caramelo e o delicioso tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e trazem o sabor único que só o chocolate ao leite Kopenhagen têm.");
						break;
						case 22: System.out.println("\nMcFlurry Ovomaltine®!\nPara sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Ovomaltine, com massa gelada de baunilha, flocos de ovomaltine e cobertura sabor chocolate");
						break;
						case 23: System.out.println("\nMcFlurry Prestígio Chocolate!\nPara sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Prestígio com massa gelada de baunilha, cobertura sabor chocolate e bombom recheado com coco coberto com chocolate ao leite Prestígio ®");
						break;
						case 24: System.out.println("\nMcFlurry Prestígio Morango!\nPara sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Prestígio com massa gelada de baunilha, cobertura de morango e bombom recheado com coco coberto com chocolate ao leite Prestígio ®");
						break;
						case 25: System.out.println("\nMcFlurry Prestígio Caramelo!\nPara sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Prestígio com massa gelada de baunilha, cobertura de caramelo e bombom recheado com coco coberto com chocolate ao leite Prestígio ®");
						break;
						}
						
						
						//Bebidas Frias//
					case 11:
						System.out.println("\nCoca-Cola 300mL: 1");
						System.out.println("Fanta Laranja 500mL: 2");
						System.out.println("Fanta Laranja 700mL: 3");
						System.out.println("Coca-Cola 500mL: 4");
						System.out.println("Coca-Cola 700mL: 5");
						System.out.println("Coca-Cola Zero 300mL: 6");
						System.out.println("Coca-Cola Zero 500mL: 7");
						System.out.println("Coca-Cola Zero 700mL: 8");
						System.out.println("Fanta Laranja 300mL: 9");
						System.out.println("Fanta Quaraná 300mL: 10");
						System.out.println("Fanta Guaraná 500mL: 11");
						System.out.println("Fanta Guaraná 700mL: 12");
						System.out.println("Del Valle Laranja 300mL: 13");
						System.out.println("Del Valle Laranja 500mL: 14");
						System.out.println("Del Valle Laranja 700mL: 15");
						System.out.println("Del Valle Uva 300mL: 16");
						System.out.println("Del Valle Uva 500mL: 17");
						System.out.println("Del Valle Uva 700mL: 18");
						System.out.println("Agua Mineral: 19");
						System.out.println("Del Valle 100% Uva (McLanche Feliz): 20");
						System.out.print("Escolha sua opção: ");
						int bFrias=ler.nextInt();
						
						switch(bFrias)
						{
						case 1: System.out.println("\nCoca-Cola 300mL!\nRefrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
						break;
						case 2: System.out.println("\nFanta Laranja 500ml!\nRefrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
						break;
						case 3: System.out.println("\nFanta Laranja 700ml!\nRefrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
						break;
						case 4: System.out.println("\nCoca-Cola 500ml!\nRefrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
						break;
						case 5: System.out.println("\nCoca-Cola 700ml!\nRefrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
						break;
						case 6: System.out.println("\nCoca-Cola Zero 300ml!\nRefrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
						break;
						case 7: System.out.println("\nCoca-Cola Zero 500ml!\nRefrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
						break;
						case 8: System.out.println("\nCoca-Cola Zero 700ml!\nRefrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
						break;
						case 9: System.out.println("\nFanta Laranja 300ml!\nRefrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
						break;
						case 10: System.out.println("\nFanta Guaraná 300ml!\nRefrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
						break;
						case 11: System.out.println("\nFanta Guaraná 500ml!\nRefrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
						break;
						case 12: System.out.println("\nFanta Guaraná 700ml!\nRefrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
						break;
						case 13: System.out.println("\nDel Valle Laranja 300ml!\nDeliciosos sabores à sua escolha. Néctar de fruta nos sabores uva ou laranja.");
						break;
						case 14: System.out.println("\nDel Valle Laranja 500ml!\nDeliciosos sabores à sua escolha. Néctar de fruta nos sabores uva ou laranja.");
						break;
						case 15: System.out.println("\nDel Valle Laranja 700ml!\nDeliciosos sabores à sua escolha. Néctar de fruta nos sabores uva ou laranja.");
						break;
						case 16: System.out.println("\nDel Valle Uva 300ml!\nDeliciosos sabores à sua escolha. Néctar de fruta nos sabores uva ou laranja.");
						break;
						case 17: System.out.println("\nDel Valle Uva 500ml!\nDeliciosos sabores à sua escolha. Néctar de fruta nos sabores uva ou laranja.");
						break;
						case 18: System.out.println("\nDel Valle Uva 700ml!\nDeliciosos sabores à sua escolha. Néctar de fruta nos sabores uva ou laranja.");
						break;
						case 19: System.out.println("\nÁgua Mineral!\nÁgua sem gás.");
						break;
						case 20: System.out.println("\nDel Valle 100% Uva (McLanche Feliz)!\n100% Suco de uva, sem açúcar adicionado, sem corante e sabores artificiais.");
						break;
						}
						
						
						//Café da Manhã//
					case 12:
						System.out.println("\nQueijo Quente: 1");
						System.out.println("Croissant de Presunto e Queijo: 2");
						System.out.println("Pão de Queijo: 3");
						System.out.println("Capuccino 300mL: 4");
						System.out.println("Capuccino 200mL: 5");
						System.out.println("Café com Leite 200mL: 6");
						System.out.println("Café com Leite 300mL: 7");
						System.out.println("Café Premium 300mL: 8");
						System.out.println("Café Premium 100mL: 9");
						System.out.println("Café Premium 200mL: 10");
						System.out.println("Chocolate Quente 300mL: 11");
						System.out.println("Chocolate Quente 200mL: 12");
						System.out.print("Escolha sua opção: ");
						int cafeManha=ler.nextInt();
						
						switch(cafeManha)
						{
						case 1: System.out.println("\nQueijo Quente!\nComposto por pão sem gergelim e duas fatias do delicioso queijo sabor cheddar.");
						break;
						case 2: System.out.println("\nCroissant de Presunto e Queijo!\nNem tente resistir. Só de olhar a imagem já dá vontade de devorar. A massa é fresquinha, crocante e deliciosa. O recheio é de presunto quentinho com queijo derretido. Impossível resistir!");
						break;
						case 3: System.out.println("\nPão de Queijo!\nImpossível de resistir. Pão de queijo quentinho e macio. Quem já provou sabe que não tem igual.");
						break;
						case 4: System.out.println("\nCapuccino 300ml!\nFeito com leite semidesnatado, café do Méqui e chocolate em pó.");
						break;
						case 5: System.out.println("\nCapuccino 200ml!\nFeito com leite semidesnatado, café do Méqui e chocolate em pó.");
						break;
						case 6: System.out.println("\nCafé com Leite 200ml!\nO famoso sabor da manhã. Quem nunca sentiu esse sabor logo cedo? E os nossos grãos selecionados deixam esse clássico do café da manhã ainda mais especial.");
						break;
						case 7: System.out.println("\nCafé com Leite 300ml!\nO famoso sabor da manhã. Quem nunca sentiu esse sabor logo cedo? E os nossos grãos selecionados deixam esse clássico do café da manhã ainda mais especial.");
						break;
						case 8: System.out.println("\nCafé Premium 300ml!\nO dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. Mas não dá para chamar um café de grãos selecionados de cafezinho.");
						break;
						case 9: System.out.println("\nCafé Premium 100ml!\nO dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. Mas não dá para chamar um café de grãos selecionados de cafezinho.");
						break;
						case 10: System.out.println("\nCafé Premium 200ml!\nO dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. Mas não dá para chamar um café de grãos selecionados de cafezinho.");
						break;
						case 11: System.out.println("\nChocolate Quente 300ml!\nFeito com leite semidesnatado e chocolate em pó.");
						break;
						case 12: System.out.println("\nChocolate Quente 200ml!\nFeito com leite semidesnatado e chocolate em pó.");
						break;
						}
						
						
						//Bebidas Quentes//
					case 13:
						System.out.println("Café Premium 100mL: 1");
						System.out.println("Café Premium 200mL: 2");
						System.out.println("Café Premium 300mL: 3");
						System.out.println("Café com Leite 200mL: 4");
						System.out.println("Café com Leite 300mL: 5");
						System.out.println("Capuccino 200mL: 6");
						System.out.println("Capuccino 300mL: 7");
						System.out.println("Chocolate Quente 200mL: 8");
						System.out.println("Chocolate Quente 300mL: 9");
						System.out.print("Escolha sua opção: ");
						int bebQuente=ler.nextInt();
						
						switch(bebQuente)
						{
						case 1: System.out.println("\nCafé Premium 100ml!\nO dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. Mas não dá para chamar um café de grãos selecionados de cafezinho.");
						break;
						case 2: System.out.println("\nCafé Premium 200ml!\nO dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. Mas não dá para chamar um café de grãos selecionados de cafezinho.");
						break;
						case 3: System.out.println("\nCafé Premium 300ml!\nO dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. Mas não dá para chamar um café de grãos selecionados de cafezinho.");
						break;
						case 4: System.out.println("\nCafé com Leite 200ml!\nO famoso sabor da manhã. Quem nunca sentiu esse sabor logo cedo? E os nossos grãos selecionados deixam esse clássico do café da manhã ainda mais especial.");
						break;
						case 5: System.out.println("\nCafé com Leite 300ml!\nO famoso sabor da manhã. Quem nunca sentiu esse sabor logo cedo? E os nossos grãos selecionados deixam esse clássico do café da manhã ainda mais especial.");
						break;
						case 6: System.out.println("\nCapuccino 200ml!\nFeito com leite semidesnatado, café do Méqui e chocolate em pó.");
						break;
						case 7: System.out.println("\nCapuccino 300ml!\nFeito com leite semidesnatado, café do Méqui e chocolate em pó.");
						break;
						case 8: System.out.println("\nChocolate Quente 200ml!\nFeito com leite semidesnatado e chocolate em pó.");
						break;
						case 9: System.out.println("\nChocolate Quente 300ml!\nFeito com leite semidesnatado e chocolate em pó.");
						break;
						}
						
						
						//McOFERTA (EM MANUTENÇÂO)//
					case 14:
						
						
						
						//Méqui Box//
					case 15:
						System.out.println("\nFamily Box para 2: 1");
						System.out.println("Family Box para 3: 2");
						System.out.println("Méqui Box Clássico para 4: 3");
						System.out.println("Méqui Box Clássico para 3: 4");
						System.out.print("Escolha sua opção: ");
						int boxM=ler.nextInt();
						
						switch(boxM)
						{
						case 1: System.out.println("\nFamily Box para 2!\nComposto por 01 McLanche Feliz e 01 McOferta média Big Mac, Quarterão, Cheddar McMelt ou McChicken.");
						break;
						case 2: System.out.println("\nFamily Box para 3!\nComposto por 01 McLanche Feliz e 02 McOfertas médias Big Mac, Quarterão, Cheddar McMelt ou McChicken.");
						break;
						case 3: System.out.println("\nMéqui Box Clássico para 4!\nMéqui Box Clássico para 4 Composto por 04 McOfertas médias: Big Mac, Quarterão, Cheddar McMelt ou McChicken.");
						break;
						case 4: System.out.println("\nMéqui Box Clássico para 3!\nMéqui Box Clássico para 3 Composto por 03 McOfertas médias: Big Mac, Quarterão, Cheddar McMelt ou McChicken.");
						break;
						default:
							System.out.println("Escolha uma opção válida!");
						}			
				}
				
				
				//LANCAMENTO//
		case 2:
			System.out.println("\nSELEÇÔES DO MÉQUI!\nCada dia uma seleção diferente para você.");
			System.out.println("8 países. 8 sanduíches. Experimente.\r\n"
					+ "Do McBrasilao McCatar. Do McFrança ao McMéxico. Diversos diferentes países pra você provar o sabor de cada um. Vamos nessa?"
					+ "Experimente colocando: 1");
			System.out.println("A novidade que faltava!\r\n"
					+ "Chegou a hora de você fazer aquela Méquizicecom o Molho do CBO e Molho Tasty. Partiu?"
					+ "Coloque a opção: 2");
			System.out.println("Peça pelo combo figurinha!\n Aproveite esse combo especial!"
					+ "Saiba mais apertando: 3");
			System.out.println("Novo McFlurry Espetáculo Kopenhagen\r\n"
					+ "Pra felicidade da sua #FomeGeladinhaDeMéqui."
					+ "Se você quer, escolha opção: 4");
			System.out.println("Simples assim.\r\n"
					+ "Seu cafezinho feito com um cafezão."
					+ "Vem experimentar colocando: 5");
			System.out.println("McLanche Feliz\r\n"
					+ "Que tal conhecer a transformação do #McLancheFeliz?"
					+ "Para saber mais, coloque: 6");
					int lanca=ler.nextInt();
			
						switch(lanca)
						{
						case 1:
							
						}
			
			
				//QUEM SOMOS//
		case 3:
			System.out.println("\nInstitucional: 1");
			System.out.println("Franquias: 2");
			System.out.println("Trabalhe Conosco: 3");
			System.out.println("Privacidade: 4");
			System.out.println("Desenvolvimento Sustentável e Compromisso Social: 5");
			System.out.println("Publicidade Responsável: 6");
			System.out.print("Coloque sua opção: ");
			int somos=ler.nextInt();
			
					switch(somos)
					{
					case 1: System.out.println("\nA Arcos Dorados é a maior franquia independente direitos exclusivos de possuir, operar e conceder o McDonald’s do mundo e a principal rede de alimentação rápida em toda América Latina e Caribe. A companhia tem as franquias de restaurantes McDonald's em 20 países e territórios, incluindo Argentina, Aruba, Brasil, Chile, Colômbia, Costa Rica, Curaçao, Equador, Guiana Francesa, Guadalupe, Martinica, México, Panamá, Peru, Porto Rico, St. Croix, St. Thomas, Trinidad & Tobago, Uruguai e Venezuela.\r\n"
							+ "\r\n"
							+ "Desde sua fundação, em 2007, a companhia preza por compromissos que norteiam sua operação, como qualidade, transparência e segurança do alimento, geração de empregos formais para jovens, apoio às comunidades onde está presente, cadeia de suprimentos sustentável e impacto ambiental, diversidade e inclusão e experiências inovadoras para toda a família.\r\n"
							+ "\r\n"
							+ "Atualmente, a rede conta com mais de 2.200 restaurantes em toda América Latina, entre unidades próprias e subfranqueadas, além de mais de 240 McCafés e cerca de 3.300 desert centers. Para isso, contamos com mais de 100 mil funcionários em toda região. No Brasil, são cerca de 1.020 restaurantes, mais de 75 McCafés e 2.010 desert centers, empregando mais de 50 mil pessoas.\r\n"
							+ "\r\n"
							+ "Para saber mais sobre a companhia, visite o site: https://www.arcosdorados.com/");
					break;
					case 2: System.out.println("\nLíder absoluto no segmento de alimentação rápida e com produtos de qualidade reconhecida, o McDonald’s é uma das melhores franquias para investir e administrar. O modelo de negócios apoiado pelas franquias foi o fator que permitiu ao McDonald’s se tornar a rede de restaurantes de maior sucesso do mundo.\r\n"
							+ "\r\n"
							+ " \r\n"
							+ "\r\n"
							+ "Entre os motivos que fazem do McDonald’s líder em seu segmento, estão:\r\n"
							+ "\r\n"
							+ "✔ Marca com reconhecimento mundial\r\n"
							+ "\r\n"
							+ "✔ Modelo de negócios testado e bem-sucedido\r\n"
							+ "\r\n"
							+ "✔ Sistema que proporciona altos níveis de treinamento\r\n"
							+ "\r\n"
							+ "✔ Provedores de excelência\r\n"
							+ "\r\n"
							+ "✔ Oferece rede de suporte profissional\r\n"
							+ "\r\n"
							+ "✔ Desde suas origens, desenvolveu as franquias como modelo de\r\n"
							+ "\r\n"
							+ "negócio predominante\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "Quero ser um franqueado!\r\n"
							+ "\r\n"
							+ "Para entrar em contato com a área de Franquias da Rede, envie um e-mail para infofranquia@br.mcd.com");
					break;
					case 3: System.out.println("\nCom mais de 50 mil funcionários no Brasil, o McDonald's é um dos maiores empregadores de jovens do país. Todos os anos, realizamos o sonho do primeiro emprego de muita gente! Do nosso atual quadro de funcionários, cerca de 76% têm menos de 25 anos de idade e estão em sua primeira experiência.\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "Somos uma das empresas que mais oferece chances de ascensão profissional. Pois, quem trabalha com a gente tem várias oportunidades de desenvolvimento. Incentivamos o estudo e o aprimoramento, e temos orgulho de dizer que hoje aqui no Brasil, mais da metade dos gerentes ingressaram na companhia como atendentes, o primeiro degrau na escala hierárquica da empresa. Anualmente, são investidos cerca de R$40 milhões em treinamento e desenvolvimento de funcionários.\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "Aqui, todos têm espaço e oportunidade, não admitimos discriminação e exigimos o mesmo respeito para todos os nossos funcionários, sem qualquer distinção de sexo, idade, raça, orientação sexual, religião ou aparência física.\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "Quer fazer parte da nossa equipe?\r\n"
							+ "\r\n"
							+ "• Se você procura uma oportunidade como Atendente ou Jovem Aprendiz no restaurante McDonald’s, clique aqui (https://jobs.kenoby.com/mcdonalds) para cadastrar seu currículo.\r\n"
							+ "\r\n"
							+ "• Para se candidatar a outras oportunidades na área corporativa e programa de estágio do McDonald’s, por favor, clique aqui (https://jobs.kenoby.com/vempromequi).\r\n"
							+ "\r\n"
							+ "• Agora, se você tem algum tipo de deficiência, será muito bem-vindo neste time, clicando aqui (https://jobs.kenoby.com/mcdonalds).");
					break;
					case 4: System.out.println("\nPOLÍTICA DE PRIVACIDADE PARA CLIENTES E USUÁRIOS DO SITE, APP E DEMAIS APLICAÇÕES DE INTERNET ARCOS DOURADOS. Acesse o Link(https://www.mcdonalds.com.br/quemsomos/privacidade).");
					break;
					case 5: System.out.println("\nRECEITA DO FUTURO!\nNa Arcos Dorados, temos o compromisso de ser uma parte ativa da solução aos desafios que nossa sociedade enfrenta atualmente, sempre trazendo propostas inovadoras. Dessa forma, nasceu nossa estratégia socioambiental “Receita do Futuro”, promovida com o objetivo de impactar positivamente os setores onde temos mais oportunidades de alcançar mudanças significativas. A \"Receita do Futuro\" está no centro dos nossos valores e direciona a maneira de fazermos a diferença no meio ambiente e nas comunidades onde estamos presentes, ao lado de milhões de clientes, funcionários, fornecedores e empresas do setor."
							+ "Pilares de atuação:\r\n"
							+ "\r\n"
							+ "Como empresa líder na região, assumimos a responsabilidade de atuar em seis frentes prioritárias."
							+ "\r\n"
							+ "Emprego Jovem - Somos o maior empregador de jovens da América Latina, dando a oportunidade a milhares de pessoas de conquistarem seu primeiro emprego formal.\r\n"
							+ "\r\n"
							+ "Mudanças Climáticas - Implementamos ações para minimizar os impactos ambientais em toda nossa cadeia de operações.\r\n"
							+ "\r\n"
							+ "Embalagem e Reciclagem - Priorizamos a utilização de materiais renováveis e buscamos promover a mudança de antigos hábitos em nossos restaurantes.\r\n"
							+ "\r\n"
							+ "Fornecimento Sustentável - Promovemos o bem-estar animal e buscamos ingredientes produzidos com respeito ao meio-ambiente.\r\n"
							+ "\r\n"
							+ "Família e Bem-estar - Mantemos nosso compromisso com as famílias, evoluindo as opções de nosso menu com foco em oferecer mais qualidade de vida.\r\n"
							+ "\r\n"
							+ "Diversidade e Inclusão - Promovemos equipes diversificadas e um ambiente de trabalho que estimule o respeito e incentive a participação de todas as pessoas, favorecendo a inclusão e a igualdade de oportunidades.\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "Conheça mais sobre nossas ações no site: https://recetadelfuturo.com/");
					break;
					case 6: System.out.println("\nPUBLICIDADE RESPONSÁVEL E CRITÉRIOS NUTRICIONAIS\r\n"
							+ "\r\n"
							+ "Em 2007, o McDonald's tornou público seu código de ética publicitária no Brasil. O objetivo dessa iniciativa foi o de tornar público o compromisso da empresa no tocante à publicidade da marca.\r\n"
							+ "\r\n"
							+ "Em complementação a estas práticas, em 2009 o McDonald's Brasil, através da Arcos Dorados  que possui a licença para operar a marca no Brasil, assinou, juntamente com 22 outras empresas precursoras, o compromisso brasileiro elaborado pela Associação Brasileira de Anunciantes (ABA) em conjunto com a Associação Brasileira das Indústrias de Alimentos (ABIA) sobre publicidade dirigida ao público infantil em complemento às normas anteriormente estabelecidas pelo CONAR (Conselho Nacional de Auto-regulamentação Publicitária).\r\n"
							+ "\r\n"
							+ "Em 2016, em conjunto com um grupo de empresas do setor de alimentos e bebidas no Brasil, assumimos o compromisso de ampliar nosso papel na política de marketing e publicidade responsável para crianças, com avanços nas diretrizes estabelecidas em 2009, por meio da padronização de critérios nutricionais únicos e da estruturação de um processo de monitoramento independente e imparcial. Mais informações em: http://www.publicidaderesponsavel.com.br/. Importante destacar que somos o único restaurante deste compromisso.\r\n"
							+ "\r\n"
							+ "No tema, aqui no Brasil, ainda seguimos os compromissos globais do McDonald’s (clique aqui e conheça – disponível apenas em inglês) e, localmente, os compromissos da Arcos Dorados em toda América Latina (clique aqui e saiba mais).\r\n"
							+ "\r\n"
							+ "E, por falar em critérios nutricionais, desde 2011, a Arcos Dorados, que sempre teve um cuidado especial com a composição nutricional do seu menu infantil, passou a ofertar produtos diferentes do seu cardápio tradicional, tendo já oferecido ao longo dos anos cenourinha, maçã, suco e purê de maçã 100% fruta.\r\n"
							+ "\r\n"
							+ "Em 2019, tivemos a mais recente mudança nutricional no Combo do McLanche Feliz: com opções de diferentes grupos alimentares, redução das gorduras, do sódio e do açúcar adicionado e trabalhando apenas com corantes e aromatizantes naturais.\r\n"
							+ "\r\n"
							+ "O menu sugerido após a mudança conta com sanduíche com presença de vegetais, petit suisse sem corante e aromatizantes artificias como sobremesa, e água e as McFritas Kids. Nossa prioridade é servir comida de qualidade, gerando momentos deliciosos. É por isso que assumimos um forte compromisso não só em relação à publicidade, mas também com o cardápio que oferecemos e com as famílias que consomem nossos produtos todos os dias.");
					break;
					}
					
					
		//Familia//
		case 4:
			System.out.println("\nMcLanche Feliz!\nUm menu infantil muito divertido. Saiba mais clicando digidando: 1");
			System.out.println("\nLancamento!\nOs brinquedos mais divertidos estão no McLanche Feliz. Saiba mais escolhendo: 2");
			System.out.println("\nMéqui Box!\nUm jeito fácil e econômico de pedir Méqui para todo tipo de família e de galera. Saiba mais colocando: 3");
			System.out.println("\nMcLanche Feliz App\nMcLanche Feliz App\r\n"
					+ "Jogos, atividades e muitas surpresas esperam você e sua família no McLanche Feliz App. Que tal baixar o App para o seu filho? Saiba mais colocando: 4");
			System.out.println("\nCompromisso com as famílias!\nTodos os días, trabalhamos para atender às preocupações de milhões de famílias que visitam os nossos Restaurantes. Saiba mais colocando: 5");
		}		int fami=ler.nextInt();
				switch(fami)
				{
				case 1:
					System.out.println("Você sabe o que é McLanche Feliz?\r\n"
							+ " \r\n"
							+ " \r\n"
							+ "É um cardápio infantil variado que atende aos critérios nutricionais globais da empresa, composto por: um sanduíche ou Chicken McNuggets, um acompanhamento (sendo McFritas Kids ou Tomatinho), uma sobremesa (Petit Suisse) e uma bebida (água mineral 500 ml). Além disso, inclui um brinquedo.\r\n"
							+ "\r\n"
							+ "Ao longo dos anos, fomos transformando o cardápio do McLanche Feliz e adaptando os ingredientes em busca de uma proposta que seja confiável para os pais, por oferecerem mais benefícios nutricionais, e ao mesmo tempo gostosa e divertida para as crianças.O McLanche Feliz tem na sua composição produtos feitos com corantes e aromatizantes naturais. Que tal desfrutar em família?");
					System.out.println("\\nHamburger!\\nUm Hamburguer (100% carne bovina), cebola, picles, ketchup, mostarda e pão sem gergelim.");
					System.out.println("\\nMcFiesta!\\nHambúrguer de carne 100% bovina, alface, tomate e maionese no pão quentinho.");
					System.out.println("\\nCheeseburger!\\nUm hamburguer (100% carne bovina), queijo sabor cheddar, cebola, picles, ketchup, mostarda e pão sem gergelim.");
					System.out.println("\nxxxxxxxx!\nxxxxxxxxxxxx");
					System.out.println("\nxxxxxxxx!\nxxxxxxxxxxxx");
					System.out.println("\nxxxxxxxx!\nxxxxxxxxxxxx");
					System.out.println("\nxxxxxxxx!\nxxxxxxxxxxxx");
					System.out.println("\nxxxxxxxx!\nxxxxxxxxxxxx");
				
				}
		
		
		//FINAL DO CÓDIGO!!!//
}
}
