package characters;

import java.util.Scanner;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			Random random = new Random();
			
			Player p = new Player();
			
			p.name = "Cykoh";
			p.hp = 100;
			p.attack = 20;
			p.heal = 20;
			
			Enemy e = new Enemy();
			
			e.name = "Hokyc";
			e.hp = 100;
			e.attack = 20;
			e.heal = 20;
			
			String options;
			
			while(p.hp > 0 && e.hp > 0) {
				System.out.println("***************************************");
				System.out.println("Cykoh Would you like to Attack or Heal?"
						+ "\n1 = Attack"
						+ "\n2 = Heal");
				System.out.println("***************************************\n");
				options = s.nextLine();
				
				int playerDamage;
				playerDamage = random.nextInt(17, 24);
				
				int enemyDamage;
				enemyDamage = random.nextInt(17, 24);
				
				int playerHeal;
				playerHeal = random.nextInt(15, 31);
				
				if (options.equals("1")) {

				    e.hp = e.hp - playerDamage;
				    System.out.println("Cykoh dealt " + playerDamage + " damage!");

				    if (e.hp <= 0) {
				        System.out.println("Hokyc has been defeated!");
				        break;
				    }

				    p.hp = p.hp - enemyDamage;
				    System.out.println("Hokyc dealt " + enemyDamage + " damage!");

				    if (p.hp <= 0) {
				        System.out.println("Cykoh has been defeated!");
				        break;
				    }

				    System.out.println("Player HP: " + p.hp);
				    System.out.println("Enemy HP: " + e.hp);
				}
				else if(options.equals("2")){
					p.hp = p.hp + playerHeal;
					System.out.println("Cykoh gained " + playerHeal + " hp");
					
					p.hp = p.hp - enemyDamage;
					System.out.println("Hokyc dealt " + enemyDamage + " damage!");
					System.out.println("Player HP: " + p.hp);
					System.out.println("Enemy HP: " + e.hp);
					if(p.hp <= 0) {
						break;
					}
				}else {
					System.out.println("That's not a valid option!");
				}
				
			}
			
			
			s.close();
		System.out.println();
		System.out.println("1");

	}


}
