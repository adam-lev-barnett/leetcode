import java.util.LinkedList;

class HitCounter {

    Queue<Integer> hitList = new LinkedList<>();

    public void removeOldHits(int timestamp) {
        
        
        while (hitList.peek() <= (timestamp - 300)) {
            hitList.remove();
            if (hitList.isEmpty()) break;
        }
    }

    public void hit(int timestamp) {
        hitList.add(timestamp);
    }
    
    public int getHits(int timestamp) {
        if (hitList.isEmpty()) return 0;
        this.removeOldHits(timestamp);
        return hitList.size();
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */
