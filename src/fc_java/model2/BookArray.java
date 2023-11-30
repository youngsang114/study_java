package fc_java.model2;

import java.util.Arrays;

public class BookArray {
    private static final int DEFAULT_CAPACITY=5; // 수정불가(final) => 상수
    private Book[] elements;
    private int size = 0;
    public BookArray(){
        elements= new Book[DEFAULT_CAPACITY];
    }
    public void add(Book element){
        if (size==elements.length){
            ensureCapacity();
        }
        elements[size++] = element;
    }
    public Book get(int index){ //  -1.5~
        //index 체크
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("범위 초과");
        }
        return elements[index];
    }
    public int size(){
        return size;
    }
    public void ensureCapacity(){
        int newCapacity = elements.length *2;
        elements = Arrays.copyOf(elements,newCapacity);
    }
}
