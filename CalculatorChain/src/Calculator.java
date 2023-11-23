import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){



        Chain chain1 = new Add();
        Chain chain2 = new Substract();
        Chain chain3 = new Multiply();
        Chain chain4 = new Divide();
        Chain chain5 = new Modulo();
        Chain chain6 = new Power();



        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);
        chain4.setNextChain(chain5);
        chain5.setNextChain(chain6);


        Numbers request=new Numbers(100,10,"add");
        chain1.calculate(request);
        System.out.println();
        Numbers request2=new Numbers(100,10,"substract");
        chain1.calculate(request2);
        System.out.println();
        Numbers request3=new Numbers(100,10,"multiply");
        chain1.calculate(request3);
        System.out.println();
        Numbers request4=new Numbers(100,10,"divide");
        chain1.calculate(request4);
        System.out.println();
        Numbers request5=new Numbers(100,10,"mod");
        chain1.calculate(request5);
        System.out.println();
        Numbers request6=new Numbers(2,2,"power");
        chain1.calculate(request6);
        System.out.println();

    }
}