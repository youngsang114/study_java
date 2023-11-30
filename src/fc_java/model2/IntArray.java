package fc_java.model2;

import java.util.Arrays;

public class IntArray {
    private static final int DEFAULT_CAPACITY=5; // 수정불가(final) => 상수
    private int[] elements;
    private int size = 0;
    public IntArray(){
        elements= new int[DEFAULT_CAPACITY];
    }
    public void add(int element){
        if (size==elements.length){
            ensureCapacity();
        }
        elements[size++] = element;
    }
    public int get(int index){ //  -1.5~
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
