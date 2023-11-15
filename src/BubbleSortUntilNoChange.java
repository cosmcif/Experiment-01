
public final class BubbleSortUntilNoChange<T extends Comparable<T>> implements Sorter<T> {
	
	public void sort(final T[] items) {
		boolean changed;
		do {
			changed = false;
			for (int i = 0; i < items.length - 1; i++) {
				if (items[i].compareTo(items[i + 1]) > 0) {
					final T item = items[i];
					items[i] = items[i + 1];
					items[i + 1] = item;
					changed = true;
				}
			}
		} while (changed);
	}
	
}


// do a for loop trough the items and swap the items[i] with item[i+1] 
// if item[i] and item[i+1] (compareTo) are equal return 0 
// if the item[i] is shorter return < 0
// if the item[i] is longer return > 0
// if an item is swaped then changed becomes true 
// if changed = true then the loop happen just once
// if changed = false it iterates again trough the items 
// changed = false means that the items are all equal or item[i] is shorter than item[i+1]