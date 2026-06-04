class LinkedList {

    private List<Integer> list;

    public LinkedList() {
        this.list = new ArrayList<>();
    }

    public int get(int index) {
        if (index < 0 || index >= this.list.size()) {
            return -1;
        }
        return this.list.get(index);
    }

    public void insertHead(int val) {
        this.list.add(0, val);
    }

    public void insertTail(int val) {
        this.list.add(val);
    }

    public boolean remove(int index) {
      if (index < 0 || index >= this.list.size()) {
            return false;
        }
        this.list.remove(index);
        return true;
    }

    public ArrayList<Integer> getValues() {
        return new ArrayList<>(this.list);
    }
}
