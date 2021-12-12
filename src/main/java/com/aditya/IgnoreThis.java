package com.aditya;

public class IgnoreThis {
    private String s;

    @ExcludeFromJacocoGeneratedReport
    public IgnoreThis(String s){
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
