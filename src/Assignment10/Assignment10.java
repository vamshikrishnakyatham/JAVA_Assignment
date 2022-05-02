package Assignment10;
import java.util.*;
class SList<E> {
    private Link<E> headLink = new Link<E>(null);
    SListIterator<E> iterator() { return new SListIterator<E>(headLink); }
    public String toString() {
        if(headLink.next == null) return "SList: []";
        System.out.print("SList: [");
        SListIterator<E> it = this.iterator();
        StringBuilder s = new StringBuilder();
        while(it.hasNext()) {
            s.append(it.next() + (it.hasNext() ? ", " : ""));
        }
        return s + "]";
    }
}

class SListIterator<E> {
    Link<E> current;
    SListIterator(Link<E> link) {
        current = link;
    }
    public boolean hasNext() {
        return current.next != null;
    }
    public Link<E> next() {
        current = current.next;
        return current;
    }
    public void insert(E e) {
        current.next = new Link<E>(e, current.next);
        current = current.next;
    }
    public void remove() {
        if(current.next != null) {
            current.next = current.next.next;
        }
    }
}

class Link<E> {
    E e;
    Link<E> next;
    Link(E e, Link<E> next) {
        this.e = e;
        this.next = next;
    }
    Link(E e) {
        this(e, null);
    }
    public String toString() {
        if(e == null) return "null";
        return e.toString();
    }
}

public class Assignment10 {
    public static void main(String[] args) {
        SList<String> sl = new SList<String>();
        System.out.println(sl);
        SListIterator<String> slIter = sl.iterator();
        System.out.println("inserting \"hi\"");
        slIter.insert("hi");
        System.out.println(sl);
        System.out.println("inserting \"there\"");
        slIter.insert("there");
        System.out.println(sl);
        System.out.println("inserting \"sweetie\"");
        slIter.insert("sweetie");
        System.out.println(sl);
        System.out.println("inserting \"pie\"");
        slIter.insert("pie");
        System.out.println(sl);
        SListIterator<String> slIter2 = sl.iterator();
        System.out.println("removing \"hi\"");
        slIter2.remove();
        System.out.println(sl);
        System.out.println("inserting \"hello\"");
        slIter2.insert("hello");
        System.out.println(sl);
        System.out.println("removing \"there\"");
        slIter2.remove();
        System.out.println(sl);
        System.out.println("removing \"sweetie\"");
        slIter2.remove();
        System.out.println(sl);
        System.out.println("removing \"pie\"");
        slIter2.remove();
        System.out.println(sl);
        System.out.println("removing \"hello\"");
        SListIterator slIter3 = sl.iterator();
        slIter3.remove();
        System.out.println(sl);
    }
}