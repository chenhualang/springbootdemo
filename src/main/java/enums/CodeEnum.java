package enums;

public interface CodeEnum<C, T extends Enum<T> & CodeEnum<C, T, V>, V> {
    C getCode();

    String getName();

    V getValue();
}
