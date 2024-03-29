package core;

/**
 * Критерий остановки работы алгоритма.
 */
public interface StoppingCriteria {
	/**
	 * На основе полученного g и, может быть, контекста, принимает решение
	 * об остановке алгоритма.
	 */
	@SuppressWarnings("unchecked")
	public boolean isSatisfied(Generation g);
}
