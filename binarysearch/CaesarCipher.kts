fun solve(s: String, k: Int): String {
    var ret = ""
    s.forEach { ret += ((it.minus('a') + k) % 26 + 97).toChar().toString() }
    return ret
}
print(solve("bob", 2))