package oop;

public class InnerClass {
    int x = 10;

    class inClass {
        int y = 5;
    }
}

class mainexecute {
    public static void main(String[] args) {
        InnerClass myOuter = new InnerClass();
        InnerClass.inClass myInner = myOuter.new inClass();

        System.out.println(myInner.y + myOuter.x);
    }
}
