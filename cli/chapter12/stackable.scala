import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
  def get(): Int
  def put(x: Int): Unit
}

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) = { buf += x}
}

@main def testStackable(): Unit = {
  val queue = new BasicIntQueue
  queue.put(10)
  queue.put(20)
  println(queue.get())
  println(queue.get())

}
