package org.example.dp.openclosep;

import java.io.Reader;

public class XMLImporter implements Employee.Importer {
    private Reader in;

    public XMLImporter(Reader in) {
        this.in = in;
    }

    public String fetchName() {
        return "Allen";
    }
}
