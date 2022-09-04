package com.p081b.p082a;

import android.util.Log;
import com.p081b.p083b.AbstractC1023a;
import com.p081b.p083b.AbstractC1024b;
import com.p081b.p083b.AbstractC1026d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* renamed from: com.b.a.n */
/* loaded from: classes.dex */
public class C1008n implements Cloneable {

    /* renamed from: i */
    private static final AbstractC1014p f2262i = new C0985h();

    /* renamed from: j */
    private static final AbstractC1014p f2263j = new C0983f();

    /* renamed from: k */
    private static Class[] f2264k = {Float.TYPE, Float.class, Double.TYPE, Integer.TYPE, Double.class, Integer.class};

    /* renamed from: l */
    private static Class[] f2265l = {Integer.TYPE, Integer.class, Float.TYPE, Double.TYPE, Float.class, Double.class};

    /* renamed from: m */
    private static Class[] f2266m = {Double.TYPE, Double.class, Float.TYPE, Integer.TYPE, Float.class, Integer.class};

    /* renamed from: n */
    private static final HashMap<Class, HashMap<String, Method>> f2267n = new HashMap<>();

    /* renamed from: o */
    private static final HashMap<Class, HashMap<String, Method>> f2268o = new HashMap<>();

    /* renamed from: a */
    String f2269a;

    /* renamed from: b */
    protected AbstractC1026d f2270b;

    /* renamed from: c */
    Method f2271c;

    /* renamed from: d */
    Class f2272d;

    /* renamed from: e */
    C0991k f2273e;

    /* renamed from: f */
    final ReentrantReadWriteLock f2274f;

    /* renamed from: g */
    final Object[] f2275g;

    /* renamed from: h */
    private Method f2276h;

    /* renamed from: p */
    private AbstractC1014p f2277p;

    /* renamed from: q */
    private Object f2278q;

    /* renamed from: com.b.a.n$a */
    /* loaded from: classes.dex */
    static class C1010a extends C1008n {

        /* renamed from: h */
        C0984g f2279h;

        /* renamed from: i */
        float f2280i;

        /* renamed from: j */
        private AbstractC1023a f2281j;

        public C1010a(AbstractC1026d abstractC1026d, C0984g c0984g) {
            super(abstractC1026d);
            this.f2272d = Float.TYPE;
            this.f2273e = c0984g;
            this.f2279h = (C0984g) this.f2273e;
            if (abstractC1026d instanceof AbstractC1023a) {
                this.f2281j = (AbstractC1023a) this.f2270b;
            }
        }

        public C1010a(AbstractC1026d abstractC1026d, float... fArr) {
            super(abstractC1026d);
            mo37122a(fArr);
            if (abstractC1026d instanceof AbstractC1023a) {
                this.f2281j = (AbstractC1023a) this.f2270b;
            }
        }

        public C1010a(String str, C0984g c0984g) {
            super(str);
            this.f2272d = Float.TYPE;
            this.f2273e = c0984g;
            this.f2279h = (C0984g) this.f2273e;
        }

        public C1010a(String str, float... fArr) {
            super(str);
            mo37122a(fArr);
        }

        @Override // com.p081b.p082a.C1008n
        /* renamed from: a */
        void mo37119a(float f) {
            this.f2280i = this.f2279h.m37220b(f);
        }

        @Override // com.p081b.p082a.C1008n
        /* renamed from: a */
        void mo37118a(Class cls) {
            if (this.f2270b != null) {
                return;
            }
            super.mo37118a(cls);
        }

        @Override // com.p081b.p082a.C1008n
        /* renamed from: a */
        public void mo37122a(float... fArr) {
            super.mo37122a(fArr);
            this.f2279h = (C0984g) this.f2273e;
        }

        @Override // com.p081b.p082a.C1008n
        /* renamed from: d */
        Object mo37116d() {
            return Float.valueOf(this.f2280i);
        }

        @Override // com.p081b.p082a.C1008n
        /* renamed from: d */
        void mo37115d(Object obj) {
            if (this.f2281j != null) {
                this.f2281j.mo37046a((AbstractC1023a) obj, this.f2280i);
            } else if (this.f2270b != null) {
                this.f2270b.mo37036a(obj, Float.valueOf(this.f2280i));
            } else if (this.f2271c == null) {
            } else {
                try {
                    this.f2275g[0] = Float.valueOf(this.f2280i);
                    this.f2271c.invoke(obj, this.f2275g);
                } catch (IllegalAccessException e) {
                    Log.e("PropertyValuesHolder", e.toString());
                } catch (InvocationTargetException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                }
            }
        }

        @Override // com.p081b.p082a.C1008n
        /* renamed from: e */
        public C1010a clone() {
            C1010a c1010a = (C1010a) super.clone();
            c1010a.f2279h = (C0984g) c1010a.f2273e;
            return c1010a;
        }
    }

    /* renamed from: com.b.a.n$b */
    /* loaded from: classes.dex */
    static class C1011b extends C1008n {

        /* renamed from: h */
        C0986i f2282h;

        /* renamed from: i */
        int f2283i;

        /* renamed from: j */
        private AbstractC1024b f2284j;

        public C1011b(AbstractC1026d abstractC1026d, C0986i c0986i) {
            super(abstractC1026d);
            this.f2272d = Integer.TYPE;
            this.f2273e = c0986i;
            this.f2282h = (C0986i) this.f2273e;
            if (abstractC1026d instanceof AbstractC1024b) {
                this.f2284j = (AbstractC1024b) this.f2270b;
            }
        }

        public C1011b(AbstractC1026d abstractC1026d, int... iArr) {
            super(abstractC1026d);
            mo37117a(iArr);
            if (abstractC1026d instanceof AbstractC1024b) {
                this.f2284j = (AbstractC1024b) this.f2270b;
            }
        }

        public C1011b(String str, C0986i c0986i) {
            super(str);
            this.f2272d = Integer.TYPE;
            this.f2273e = c0986i;
            this.f2282h = (C0986i) this.f2273e;
        }

        public C1011b(String str, int... iArr) {
            super(str);
            mo37117a(iArr);
        }

        @Override // com.p081b.p082a.C1008n
        /* renamed from: a */
        void mo37119a(float f) {
            this.f2283i = this.f2282h.m37217b(f);
        }

        @Override // com.p081b.p082a.C1008n
        /* renamed from: a */
        void mo37118a(Class cls) {
            if (this.f2270b != null) {
                return;
            }
            super.mo37118a(cls);
        }

        @Override // com.p081b.p082a.C1008n
        /* renamed from: a */
        public void mo37117a(int... iArr) {
            super.mo37117a(iArr);
            this.f2282h = (C0986i) this.f2273e;
        }

        @Override // com.p081b.p082a.C1008n
        /* renamed from: d */
        Object mo37116d() {
            return Integer.valueOf(this.f2283i);
        }

        @Override // com.p081b.p082a.C1008n
        /* renamed from: d */
        void mo37115d(Object obj) {
            if (this.f2284j != null) {
                this.f2284j.mo37044a((AbstractC1024b) obj, this.f2283i);
            } else if (this.f2270b != null) {
                this.f2270b.mo37036a(obj, Integer.valueOf(this.f2283i));
            } else if (this.f2271c == null) {
            } else {
                try {
                    this.f2275g[0] = Integer.valueOf(this.f2283i);
                    this.f2271c.invoke(obj, this.f2275g);
                } catch (IllegalAccessException e) {
                    Log.e("PropertyValuesHolder", e.toString());
                } catch (InvocationTargetException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                }
            }
        }

        @Override // com.p081b.p082a.C1008n
        /* renamed from: e */
        public C1011b clone() {
            C1011b c1011b = (C1011b) super.clone();
            c1011b.f2282h = (C0986i) c1011b.f2273e;
            return c1011b;
        }
    }

    private C1008n(AbstractC1026d abstractC1026d) {
        this.f2271c = null;
        this.f2276h = null;
        this.f2273e = null;
        this.f2274f = new ReentrantReadWriteLock();
        this.f2275g = new Object[1];
        this.f2270b = abstractC1026d;
        if (abstractC1026d != null) {
            this.f2269a = abstractC1026d.m37041b();
        }
    }

    private C1008n(String str) {
        this.f2271c = null;
        this.f2276h = null;
        this.f2273e = null;
        this.f2274f = new ReentrantReadWriteLock();
        this.f2275g = new Object[1];
        this.f2269a = str;
    }

    /* renamed from: a */
    public static <V> C1008n m37143a(AbstractC1026d abstractC1026d, AbstractC1014p<V> abstractC1014p, V... vArr) {
        C1008n c1008n = new C1008n(abstractC1026d);
        c1008n.m37128a((Object[]) vArr);
        c1008n.m37145a((AbstractC1014p) abstractC1014p);
        return c1008n;
    }

    /* renamed from: a */
    public static C1008n m37142a(AbstractC1026d<?, Float> abstractC1026d, float... fArr) {
        return new C1010a(abstractC1026d, fArr);
    }

    /* renamed from: a */
    public static C1008n m37141a(AbstractC1026d<?, Integer> abstractC1026d, int... iArr) {
        return new C1011b(abstractC1026d, iArr);
    }

    /* renamed from: a */
    public static C1008n m37140a(AbstractC1026d abstractC1026d, AbstractC0987j... abstractC0987jArr) {
        C0991k m37192a = C0991k.m37192a(abstractC0987jArr);
        if (m37192a instanceof C0986i) {
            return new C1011b(abstractC1026d, (C0986i) m37192a);
        }
        if (m37192a instanceof C0984g) {
            return new C1010a(abstractC1026d, (C0984g) m37192a);
        }
        C1008n c1008n = new C1008n(abstractC1026d);
        c1008n.f2273e = m37192a;
        c1008n.f2272d = abstractC0987jArr[0].m37205e();
        return c1008n;
    }

    /* renamed from: a */
    public static C1008n m37134a(String str, AbstractC1014p abstractC1014p, Object... objArr) {
        C1008n c1008n = new C1008n(str);
        c1008n.m37128a(objArr);
        c1008n.m37145a(abstractC1014p);
        return c1008n;
    }

    /* renamed from: a */
    public static C1008n m37132a(String str, float... fArr) {
        return new C1010a(str, fArr);
    }

    /* renamed from: a */
    public static C1008n m37131a(String str, int... iArr) {
        return new C1011b(str, iArr);
    }

    /* renamed from: a */
    public static C1008n m37130a(String str, AbstractC0987j... abstractC0987jArr) {
        C0991k m37192a = C0991k.m37192a(abstractC0987jArr);
        if (m37192a instanceof C0986i) {
            return new C1011b(str, (C0986i) m37192a);
        }
        if (m37192a instanceof C0984g) {
            return new C1010a(str, (C0984g) m37192a);
        }
        C1008n c1008n = new C1008n(str);
        c1008n.f2273e = m37192a;
        c1008n.f2272d = abstractC0987jArr[0].m37205e();
        return c1008n;
    }

    /* renamed from: a */
    static String m37133a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        char upperCase = Character.toUpperCase(str2.charAt(0));
        return str + upperCase + str2.substring(1);
    }

    /* renamed from: a */
    private Method m37139a(Class cls, String str, Class cls2) {
        Method method;
        Class<?>[] clsArr;
        Method method2 = null;
        String m37133a = m37133a(str, this.f2269a);
        if (cls2 != null) {
            Class<?>[] clsArr2 = new Class[1];
            for (Class<?> cls3 : this.f2272d.equals(Float.class) ? f2264k : this.f2272d.equals(Integer.class) ? f2265l : this.f2272d.equals(Double.class) ? f2266m : new Class[]{this.f2272d}) {
                clsArr2[0] = cls3;
                try {
                    method2 = cls.getMethod(m37133a, clsArr2);
                    this.f2272d = cls3;
                    return method2;
                } catch (NoSuchMethodException e) {
                    try {
                        method2 = cls.getDeclaredMethod(m37133a, clsArr2);
                        method2.setAccessible(true);
                        this.f2272d = cls3;
                        return method2;
                    } catch (NoSuchMethodException e2) {
                    }
                }
            }
            Log.e("PropertyValuesHolder", "Couldn't find setter/getter for property " + this.f2269a + " with value type " + this.f2272d);
            return method2;
        }
        try {
            return cls.getMethod(m37133a, null);
        } catch (NoSuchMethodException e3) {
            try {
                method = cls.getDeclaredMethod(m37133a, null);
                try {
                    method.setAccessible(true);
                    return method;
                } catch (NoSuchMethodException e4) {
                    Log.e("PropertyValuesHolder", "Couldn't find no-arg method for property " + this.f2269a + ": " + e3);
                    return method;
                }
            } catch (NoSuchMethodException e5) {
                method = null;
            }
        }
    }

    /* renamed from: a */
    private Method m37138a(Class cls, HashMap<Class, HashMap<String, Method>> hashMap, String str, Class cls2) {
        Method method = null;
        try {
            this.f2274f.writeLock().lock();
            HashMap<String, Method> hashMap2 = hashMap.get(cls);
            if (hashMap2 != null) {
                method = hashMap2.get(this.f2269a);
            }
            if (method == null) {
                method = m37139a(cls, str, cls2);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap<>();
                    hashMap.put(cls, hashMap2);
                }
                hashMap2.put(this.f2269a, method);
            }
            Method method2 = method;
            return method2;
        } finally {
            this.f2274f.writeLock().unlock();
        }
    }

    /* renamed from: a */
    private void m37136a(Object obj, AbstractC0987j abstractC0987j) {
        if (this.f2270b != null) {
            abstractC0987j.mo37200a(this.f2270b.mo37037a(obj));
        }
        try {
            if (this.f2276h == null) {
                m37126b((Class) obj.getClass());
            }
            abstractC0987j.mo37200a(this.f2276h.invoke(obj, new Object[0]));
        } catch (IllegalAccessException e) {
            Log.e("PropertyValuesHolder", e.toString());
        } catch (InvocationTargetException e2) {
            Log.e("PropertyValuesHolder", e2.toString());
        }
    }

    /* renamed from: b */
    private void m37126b(Class cls) {
        this.f2276h = m37138a(cls, f2268o, "get", null);
    }

    @Override // 
    /* renamed from: a */
    public C1008n clone() {
        try {
            C1008n c1008n = (C1008n) super.clone();
            c1008n.f2269a = this.f2269a;
            c1008n.f2270b = this.f2270b;
            c1008n.f2273e = this.f2273e.clone();
            c1008n.f2277p = this.f2277p;
            return c1008n;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37119a(float f) {
        this.f2278q = this.f2273e.mo37196a(f);
    }

    /* renamed from: a */
    public void m37145a(AbstractC1014p abstractC1014p) {
        this.f2277p = abstractC1014p;
        this.f2273e.m37195a(abstractC1014p);
    }

    /* renamed from: a */
    public void m37144a(AbstractC1026d abstractC1026d) {
        this.f2270b = abstractC1026d;
    }

    /* renamed from: a */
    void mo37118a(Class cls) {
        this.f2271c = m37138a(cls, f2267n, "set", this.f2272d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m37137a(Object obj) {
        if (this.f2270b != null) {
            try {
                this.f2270b.mo37037a(obj);
                Iterator<AbstractC0987j> it2 = this.f2273e.f2241e.iterator();
                while (it2.hasNext()) {
                    AbstractC0987j next = it2.next();
                    if (!next.m37216a()) {
                        next.mo37200a(this.f2270b.mo37037a(obj));
                    }
                }
                return;
            } catch (ClassCastException e) {
                Log.e("PropertyValuesHolder", "No such property (" + this.f2270b.m37041b() + ") on target object " + obj + ". Trying reflection instead");
                this.f2270b = null;
            }
        }
        Class<?> cls = obj.getClass();
        if (this.f2271c == null) {
            mo37118a((Class) cls);
        }
        Iterator<AbstractC0987j> it3 = this.f2273e.f2241e.iterator();
        while (it3.hasNext()) {
            AbstractC0987j next2 = it3.next();
            if (!next2.m37216a()) {
                if (this.f2276h == null) {
                    m37126b((Class) cls);
                }
                try {
                    next2.mo37200a(this.f2276h.invoke(obj, new Object[0]));
                } catch (IllegalAccessException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                } catch (InvocationTargetException e3) {
                    Log.e("PropertyValuesHolder", e3.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public void m37135a(String str) {
        this.f2269a = str;
    }

    /* renamed from: a */
    public void mo37122a(float... fArr) {
        this.f2272d = Float.TYPE;
        this.f2273e = C0991k.m37194a(fArr);
    }

    /* renamed from: a */
    public void mo37117a(int... iArr) {
        this.f2272d = Integer.TYPE;
        this.f2273e = C0991k.m37193a(iArr);
    }

    /* renamed from: a */
    public void m37129a(AbstractC0987j... abstractC0987jArr) {
        int length = abstractC0987jArr.length;
        AbstractC0987j[] abstractC0987jArr2 = new AbstractC0987j[Math.max(length, 2)];
        this.f2272d = abstractC0987jArr[0].m37205e();
        for (int i = 0; i < length; i++) {
            abstractC0987jArr2[i] = abstractC0987jArr[i];
        }
        this.f2273e = new C0991k(abstractC0987jArr2);
    }

    /* renamed from: a */
    public void m37128a(Object... objArr) {
        this.f2272d = objArr[0].getClass();
        this.f2273e = C0991k.m37191a(objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m37127b() {
        if (this.f2277p == null) {
            this.f2277p = this.f2272d == Integer.class ? f2262i : this.f2272d == Float.class ? f2263j : null;
        }
        if (this.f2277p != null) {
            this.f2273e.m37195a(this.f2277p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m37125b(Object obj) {
        m37136a(obj, this.f2273e.f2241e.get(0));
    }

    /* renamed from: c */
    public String m37124c() {
        return this.f2269a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m37123c(Object obj) {
        m37136a(obj, this.f2273e.f2241e.get(this.f2273e.f2241e.size() - 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo37116d() {
        return this.f2278q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo37115d(Object obj) {
        if (this.f2270b != null) {
            this.f2270b.mo37036a(obj, mo37116d());
        }
        if (this.f2271c != null) {
            try {
                this.f2275g[0] = mo37116d();
                this.f2271c.invoke(obj, this.f2275g);
            } catch (IllegalAccessException e) {
                Log.e("PropertyValuesHolder", e.toString());
            } catch (InvocationTargetException e2) {
                Log.e("PropertyValuesHolder", e2.toString());
            }
        }
    }

    public String toString() {
        return this.f2269a + ": " + this.f2273e.toString();
    }
}
