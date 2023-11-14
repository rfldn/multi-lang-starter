package code.retreat

class Reduce {

    companion object {
        const val ITERATIONS = 100000
    }

    fun reduceHugeList() {
        List(ITERATIONS) { 0 }.foldIndexed(emptyList<Int>())  { index, acc, _ ->
            acc.plus(index)
        }
    }

    fun reduceHugeMutableList() {
        List(ITERATIONS) { 0 }.foldIndexed(mutableListOf<Int>())  { index, acc, _ ->
            acc.add(index)
            acc
        }
    }
}
