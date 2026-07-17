class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        l=sorted(nums1+nums2)
        n=len(l)
        if (n%2==0):
            mid1=l[(n//2)-1]
            mid2=l[n//2]
            return float((mid1+mid2)/2.0)
        else:
            return float(l[(n/2)])
           
