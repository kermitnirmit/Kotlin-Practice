import java.util.HashSet

fun solve(nums: IntArray): Boolean {
    var hashy:HashMap<Int, Int> = HashMap();
    for (num in nums) {
        if (hashy.containsKey(num)) {
            val oldVal = hashy.get(num)?.plus(1);
            if (oldVal != null) {
                hashy.replace(num, oldVal)
            };
        } else {
            hashy.put(num, 1)
        }
    }
    val values: MutableCollection<Int> = hashy.values;
    var valueSet: MutableSet<Int> = HashSet();
    for (q in values) {
        valueSet.add(q)
    }
    if (valueSet.size == 1 && valueSet.first() > 1) {
        return true
    }
    val qwe = valueSet.reduce {a, b -> gcd(a, b) }
    return qwe > 1
}

fun gcd(a: Int, b:Int): Int {
    if (b == 0) return a;
    return gcd(b, a % b);
}
val numbers: IntArray = intArrayOf(1,1,1,1,1,1,1,1,2,2,2,2);
println(solve(numbers))
