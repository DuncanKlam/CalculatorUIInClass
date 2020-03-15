import java.util.Map;

public class Calculator {

    String mainNumber;
    String memNumber = "0";

    String[][] numberAndOperationArray = new String[50][2];
    int NAOAIndex = 0;

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
        mainNumber = "0";
    }

    public String getMainNumber() {
        return mainNumber;
    }

    public void addOperationAndValueToArray(String number, String operation) {
        numberAndOperationArray[NAOAIndex][0] = number;
        numberAndOperationArray[NAOAIndex][1] = operation;
        NAOAIndex++;
        resetMainNumber();
    }

    public String calculate() {
        var newNumberInteger = 0;
        if (getRecentNumberToOperateOn(NAOAIndex-1).isEmpty()){
            if(getRecentOperationToPerform(NAOAIndex).contains("mult") || getRecentOperationToPerform(NAOAIndex).contains("div")){
                newNumberInteger = 1;
            }
        }
        else{ newNumberInteger = Integer.parseInt(getRecentNumberToOperateOn(NAOAIndex-1)); }

        var result = 0;
        var valueToOperateOn = Integer.parseInt(getRecentNumberToOperateOn(0));
        for (int i = 0; i < NAOAIndex; i++){
            var calculation = getRecentOperationToPerform(i);
            var nextNumberInArray = 0;
            if (calculation.contains("calculate")){
                nextNumberInArray = 0;
            } else{ nextNumberInArray = Integer.parseInt(getRecentNumberToOperateOn(i+1)); }

            if (calculation.contains("add")){
                result = valueToOperateOn + nextNumberInArray;
            }
            else if (calculation.contains("subt")){
                result = valueToOperateOn - nextNumberInArray;
            }
            else if (calculation.contains("mult")){
                result = valueToOperateOn * nextNumberInArray;
            }
            else if (calculation.contains("div")){
                result = valueToOperateOn / nextNumberInArray;
            }
            valueToOperateOn = result;
        }
        return Integer.toString(valueToOperateOn);
    }

    public String getRecentOperationToPerform(int index){
        return numberAndOperationArray[index][1];
    }
    public String getRecentNumberToOperateOn(int index) {return numberAndOperationArray[index][0];}

    public void holyHandGrenade(){
        resetMainNumber();
        NAOAIndex = 0;
        resetNAOArray();
    }

    public void resetNAOArray() {
        NAOAIndex = 0;
        for(int i=0; i<numberAndOperationArray.length-1; i++){
            numberAndOperationArray[i][0]="";
            numberAndOperationArray[i][1]="";
        }
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

}
