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

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) = { super.put(x + 1) }
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int) = {
    if (x >= 0) super.put(x)
  }
}

class MyQueue extends BasicIntQueue with Doubling

@main def testStackable(): Unit = {
  val queue = new MyQueue
  queue.put(10)
  println(queue.get())

  val queue2 = new BasicIntQueue with Doubling
  queue2.put(10)
  println(queue2.get())

  val queue3 = new BasicIntQueue with Incrementing with Filtering with Doubling
  queue3.put(-1)
  queue3.put(0)
  queue3.put(1)
  println(queue3.get())
  println(queue3.get())
}
