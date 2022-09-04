package org.codehaus.jackson.util;

import java.util.Arrays;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.PrettyPrinter;
import org.codehaus.jackson.impl.Indenter;
import org.p286a.p287a.p299f.p302c.C11125l;
import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes3.dex */
public class DefaultPrettyPrinter implements PrettyPrinter {
    protected Indenter _arrayIndenter = new FixedSpaceIndenter();
    protected Indenter _objectIndenter = new Lf2SpacesIndenter();
    protected boolean _spacesInObjectEntries = true;
    protected int _nesting = 0;

    /* loaded from: classes3.dex */
    public static class FixedSpaceIndenter implements Indenter {
        @Override // org.codehaus.jackson.impl.Indenter
        public boolean isInline() {
            return true;
        }

        @Override // org.codehaus.jackson.impl.Indenter
        public void writeIndentation(JsonGenerator jsonGenerator, int i) {
            jsonGenerator.writeRaw(C11125l.f35805c);
        }
    }

    /* loaded from: classes3.dex */
    public static class Lf2SpacesIndenter implements Indenter {
        static final char[] SPACES;
        static final int SPACE_COUNT = 64;
        static final String SYSTEM_LINE_SEPARATOR;

        static {
            String str = null;
            try {
                str = System.getProperty("line.separator");
            } catch (Throwable th) {
            }
            if (str == null) {
                str = "\n";
            }
            SYSTEM_LINE_SEPARATOR = str;
            SPACES = new char[64];
            Arrays.fill(SPACES, (char) C11125l.f35805c);
        }

        @Override // org.codehaus.jackson.impl.Indenter
        public boolean isInline() {
            return false;
        }

        @Override // org.codehaus.jackson.impl.Indenter
        public void writeIndentation(JsonGenerator jsonGenerator, int i) {
            jsonGenerator.writeRaw(SYSTEM_LINE_SEPARATOR);
            int i2 = i + i;
            while (i2 > 64) {
                jsonGenerator.writeRaw(SPACES, 0, 64);
                i2 -= SPACES.length;
            }
            jsonGenerator.writeRaw(SPACES, 0, i2);
        }
    }

    /* loaded from: classes3.dex */
    public static class NopIndenter implements Indenter {
        @Override // org.codehaus.jackson.impl.Indenter
        public boolean isInline() {
            return true;
        }

        @Override // org.codehaus.jackson.impl.Indenter
        public void writeIndentation(JsonGenerator jsonGenerator, int i) {
        }
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void beforeArrayValues(JsonGenerator jsonGenerator) {
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void beforeObjectEntries(JsonGenerator jsonGenerator) {
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void indentArraysWith(Indenter indenter) {
        if (indenter == null) {
            indenter = new NopIndenter();
        }
        this._arrayIndenter = indenter;
    }

    public void indentObjectsWith(Indenter indenter) {
        if (indenter == null) {
            indenter = new NopIndenter();
        }
        this._objectIndenter = indenter;
    }

    public void spacesInObjectEntries(boolean z) {
        this._spacesInObjectEntries = z;
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(C0494h.f736x);
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeEndArray(JsonGenerator jsonGenerator, int i) {
        if (!this._arrayIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.writeRaw(C11125l.f35805c);
        }
        jsonGenerator.writeRaw(']');
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeEndObject(JsonGenerator jsonGenerator, int i) {
        if (!this._objectIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.writeRaw(C11125l.f35805c);
        }
        jsonGenerator.writeRaw(C0494h.f735w);
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(C0494h.f736x);
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) {
        if (this._spacesInObjectEntries) {
            jsonGenerator.writeRaw(" : ");
        } else {
            jsonGenerator.writeRaw(C0494h.f680A);
        }
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeRootValueSeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(C11125l.f35805c);
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeStartArray(JsonGenerator jsonGenerator) {
        if (!this._arrayIndenter.isInline()) {
            this._nesting++;
        }
        jsonGenerator.writeRaw('[');
    }

    @Override // org.codehaus.jackson.PrettyPrinter
    public void writeStartObject(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(C0494h.f734v);
        if (!this._objectIndenter.isInline()) {
            this._nesting++;
        }
    }
}
