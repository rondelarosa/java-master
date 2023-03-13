package org.example.dp.openclosep;

public class JsonExporter implements Employee.Exporter {
    private String name;

    public void storeName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{ \"name\":\"" + name + "\" }";
    }
}
