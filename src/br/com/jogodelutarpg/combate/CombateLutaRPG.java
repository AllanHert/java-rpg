package br.com.jogodelutarpg.combate;

import java.util.Random;
import java.util.Scanner;

public class CombateLutaRPG {
	
	
	static int ataqueJogador() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escolha seu ataque:");
		System.out.println("(1) - Ataque Basico");
		System.out.println("(2) - Ultimate");
		return leitor.nextInt();
		}
	
	static int ganhaBuff() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("ITEM ENCONTRADO!");
		System.out.println("Escolha seu item:");
		System.out.println("(1) - Espada nova! Aumenta 1 de dano no Ataque Basico");
		System.out.println("(2) - Cajado melhorado! Aumenta 5 de dano da Ultimate");
		System.out.println("(3) - Livro de feitiços! Aumenta 3 carga da Ultimate");
		System.out.println("(4) - Poção de vida! Ganha 20 de HP");
		System.out.println("===========================");
		return leitor.nextInt();
		}
	
	static int ataqueComputador() {
		Random gerador = new Random();
		return gerador.nextInt(3)+1; //Retorna num aleatorio entre 1 e 3
	}
	
	static void mostraHp(int hpJogador, int hpComputador, int contagemUltimate) {
		System.out.println("===========================");
		System.out.println("- HP Jogador: " + hpJogador);
		System.out.println("- HP INIMIGO: " + hpComputador);
		System.out.println("* Cargas de Ultimates: " + contagemUltimate);
		System.out.println("===========================");

	}
	
	static int combate(){
		int hpJogador = 160;
		int hpComputador;
		int contagemUltimate = 5;
		int escolhaAtaque;
		int escolhaBuff;
		int ataqueBasico = 7;
		int ataqueUltimate = 20;
		int i = 1;
		
		while(hpJogador > 0) {
			
			hpComputador = 9 + i;
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("INIMIGO DO MEIO AMBIENTE " + i);
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=\n");
			
			if(i % 3 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: VOCE VAI SER POLUIDO!");
			}
			
			if(i % 7 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: PREPARECE PARA O DESMATAMENTO!");
			}
			
			if(i % 11 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: SUA DE SUJAR HORA CHEGOU!");
			}
			
			if(i % 13 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: NAO TEREI PENA DE DESTRUIR O MEIO AMBIENTE!");
			}
			
			if(i % 17 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: SUCUMBAAAAA AO LIXO!");
			}
			
			if(i % 23 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: REXXXPEITA O RATO!");
			}
			
			if(i % 29 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: QUEM VAI ENCARAR O CAMPEAO DO DESMATAMENTO?");
			}
			
			if(i % 31 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: E LA VAI BOMBA DE LIXO");
			}
			
			if(i % 37 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: SER INSIGNIFICANTE!");
			}
			
			if(i % 41 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: VOCE SERA TRANSFORMADO EM LIXO");
			}
			
			if(i % 43 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: TI TI TITI TI TI TI");
			}
			
			if(i % 47 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: AGORA VOCE ME VE, AGORA NAO VE MAIS");
			}
			
			if(i % 53 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: MANTENHA SEU AMIGOS PERTO, E SEUS INIMIGOS NA DUVIDA");
			}
			
			if(i % 59 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: EU VOLTEI!!!");
			}
			
			if(i % 97 == 0) {
				System.out.println("INIMIGO DO MEIO AMBIENTE: TODOS SERVIRAO AO VERDADEIRO SENHOR DOS LIXOS E DOS PORCOS!");
			}
			

			while(hpJogador > 0 && hpComputador > 0 ) {
				mostraHp(hpJogador, hpComputador, contagemUltimate);
				escolhaAtaque = ataqueJogador();
				switch(escolhaAtaque) {
					case 1:
						System.out.println("Jogador realizou um ataque basico.");
						hpComputador -= ataqueBasico;
						break;
					case 2:
						if(contagemUltimate > 0) {
							System.out.println("Jogador usou sua Ultimate.");
							hpComputador -= ataqueUltimate;
							contagemUltimate--;
							break;
						} else {
							System.out.println("Sem cargas suficientes.");
							break;
						}
						
					default:
						System.out.println("Opcao invalida.");
						break;
						
				}
				if(hpComputador > 0) {
					escolhaAtaque = ataqueComputador();
					switch(escolhaAtaque){
					case 1:
						System.out.println("Computador realizou um ataque basico.");
						hpJogador -= 2 + (int)(i/10);
						break;
					case 2:
						System.out.println("Computador usou sua habilidade.");
						hpJogador -= 3 + (int)(i/10);
						break;
					case 3:
						System.out.println("Computador usou sua Ultimate.");
						hpJogador -= 7 + (int)(i/10);
						break;
					}
				}
				else {
					System.out.println("Inimigo derrotado.");
					System.out.println("Vida Aumentada!");

				}
			}
			
			if(hpJogador > 0) {
				hpJogador += 5;
			}
			if(i % 10 ==0) {
				escolhaBuff = ganhaBuff();
				switch(escolhaBuff) {
					case 1:
						System.out.println("Dano do ataque basico aumentado!");
						ataqueBasico++;
						break;
					case 2:
						System.out.println("Dano da Ultimate aumentado!");
						ataqueUltimate += 5;
						break;
					case 3:
						System.out.println("Carga da Ultimate aumentada!");
						contagemUltimate += 3;
						break;
					case 4:
						System.out.println("HP aumentado!");
						hpJogador += 20;
						break;
					default:
						System.out.println("Opcao invalida.");
						break;
						
				}
			}
			
			
			i++;
		}
		return i;
	}
	
	 public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int continua = 1;
		int recorde = 0;
		while(continua == 1) {
			
			int pontos = combate();
			System.out.println("Jogador chegou a " + pontos + " pontos.");
			if(pontos > recorde) {
				recorde = pontos;
			}
			System.out.println("RECORDE ATUAL = " + recorde + " inimigos do meio ambiente derrotados");
			
			System.out.println("Você morreu e o lixo se espalhou. Tentar novamente? (1) Sim (2) Não");
			continua = leitor.nextInt();
		}
	}
}
