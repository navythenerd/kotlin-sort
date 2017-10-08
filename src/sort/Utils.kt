package sort

class Utils<T> {

    /**
     * helper function to swap array entries
     *
     * @param array array to work with
     * @param indexA data position 1 for swap operation
     * @param indexB data position 2 for swap operation
     */
    fun swap(array: Array<T>, indexA: Int, indexB: Int) {
        val swap: T = array[indexA]
        array[indexA] = array[indexB]
        array[indexB] = swap
    }
}