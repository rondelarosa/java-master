package org.example.dp.openclosep;

import java.io.Reader;

public class JsonImporter implements Employee.Importer {
    private Reader in;

    public JsonImporter(Reader in) {
        this.in = in;
    }

    public String fetchName() {
        return "Allen";
    }
}
