package model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by andrew_yashin on 4/20/17.
 */
@Data
@NoArgsConstructor
public class Model {
    @Setter
    @Getter
    private String surname, name, fatherName, nickName, comment,
            telephoneHome, telephoneMobile, telephoneMobile2,
            email, skype,
            index, city, street, streetNumber,  homeNumber, flatNumber,
            dateOfCreating, dateOfModify;

    private Groups group;

    public String getGroup(){
        return group.name();
    }

    public void setGroup(int number){
        group = Groups.TM41;
    }
    public String getSurnameAndName(){
        StringBuilder builder = new StringBuilder();
        builder.append(surname);
        builder.append(" ");
        builder.append(name.charAt(0));
        builder.append(".");
        return builder.toString();
    }

    public String getAddress(){
        StringBuilder builder = new StringBuilder();
        builder.append(index);
        builder.append(", ");
        builder.append(city);
        builder.append(", ");
        builder.append(street);
        builder.append(", ");
        builder.append(streetNumber);
        builder.append(", ");
        builder.append(homeNumber);
        builder.append(", ");
        builder.append(flatNumber);
        builder.append(".");
        return builder.toString();
    }
}
