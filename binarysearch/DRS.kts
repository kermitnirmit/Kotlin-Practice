fun solve(n: Int): String {
    if (n == 0) return "xxy";
    var s: String = "xxy";
    for (i in 0..n-1) {
        if (i % 3 == 0) {
            s = s.plus(s);
        } else if (i % 3 == 1) {
            s = s.reversed()
        } else {
            var tempList: ArrayList<Char> = ArrayList();
            for (a in s) {
                if (a == 'x') {
                    tempList.add('y')
                } else {
                    tempList.add('x')
                }
            }
            s = tempList.joinToString(separator = "")
        }
    }
    return s;
}

print(solve(10))