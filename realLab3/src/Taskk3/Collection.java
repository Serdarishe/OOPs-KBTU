package Taskk3;

public class Collection implements MyCollection{
    private Object[] elements;
    private int size;

    public Collection(){
        elements = new Object[10];
        size = 0;
    }

    @Override
    public void add(Object element) {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            for(int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[size] = element;
        size++;
    }
    @Override
    public void remove(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                elements[size - 1] = null;
                size--;
                return;
            }
        }
    }
    @Override
    public boolean contains(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }
}
