package ru.runa.gpd.office.word;

import org.dom4j.Document;
import org.dom4j.Element;

public class DocxColumnModel {
    protected String variable = "";
    protected String attribute = "";

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void serialize(Document document, Element parent) {
        Element el = parent.addElement("column");
        el.addAttribute("variable", variable);
        el.addAttribute("attribute", attribute);
    }

    public static DocxColumnModel deserialize(Element element) {
        DocxColumnModel model = new DocxColumnModel();
        model.variable = element.attributeValue("variable");
        model.attribute = element.attributeValue("attribute");
        return model;
    }
}
