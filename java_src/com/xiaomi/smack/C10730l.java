package com.xiaomi.smack;

import com.xiaomi.smack.packet.C10740g;
import com.xiaomi.smack.packet.C10741h;
import java.io.PrintStream;
import java.io.PrintWriter;
/* renamed from: com.xiaomi.smack.l */
/* loaded from: classes.dex */
public class C10730l extends Exception {

    /* renamed from: a */
    private C10740g f33450a;

    /* renamed from: b */
    private C10741h f33451b;

    /* renamed from: c */
    private Throwable f33452c;

    public C10730l() {
        this.f33450a = null;
        this.f33451b = null;
        this.f33452c = null;
    }

    public C10730l(C10740g c10740g) {
        this.f33450a = null;
        this.f33451b = null;
        this.f33452c = null;
        this.f33450a = c10740g;
    }

    public C10730l(String str) {
        super(str);
        this.f33450a = null;
        this.f33451b = null;
        this.f33452c = null;
    }

    public C10730l(String str, Throwable th) {
        super(str);
        this.f33450a = null;
        this.f33451b = null;
        this.f33452c = null;
        this.f33452c = th;
    }

    public C10730l(Throwable th) {
        this.f33450a = null;
        this.f33451b = null;
        this.f33452c = null;
        this.f33452c = th;
    }

    /* renamed from: a */
    public Throwable m3925a() {
        return this.f33452c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        return (message != null || this.f33451b == null) ? (message != null || this.f33450a == null) ? message : this.f33450a.toString() : this.f33451b.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f33452c != null) {
            printStream.println("Nested Exception: ");
            this.f33452c.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f33452c != null) {
            printWriter.println("Nested Exception: ");
            this.f33452c.printStackTrace(printWriter);
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb.append(message).append(": ");
        }
        if (this.f33451b != null) {
            sb.append(this.f33451b);
        }
        if (this.f33450a != null) {
            sb.append(this.f33450a);
        }
        if (this.f33452c != null) {
            sb.append("\n  -- caused by: ").append(this.f33452c);
        }
        return sb.toString();
    }
}
