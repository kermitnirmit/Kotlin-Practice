class LLNode(val next: LLNode?, val value: Int)

fun solve(head: LLNode): Boolean {
    var maxSoFar = Int.MIN_VALUE
    var curr: LLNode? = head
    while (curr != null) {
        if (curr.value <= maxSoFar) {
            return false
        }
        maxSoFar = curr.value
        curr = curr.next
    }
    return true
}


val tail: LLNode = LLNode(null, 2)
val middle: LLNode = LLNode(tail, 3)
val head: LLNode = LLNode(middle, 2)
print(solve(head))