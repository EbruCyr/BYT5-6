public class Numbers {
    private int num1;
    private int num2;

    private String calculationType;

    public Numbers(int number1, int number2, String calculationType){

        num1 = number1;
        num2 = number2;
        this.calculationType = calculationType;

    }

    public int getNumber1(){ return num1; }
    public int getNum2(){ return num2; }
    public String getCalcWanted(){ return calculationType; }
}
