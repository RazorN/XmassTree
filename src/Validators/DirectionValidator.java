package Validators;

import Exceptions.NoProperValueException;
import Exceptions.OutOfRangeException;
import Exceptions.WrongTypeException;
import com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DirectionValidator extends Validator<String> {
    public void getValueFromUser(){

        try {
            if(!scann.hasNextLine()) {
                throw new WrongTypeException();
            } else {
                String tmpValue = scann.nextLine();
                if(!tmpValue.contentEquals("up") && !tmpValue.contentEquals("down")
                        && !tmpValue.contentEquals("right") && !tmpValue.contentEquals("left")){
                    throw new OutOfRangeException();
                } else {
                    this.value = tmpValue;
                    this.isSset = true;
                }
            }
            }
        catch(OutOfRangeException e){
            isSset = false;
        }
        catch (WrongTypeException e){
            isSset = false;
        }
    }
}
