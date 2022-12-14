# Java 言語で学ぶデザインパターン入門
## 結城浩

# 序章
## UML について
- Unified Modeling Languageの略。設計や仕様を視覚化したり、文書化するための表現
- アトリビュート -> フィールド
- オペレーション　-> メソッド
- [UML Resource Page](http://www.omg.org/uml/)
## デザインパターンを学ぶ前に
_デザインパターンはクラスライブラリそのものではない_
- Abstract Patternがどんなものかと聞かれたときに、具体的なプログラムが出てくることも大事だが、どういう種類のクラスやインターフェースが出てきて、それらが互いにどういう関係にあるのか

_プログラムを完成品として見ないこと_
- デザインパターンの目標の1つに、プログラムの再利用可能にするということがある
- 完成品としてみるのではなくて部品としてみること
    - どのような昨日が拡張される可能性があるか
    - その機能拡張を行うときに、修正が必要になるのはどのクラスか
    - 修正が不要なのはどのクラスか

_役割を理解すること_
- サンプルを読むときには各クラスやインターフェースがどのような役割を果たしているのか留意すること

以上の観点で本書を読んでいく


# 第 1 部 デザインパターンになれる
## 第 1 章 Iterator 1 つ 1 つ数え上げる
### Iteratorパターン
- for分におけるiのような動きを一般化したもの
- Iteratorというだけで、こんなに大仰なデザインパターンを使用する必要があるのか
    - 実装とは切り離して数え上げを行うことができる
    - WhileループはBookShelfの実装に依存しない
- Iteratorの役割
    - 要素を順番にスキャンしていくインターフェース
    - hasNext , next
- Concrete Iteratorの役割
    - Iteratorを実際に実装する。BookShelfIterator
- Aggregate の役
    - Iteratorを作り出す。順番にスキャンしてくれる人を作り出すメソッド。
- Concrete Aggregateの役
 - Aggregateを実装るやく。BookShelf