package com.tekwill.hints.inheritance.interfaces;

public class HR extends Employee {
    public void sendInvitationToMeeting(Employee employee) {
        System.out.println("Sent invitation to " + employee);
    }
}
