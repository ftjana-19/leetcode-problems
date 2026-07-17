class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        int n = merged.length;
        if (n % 2 == 0) {
            int mid1 = merged[(n / 2) - 1];
            int mid2 = merged[n / 2];
            return (mid1 + mid2) / 2.0;
        } else {
            return merged[n / 2];
        }
    }
        
    }
