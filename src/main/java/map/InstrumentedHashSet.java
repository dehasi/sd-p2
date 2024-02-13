package map;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class InstrumentedHashSet<E> extends HashSet<E> {
    // The number of attempted element insertions
    private int addCount = 0;

    public InstrumentedHashSet() {}
    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override public boolean add(E e) {
        ++addCount;
        return super.add(e);
    }

    @Override public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        var set = new InstrumentedHashSet<String>();

        set.addAll(List.of("AAA", "BBB", "CCC"));

        System.out.println(set.getAddCount());
    }
}
