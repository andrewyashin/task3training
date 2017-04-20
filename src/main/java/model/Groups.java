package model;

/**
 * Created by andrew_yashin on 4/20/17.
 */
public enum Groups {
    TM41(1),
    TM42(2),
    TM45(3),
    TP56(4);

    private int number;

    Groups(int number){
        this.number = number;
    }
}
