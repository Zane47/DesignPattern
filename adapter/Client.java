package DesignPattern.adapter;

public class Client {


    public static void main(String[] args) {
        AbstractPlayer k = new Guards("科比");
        k.attack();
//      AbstractPlayer y = new Center("姚明");
        AbstractPlayer y = new Translator("姚明");
        y.attack();
        y.defense();
    }

}
