package chapter11.section12.holding;

import java.util.Iterator;

/**
 * TODO
 *
 * @author zhanghua
 * @date 2020/9/29
 */
public class NonCollectionSequence extends PetSequence {
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public String next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
}

class PetSequence {
    protected String[] pets = {"A", "B", "C", "D", "E", "F", "G", "H"};
}