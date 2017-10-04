package sort

/**
 * Generic Bubble Sort
 *
 * @author Cedrik Kaufmann
 */
class BubbleSort<T : Comparable<T>>: Sort<T> {

    /**
     * Sort array
     *
     * @param data array to sort
     * @return sorted array
     */
    override fun sort(data: Array<T>): Array<T> {
        val sorting: Array<T> = data.clone()

        (sorting.count() downTo 1)
                .asSequence()
                .flatMap { (0 until (it - 1)).asSequence() }
                .filter { sorting[it] > sorting[it + 1] }
                .forEach { swap(sorting, it, it +1) }

        return sorting
    }

    /**
     * helper function to swap array entries
     *
     * @param array array to work with
     * @param indexA data position 1 for swap operation
     * @param indexB data position 2 for swap operation
     */
    private fun swap(array: Array<T>, indexA: Int, indexB: Int) {
        val swap: T = array[indexA]
        array[indexA] = array[indexB]
        array[indexB] = swap
    }
}