package Validators;

import Exceptions.NoProperValueException;

import java.util.Scanner;

public abstract class Validator<T> {
    protected T value;
    protected boolean isSset = false;
    protected Scanner scann = new Scanner(System.in);

    abstract void getValueFromUser();

    public T getValue() throws NoProperValueException {
        getValueFromUser();
        if(isSset == true)
            return this.value;
        else
            throw new NoProperValueException();
    }

}
