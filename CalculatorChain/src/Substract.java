public class Substract implements Chain{

    private  Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    @Override
    public void calculate(Numbers request) {

        if(request.getCalcWanted() == "substract"){

            System.out.print(request.getNumber1() + " - " + request.getNum2() + " = "+
                    (request.getNumber1()-request.getNum2()));

        } else {

            nextInChain.calculate(request);

        }

    }

}
