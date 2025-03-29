import java.util.Random;

class Solution {
    
    int[] original; // Original array to restore
    int[] shuffled; // Shuffled version of input array

    Random rando = new Random();

    private List<Integer> copyArray() { // Turn array into resizable so we can remove indexes
        List<Integer> listCopy = new ArrayList<> (Arrays.stream(shuffled)
                                    .boxed()
                                    .toList());
        return listCopy;
    }

    public Solution(int[] nums) { // Constructor 
        this.shuffled = nums;
        this.original = nums.clone();
    }
    
    public int[] reset() { // reset 'shuffled'
        shuffled = original.clone();
        return shuffled;
    }
    
    public int[] shuffle() { 
        List<Integer> aux = this.copyArray(); // Use List to whittle down ints to copy

        for (int i = 0; i < shuffled.length; i++) {
            int deadIndex = rando.nextInt(aux.size()); // Get a rando number from size range
            shuffled[i] = aux.get(deadIndex); // Output array at index i becomes the list item of pulled index
            aux.remove(deadIndex); // remove that item from the aux array so items don't duplicate
        }

        return shuffled;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
