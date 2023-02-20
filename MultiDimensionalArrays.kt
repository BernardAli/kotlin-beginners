fun main() {
    var ages:Array<Array<Int>>

    ages = arrayOf(
        arrayOf(1, 2, 3, 4, 5,6, 7),
        arrayOf(1, 2, 3, 4, 5),
    )

    for (nums in ages){
        println(nums.size)
    }
}