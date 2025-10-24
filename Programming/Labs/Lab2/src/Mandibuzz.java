package mypokemons;

import mymoves.mandibuzz.BoneRush;
import mymoves.vullaby.DoubleTeam;
import mymoves.vullaby.NastyPlot;
import mymoves.vullaby.RockTomb;
import ru.ifmo.se.pokemon.Type;

public class Mandibuzz extends Vullaby{
	public Mandibuzz(String name , int level)
	{
		super(name , level);
		super.setType(Type.DARK,Type.FLYING);
		super.setStats(110,65,105,55,95,80);
		
		RockTomb rocktomb = new RockTomb(60,95);
		NastyPlot nastyplot = new NastyPlot(0,100);
		DoubleTeam doubleteam = new DoubleTeam(0,100);
		BoneRush bonerush = new BoneRush(25,90);
		
		super.setMove(rocktomb, nastyplot ,doubleteam , bonerush);
	}

}
