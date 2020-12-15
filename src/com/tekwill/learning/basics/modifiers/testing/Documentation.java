package com.tekwill.learning.basics.modifiers.testing;

public class Documentation extends Tester {
    private Tester employee;

    public void checkPublic() {
        employee.publicFirstName = "value";
        employee.public_doWork();
    }

    public void checkProtected() {
//        employee.protectedFirstName = "value";
//        employee.protected_doWork(); [NO ACCESS]
    }

    public void checkDefault() {
//        employee.defaultFirstName = "value";
//        employee.default_doWork(); [NO ACCESS]
    }

    public void checkPrivate() {
//        employee.privateFirstName = "value";
//        employee.private_doWork();
    }

}
