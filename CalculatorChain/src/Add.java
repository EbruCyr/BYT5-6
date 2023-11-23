public class Add implements Chain{

    private  Chain nextInChain;

    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }



    public void calculate(Numbers request) {

        if(request.getCalcWanted() == "add"){

            System.out.print(request.getNumber1() + " + " + request.getNum2() + " = "+
                    (request.getNumber1()+request.getNum2()));

        } else {

            nextInChain.calculate(request);

        }

    }
}
