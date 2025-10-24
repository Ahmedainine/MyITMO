package mypackage;


import mypokemons.Mandibuzz;
import mypokemons.Togekiss;
import mypokemons.Togepi;
import mypokemons.Togetic;
import mypokemons.Vullaby;
import mypokemons.Zangoose;
import ru.ifmo.se.pokemon.Battle;


public class Main {

	public static void main(String[] args) {
Battle b = new Battle();
		
		// Team 1
		Zangoose zangoose = new Zangoose("Zangy", 19);
        Vullaby vullaby = new Vullaby("Vully", 54);
        Mandibuzz mandibuzz = new Mandibuzz("Mandy", 57);

        // Team 2
        Togepi togepi = new Togepi("Togo", 1);
        Togetic togetic = new Togetic("Togi", 1);
        Togekiss togekiss = new Togekiss("TogoX", 1);
		
		// Add team 1 Pokemon
		
        b.addAlly(zangoose);
        b.addAlly(togetic);
        b.addAlly(mandibuzz);

        // Add team 2 Pokemon
        b.addFoe(togepi);
        b.addFoe(vullaby);
        b.addFoe(togekiss);
        
        
		
		b.go();

	}

}
