package controller;

import model.Examples;
import model.Groups;
import model.Model;
import model.RegExpUser;
import view.View;

import java.io.InputStream;
import java.util.*;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;

    }

    public void processUser(){
        model.setName(
                inputField(View.NAME, Examples.NAME, RegExpUser.NAME_REG, System.in));
        model.setSurname(
                inputField(View.SURNAME, Examples.SURNAME, RegExpUser.SURNAME_REG, System.in));
        model.setFatherName(
                inputField(View.FATHERNAME, Examples.FATHERNAME, RegExpUser.FATHERNAME_REG, System.in));
        model.setNickName(
                inputField(View.NICKNAME, Examples.NICKNAME, RegExpUser.NICKNAME_REG, System.in));
        model.setComment(
                inputField(View.COMMENT, Examples.COMMENT, RegExpUser.COMMENT_REG, System.in));
        model.setGroup(
                inputGroup(View.GROUP, RegExpUser.GROUP_REG, System.in));

        model.setTelephoneHome(
                inputField(View.HOMEPHONE, Examples.HOMEPHONE, RegExpUser.HOMEPHONE_REG, System.in));
        model.setTelephoneMobile(
                inputField(View.MOBILEPHONE, Examples.MOBILEPHONE, RegExpUser.MOBILEPHONE_REG, System.in));
        model.setTelephoneMobile2(
                inputField(View.MOBILEPHONE2, Examples.MOBILEPHONE2, RegExpUser.MOBILEPHONE_REG2, System.in));

        model.setEmail(inputField(View.EMAIL, Examples.EMAIL, RegExpUser.EMAIL_REG, System.in));
        model.setSkype(inputField(View.SKYPE, Examples.SKYPE, RegExpUser.SKYPE_REG, System.in));

        model.setIndex(inputField(View.INDEX, Examples.INDEX, RegExpUser.INDEX_REG, System.in));
        model.setCity(inputField(View.CITY, Examples.CITY, RegExpUser.CITY_REG, System.in));
        model.setStreet(
                inputField(View.STREET, Examples.STREET, RegExpUser.STREET_REG, System.in));
        model.setStreetNumber(
                inputField(View.STREETNUMBER, Examples.STREETNUMBER, RegExpUser.STREETNUMBER_REG, System.in));
        model.setFlatNumber(inputField(
                View.FLATNUMBER, Examples.FLAT_NUMBER, RegExpUser.FLAT_NUMBER_REG, System.in));
        model.setHomeNumber(
                inputField(View.HOUSENUMBER, Examples.NUMBERHOME, RegExpUser.NUMBERHOME_REG, System.in));

        if(model.getDateOfCreating()==null) {
            model.setDateOfCreating(generateCreatingDate());
        }

        model.setDateOfModify(generateModifyDate());
        view.printReport(createReport());
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

    public Groups inputGroup(String field, String pattern, InputStream stream){
        Map<Integer, String> groups = new HashMap<>();
        for(Groups group: Groups.values()){
            groups.put(group.ordinal(), group.name());
        }
        view.printInputGroups(groups);
        int numberOfInput = Integer.parseInt(inputField(field, "1", pattern, stream));

        return Groups.values()[numberOfInput];
    }

    public Map<String, String> createReport(){
        LinkedHashMap<String, String> report = new LinkedHashMap<>();
        report.put(View.FI, model.getSurnameAndName());
        report.put(View.FATHERNAME, model.getFatherName());
        report.put(View.NICKNAME, model.getNickName());
        report.put(View.COMMENT, model.getComment());
        report.put(View.GROUP, model.getGroup());
        report.put(View.HOMEPHONE, model.getHomeNumber());
        report.put(View.MOBILEPHONE, model.getTelephoneMobile());
        if(!model.getTelephoneMobile2().isEmpty())
            report.put(View.MOBILEPHONE2, model.getTelephoneMobile2());
        report.put(View.EMAIL, model.getEmail());
        report.put(View.SKYPE, model.getSkype());
        report.put(View.ADDRESS, model.getAddress());
        report.put(View.DATE_OF_CREATING, model.getDateOfCreating());
        report.put(View.DATE_OF_MODIFY, model.getDateOfModify());
        return report;
    }

    public String generateCreatingDate(){
        return new Date().toString();
    }

    public String generateModifyDate(){
        return new Date().toString();
    }
}
