import com.sun.tools.javac.code.Scope;

public class MyLinkedList<T> implements ILinkedList<T> {
    T value;
    MyLinkedList<T> next;
    int size;

    public MyLinkedList(T value){
        this(value, null);
    }
    public MyLinkedList(T value, MyLinkedList<T> next){
    this.value = value;
    this.next = next;
    }






    /**
     * Get the next list element
     *
     * @return the next ele
     * ment
     */

    @Override
    public ILinkedList<T> next() {

       return next;
    }

    /**
     * Gets the last element in the list
     *
     * @return the node at the end of the list
     */
    @Override
    public ILinkedList<T> last() {
        MyLinkedList<T> temp = this;
        if (temp.next == null) {
            return temp;
        }
        do temp = temp.next;
        while (temp.next != null);

        return temp;
    }

    /**
     * Get the element n elements down the list
     *
     * @param n the number of elements to skip
     * @return the element n away
     */
    @Override
    public ILinkedList<T> after(int n) {
        if (n < 0) {
            throw new NullPointerException("negative value n parameter  not valid");
        }
        MyLinkedList<T> temp;
        temp = this;
        for (int i = 0; i < n; i++) {
            temp = temp.next;
        }
        return temp;
    }
        //

        //Removes the next element (sets null)
        //@return the previously next element
        //
        public ILinkedList<T> detach(){
        MyLinkedList<T> temp = this.next;
        this.next = null;
        return temp;


    }

    /**
     * Gets the current value
     *
     * @return the current value
     */
    @Override
    public T get(){
        MyLinkedList<T> temp = this;
        if(temp != null){
            return temp.value;

        }
        else
            return null;


        }

    /**
     * Sets the value of this node
     *
     * @param value the new value
     */
    @Override
    public void set(T value) {

        this.value= value;


        }




    /**
     * Sets the next element in the list
     *
     * @param next the next element
     *             <p>
     *             Example: (1->2->3).setNext(4) => 1->4
     */
    @Override
    public void setNext(ILinkedList<T> next) {
        this.next = (MyLinkedList<T>)next;

    }

    /**
     * Sets the next element after this current element
     *
     * @param next the next element
     *             <p>
     *             Example: (1->2->3).appnd(4) => 1->2->3->4
     */
    @Override
    public void append(ILinkedList<T> next) {
        MyLinkedList<T> temp = this;
        do temp = temp.next;
        while (null != temp.next);
        temp.setNext(next);
        }



    /**
     * Adds the current list as the next of newFirst
     *
     * @param newFirst the new head of the list
     *                 <p>
     *                 Example: (1->2->3).insert(4) => 4->1->2->3
     */
    @Override
    public void insert(ILinkedList<T> newFirst) {
        this.setNext(newFirst);
        }

    }





