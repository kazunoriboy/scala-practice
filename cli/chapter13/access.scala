class Outer {
  class Inner {
    private def f() { println("f") }
    class InnerMost {
      f() // OK
    }
  }
  (new Inner).f() // error: f is not accessible
}

package p {
  class Super {
    protected def f() = { pirntln("f") }
  }
  class Sub extends Super {
    f() // OK
  }
  class Other {
    (new Super).f() // error: f is not accessible in Scala. Java would accept this
  }
}

