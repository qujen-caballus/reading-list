
/*
次の要素が存在するかというhasNext
nextはこれを呼び出したときに内部状態を次に進める必要がある
*/
public interface Iterator{
    public abstract boolean hasNest();
    public abstract Object next();
}
