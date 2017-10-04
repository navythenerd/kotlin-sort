package sort

/**
 * Generic Merge Sort
 *
 * @author Cedrik Kaufmann
 */
class MergeSort<T : Comparable<T>>: Sort<T> {

    /**
     * Sort array
     *
     * @param data array to sort
     * @return sorted array
     */
    override fun sort(data: Array<T>): Array<T> {
        return if (data.isEmpty() || data.size == 1) {
            data
        } else {
            val split = Math.floorDiv(data.count(), 2)

            val leftPart = data.sliceArray(0..(split-1))
            val rightPart = data.sliceArray(split until data.size)

            val left = sort(leftPart)
            val right = sort(rightPart)

            merge(left, right)
        }
    }

    /**
     * Merge sorted array slices
     *
     * @param left left array slice to merge
     * @param right right array slice to merge
     * @return sorted and merged array
     */
    private fun merge(left: Array<T>, right: Array<T>): Array<T> {
        var leftIndex = 0
        var rightIndex = 0
        val merged = left.plus(right)

        for (i in 0 until merged.size) {
            when {
                leftIndex > left.size - 1 -> merged[i] = right[rightIndex++]
                rightIndex > right.size - 1 -> merged[i] = left[leftIndex++]
                else -> merged[i] = if (left[leftIndex] <= right[rightIndex]) left[leftIndex++] else right[rightIndex++]
            }
        }

        return merged
    }
}