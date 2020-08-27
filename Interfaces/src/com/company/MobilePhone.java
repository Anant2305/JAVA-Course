package com.company;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered On");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now Ringing " + phoneNumber + " on desk phone");
        }else{
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answer the Mobile Phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody Ring");
        }else{
            isRinging = false;
            System.out.println("Mobile Phone Not On or Number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
