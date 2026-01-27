object Solution {
    def getConcatenation(nums: Array[Int]): Array[Int] = {
        (nums.toList ::: nums.toList).toArray
    }
}
