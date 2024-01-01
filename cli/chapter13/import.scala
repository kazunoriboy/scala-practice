// Fruitへのアクセスが簡単になる
import bobsdelights.Fruit

// bobsdelightsパッケージのすべてのメンバーをインポート
import bobsdelights._

// Fruitsオブジェクトのすべてのメンバーへのアクセスが簡単に
import bobsdelights.Fruits._

def showFruit(fruit: Fruit) = {
  import fruit._
  println(name + "s are " + color)
}
