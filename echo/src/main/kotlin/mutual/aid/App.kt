package mutual.aid

fun main(args: Array<String>) {
  val echo = args.firstOrNull() ?: "Is there an echo in here?"
  println(echo)
}
