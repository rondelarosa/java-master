package org.example.reflection;

import java.lang.reflect.Method;

public class ReflectionStart {
    public static void process() {
        BankAccount acct1 = new BankAccount("1234", 500);
        callDeposit(acct1, 50);

        System.out.println("Account balance: " + acct1.getBalanceAmount());
    }

    private static void callDeposit(Object obj, double amount) {
        try {
            Class<?> theClass = obj.getClass();
            Method methodName = theClass.getMethod("deposit", double.class);

            methodName.invoke(obj, amount);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
