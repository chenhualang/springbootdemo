package util;



public class SubclassScanner extends ClassPathClassResourceScanner {
    private final Class<?> parClass;

    public SubclassScanner(Class<?> parClass) {
        this.parClass = parClass;
    }

    public boolean predicate(Class<?> clz) {
        return this.parClass.isAssignableFrom(clz);
    }
}
