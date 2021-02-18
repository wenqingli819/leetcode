package array;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeMap;

/*
 * Created by babydeveloper on 1/26/21.
 * https://leetcode.com/problems/high-five/
 */
public class HighFive {
//TreeMap <key, a collection of scores>
// a collection of scores: PriorityQueue 队头是最小元素， 先进先出
    public static int[][] highFive(int[][] items, int k) {
        TreeMap<Integer, PriorityQueue<Integer>> topFiveScores = new TreeMap<>();
        //loop through the 2d array and construct the treemap
        //{{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}}
        for (int[] item : items) {
            //[1, 91], [1,92], [2, 93],[2, 97]
            int id = item[0];
            int score = item[1];

            PriorityQueue<Integer> pq;
            // if we encountered this id before
            if (topFiveScores.containsKey(id)) {
                //get out what we already have based on id
                pq = topFiveScores.get(id);
                // and add the new score in pq
                pq.offer(score);
                // after offer in pq, check the size, if it is too large, poll the smallest element out
                if (pq.size() > k) {
                    pq.poll();
                }
            } // if we don't have this id in topFiveScoresPerID
            else{
                // create a brand new pq, offer the score in pq
                pq = new PriorityQueue<>();
                pq.offer(score);
            }
            // put(id,pq) in topFiveScoresPerID
            topFiveScores.put(id, pq);
        }
        //row = how many items in the treeMap, col = each row(item) has two cols
        int[][] res = new int[topFiveScores.size()][2];
        // loop through the keys
        for (int id : topFiveScores.keySet()) {
            PriorityQueue<Integer> topFive = topFiveScores.get(id);
            int sum = 0;
            // while topFiveScores is not empty, poll and summing up
            while (!topFive.isEmpty()) {
                sum += topFive.poll();
            }
            //because student id starting from 1, and out indexes starting from 0
            res[id - 1][0] = id;
            res[id - 1][1] = sum / 5;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] items = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
        System.out.println(Arrays.deepToString(highFive(items,5)));

//        int[][] items2 = {{1,91},{1,92},{5,93},{5,97},{1,60},{5,77},{1,65},{1,87},{1,100},{5,100},{5,76}};
//        System.out.println(Arrays.deepToString(highFive(items2,5)));
    }
}