package org.p328c.p329a.p331b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.C11632j;
import org.p328c.p347e.p349b.C11608a;
import org.p328c.p347e.p349b.C11609b;
/* renamed from: org.c.a.b.c */
/* loaded from: classes2.dex */
public class C11457c implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final Map<String, Long> f36564a = new HashMap();

    /* renamed from: b */
    private final Map<String, Long> f36565b = new HashMap();

    /* renamed from: c */
    private final File f36566c;

    /* renamed from: org.c.a.b.c$a */
    /* loaded from: classes2.dex */
    private final class C11459a extends C11609b {

        /* renamed from: b */
        private long f36568b;

        /* renamed from: c */
        private Map<C11622c, Long> f36569c;

        private C11459a() {
            this.f36568b = System.currentTimeMillis();
            this.f36569c = new HashMap();
        }

        @Override // org.p328c.p347e.p349b.C11609b
        /* renamed from: a */
        public void mo476a(C11608a c11608a) {
            C11457c.this.m1016a(c11608a.m574b(), this.f36568b);
        }

        @Override // org.p328c.p347e.p349b.C11609b
        /* renamed from: a */
        public void mo475a(C11622c c11622c) {
            C11457c.this.m1012b(c11622c, System.nanoTime() - this.f36569c.get(c11622c).longValue());
        }

        @Override // org.p328c.p347e.p349b.C11609b
        /* renamed from: a */
        public void mo474a(C11632j c11632j) {
            C11457c.this.m1011c();
        }

        @Override // org.p328c.p347e.p349b.C11609b
        /* renamed from: b */
        public void mo553b(C11622c c11622c) {
            this.f36569c.put(c11622c, Long.valueOf(System.nanoTime()));
        }
    }

    /* renamed from: org.c.a.b.c$b */
    /* loaded from: classes2.dex */
    private class C11460b implements Comparator<C11622c> {
        private C11460b() {
        }

        /* renamed from: a */
        private Long m1009a(C11622c c11622c) {
            Long m1017a = C11457c.this.m1017a(c11622c);
            if (m1017a == null) {
                return 0L;
            }
            return m1017a;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C11622c c11622c, C11622c c11622c2) {
            if (C11457c.this.m1013b(c11622c)) {
                return -1;
            }
            if (C11457c.this.m1013b(c11622c2)) {
                return 1;
            }
            int compareTo = m1009a(c11622c2).compareTo(m1009a(c11622c));
            return compareTo == 0 ? C11457c.this.m1010c(c11622c).compareTo(C11457c.this.m1010c(c11622c2)) : compareTo;
        }
    }

    private C11457c(File file) {
        this.f36566c = file;
    }

    /* renamed from: a */
    public static C11457c m1019a(File file) {
        if (file.exists()) {
            try {
                return m1014b(file);
            } catch (C11453a e) {
                e.printStackTrace();
                file.delete();
            }
        }
        return new C11457c(file);
    }

    /* renamed from: b */
    private static C11457c m1014b(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            C11457c c11457c = (C11457c) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return c11457c;
        } catch (Exception e) {
            throw new C11453a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m1011c() {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.f36566c));
        objectOutputStream.writeObject(this);
        objectOutputStream.close();
    }

    /* renamed from: a */
    Long m1017a(C11622c c11622c) {
        return this.f36565b.get(c11622c.toString());
    }

    /* renamed from: a */
    public C11609b m1020a() {
        return new C11459a();
    }

    /* renamed from: a */
    void m1016a(C11622c c11622c, long j) {
        this.f36565b.put(c11622c.toString(), Long.valueOf(j));
    }

    /* renamed from: b */
    public Comparator<C11622c> m1015b() {
        return new C11460b();
    }

    /* renamed from: b */
    void m1012b(C11622c c11622c, long j) {
        this.f36564a.put(c11622c.toString(), Long.valueOf(j));
    }

    /* renamed from: b */
    boolean m1013b(C11622c c11622c) {
        return !this.f36564a.containsKey(c11622c.toString());
    }

    /* renamed from: c */
    Long m1010c(C11622c c11622c) {
        return this.f36564a.get(c11622c.toString());
    }
}
