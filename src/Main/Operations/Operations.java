package Main.Operations;

import Main.Trees.BinaryTree;

public class Operations {

    public static int altura(BinaryTree a) {
        /* retorna la altura de un árbol binario */
        if (a.isEmpty())
            return 0;
        else return 1 + Math.max(altura(a.getRight()), altura(a.getLeft()));

    }

    public static boolean isomorfos ( BinaryTree a1, BinaryTree a2 ) {

    }
    /* Informa si los árboles binarios a1 y a2 son isomorfos */

    public static boolean esCompleto ( BinaryTree a ) {}
    /* Indica si un árbol binario es completo */

    public static boolean lleno ( BinaryTree a ) {}
    /* Informa si un árbol binario es lleno */

    public static boolean estable (BinaryTree a ) {}
    /* Un árbol de valores enteros es estable si es vacío, consta de un único elemento o para todo elemento de la estructura su padre es mayor. */

    public static void porNiveles(BinaryTree a) {}
    /* Muestra el recorrido por niveles*/
}
