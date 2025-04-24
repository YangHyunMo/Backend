package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();
        InterfaceCImpl ia = impl;
        ia.methodA();
        System.out.println();
        InterfaceCImpl ib = impl;
        ib.methodB();
        System.out.println();
        InterfaceCImpl ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
