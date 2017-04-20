package view;

/**
 * Created by andrew_yashin on 4/20/17.
 */
public class View {

    static final String LEFT_BRACKET = "(";
    static final String RIGHT_BRACKET = ")";
    static final String SPACE = " ";
    static final String EQUALLY = "=";
    static final String DOUBLEDOT = ":";
    static final String DOT = ".";
    static final String INPUT = "Input";
    static final String EXAMPLE = "Example";

    public static final String WRONG_STRING = "Wrong String";
    public static final String NAME = "Name";
    public static final String SURNAME = "Surname";
    public static final String FATHERNAME = "Father Name";
    public static final String NICKNAME = "Nickname";
    public static final String COMMENT = "Comment";
    public static final String GROUP = "Group";
    public static final String HOMEPHONE = "HomePhone";
    public static final String MOBILEPHONE = "MobilePhone";
    public static final String MOBILEPHONE2 = "MobilePhone #2";
    public static final String EMAIL = "E-mail";
    public static final String SKYPE = "Skype";
    public static final String ADDRESS = "Address";
    public static final String INDEX = "Index";
    public static final String CITY = "City";
    public static final String STREET = "Street";
    public static final String STREETNUMBER = "Street Number";
    public static final String HOUSENUMBER = "House Number";
    public static final String FLATNUMBER = "Flat Number";

    public void println(String value){
        System.out.println(value);
    }

    public void print(String value){
        System.out.print(value);
    }

    public void printInputField(String field, String example){
        System.out.println(
                concatenateString(
                        INPUT, SPACE, field, SPACE,
                        LEFT_BRACKET, EXAMPLE, DOUBLEDOT, SPACE, example, RIGHT_BRACKET,
                        SPACE, EQUALLY, SPACE
                ));
    }

    public void printWrongString(){
        System.out.println(WRONG_STRING);
    }

    private String concatenateString(String... args){
        StringBuilder sb = new StringBuilder();
        for(String value: args){
            sb.append(value);
        }

        return sb.toString();
    }
}
