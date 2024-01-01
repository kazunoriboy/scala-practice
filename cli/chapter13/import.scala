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

import java.util.regex

class AStarB {
  // java.util.regex.Patternを参照
  val pat = regex.Pattern.compile("a*b")
}

import Fruits.{Apple, Orange}

import Fruits.{Apple => McIntoch, Orange}
