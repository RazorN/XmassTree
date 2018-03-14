package Validators;

import Exceptions.NoProperValueException;
import Exceptions.OutOfRangeException;
import Exceptions.WrongTypeException;

public class HeightValidator extends Validator<Integer> {

    private int maxValue = 20;
    private int minValue = 0;

    public HeightValidator() {
    }

    public HeightValidator(int min, int max) {
        this.maxValue = max;
        if(min>0)
            this.minValue = min;
    }

    public void getValueFromUser(){
        int tmpValue;
        try {
            if(!scann.hasNextInt())
                throw new WrongTypeException();
            tmpValue = scann.nextInt();
            if (tmpValue < minValue || tmpValue > maxValue) {
                throw  new OutOfRangeException();
            } else {
                this.value = tmpValue;
                this.isSset = true;
            }
        }
        catch(OutOfRangeException e){
            isSset = false;
        }
        catch (WrongTypeException e){
            isSset = false;
        }
        finally{
        }
    }

    public Integer getValue() throws NoProperValueException {
        getValueFromUser();
        if(isSset == true)
            return this.value;
        else
            throw new NoProperValueException();
    }
}
