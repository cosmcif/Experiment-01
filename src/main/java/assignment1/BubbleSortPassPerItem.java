package assignment1;

public final class BubbleSortPassPerItem<T extends Comparable<T>> implements Sorter<T> {
	
	public void sort(final T[] items) {
		for (int pass = 0; pass < items.length; pass++) {

			for (int i = 0; i < items.length - 1; i++) {
				if (items[i].compareTo(items[i + 1]) > 0) {
					final T item = items[i];
					items[i] = items[i + 1];
					items[i + 1] = item;
				}
			}

		}
	}
	
}


// a double for loop, outer loop iterates for all the items length
// inner loop iterates items.length -1
// compares if the item[i] is greater than the item[i+1] in that case swap it
// if item[i] is shorter or equal then leave it there 
// do the swap if neccessary for all the length for length times