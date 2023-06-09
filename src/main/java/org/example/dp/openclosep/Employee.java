package org.example.dp.openclosep;

/**
 * Builder design pattern is delegating the creation.
 * This pattern is example of Open/Close principle
 */
public class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }

    interface Importer {
        String fetchName();
    }

    interface Exporter {
        void storeName(String name);
    }

    public Employee(Importer source) {
        name = source.fetchName();
    }

    public void export(Exporter destination) {
        destination.storeName(name);
    }
}
