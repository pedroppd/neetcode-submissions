class DynamicArray {

    private int capacity;
    private int size;
    private int[] data;


    public DynamicArray(int capacity) {
        this.data = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return this.data[i];
    }

    public void set(int i, int n) {
       this.data[i] = n;
    }

    public void pushback(int n) {
        if(this.size  == this.capacity) {
            resize();
        }
        this.data[this.size] = n;
        this.size ++;
    }

    public int popback() {
        var element = this.data[size - 1];
        size --;
        return element;
    }

    public void resize() {
        int newCapacity = this.capacity * 2;
        int[] newData = new int[newCapacity];
        for(int i = 0; i < this.size; i++) {
            newData[i] = this.data[i];
        }
        this.capacity = newCapacity;
        this.data = newData;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
