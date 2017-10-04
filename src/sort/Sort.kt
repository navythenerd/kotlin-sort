package sort

/**
 * Interface providing generic sort approach
 *
 * @author Cedrik Kaufmann
 */
interface Sort<T: Comparable<T>> {

    fun sort(data: Array<T>): Array<T>
}