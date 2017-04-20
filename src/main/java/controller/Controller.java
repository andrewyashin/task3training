package controller;

import model.Examples;
import model.Model;
import model.RegExUser;
import view.View;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by andrew_yashin on 4/20/17.
 */
public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;

    }

    //TODO: Add group selector
    public void processUser(){
        model.setName(
                inputField(View.NAME, Examples.NAME, RegExUser.NAME_REG, System.in));
        model.setSurname(
                inputField(View.SURNAME, Examples.SURNAME, RegExUser.SURNAME_REG, System.in));
        model.setFatherName(
                inputField(View.FATHERNAME, Examples.FATHERNAME, RegExUser.FATHERNAME_REG, System.in));
        model.setNickName(
                inputField(View.NICKNAME, Examples.NICKNAME, RegExUser.NICKNAME_REG, System.in));
        model.setComment(
                inputField(View.COMMENT, Examples.COMMENT, RegExUser.COMMENT_REG, System.in));

        model.setTelephoneHome(
                inputField(View.HOMEPHONE, Examples.HOMEPHONE, RegExUser.HOMEPHONE_REG, System.in));
        model.setTelephoneMobile(
                inputField(View.MOBILEPHONE, Examples.MOBILEPHONE, RegExUser.MOBILEPHONE_REG, System.in));
        model.setTelephoneMobile2(
                inputField(View.MOBILEPHONE2, Examples.MOBILEPHONE2, RegExUser.MOBILEPHONE_REG2, System.in));

        model.setEmail(inputField(View.EMAIL, Examples.EMAIL, RegExUser.EMAIL_REG, System.in));
        model.setSkype(inputField(View.SKYPE, Examples.SKYPE, RegExUser.SKYPE_REG, System.in));

        model.setIndex(inputField(View.INDEX, Examples.INDEX, RegExUser.INDEX_REG, System.in));
        model.setCity(inputField(View.CITY, Examples.CITY, RegExUser.CITY_REG, System.in));
        model.setStreet(
                inputField(View.STREET, Examples.STREET, RegExUser.STREET_REG, System.in));
        model.setStreetNumber(
                inputField(View.STREETNUMBER, Examples.STREETNUMBER, RegExUser.STREETNUMBER_REG, System.in));
        model.setFlatNumber(inputField(
                View.FLATNUMBER, Examples.FLAT_NUMBER, RegExUser.FLAT_NUMBER_REG, System.in));
        model.setHomeNumber(
                inputField(View.HOUSENUMBER, Examples.NUMBERHOME, RegExUser.NUMBERHOME_REG, System.in));

    }

    public String inputField(String field, String example, String pattern, InputStream stream){
        view.printInputField(field, example);
        Scanner sc = new Scanner(stream);
        String input = sc.nextLine();

        while (!checkField(input, pattern)){
            view.printWrongString();
            view.printInputField(field, example);
            input = sc.nextLine();
        }

        return input;
    }

    public boolean checkField(String input, String pattern){
        return input.matches(pattern);
    }
}
