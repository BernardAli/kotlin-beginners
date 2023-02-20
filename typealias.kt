class Person2(val name: String, val age: Int)
data class Node(val value: Any)
typealias Player = Person2
typealias NodeSet = Set<Node>
typealias Test<T> = (T) -> Boolean