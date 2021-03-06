class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            hm.put(nums1[i], hm.getOrDefault(nums1[i], 0) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            int freq = hm.getOrDefault(nums2[i], 0);
            if (freq > 0) {
                intersection.add(nums2[i]);
                hm.put(nums2[i], --freq);
            }
        }

        int[] result = new int[intersection.size()];
        int idx = 0;
        for (int commonVal : intersection) {
            result[idx++] = commonVal;
        }

        return result;
    }
}
