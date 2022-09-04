package p005b.p006a.p007a.p008a.p020j.p021a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import p005b.p006a.p007a.p008a.C0283e;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.p058r.C0706e;
/* renamed from: b.a.a.a.j.a.d */
/* loaded from: classes.dex */
class C0310d implements AbstractC0307a {

    /* renamed from: a */
    private final String f273a;

    /* renamed from: b */
    private final Socket f274b;

    /* renamed from: c */
    private final InputStream f275c;

    /* renamed from: d */
    private C0286f f276d;

    /* renamed from: e */
    private C0283e f277e;

    public C0310d(String str, InputStream inputStream) {
        this.f273a = str;
        this.f274b = null;
        this.f275c = inputStream;
    }

    public C0310d(String str, Socket socket) {
        this.f273a = str;
        this.f274b = socket;
        this.f275c = null;
    }

    /* renamed from: a */
    private ObjectInputStream m39698a() {
        return this.f275c != null ? new ObjectInputStream(this.f275c) : new ObjectInputStream(this.f274b.getInputStream());
    }

    @Override // p005b.p006a.p007a.p008a.p020j.p021a.AbstractC0307a
    /* renamed from: a */
    public void mo39697a(C0286f c0286f) {
        this.f276d = c0286f;
        this.f277e = c0286f.mo126e(getClass().getPackage().getName());
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractRunnableC0498b, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f274b == null) {
            return;
        }
        C0706e.m38433a(this.f274b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Type inference failed for: r0v0, types: [b.a.a.a.e] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        Throwable th;
        ObjectInputStream objectInputStream;
        RuntimeException e;
        IOException e2;
        ?? r1 = this + ": connected";
        this.f277e.mo62i(r1);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = m39698a();
                while (true) {
                    try {
                        AbstractC0366d abstractC0366d = (AbstractC0366d) objectInputStream.readObject();
                        C0283e mo126e = this.f276d.mo126e(abstractC0366d.mo39534f());
                        if (mo126e.m39783b(abstractC0366d.mo39538b())) {
                            mo126e.m39791a(abstractC0366d);
                        }
                    } catch (EOFException e3) {
                        objectInputStream2 = objectInputStream;
                        if (objectInputStream2 != null) {
                            C0706e.m38435a(objectInputStream2);
                        }
                        close();
                        this.f277e.mo62i(this + ": connection closed");
                        return;
                    } catch (IOException e4) {
                        e2 = e4;
                        this.f277e.mo62i(this + ": " + e2);
                        if (objectInputStream != null) {
                            C0706e.m38435a(objectInputStream);
                        }
                        close();
                        this.f277e.mo62i(this + ": connection closed");
                        return;
                    } catch (ClassNotFoundException e5) {
                        this.f277e.mo64h(this + ": unknown event class");
                        if (objectInputStream != null) {
                            C0706e.m38435a(objectInputStream);
                        }
                        close();
                        this.f277e.mo62i(this + ": connection closed");
                        return;
                    } catch (RuntimeException e6) {
                        e = e6;
                        this.f277e.mo64h(this + ": " + e);
                        if (objectInputStream != null) {
                            C0706e.m38435a(objectInputStream);
                        }
                        close();
                        this.f277e.mo62i(this + ": connection closed");
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (r1 != 0) {
                    C0706e.m38435a((Closeable) r1);
                }
                close();
                this.f277e.mo62i(this + ": connection closed");
                throw th;
            }
        } catch (EOFException e7) {
        } catch (IOException e8) {
            objectInputStream = null;
            e2 = e8;
        } catch (ClassNotFoundException e9) {
            objectInputStream = null;
        } catch (RuntimeException e10) {
            objectInputStream = null;
            e = e10;
        } catch (Throwable th3) {
            r1 = 0;
            th = th3;
            if (r1 != 0) {
            }
            close();
            this.f277e.mo62i(this + ": connection closed");
            throw th;
        }
    }

    public String toString() {
        return "client " + this.f273a;
    }
}
