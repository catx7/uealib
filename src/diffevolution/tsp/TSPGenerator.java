package diffevolution.tsp;

import java.util.Random;

import diffevolution.Context;
import diffevolution.tsp.TSPGeneration;
import core.Generator;

public class TSPGenerator<C extends Context<TSPGeneration, TSPSolution>> implements Generator<TSPGeneration> {

	
	public TSPGeneration getNext(TSPGeneration currentGeneration) {
		TSPGeneration g = new TSPGeneration();
		int Gn = 10; 
			
		for(int k = 0; k < Gn; ++k) {			
		    int x = 1, y = 1, z = 1;
		    Random rand = new Random();
	
		    while(x == y || y == z ){
		        x = rand.nextInt(Gn);
		    	y = rand.nextInt(Gn);
		    	z = rand.nextInt(Gn);
		    }
		    		  
		    TSPSolution newRouteEncrypted = currentGeneration.mutate(currentGeneration.get(x).route2leh(), currentGeneration.get(y).route2leh(), currentGeneration.get(z).route2leh());  
		    TSPSolution currentRouteEncrypted = currentGeneration.get(k).route2leh();
		    newRouteEncrypted.doCrossover(currentRouteEncrypted);
		    TSPSolution nextRoute = newRouteEncrypted.leh2route();
		    g.add(nextRoute);
		}
	    return g;	
	}
}
