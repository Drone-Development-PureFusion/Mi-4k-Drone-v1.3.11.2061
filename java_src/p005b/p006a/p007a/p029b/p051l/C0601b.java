package p005b.p006a.p007a.p029b.p051l;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
/* renamed from: b.a.a.b.l.b */
/* loaded from: classes.dex */
public class C0601b extends AbstractC0602c {

    /* renamed from: d */
    private File f1040d;

    /* renamed from: e */
    private FileOutputStream f1041e;

    public C0601b(File file, boolean z) {
        this.f1040d = file;
        this.f1041e = new FileOutputStream(file, z);
        this.f1043b = new BufferedOutputStream(this.f1041e);
        this.f1044c = true;
    }

    /* renamed from: a */
    public FileChannel m38748a() {
        if (this.f1043b == null) {
            return null;
        }
        return this.f1041e.getChannel();
    }

    /* renamed from: b */
    public File m38747b() {
        return this.f1040d;
    }

    @Override // p005b.p006a.p007a.p029b.p051l.AbstractC0602c
    /* renamed from: c */
    String mo38738c() {
        return "file [" + this.f1040d + "]";
    }

    @Override // p005b.p006a.p007a.p029b.p051l.AbstractC0602c
    /* renamed from: d */
    OutputStream mo38737d() {
        this.f1041e = new FileOutputStream(this.f1040d, true);
        return new BufferedOutputStream(this.f1041e);
    }

    public String toString() {
        return "c.q.l.c.recovery.ResilientFileOutputStream@" + System.identityHashCode(this);
    }
}
