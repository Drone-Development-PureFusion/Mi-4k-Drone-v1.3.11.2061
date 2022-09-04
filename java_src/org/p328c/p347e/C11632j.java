package org.p328c.p347e;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.p328c.p347e.p349b.C11608a;
import org.p328c.p347e.p349b.C11609b;
/* renamed from: org.c.e.j */
/* loaded from: classes2.dex */
public class C11632j implements Serializable {
    private static final ObjectStreamField[] serialPersistentFields = ObjectStreamClass.lookup(C11635b.class).getFields();
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final AtomicInteger f36772a;

    /* renamed from: b */
    private final AtomicInteger f36773b;

    /* renamed from: c */
    private final CopyOnWriteArrayList<C11608a> f36774c;

    /* renamed from: d */
    private final AtomicLong f36775d;

    /* renamed from: e */
    private final AtomicLong f36776e;

    /* renamed from: f */
    private C11635b f36777f;

    @C11609b.AbstractC11610a
    /* renamed from: org.c.e.j$a */
    /* loaded from: classes.dex */
    private class C11634a extends C11609b {
        private C11634a() {
        }

        @Override // org.p328c.p347e.p349b.C11609b
        /* renamed from: a */
        public void mo476a(C11608a c11608a) {
            C11632j.this.f36774c.add(c11608a);
        }

        @Override // org.p328c.p347e.p349b.C11609b
        /* renamed from: a */
        public void mo475a(C11622c c11622c) {
            C11632j.this.f36772a.getAndIncrement();
        }

        @Override // org.p328c.p347e.p349b.C11609b
        /* renamed from: a */
        public void mo474a(C11632j c11632j) {
            C11632j.this.f36775d.addAndGet(System.currentTimeMillis() - C11632j.this.f36776e.get());
        }

        @Override // org.p328c.p347e.p349b.C11609b
        /* renamed from: b */
        public void mo473b(C11608a c11608a) {
        }

        @Override // org.p328c.p347e.p349b.C11609b
        /* renamed from: c */
        public void mo472c(C11622c c11622c) {
            C11632j.this.f36773b.getAndIncrement();
        }

        @Override // org.p328c.p347e.p349b.C11609b
        /* renamed from: d */
        public void mo471d(C11622c c11622c) {
            C11632j.this.f36776e.set(System.currentTimeMillis());
        }
    }

    /* renamed from: org.c.e.j$b */
    /* loaded from: classes2.dex */
    private static class C11635b implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        private final AtomicInteger f36779a;

        /* renamed from: b */
        private final AtomicInteger f36780b;

        /* renamed from: c */
        private final List<C11608a> f36781c;

        /* renamed from: d */
        private final long f36782d;

        /* renamed from: e */
        private final long f36783e;

        private C11635b(ObjectInputStream.GetField getField) {
            this.f36779a = (AtomicInteger) getField.get("fCount", (Object) null);
            this.f36780b = (AtomicInteger) getField.get("fIgnoreCount", (Object) null);
            this.f36781c = (List) getField.get("fFailures", (Object) null);
            this.f36782d = getField.get("fRunTime", 0L);
            this.f36783e = getField.get("fStartTime", 0L);
        }

        public C11635b(C11632j c11632j) {
            this.f36779a = c11632j.f36772a;
            this.f36780b = c11632j.f36773b;
            this.f36781c = Collections.synchronizedList(new ArrayList(c11632j.f36774c));
            this.f36782d = c11632j.f36775d.longValue();
            this.f36783e = c11632j.f36776e.longValue();
        }

        /* renamed from: a */
        public static C11635b m470a(ObjectInputStream objectInputStream) {
            return new C11635b(objectInputStream.readFields());
        }

        /* renamed from: a */
        public void m469a(ObjectOutputStream objectOutputStream) {
            ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
            putFields.put("fCount", this.f36779a);
            putFields.put("fIgnoreCount", this.f36780b);
            putFields.put("fFailures", this.f36781c);
            putFields.put("fRunTime", this.f36782d);
            putFields.put("fStartTime", this.f36783e);
            objectOutputStream.writeFields();
        }
    }

    public C11632j() {
        this.f36772a = new AtomicInteger();
        this.f36773b = new AtomicInteger();
        this.f36774c = new CopyOnWriteArrayList<>();
        this.f36775d = new AtomicLong();
        this.f36776e = new AtomicLong();
    }

    private C11632j(C11635b c11635b) {
        this.f36772a = c11635b.f36779a;
        this.f36773b = c11635b.f36780b;
        this.f36774c = new CopyOnWriteArrayList<>(c11635b.f36781c);
        this.f36775d = new AtomicLong(c11635b.f36782d);
        this.f36776e = new AtomicLong(c11635b.f36783e);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f36777f = C11635b.m470a(objectInputStream);
    }

    private Object readResolve() {
        return new C11632j(this.f36777f);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        new C11635b(this).m469a(objectOutputStream);
    }

    /* renamed from: a */
    public int m488a() {
        return this.f36772a.get();
    }

    /* renamed from: b */
    public int m486b() {
        return this.f36774c.size();
    }

    /* renamed from: c */
    public long m484c() {
        return this.f36775d.get();
    }

    /* renamed from: d */
    public List<C11608a> m482d() {
        return this.f36774c;
    }

    /* renamed from: e */
    public int m480e() {
        return this.f36773b.get();
    }

    /* renamed from: f */
    public boolean m478f() {
        return m486b() == 0;
    }

    /* renamed from: g */
    public C11609b m477g() {
        return new C11634a();
    }
}
