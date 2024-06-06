package edu.dio.aulas.arvorebinaria.model;

public abstract class AbstractBinaryTree<T> implements Comparable<T>  {

    public abstract boolean equals(Object object);
    public abstract int hashCode();
    public abstract int compareTo(T another);
    public abstract String toString();

}
