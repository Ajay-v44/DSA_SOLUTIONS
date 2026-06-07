package Tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode2196 {
    public static TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        for (int[] description : descriptions) {
            int parentVal = description[0];
            int childVal = description[1];
            int isLeft = description[2];

//Gret or create  a new parent
            map.putIfAbsent(parentVal, new TreeNode(parentVal));
            TreeNode parent = map.get(parentVal);
//Gret or create  a new child
            map.putIfAbsent(childVal, new TreeNode(childVal));
            TreeNode child = map.get(childVal);


            if (isLeft == 1)
                parent.left = child;
            else
                parent.right = child;

            children.add(childVal);

        }

        for (int parentVal : map.keySet()) {
            if (!children.contains(parentVal))
                return map.get(parentVal);
        }
        return null;
    }

    static void main() {
        int[][] description = {{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}};
        System.out.println(createBinaryTree(description).val);
    }
}

