import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNumbers {

	public static void main(String[] args) {

		Integer[] array = { 2, 2, 1, 2, 1, 2, 4 };

		Set<Integer> set = new TreeSet<Integer>();
		set.addAll(Arrays.asList(array));
		int[] a = new int[set.size()];
		int count = 0;

		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			count = 0;

			for (int j = 0; j < array.length; j++) {
				if (integer == array[j])
					count++;
			}
			System.out.print(integer);
			System.out.print('-');
			System.out.print(count);
			System.out.println();
		}

	}

}
