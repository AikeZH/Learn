package chapter11.section12.holding;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/**
 * TODO
 *
 * @author zhanghua
 * @date 2020/9/29
 */
public class CollectionSequence extends AbstractCollection {
    private String[] strings = {"A", "B", "C", "D", "E", "F", "G", "H"};

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < strings.length;
            }

            @Override
            public Object next() {
                return strings[index++];
            }

            @Override
            public void remove() {
                // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public int size() {
        return strings.length;
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
