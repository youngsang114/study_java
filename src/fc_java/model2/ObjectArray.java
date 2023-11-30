package fc_java.model2;

import java.util.Arrays;

public class ObjectArray {
    private static final int DEFAULT_CAPACITY=5; // 수정불가(final) => 상수
    private Object[] elements;
    private int size = 0;
    public ObjectArray(){
        this(DEFAULT_CAPACITY); // this() : 생성자안에서 다른 생성자를 호출할 때 사용
    }
    public ObjectArray(int capacity){ // 원하는 크기의 배열을 생성한다.
        elements= new Object[capacity];
    }
    public void add(Object element){
        if (size==elements.length){
            ensureCapacity();
        }
        elements[size++] = element;
    }
    public Object get(int index){ //  -1.5~
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
