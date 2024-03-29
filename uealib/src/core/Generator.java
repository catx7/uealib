package core;

public interface Generator {
    /**
     * Основываясь на данных о переданном ему поколении g и, может быть, контексте,
     * конструирует новое поколение.
     */
	@SuppressWarnings("unchecked")
	public Generation getNext(Generation g);
	
	
}
