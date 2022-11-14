
//集合体に対応sるうIteratorを一つ作成するためのもの
//集合体を数え上げたい、スキャンしたい、一つずつ調べていきたいというときにはiteratorメソッドを使ってIteratorインターフェースを実装したクラスのインスタンスを一個作る
public interface Aggregate {
    public abstract Iterator iterator();
}
