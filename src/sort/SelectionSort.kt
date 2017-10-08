package sort

/**
 * Generic selection sort based on minimum selection
 *
 * @author Cedrik Kaufmann
 */
class SelectionSort<T: Comparable<T>>: Sort<T> {

    private val utils = Utils<T>() // providing some useful functions

    /**
     * Sort array
     *
     * @param data array to sort
     * @return sorted array
     */
    override fun sort(data: Array<T>): Array<T> {
        val sorting = data.clone()

        for (i in 0 .. (sorting.size - 2) ) {
            var minIndex = i

            ((i + 1) .. (sorting.size - 1))
                    .asSequence()
                    .filter { sorting[it] < sorting[minIndex] }
                    .forEach { minIndex = it }

            utils.swap(sorting, i, minIndex)
        }

        return sorting
    }
}