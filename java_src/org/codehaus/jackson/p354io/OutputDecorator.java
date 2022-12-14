package org.codehaus.jackson.p354io;

import java.io.OutputStream;
import java.io.Writer;
/* renamed from: org.codehaus.jackson.io.OutputDecorator */
/* loaded from: classes3.dex */
public abstract class OutputDecorator {
    public abstract OutputStream decorate(IOContext iOContext, OutputStream outputStream);

    public abstract Writer decorate(IOContext iOContext, Writer writer);
}
