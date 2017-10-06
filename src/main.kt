import sort.BubbleSort
import sort.MergeSort
import sort.QuickSort
import sort.Sort
import java.util.*

/**
 * Demo program using the implemented sorting algorithms
 */
fun main(args: Array<String>) {
    // Setting up different sorting algorithms
    val sortingAlgos: Array<Sort<Int>> = arrayOf(
            BubbleSort<Int>(),
            MergeSort<Int>(),
            QuickSort<Int>()
    )

    // Setting up unsorted data
    val random = Random()
    val unsorted = Array(50, { random.nextInt(100) })

    // Print unsorted data
    print("Unsorted: ")
    printIntArray(unsorted)
    print("\n")

    //Sorting data & print sorted
    for (algo in sortingAlgos) {
        val sorted = algo.sort(unsorted)
        print("Sorted: ")
        printIntArray(sorted)
        print("\n")
    }
}

/**
 * Helper function to print int array
 *
 * @param data array to be printed
 */
fun printIntArray(data: Array<Int>) {
    for (elem in data) {
        print("$elem, ")
    }
}