package com;

public class Main {
    public static void main(String[] args) {
        Cell<String> cell=new Cell<>(new Main());
        System.out.println(cell.<Integer>getE(new Integer(5)));
    }
    <T> T method(T t){
        return t;
    }
}
class   Cell<T>{
    T t;
<X> Cell(X x){

}
    public void setT(T t) {
        this.t = t;
    }
    <E> E getE(E e){
        return e;
    }


}


























