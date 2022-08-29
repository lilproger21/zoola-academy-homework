package com.zoolatech.lecture3.tasks._2;

public class LessThanXValidator implements Validator {
    private  String fieldName;
    private final int x;

    public LessThanXValidator(String fieldName, int x) {
        this.fieldName = fieldName;
        this.x = x;
    }

    @Override
    public boolean isValid(UserAccount userAccount) {
        int fieldLength = getStringFieldValue(userAccount, fieldName).length();
        if (fieldLength < x) {
            System.out.println("Field`s " + fieldName + " length is less than " + x);
            return true;
        }else {
            System.out.println("Field`s " + fieldName + " length is more than " + x+". Validating error.");
            return false;
        }
    }
}
