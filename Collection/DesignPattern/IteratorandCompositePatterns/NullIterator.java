package DesignPattern.IteratorandCompositePatterns;

public class NullIterator extends MenuComponent {
    public Object next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
