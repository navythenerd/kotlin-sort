package sort

/**
 * Generic Bubble Sort
 *
 * @author Cedrik Kaufmann
 */
class BubbleSort<T : Comparable<T>>: Sort<T> {

    private val utils = Utils<T>() // providing some useful functions

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
                .forEach { utils.swap(sorting, it, it +1) }

        return sorting
    }
}