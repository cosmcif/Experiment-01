package exp01;

public final class BubbleSortWhileNeeded<T extends Comparable<T>> implements Sorter<T> {

	public void sort(final T[] items) {
		int n = items.length;

		do {
			int maxIndex = 0;
			for (int i = 1; i < n; i++) {
				if (items[i - 1].compareTo(items[i]) > 0) {
					final T item = items[i - 1];
					items[i - 1] = items[i];
					items[i] = item;
					maxIndex = i;
				}
			}
			n = maxIndex;
		} while (n > 0);

	}
	
}


// do the swap when neeeded. Do the swap if itemp[i-1] is longer than item[i]
// iterates first time to n where is n is the length of items
// after it sets n to the index of item that has been swapped before 
// n = item[i]

