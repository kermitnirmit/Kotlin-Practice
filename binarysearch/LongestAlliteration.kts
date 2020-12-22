fun solve(words: List<String>): Int {
    if (words.size < 1) {
        return 1
    }
    var first = words[0].get(0)
    var streak: MutableList<Int> = mutableListOf()
    var curr = 0
    for (word in words) {
        if (word.get(0) != first) {
            streak.add(curr)
            first = word.get(0)
            curr = 1
        } else {
            curr++
        }
    }
    streak.add(curr)
//    return streak.reduce { a, b -> if (a > b) return a else return b}
    return streak.maxOrNull() ?: 0
}

print(solve(listOf("she","sells","seashells","he","sells","clams")))