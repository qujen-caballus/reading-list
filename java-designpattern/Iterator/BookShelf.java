/*
本棚を表すクラス。集合体として扱うためにAggregeteをImplementsしてきている。
*/


public class BookShelf implements Aggregate {
    //クラス外からの不用意な変更を防ぐためにprivateで実装
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

}