package array;
public class BinarySearch {

    // 左闭右闭区间 [left, right] 版本（带剪枝优化）
    public int search(int[] nums, int target) {
        // 剪枝：target超出数组范围，直接返回-1
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // 防止溢出，等价于 (left + right) / 2
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                // 目标在右边，mid已经判断过，左边界移到mid+1
                left = mid + 1;
            } else {
                // 目标在左边，右边界移到mid-1
                right = mid - 1;
            }
        }
        // 找不到目标
        return -1;
    }

    // main方法：IDEA本地测试
    public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();

        // 示例1
        int[] nums1 = {-1,0,3,5,9,12};
        int target1 = 9;
        System.out.println("示例1结果：" + solution.search(nums1, target1)); // 预期输出：4

        // 示例2
        int[] nums2 = {-1,0,3,5,9,12};
        int target2 = 2;
        System.out.println("示例2结果：" + solution.search(nums2, target2)); // 预期输出：-1
    }
}



