package com.tom.se.crazyit.review01.map;

import java.util.*;

/**
 * @descriptions: CollectionTest
 * @author: Tom
 * @date: 2021/2/23 下午 05:08
 * @version: 1.0
 */
public class CollectionTest {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList<>();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums);
        Collections.reverse(nums);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        Collections.shuffle(nums);
        System.out.println(nums);

        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
        Collections.replaceAll(nums, 0, 1);
        System.out.println(Collections.frequency(nums,-5));
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println(Collections.binarySearch(nums,3));
        List unmodifiableList = Collections.emptyList();
        Set unmodifiabeleSet = Collections.singleton("瘋狂Java講義");
        Map score = new HashMap();
        score.put("語文", 80);
        score.put("Java", 82);
        Map unmodifiableMap = Collections.unmodifiableMap(score);
//        unmodifiableList.add("測試元素");
//        unmodifiabeleSet.add("測試元素");
//        unmodifiableMap.put("語文", 90);
        Collection c = Collections.synchronizedCollection(new ArrayList());
        List list = Collections.synchronizedList(new ArrayList());
        Set s = Collections.synchronizedSet(new HashSet());
        Map m = Collections.synchronizedMap(new HashMap());
    }
}
