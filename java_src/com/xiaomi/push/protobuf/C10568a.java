package com.xiaomi.push.protobuf;

import com.google.p222a.p223a.AbstractC3390e;
import com.google.p222a.p223a.C3386b;
import com.google.p222a.p223a.C3387c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.xiaomi.push.protobuf.a */
/* loaded from: classes2.dex */
public final class C10568a {

    /* renamed from: com.xiaomi.push.protobuf.a$a */
    /* loaded from: classes2.dex */
    public static final class C10569a extends AbstractC3390e {

        /* renamed from: a */
        private boolean f32795a;

        /* renamed from: c */
        private boolean f32797c;

        /* renamed from: e */
        private boolean f32799e;

        /* renamed from: g */
        private boolean f32801g;

        /* renamed from: b */
        private int f32796b = 0;

        /* renamed from: d */
        private boolean f32798d = false;

        /* renamed from: f */
        private int f32800f = 0;

        /* renamed from: h */
        private boolean f32802h = false;

        /* renamed from: i */
        private List<String> f32803i = Collections.emptyList();

        /* renamed from: j */
        private int f32804j = -1;

        /* renamed from: b */
        public static C10569a m4701b(byte[] bArr) {
            return (C10569a) new C10569a().a(bArr);
        }

        /* renamed from: c */
        public static C10569a m4700c(C3386b c3386b) {
            return new C10569a().mo4530a(c3386b);
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public int mo4533a() {
            if (this.f32804j < 0) {
                mo4526b();
            }
            return this.f32804j;
        }

        /* renamed from: a */
        public C10569a m4707a(int i) {
            this.f32795a = true;
            this.f32796b = i;
            return this;
        }

        /* renamed from: a */
        public C10569a m4706a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            if (this.f32803i.isEmpty()) {
                this.f32803i = new ArrayList();
            }
            this.f32803i.add(str);
            return this;
        }

        /* renamed from: a */
        public C10569a m4705a(boolean z) {
            this.f32797c = true;
            this.f32798d = z;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public void mo4529a(C3387c c3387c) {
            if (m4698e()) {
                c3387c.m27975b(1, m4699d());
            }
            if (m4696g()) {
                c3387c.m27987a(2, m4697f());
            }
            if (m4694i()) {
                c3387c.m27992a(3, m4695h());
            }
            if (m4692k()) {
                c3387c.m27987a(4, m4693j());
            }
            for (String str : m4691l()) {
                c3387c.m27988a(5, str);
            }
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public int mo4526b() {
            int i = 0;
            int m27956d = m4698e() ? C3387c.m27956d(1, m4699d()) + 0 : 0;
            if (m4696g()) {
                m27956d += C3387c.m27970b(2, m4697f());
            }
            if (m4694i()) {
                m27956d += C3387c.m27961c(3, m4695h());
            }
            int m27970b = m4692k() ? m27956d + C3387c.m27970b(4, m4693j()) : m27956d;
            for (String str : m4691l()) {
                i += C3387c.m27966b(str);
            }
            int size = m27970b + i + (m4691l().size() * 1);
            this.f32804j = size;
            return size;
        }

        /* renamed from: b */
        public C10569a m4704b(int i) {
            this.f32799e = true;
            this.f32800f = i;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public C10569a mo4530a(C3386b c3386b) {
            while (true) {
                int m28021a = c3386b.m28021a();
                switch (m28021a) {
                    case 0:
                        break;
                    case 8:
                        m4707a(c3386b.m28003i());
                        break;
                    case 16:
                        m4705a(c3386b.m28007f());
                        break;
                    case 24:
                        m4704b(c3386b.m28009e());
                        break;
                    case 32:
                        m4702b(c3386b.m28007f());
                        break;
                    case 42:
                        m4706a(c3386b.m28005g());
                        break;
                    default:
                        if (a(c3386b, m28021a)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }

        /* renamed from: b */
        public C10569a m4702b(boolean z) {
            this.f32801g = true;
            this.f32802h = z;
            return this;
        }

        /* renamed from: d */
        public int m4699d() {
            return this.f32796b;
        }

        /* renamed from: e */
        public boolean m4698e() {
            return this.f32795a;
        }

        /* renamed from: f */
        public boolean m4697f() {
            return this.f32798d;
        }

        /* renamed from: g */
        public boolean m4696g() {
            return this.f32797c;
        }

        /* renamed from: h */
        public int m4695h() {
            return this.f32800f;
        }

        /* renamed from: i */
        public boolean m4694i() {
            return this.f32799e;
        }

        /* renamed from: j */
        public boolean m4693j() {
            return this.f32802h;
        }

        /* renamed from: k */
        public boolean m4692k() {
            return this.f32801g;
        }

        /* renamed from: l */
        public List<String> m4691l() {
            return this.f32803i;
        }

        /* renamed from: m */
        public int m4690m() {
            return this.f32803i.size();
        }
    }
}
