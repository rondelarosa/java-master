package org.example.dp.openclosep;

import java.io.Reader;
import java.io.StringReader;

public class OpenClosePrincipleStart {
    public static void process(){
        json();
        xml();
    }

    public static void json(){
        String json = "{ \"name\":\"Allen\"}";

        Reader in = new StringReader(json);
        Employee me = new Employee(new JsonImporter(in));


        Employee.Exporter exporter = new JsonExporter();
        me.export(exporter);

        String jsonVersion = exporter.toString();

    }

    public static void xml(){
        String xml = "<name value=\"Allen\">";

        Reader in = new StringReader(xml);
        Employee me = new Employee(new XMLImporter(in));


        Employee.Exporter exporter = new XMLExporter();
        me.export(exporter);

        String xmlVersion = exporter.toString();

    }
}
