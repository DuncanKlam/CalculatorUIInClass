public class Calculator {

    String mainNumber;
    String previousNumber = "0";
    String calculationToPerform = "";

    String memNumber = "0";


    public Calculator() {
        this("");
    }

    public Calculator(String mainNumber) {
        this.mainNumber = mainNumber;
    }

    public void appendToMainNumber(String toAppend) {
        mainNumber += toAppend;
    }

    public void resetMainNumber() {
        mainNumber = "";
    }

    public String getMainNumber() {
        return mainNumber;
    }

    public void storeAndResetMainNumber() {
        previousNumber = mainNumber;
        resetMainNumber();
    }

    public String calculate(String toCalculate) {
        var mainNumberInteger = Integer.parseInt(previousNumber);
        var newNumberInteger = Integer.parseInt(toCalculate);
        var result = newNumberInteger;

        if (calculationToPerform.contains("add")){
            result = mainNumberInteger + newNumberInteger;
        }
        else if (calculationToPerform.contains("subt")){
            result = mainNumberInteger - newNumberInteger;
        }
        else if (calculationToPerform.contains("mult")){
            result = mainNumberInteger * newNumberInteger;
        }
        else if (calculationToPerform.contains("div")){
            result = mainNumberInteger / newNumberInteger;
        }
        return Integer.toString(result);
    }

    public void holyHandGrenade(){
        calculationToPerform = "";
        mainNumber = "0";
        previousNumber = "0";
    }

    public void addToMemoryValue(String aNumber) {
        var numberToBeAdded = Integer.parseInt(aNumber);
        var numbertoAddTo = Integer.parseInt(memNumber);
        memNumber = Integer.toString(numbertoAddTo + numberToBeAdded);
    }

    public void subtractFromMemoryValue(String aNumber) {
        var numberToSubtract = Integer.parseInt(aNumber);
        var numberToSubtractFrom = Integer.parseInt(memNumber);
        memNumber = Integer.toString(numberToSubtractFrom - numberToSubtract);
    }

    public void clearMemoryValue() {
        memNumber = "0";
    }

    public String readMemoryValue() {
        return memNumber;
    }

    public void resetCalculationToPerform() {
        calculationToPerform = "";
    }
}
