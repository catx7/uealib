package antcolony;

import antcolony.Generation;

public class TransitionCriteria  implements core.TransitionCriteria{
	
	public boolean isSatisfied(Generation g, Generation h) {
		AntSolution s1 = g.getSolution();
		AntSolution s2 = h.getSolution();
	//	System.out.println(s1.getFitness());
	//	System.out.println(s2.getFitness());
		if(s1.getFitness()<s2.getFitness()){return false;}	
		else{	return true;}
	}

	@Override
	public boolean isSatisfied(core.Generation g, core.Generation h) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
