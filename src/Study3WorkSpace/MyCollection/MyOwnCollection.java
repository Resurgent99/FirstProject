package Study3WorkSpace.MyCollection;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

public interface MyOwnCollection<T> extends Iterable<T>{
  Iterator<T> iterator();

  default void forEach(Consumer<? super T> action) {
    Objects.requireNonNull(action);
    for (T t : this) {
      action.accept(t);
    }
  }
  T next();
  boolean hasNext();
  default void remove() {
    throw new UnsupportedOperationException("remove");
  }
  default void forEachRemaining(Consumer<T> action) {
    Objects.requireNonNull(action);
    while (hasNext())
      action.accept(next());
  }
  void add(T lamba);
}
