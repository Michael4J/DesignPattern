package com.behavioral.iterator;

/**
 * @Title: NameRepository
 * @Auther: MichaelJ
 * @Date: 2018-7-23
 */
public class NameRepository implements Container {

    public String names[];

    public void setNames(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
