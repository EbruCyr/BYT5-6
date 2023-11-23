public class Power implements Chain{
    private  Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    @Override
    public void calculate(Numbers request) {

        if(request.getCalcWanted() == "power"){

            System.out.print(request.getNumber1() + " ^ " + request.getNum2() + " = "+
                    (Math.pow(request.getNumber1(),request.getNum2())));

        } else {

            nextInChain.calculate(request);


        }

    }
}
