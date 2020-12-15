package com.tekwill.learning.basics.modifiers.software;

public class Meeting {
    private Employee employee;

    public void checkPublic() {
        employee.publicFirstName = "value";
        employee.public_doWork();
    }

    public void checkProtected() {
        employee.protectedFirstName = "value";
        employee.protected_doWork();
    }

    public void checkDefault() {
        employee.defaultFirstName = "value";
        employee.default_doWork();
    }

    public void checkPrivate() {
//     public void checkPrivate() {
        int test; // on local variables no access modifier
//        employee.privateFirstName = "value"; - no access
//        employee.private_doWork(); - no access
    }

}
