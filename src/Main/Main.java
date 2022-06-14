package Main;

import Main.Api.Api;
import Main.Trees.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> n1 = new BinaryTree<>(6);
        BinaryTree<Integer> n2 = new BinaryTree<>(9);
        BinaryTree<Integer> n3 = new BinaryTree<>(8, n1,n2);
        BinaryTree<Integer> n4 = new BinaryTree<>(4);
        BinaryTree<Integer> n5 = new BinaryTree<>(5, n4, n3);
        BinaryTree<Integer> n6 = new BinaryTree<>(12);
        BinaryTree<Integer> n7 = new BinaryTree<>();
        BinaryTree<Integer> n8 = new BinaryTree<>(13, n6, n7);
        BinaryTree<Integer> n9 = new BinaryTree<>();
        BinaryTree<Integer> n10 = new BinaryTree<>(11, n9, n8);
        BinaryTree<Integer> tree = new BinaryTree<>(10, n5, n10);


        BinaryTree<Integer> m1 = new BinaryTree<>(5);
        BinaryTree<Integer> m2 = new BinaryTree<>(11);
        BinaryTree<Integer> m3 = new BinaryTree<>(6, m1,m2);
        BinaryTree<Integer> m4 = new BinaryTree<>(2);
        BinaryTree<Integer> m6 = new BinaryTree<>(4);
        BinaryTree<Integer> m5 = new BinaryTree<>(7, m4, m3);
//        BinaryTree<Integer> m7 = new BinaryTree<>();
//        BinaryTree<Integer> m8 = new BinaryTree<>(9, m6, m7);
//        BinaryTree<Integer> m9 = new BinaryTree<>();
//        BinaryTree<Integer> m10 = new BinaryTree<>(5, m9, m8);
        BinaryTree<Integer> tree2 = new BinaryTree<>(2, m5, m6);

        BinaryTree<Integer> r1 = new BinaryTree<>(5);
        BinaryTree<Integer> r2 = new BinaryTree<>(11);
        BinaryTree<Integer> r3 = new BinaryTree<>(6, r1,r2);
        BinaryTree<Integer> r4 = new BinaryTree<>(2);
        BinaryTree<Integer> r6 = new BinaryTree<>(4);
        BinaryTree<Integer> r5 = new BinaryTree<>(7, r4, r3);
//        BinaryTree<Integer> r7 = new BinaryTree<>();
//        BinaryTree<Integer> r8 = new BinaryTree<>(9, r6, r7);
//        BinaryTree<Integer> r9 = new BinaryTree<>();
//        BinaryTree<Integer> r10 = new BinaryTree<>(5, r9, r8);
        BinaryTree<Integer> tree3 = new BinaryTree<>(2, r5, r6);

        System.out.println(Api.altura(tree));
//        System.out.println(Api.altura(tree));
        System.out.println(Api.lleno(tree2));
        System.out.println(Api.esCompleto(tree2));
        System.out.println(Api.estable(tree));
        System.out.println();
        System.out.println(false && false);

        System.out.println(Api.isomorfos(tree2, tree3));
        System.out.println(Api.isomorfos(tree2, tree));
        System.out.println();
        Api.porNiveles(tree, Api.altura(tree));
    }
}
