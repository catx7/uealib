package taboosearch.permutations;

import java.util.ArrayList;
import java.util.List;
import common.Pair;
import taboosearch.Generation;

abstract public class Generator<S extends Solution, M extends Move<S>, G extends Generation<S>>
		extends taboosearch.Generator<S, M, G> {
	private List<M> moves;
	
	public Generator(int n) {	
		this.moves = getMoves(n);
	}
	
	abstract protected M makeMove(int i, int j);
	
	private ArrayList<M> getMoves(int n) {
		ArrayList<M> result = new ArrayList<M>((n - 2) * (n - 1) / 2);
		
		for (int i = 1; i < n - 1; ++i)
			for (int j = i + 1; j < n; ++j) {
				result.add(makeMove(i, j));
			}
		
		return result;	
	}

	public Pair<S, List<M>> getNext(G generation) {
		assert generation.size() == 1;

		S solution = generation.get(0);		
		return new Pair<S, List<M>>(solution, moves);
	}

}