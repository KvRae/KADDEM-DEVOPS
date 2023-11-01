import kotlin.math.abs
import kotlin.math.sign

fun main(args: Array<String>) {
 var solution = Solution()
    println(solution.divide(-2147483648,-1))


}

class Solution {
    /*fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0
        if (haystack.isEmpty()) return -1
        if (haystack.length < needle.length) return -1
        var i = 0
        var j = 0
        while (i < haystack.length) {
            if (haystack[i] == needle[j]) {
                if (j == needle.length - 1) {
                    return i - j
                }
                i++
                j++
            } else {
                i = i - j + 1
                j = 0
            }
        }
        return -1
    }*/


    fun divide(dividend: Int, divisor: Int): Int {
        if (dividend == Int.MIN_VALUE && divisor == -1) return Int.MAX_VALUE
        val sign = if (dividend.sign == divisor.sign) 1 else -1
        var dividend = abs(dividend.toLong())
        val divisor = abs(divisor.toLong())
        var result = 0L
        while (dividend >= divisor) {
            var temp = divisor
            var count = 1L
            while (dividend >= temp.shl(1)) {
                temp = temp.shl(1)
                count = count.shl(1)
            }
            dividend -= temp
            result += count
        }
        return (result * sign).toInt()
    }
}