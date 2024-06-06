package edu.dio.aulas.arvorebinaria.model;

import java.util.Objects;

public class Object extends AbstractBinaryTree<Object>{

    Integer value;

    public Object(Integer value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Object object = (Object) o;
        return Objects.equals(value, object.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(Object another) {
        int i = 0;

        if (this.value > another.value) {
            i = 1;
        } else if (this.value < another.value) {
            i = -1;
        }

        return i;

    }

    @Override
    public String toString() {
        return value.toString();
    }
}
