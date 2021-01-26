package main;

import pojo.Arco;
import pojo.Curandero;
import pojo.Espada;
import pojo.Guerrero;
import pojo.Hechizo;
import pojo.Mago;
import pojo.Rezo;

public class VideojuegoMain {

	public static void main(String[] args) {


		Guerrero luchador1 = new Guerrero("Pablo", (new Espada(50)), 500, 30);		
		Mago luchador2 = new Mago("Miguel", (new Hechizo(60)), 300, 40);
		
		int totalDamage;
		boolean finJuego = false;
		
		while (!finJuego) {
						
			totalDamage = luchador1.atacar(luchador2);
			System.out.println(luchador1.getNombre() + " ataca a " + luchador2.getNombre() 
			+ " y le inflinge " + totalDamage + " puntos de daño" );
			
			if (luchador2.getPuntosVida() > 0) {
				totalDamage = luchador2.atacar(luchador1);
				System.out.println(luchador2.getNombre() + " ataca a " + luchador1.getNombre() 
				+ " y le inflinge " + totalDamage + " puntos de daño" );
				
				if (luchador1.getPuntosVida() <= 0) {
					finJuego = true;
					System.out.println("FIN DEL JUEGO!!! " + luchador2.getNombre() + " GANA");
				}
				
			} else {
				finJuego = true;
				System.out.println("FIN DEL JUEGO!!! " + luchador1.getNombre() + " GANA");
			}
			
			
			
		}
		
		

	}

}
