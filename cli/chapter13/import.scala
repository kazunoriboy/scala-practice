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

// メンバーを選択してインポート
import Fruits.{Apple, Orange}

// 別名でインポート
import Fruits.{Apple => McIntoch, Orange}

// javaの日付クラスとは別の名前になるようにしてインポート
import java.sql.{Date => SDate}

// パッケージのみをインポートして、S.Dateでつかえるようにする
import java.{sql => S}

// ワイルドカードですべてのメンバーをインポート
import Fruits.{_}

// Appleに別名をつけて、すべてのメンバーをインポートする
import Fruits.{Applce => McIntosh, _}

// Pearを除くすべてのメンバーをインポート
import Fruits.{Pear => _, _}

