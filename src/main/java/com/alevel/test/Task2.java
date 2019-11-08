package com.alevel.test;

import java.util.Arrays;

public class Task2 {


        public boolean canJump ( int[] nums){

            if (nums == null || nums.length == 0) {
                return false;
            }
            int n = nums.length;
            int last = n - 1;
            for (int i = n - 2; i >= 0; i--) {
                if (i + nums[i] >= last) last = i;
            }
            return last == 0;


        }
    }
