class DinnerPlates {
    
    private final PriorityQueue<Integer> pq;
    private final TreeMap<Integer, Integer> valueMap;
    private final int capacity;

    public DinnerPlates(int capacity) {
        this.pq = new PriorityQueue<>();
        this.valueMap = new TreeMap<>();
        this.capacity = capacity;
    }
    
    public void push(int val) {
        int insertIndex = valueMap.size();
        if (!pq.isEmpty()) {
            insertIndex = pq.poll();
        }
        valueMap.put(insertIndex, val);
    }
    
    public int pop() {
        if (valueMap.isEmpty()) return -1;
        Map.Entry<Integer, Integer> entry = valueMap.pollLastEntry();
        pq.add(entry.getKey());
        return entry.getValue();
    }
    
    public int popAtStack(int index) {
        int rIdx = (capacity * (index + 1)) - 1;
        Integer key = valueMap.floorKey(rIdx);
        if (key == null || key <= rIdx - capacity) return -1;
        pq.add(key);
        return valueMap.remove(key);
    }
}

//==>Time complexity O(logn)



/**
 * Your DinnerPlates object will be instantiated and called as such:
 * DinnerPlates obj = new DinnerPlates(capacity);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAtStack(index);
 */