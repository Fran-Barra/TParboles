package Main.Api;

import Main.Trees.BinaryTree;

public class Api {

    public static int altura(BinaryTree a) {
        /* retorna la altura de un árbol binario */
        if (a.isEmpty())
            return -1;
        else return 1 + Math.max(altura(a.getRight()), altura(a.getLeft()));

    }

    public static boolean isomorfos ( BinaryTree a1, BinaryTree a2 ) {
        /* Informa si los árboles binarios a1 y a2 son isomorfos */
        if (a1.isEmpty() || a2.isEmpty()) {
            return a1.isEmpty() == a2.isEmpty();
        }
        return isomorfos(a1.getLeft(), a2.getLeft()) && isomorfos(a1.getRight(), a2.getRight());
    }

    public static boolean esCompleto ( BinaryTree a ) {
        /* Indica si un árbol binario es completo */
        if (a.isEmpty())
            return true;
        if (altura(a) == 1)
            return !a.getLeft().isEmpty() && !a.getRight().isEmpty();

        return esCompleto(a.getLeft()) && esCompleto(a.getRight());
    }

    public static boolean lleno ( BinaryTree a ) {
        if (altura(a) == 1)
            return true;
        if (altura(a.getRight()) == altura(a.getLeft()))
            return lleno(a.getLeft()) && lleno(a.getRight());
        return false;
    }
    /* Informa si un árbol binario es lleno */

    public static boolean estable (BinaryTree<Integer> a ) {
        /* Un árbol de valores enteros es estable si es vacío,
        consta de un único elemento o para t0do elemento de la
        estructura su padre es mayor. */
        boolean estable = true;
        if (a.isEmpty())
            return true;
        if (altura(a) == 0)
            return true;
//        try {
        if (!a.getLeft().isEmpty() && !a.getRight().isEmpty())
            return  (a.getRoot() > a.getLeft().getRoot() && a.getRoot() < a.getRight().getRoot());
                return estable(a.getRight()) && estable(a.getLeft());
//        } catch (Exception) {
//            e.printStackTrace();
//        }
//        return estable(a.getRight()) && estable(a.getLeft());
//        return false;
    }

    public static void porNiveles(BinaryTree a, int i) {
        /* Muestra el recorrido por niveles*/
        if (altura(a) == i)
            System.out.println(a.getRoot());
        if (altura(a) == 0)
            return;
        if (i>altura(a))
            return;
        porNiveles(a.getLeft(), i-1);
        porNiveles(a.getRight(), i-1);

    }

    public int profundidad(BinaryTree a){
        if (a.isEmpty())
            return 0;
        return 1 + Math.max(profundidad(a.getLeft()), profundidad(a.getRight()));
    }
}
