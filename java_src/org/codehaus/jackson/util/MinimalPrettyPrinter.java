package org.codehaus.jackson.util;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.PrettyPrinter;
import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes3.dex */
public class MinimalPrettyPrinter implements PrettyPrinter {
    public static final String DEFAULT_ROOT_VALUE_SEPARATOR = " ";
    protected String _rootValueSeparator = " ";

    @Override // org.codehaus.jackson.PrettyPrinter
    public void beforeArrayValues(JsonGenerator jsonGenerator) {
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void beforeObjectEntries(JsonGenerator jsonGenerator) {
    }

    public void setRootValueSeparator(String str) {
        this._rootValueSeparator = str;
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(C0494h.f736x);
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeEndArray(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.writeRaw(']');
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeEndObject(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.writeRaw(C0494h.f735w);
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(C0494h.f736x);
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(C0494h.f680A);
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeRootValueSeparator(JsonGenerator jsonGenerator) {
        if (this._rootValueSeparator != null) {
            jsonGenerator.writeRaw(this._rootValueSeparator);
        }
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeStartArray(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw('[');
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeStartObject(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(C0494h.f734v);
    }
}
