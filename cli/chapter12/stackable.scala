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

// traitをextendsすると、そのクラスを継承したクラスでしかこのtraitを使えない
trait Doubling extends IntQueue {
  abstract override def put(x: Int) = { super.put(2 * x) }
}

class MyQueue extends BasicIntQueue with Doubling

@main def testStackable(): Unit = {
  val queue = new MyQueue
  queue.put(10)
  println(queue.get())
}
