package fc_java.model2;
@FunctionalInterface
public interface Convertor<F,T> {
    T convert(F from);


}
