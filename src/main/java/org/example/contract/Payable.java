package org.example.contract;

 public interface Payable {
    void pay();

     /**
      * This resolve violation on Interface segregation principle.
      * Client has option to implement default implementation
      */
     class Implementation implements Payable {
        public void pay() {

        }
    }
}
