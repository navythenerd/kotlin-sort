package sort

/**
 * Generic QuickSort implementation using Hoare-Partition-Scheme
 *
 * @author Cedrik Kaufmann
 */
class QuickSort<T: Comparable<T>>: Sort<T> {

    /**
     * Sort array using Quicksort
     *
     * @param data array to be sorted
     * @return sorted array
     */
    override fun sort(data: Array<T>): Array<T> {
        val sorting = data.clone()
        quicksort(sorting, 0, sorting.size-1)

        return sorting
    }

    /**
     * Quicksort function
     *
     * @param data array to be sorted
     * @param low lower border
     * @param high higher border
     */
    private fun quicksort(data: Array<T>, low: Int, high: Int) {
        if (low < high) {
            val partition = partition(data, low, high)
            quicksort(data, low, partition)
            quicksort(data, partition + 1, high)
        }
    }

    /**
     * Partition Algorithm based on Hoare
     *
     * @param data array to be partitioned
     * @param low lower border
     * @param high higher border
     * @return partition index
     */
    private fun partition(data: Array<T>, low: Int, high: Int): Int {
        val pivot = data[low]
        var i = low - 1
        var j = high + 1

        while (true) {
            do {
                i++
            } while (data[i] < pivot)

            do {
                j--
            } while (data[j] > pivot)

            if (i >= j) {
                return j
            }

            swap(data, i, j)
        }
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