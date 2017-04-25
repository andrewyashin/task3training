package model;

/**
 * Created by andrew_yashin on 4/20/17.
 */
public interface RegExpUser {
    String
            NAME_REG = "[A-Z]{1}[a-z]{1,20}",
            SURNAME_REG = "[A-Z]{1}[a-z]{1,20}",
            FATHERNAME_REG = "[A-Z]{1}[a-z]{1,20}",
            NICKNAME_REG = "^[A-Za-z][A-Za-z0-9_.]{1,20}",
            COMMENT_REG = ".*",
            GROUP_REG = "[0-3]",

            HOMEPHONE_REG = "[0-9]{3}\\s[0-9]{2}\\s[0-9]{2}",
            MOBILEPHONE_REG = "\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})",
            MOBILEPHONE_REG2 = "(\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4}))?",

            EMAIL_REG = "\\w+@[A-Za-z0-9]+\\.[A-Za-z]{2,64}",
            SKYPE_REG = "[A-Za-z]{1}[A-Za-z\\_\\.0-9]+",

            INDEX_REG = "[0-9]{5}",
            CITY_REG = "[A-Z]{1}[A-Za-z]+",
            STREET_REG = "[A-Z]{1}[A-Za-z]+",
            NUMBERHOME_REG = "\\d+",
            STREETNUMBER_REG = "\\d+[A-Z]?",
            FLAT_NUMBER_REG = "\\d+";
}
