class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int[] aux = new int[n];
        arraySplitter(0, n-1, nums, aux);
        return nums;
    }

    private static void arraySplitter(int left, int right, int[] nums, int[] aux) {
        if (left < right) {
            int mid = (left + right) / 2;
            arraySplitter(left, mid, nums, aux);
            arraySplitter(mid + 1, right, nums, aux);
            mergeLists(left, mid, right, nums, aux);
        }

    }

    private static void mergeLists(int left, int mid, int right, int[] nums, int[] aux) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (nums[i] < nums[j]) {
                aux[k] = nums[i];
                i++;
            }
            else {
                aux[k] = nums[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            aux[k] = nums[i];
            i++;
            k++;
        }

        while (j <= right) {
            aux[k] = nums[j];
            j++;
            k++;
        }

        for (k = left; k <= right; k++) {
            nums[k] = aux[k];
        }

    }
}
