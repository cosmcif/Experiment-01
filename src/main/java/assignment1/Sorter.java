package assignment1;

/**
 * Interface for sorter
 * @param <T>
 */
interface Sorter<T extends Comparable<T>> {
	
	void sort(T[] items);
	
}
