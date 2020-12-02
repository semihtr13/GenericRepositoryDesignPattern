package pattern;

import java.util.List;

public interface Repository<T> {
    List<T> getAll();
    void  add(T t);
    void  delete(T t);
    void update(T t);
}
