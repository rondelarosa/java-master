package org.example.dp;

public abstract class Worker {
    private String name;
    public Worker(String name) {
        this.name = name;
    }

    /**
     * Template Method design pattern
     * The basic idea of Template method is that you want to do as much work as you possibly can at the superclass level.
     * The super class though sometimes needs some kind of work to be done by the subclass.
     */
    public void pay() {
        /**
         * Template Method design pattern: getAmountDue()
         */
        Money due = getAmountDue();
    }

    /**
     * Now, when you write the superclass, typically the subclass don't exist,
     * so there's no way that you could use something like a getter and setter, even if that's a good idea
     * So you get around that problem by providing an abstract method at the superclass level and
     * that abstract method is implemented in the subclass. So, the only reason getAmountDue exists
     * because the  superclass needs to get some information from the subclass.
     * @return
     */
    abstract protected Money getAmountDue();
}
