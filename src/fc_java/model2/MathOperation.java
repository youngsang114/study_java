package fc_java.model2;
@FunctionalInterface // 함수형 인터페이스 : [추상 메서드]를 [딱 한개만] 가지고 있는 인터페이스
public interface MathOperation {
    public int operation(int x, int y); //추상 메서드
}
