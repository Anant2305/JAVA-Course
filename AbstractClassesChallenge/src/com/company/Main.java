package com.company;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for(String s : data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());


        String stringData2 = "5 7 3 9 8 2 1 0 4 6";

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String[] data2 = stringData2.split(" ");
        for(String s : data2){
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("0"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("4"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());

    }
}
