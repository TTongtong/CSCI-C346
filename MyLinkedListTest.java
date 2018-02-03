import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
public class MyLinkedListTest {




    @org.junit.jupiter.api.Test
    public void next1(){
        MyLinkedList<Integer> l = new MyLinkedList<>(1);

        assertEquals(null, l.next());


    }
    @org.junit.jupiter.api.Test
    public void next() {

        MyLinkedList<Integer> a = new MyLinkedList<Integer>(1);
        MyLinkedList<Integer> b = new MyLinkedList<Integer>(0,a);

        assertEquals(a, b.next());
    }

    @org.junit.jupiter.api.Test
    public void last() {
        MyLinkedList<Integer> l = new MyLinkedList<Integer>(4);
        assertEquals(l, l.last());
    }

    @org.junit.jupiter.api.Test
    public void after() {
        MyLinkedList<Integer> l = new MyLinkedList<Integer>(4);
        MyLinkedList<Integer> l1 = new MyLinkedList<Integer>(3);
        MyLinkedList<Integer> l2 = new MyLinkedList<Integer>(2, l);
        MyLinkedList<Integer> l3 = new MyLinkedList<Integer>(1, l1);
    }

    @org.junit.jupiter.api.Test
    void detach() {
        MyLinkedList<Integer> a = new MyLinkedList<Integer>(3);
        MyLinkedList<Integer> b = new MyLinkedList<Integer>(2, a);
        MyLinkedList<Integer> c = new MyLinkedList<Integer>(1, b);

        c.detach();
        assertEquals(null, c.next());

    }

    @org.junit.jupiter.api.Test
    public void get() {
        MyLinkedList<Integer> l = new MyLinkedList<Integer>(1);
        assertEquals(1, (int)l.get());
    }

    @org.junit.jupiter.api.Test
    void set() {
        MyLinkedList<Integer> l = new MyLinkedList<Integer>(1);
        l.set(4);
        assertEquals(4, (int)l.get());
    }

    @org.junit.jupiter.api.Test
    void setNext() {
        MyLinkedList<Integer> a = new MyLinkedList<Integer>(4);
        MyLinkedList<Integer> b = new MyLinkedList<Integer>(3);
        MyLinkedList<Integer> c = new MyLinkedList<Integer>(2, b);
        MyLinkedList<Integer> d = new MyLinkedList<Integer>(1, c);

        a.setNext(d);
        assertEquals(d, a.next());
    }

    @org.junit.jupiter.api.Test
    public void append() {
        MyLinkedList<Integer> a = new MyLinkedList<Integer>(4);
        MyLinkedList<Integer> b = new MyLinkedList<Integer>(3);
        MyLinkedList<Integer> c = new MyLinkedList<Integer>(2, b);
        MyLinkedList<Integer> d = new MyLinkedList<Integer>(1, c);

        a.append(a);
        assertEquals(a, b.next());
        assertEquals(a, d.next());

    }

    @org.junit.jupiter.api.Test
    public void testInsert() {
        MyLinkedList<Integer> a = new MyLinkedList<Integer>(4);
        MyLinkedList<Integer> b = new MyLinkedList<Integer>(3);
        MyLinkedList<Integer> c = new MyLinkedList<Integer>(2, b);
        MyLinkedList<Integer> d = new MyLinkedList<Integer>(1, c);

        d.insert(a);
        assertEquals(d, a.next());
    }






}