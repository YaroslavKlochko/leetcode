package com.example.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public List<Node> children;

    public Node(List<Node> children) {
        this.children = new ArrayList<>();
    }
}
