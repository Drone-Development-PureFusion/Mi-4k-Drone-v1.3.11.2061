package com.xiaomi.push.protobuf;

import com.google.p222a.p223a.AbstractC3390e;
import com.google.p222a.p223a.C3385a;
import com.google.p222a.p223a.C3386b;
import com.google.p222a.p223a.C3387c;
/* renamed from: com.xiaomi.push.protobuf.b */
/* loaded from: classes.dex */
public final class C10570b {

    /* renamed from: com.xiaomi.push.protobuf.b$a */
    /* loaded from: classes2.dex */
    public static final class C10571a extends AbstractC3390e {

        /* renamed from: a */
        private boolean f32805a;

        /* renamed from: c */
        private boolean f32807c;

        /* renamed from: e */
        private boolean f32809e;

        /* renamed from: g */
        private boolean f32811g;

        /* renamed from: i */
        private boolean f32813i;

        /* renamed from: k */
        private boolean f32815k;

        /* renamed from: m */
        private boolean f32817m;

        /* renamed from: o */
        private boolean f32819o;

        /* renamed from: q */
        private boolean f32821q;

        /* renamed from: s */
        private boolean f32823s;

        /* renamed from: u */
        private boolean f32825u;

        /* renamed from: b */
        private int f32806b = 0;

        /* renamed from: d */
        private long f32808d = 0;

        /* renamed from: f */
        private String f32810f = "";

        /* renamed from: h */
        private String f32812h = "";

        /* renamed from: j */
        private String f32814j = "";

        /* renamed from: l */
        private String f32816l = "";

        /* renamed from: n */
        private String f32818n = "";

        /* renamed from: p */
        private int f32820p = 1;

        /* renamed from: r */
        private int f32822r = 0;

        /* renamed from: t */
        private int f32824t = 0;

        /* renamed from: v */
        private String f32826v = "";

        /* renamed from: w */
        private int f32827w = -1;

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public int mo4533a() {
            if (this.f32827w < 0) {
                mo4526b();
            }
            return this.f32827w;
        }

        /* renamed from: a */
        public C10571a m4689a(int i) {
            this.f32805a = true;
            this.f32806b = i;
            return this;
        }

        /* renamed from: a */
        public C10571a m4688a(long j) {
            this.f32807c = true;
            this.f32808d = j;
            return this;
        }

        /* renamed from: a */
        public C10571a m4687a(String str) {
            this.f32809e = true;
            this.f32810f = str;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public void mo4529a(C3387c c3387c) {
            if (m4678e()) {
                c3387c.m27992a(1, m4681d());
            }
            if (m4674g()) {
                c3387c.m27974b(2, m4676f());
            }
            if (m4672i()) {
                c3387c.m27988a(3, m4673h());
            }
            if (m4670k()) {
                c3387c.m27988a(4, m4671j());
            }
            if (m4668m()) {
                c3387c.m27988a(5, m4669l());
            }
            if (m4666o()) {
                c3387c.m27988a(6, m4667n());
            }
            if (m4663r()) {
                c3387c.m27988a(7, m4664q());
            }
            if (m4662s()) {
                c3387c.m27992a(8, m4661t());
            }
            if (m4659v()) {
                c3387c.m27992a(9, m4660u());
            }
            if (m4657x()) {
                c3387c.m27992a(10, m4658w());
            }
            if (m4655z()) {
                c3387c.m27988a(11, m4656y());
            }
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public int mo4526b() {
            int i = 0;
            if (m4678e()) {
                i = 0 + C3387c.m27961c(1, m4681d());
            }
            if (m4674g()) {
                i += C3387c.m27955d(2, m4676f());
            }
            if (m4672i()) {
                i += C3387c.m27971b(3, m4673h());
            }
            if (m4670k()) {
                i += C3387c.m27971b(4, m4671j());
            }
            if (m4668m()) {
                i += C3387c.m27971b(5, m4669l());
            }
            if (m4666o()) {
                i += C3387c.m27971b(6, m4667n());
            }
            if (m4663r()) {
                i += C3387c.m27971b(7, m4664q());
            }
            if (m4662s()) {
                i += C3387c.m27961c(8, m4661t());
            }
            if (m4659v()) {
                i += C3387c.m27961c(9, m4660u());
            }
            if (m4657x()) {
                i += C3387c.m27961c(10, m4658w());
            }
            if (m4655z()) {
                i += C3387c.m27971b(11, m4656y());
            }
            this.f32827w = i;
            return i;
        }

        /* renamed from: b */
        public C10571a m4686b(int i) {
            this.f32819o = true;
            this.f32820p = i;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public C10571a mo4530a(C3386b c3386b) {
            while (true) {
                int m28021a = c3386b.m28021a();
                switch (m28021a) {
                    case 0:
                        break;
                    case 8:
                        m4689a(c3386b.m28009e());
                        break;
                    case 16:
                        m4688a(c3386b.m28011d());
                        break;
                    case 26:
                        m4687a(c3386b.m28005g());
                        break;
                    case 34:
                        m4684b(c3386b.m28005g());
                        break;
                    case 42:
                        m4682c(c3386b.m28005g());
                        break;
                    case 50:
                        m4679d(c3386b.m28005g());
                        break;
                    case 58:
                        m4677e(c3386b.m28005g());
                        break;
                    case 64:
                        m4686b(c3386b.m28009e());
                        break;
                    case 72:
                        m4683c(c3386b.m28009e());
                        break;
                    case 80:
                        m4680d(c3386b.m28009e());
                        break;
                    case 90:
                        m4675f(c3386b.m28005g());
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
        public C10571a m4684b(String str) {
            this.f32811g = true;
            this.f32812h = str;
            return this;
        }

        /* renamed from: c */
        public C10571a m4683c(int i) {
            this.f32821q = true;
            this.f32822r = i;
            return this;
        }

        /* renamed from: c */
        public C10571a m4682c(String str) {
            this.f32813i = true;
            this.f32814j = str;
            return this;
        }

        /* renamed from: d */
        public int m4681d() {
            return this.f32806b;
        }

        /* renamed from: d */
        public C10571a m4680d(int i) {
            this.f32823s = true;
            this.f32824t = i;
            return this;
        }

        /* renamed from: d */
        public C10571a m4679d(String str) {
            this.f32815k = true;
            this.f32816l = str;
            return this;
        }

        /* renamed from: e */
        public C10571a m4677e(String str) {
            this.f32817m = true;
            this.f32818n = str;
            return this;
        }

        /* renamed from: e */
        public boolean m4678e() {
            return this.f32805a;
        }

        /* renamed from: f */
        public long m4676f() {
            return this.f32808d;
        }

        /* renamed from: f */
        public C10571a m4675f(String str) {
            this.f32825u = true;
            this.f32826v = str;
            return this;
        }

        /* renamed from: g */
        public boolean m4674g() {
            return this.f32807c;
        }

        /* renamed from: h */
        public String m4673h() {
            return this.f32810f;
        }

        /* renamed from: i */
        public boolean m4672i() {
            return this.f32809e;
        }

        /* renamed from: j */
        public String m4671j() {
            return this.f32812h;
        }

        /* renamed from: k */
        public boolean m4670k() {
            return this.f32811g;
        }

        /* renamed from: l */
        public String m4669l() {
            return this.f32814j;
        }

        /* renamed from: m */
        public boolean m4668m() {
            return this.f32813i;
        }

        /* renamed from: n */
        public String m4667n() {
            return this.f32816l;
        }

        /* renamed from: o */
        public boolean m4666o() {
            return this.f32815k;
        }

        /* renamed from: p */
        public C10571a m4665p() {
            this.f32815k = false;
            this.f32816l = "";
            return this;
        }

        /* renamed from: q */
        public String m4664q() {
            return this.f32818n;
        }

        /* renamed from: r */
        public boolean m4663r() {
            return this.f32817m;
        }

        /* renamed from: s */
        public boolean m4662s() {
            return this.f32819o;
        }

        /* renamed from: t */
        public int m4661t() {
            return this.f32820p;
        }

        /* renamed from: u */
        public int m4660u() {
            return this.f32822r;
        }

        /* renamed from: v */
        public boolean m4659v() {
            return this.f32821q;
        }

        /* renamed from: w */
        public int m4658w() {
            return this.f32824t;
        }

        /* renamed from: x */
        public boolean m4657x() {
            return this.f32823s;
        }

        /* renamed from: y */
        public String m4656y() {
            return this.f32826v;
        }

        /* renamed from: z */
        public boolean m4655z() {
            return this.f32825u;
        }
    }

    /* renamed from: com.xiaomi.push.protobuf.b$b */
    /* loaded from: classes.dex */
    public static final class C10572b extends AbstractC3390e {

        /* renamed from: a */
        private boolean f32828a;

        /* renamed from: c */
        private boolean f32830c;

        /* renamed from: e */
        private boolean f32832e;

        /* renamed from: g */
        private boolean f32834g;

        /* renamed from: b */
        private boolean f32829b = false;

        /* renamed from: d */
        private int f32831d = 0;

        /* renamed from: f */
        private int f32833f = 0;

        /* renamed from: h */
        private int f32835h = 0;

        /* renamed from: i */
        private int f32836i = -1;

        /* renamed from: b */
        public static C10572b m4650b(byte[] bArr) {
            return (C10572b) new C10572b().a(bArr);
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public int mo4533a() {
            if (this.f32836i < 0) {
                mo4526b();
            }
            return this.f32836i;
        }

        /* renamed from: a */
        public C10572b m4654a(int i) {
            this.f32830c = true;
            this.f32831d = i;
            return this;
        }

        /* renamed from: a */
        public C10572b m4653a(boolean z) {
            this.f32828a = true;
            this.f32829b = z;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public void mo4529a(C3387c c3387c) {
            if (m4647e()) {
                c3387c.m27987a(1, m4648d());
            }
            if (m4645g()) {
                c3387c.m27992a(3, m4646f());
            }
            if (m4643i()) {
                c3387c.m27992a(4, m4644h());
            }
            if (m4641k()) {
                c3387c.m27992a(5, m4642j());
            }
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public int mo4526b() {
            int i = 0;
            if (m4647e()) {
                i = 0 + C3387c.m27970b(1, m4648d());
            }
            if (m4645g()) {
                i += C3387c.m27961c(3, m4646f());
            }
            if (m4643i()) {
                i += C3387c.m27961c(4, m4644h());
            }
            if (m4641k()) {
                i += C3387c.m27961c(5, m4642j());
            }
            this.f32836i = i;
            return i;
        }

        /* renamed from: b */
        public C10572b m4652b(int i) {
            this.f32832e = true;
            this.f32833f = i;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public C10572b mo4530a(C3386b c3386b) {
            while (true) {
                int m28021a = c3386b.m28021a();
                switch (m28021a) {
                    case 0:
                        break;
                    case 8:
                        m4653a(c3386b.m28007f());
                        break;
                    case 24:
                        m4654a(c3386b.m28009e());
                        break;
                    case 32:
                        m4652b(c3386b.m28009e());
                        break;
                    case 40:
                        m4649c(c3386b.m28009e());
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

        /* renamed from: c */
        public C10572b m4649c(int i) {
            this.f32834g = true;
            this.f32835h = i;
            return this;
        }

        /* renamed from: d */
        public boolean m4648d() {
            return this.f32829b;
        }

        /* renamed from: e */
        public boolean m4647e() {
            return this.f32828a;
        }

        /* renamed from: f */
        public int m4646f() {
            return this.f32831d;
        }

        /* renamed from: g */
        public boolean m4645g() {
            return this.f32830c;
        }

        /* renamed from: h */
        public int m4644h() {
            return this.f32833f;
        }

        /* renamed from: i */
        public boolean m4643i() {
            return this.f32832e;
        }

        /* renamed from: j */
        public int m4642j() {
            return this.f32835h;
        }

        /* renamed from: k */
        public boolean m4641k() {
            return this.f32834g;
        }
    }

    /* renamed from: com.xiaomi.push.protobuf.b$c */
    /* loaded from: classes2.dex */
    public static final class C10573c extends AbstractC3390e {

        /* renamed from: a */
        private boolean f32837a;

        /* renamed from: c */
        private boolean f32839c;

        /* renamed from: e */
        private boolean f32841e;

        /* renamed from: g */
        private boolean f32843g;

        /* renamed from: i */
        private boolean f32845i;

        /* renamed from: k */
        private boolean f32847k;

        /* renamed from: b */
        private String f32838b = "";

        /* renamed from: d */
        private String f32840d = "";

        /* renamed from: f */
        private String f32842f = "";

        /* renamed from: h */
        private String f32844h = "";

        /* renamed from: j */
        private String f32846j = "";

        /* renamed from: l */
        private String f32848l = "";

        /* renamed from: m */
        private int f32849m = -1;

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public int mo4533a() {
            if (this.f32849m < 0) {
                mo4526b();
            }
            return this.f32849m;
        }

        /* renamed from: a */
        public C10573c m4640a(String str) {
            this.f32837a = true;
            this.f32838b = str;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public void mo4529a(C3387c c3387c) {
            if (m4634e()) {
                c3387c.m27988a(1, m4636d());
            }
            if (m4630g()) {
                c3387c.m27988a(2, m4632f());
            }
            if (m4628i()) {
                c3387c.m27988a(3, m4629h());
            }
            if (m4626k()) {
                c3387c.m27988a(4, m4627j());
            }
            if (m4624m()) {
                c3387c.m27988a(5, m4625l());
            }
            if (m4622o()) {
                c3387c.m27988a(6, m4623n());
            }
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public int mo4526b() {
            int i = 0;
            if (m4634e()) {
                i = 0 + C3387c.m27971b(1, m4636d());
            }
            if (m4630g()) {
                i += C3387c.m27971b(2, m4632f());
            }
            if (m4628i()) {
                i += C3387c.m27971b(3, m4629h());
            }
            if (m4626k()) {
                i += C3387c.m27971b(4, m4627j());
            }
            if (m4624m()) {
                i += C3387c.m27971b(5, m4625l());
            }
            if (m4622o()) {
                i += C3387c.m27971b(6, m4623n());
            }
            this.f32849m = i;
            return i;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public C10573c mo4530a(C3386b c3386b) {
            while (true) {
                int m28021a = c3386b.m28021a();
                switch (m28021a) {
                    case 0:
                        break;
                    case 10:
                        m4640a(c3386b.m28005g());
                        break;
                    case 18:
                        m4638b(c3386b.m28005g());
                        break;
                    case 26:
                        m4637c(c3386b.m28005g());
                        break;
                    case 34:
                        m4635d(c3386b.m28005g());
                        break;
                    case 42:
                        m4633e(c3386b.m28005g());
                        break;
                    case 50:
                        m4631f(c3386b.m28005g());
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
        public C10573c m4638b(String str) {
            this.f32839c = true;
            this.f32840d = str;
            return this;
        }

        /* renamed from: c */
        public C10573c m4637c(String str) {
            this.f32841e = true;
            this.f32842f = str;
            return this;
        }

        /* renamed from: d */
        public C10573c m4635d(String str) {
            this.f32843g = true;
            this.f32844h = str;
            return this;
        }

        /* renamed from: d */
        public String m4636d() {
            return this.f32838b;
        }

        /* renamed from: e */
        public C10573c m4633e(String str) {
            this.f32845i = true;
            this.f32846j = str;
            return this;
        }

        /* renamed from: e */
        public boolean m4634e() {
            return this.f32837a;
        }

        /* renamed from: f */
        public C10573c m4631f(String str) {
            this.f32847k = true;
            this.f32848l = str;
            return this;
        }

        /* renamed from: f */
        public String m4632f() {
            return this.f32840d;
        }

        /* renamed from: g */
        public boolean m4630g() {
            return this.f32839c;
        }

        /* renamed from: h */
        public String m4629h() {
            return this.f32842f;
        }

        /* renamed from: i */
        public boolean m4628i() {
            return this.f32841e;
        }

        /* renamed from: j */
        public String m4627j() {
            return this.f32844h;
        }

        /* renamed from: k */
        public boolean m4626k() {
            return this.f32843g;
        }

        /* renamed from: l */
        public String m4625l() {
            return this.f32846j;
        }

        /* renamed from: m */
        public boolean m4624m() {
            return this.f32845i;
        }

        /* renamed from: n */
        public String m4623n() {
            return this.f32848l;
        }

        /* renamed from: o */
        public boolean m4622o() {
            return this.f32847k;
        }
    }

    /* renamed from: com.xiaomi.push.protobuf.b$d */
    /* loaded from: classes.dex */
    public static final class C10574d extends AbstractC3390e {

        /* renamed from: a */
        private boolean f32850a;

        /* renamed from: c */
        private boolean f32852c;

        /* renamed from: e */
        private boolean f32854e;

        /* renamed from: g */
        private boolean f32856g;

        /* renamed from: b */
        private boolean f32851b = false;

        /* renamed from: d */
        private String f32853d = "";

        /* renamed from: f */
        private String f32855f = "";

        /* renamed from: h */
        private String f32857h = "";

        /* renamed from: i */
        private int f32858i = -1;

        /* renamed from: b */
        public static C10574d m4617b(byte[] bArr) {
            return (C10574d) new C10574d().a(bArr);
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public int mo4533a() {
            if (this.f32858i < 0) {
                mo4526b();
            }
            return this.f32858i;
        }

        /* renamed from: a */
        public C10574d m4621a(String str) {
            this.f32852c = true;
            this.f32853d = str;
            return this;
        }

        /* renamed from: a */
        public C10574d m4620a(boolean z) {
            this.f32850a = true;
            this.f32851b = z;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public void mo4529a(C3387c c3387c) {
            if (m4614e()) {
                c3387c.m27987a(1, m4615d());
            }
            if (m4612g()) {
                c3387c.m27988a(2, m4613f());
            }
            if (m4610i()) {
                c3387c.m27988a(3, m4611h());
            }
            if (m4608k()) {
                c3387c.m27988a(4, m4609j());
            }
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public int mo4526b() {
            int i = 0;
            if (m4614e()) {
                i = 0 + C3387c.m27970b(1, m4615d());
            }
            if (m4612g()) {
                i += C3387c.m27971b(2, m4613f());
            }
            if (m4610i()) {
                i += C3387c.m27971b(3, m4611h());
            }
            if (m4608k()) {
                i += C3387c.m27971b(4, m4609j());
            }
            this.f32858i = i;
            return i;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public C10574d mo4530a(C3386b c3386b) {
            while (true) {
                int m28021a = c3386b.m28021a();
                switch (m28021a) {
                    case 0:
                        break;
                    case 8:
                        m4620a(c3386b.m28007f());
                        break;
                    case 18:
                        m4621a(c3386b.m28005g());
                        break;
                    case 26:
                        m4618b(c3386b.m28005g());
                        break;
                    case 34:
                        m4616c(c3386b.m28005g());
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
        public C10574d m4618b(String str) {
            this.f32854e = true;
            this.f32855f = str;
            return this;
        }

        /* renamed from: c */
        public C10574d m4616c(String str) {
            this.f32856g = true;
            this.f32857h = str;
            return this;
        }

        /* renamed from: d */
        public boolean m4615d() {
            return this.f32851b;
        }

        /* renamed from: e */
        public boolean m4614e() {
            return this.f32850a;
        }

        /* renamed from: f */
        public String m4613f() {
            return this.f32853d;
        }

        /* renamed from: g */
        public boolean m4612g() {
            return this.f32852c;
        }

        /* renamed from: h */
        public String m4611h() {
            return this.f32855f;
        }

        /* renamed from: i */
        public boolean m4610i() {
            return this.f32854e;
        }

        /* renamed from: j */
        public String m4609j() {
            return this.f32857h;
        }

        /* renamed from: k */
        public boolean m4608k() {
            return this.f32856g;
        }
    }

    /* renamed from: com.xiaomi.push.protobuf.b$e */
    /* loaded from: classes2.dex */
    public static final class C10575e extends AbstractC3390e {

        /* renamed from: a */
        private boolean f32859a;

        /* renamed from: c */
        private boolean f32861c;

        /* renamed from: e */
        private boolean f32863e;

        /* renamed from: g */
        private boolean f32865g;

        /* renamed from: i */
        private boolean f32867i;

        /* renamed from: k */
        private boolean f32869k;

        /* renamed from: m */
        private boolean f32871m;

        /* renamed from: o */
        private boolean f32873o;

        /* renamed from: q */
        private boolean f32875q;

        /* renamed from: s */
        private boolean f32877s;

        /* renamed from: b */
        private int f32860b = 0;

        /* renamed from: d */
        private String f32862d = "";

        /* renamed from: f */
        private String f32864f = "";

        /* renamed from: h */
        private String f32866h = "";

        /* renamed from: j */
        private int f32868j = 0;

        /* renamed from: l */
        private String f32870l = "";

        /* renamed from: n */
        private String f32872n = "";

        /* renamed from: p */
        private String f32874p = "";

        /* renamed from: r */
        private C10572b f32876r = null;

        /* renamed from: t */
        private int f32878t = 0;

        /* renamed from: u */
        private int f32879u = -1;

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public int mo4533a() {
            if (this.f32879u < 0) {
                mo4526b();
            }
            return this.f32879u;
        }

        /* renamed from: a */
        public C10575e m4607a(int i) {
            this.f32859a = true;
            this.f32860b = i;
            return this;
        }

        /* renamed from: a */
        public C10575e m4606a(C10572b c10572b) {
            if (c10572b == null) {
                throw new NullPointerException();
            }
            this.f32875q = true;
            this.f32876r = c10572b;
            return this;
        }

        /* renamed from: a */
        public C10575e m4605a(String str) {
            this.f32861c = true;
            this.f32862d = str;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public void mo4529a(C3387c c3387c) {
            if (m4597e()) {
                c3387c.m27975b(1, m4599d());
            }
            if (m4593g()) {
                c3387c.m27988a(2, m4595f());
            }
            if (m4591i()) {
                c3387c.m27988a(3, m4592h());
            }
            if (m4589k()) {
                c3387c.m27988a(4, m4590j());
            }
            if (m4587m()) {
                c3387c.m27992a(5, m4588l());
            }
            if (m4585o()) {
                c3387c.m27988a(6, m4586n());
            }
            if (m4583q()) {
                c3387c.m27988a(7, m4584p());
            }
            if (m4581s()) {
                c3387c.m27988a(8, m4582r());
            }
            if (m4580t()) {
                c3387c.m27989a(9, m4579u());
            }
            if (m4577w()) {
                c3387c.m27992a(10, m4578v());
            }
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public int mo4526b() {
            int i = 0;
            if (m4597e()) {
                i = 0 + C3387c.m27956d(1, m4599d());
            }
            if (m4593g()) {
                i += C3387c.m27971b(2, m4595f());
            }
            if (m4591i()) {
                i += C3387c.m27971b(3, m4592h());
            }
            if (m4589k()) {
                i += C3387c.m27971b(4, m4590j());
            }
            if (m4587m()) {
                i += C3387c.m27961c(5, m4588l());
            }
            if (m4585o()) {
                i += C3387c.m27971b(6, m4586n());
            }
            if (m4583q()) {
                i += C3387c.m27971b(7, m4584p());
            }
            if (m4581s()) {
                i += C3387c.m27971b(8, m4582r());
            }
            if (m4580t()) {
                i += C3387c.m27972b(9, m4579u());
            }
            if (m4577w()) {
                i += C3387c.m27961c(10, m4578v());
            }
            this.f32879u = i;
            return i;
        }

        /* renamed from: b */
        public C10575e m4604b(int i) {
            this.f32867i = true;
            this.f32868j = i;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public C10575e mo4530a(C3386b c3386b) {
            while (true) {
                int m28021a = c3386b.m28021a();
                switch (m28021a) {
                    case 0:
                        break;
                    case 8:
                        m4607a(c3386b.m28003i());
                        break;
                    case 18:
                        m4605a(c3386b.m28005g());
                        break;
                    case 26:
                        m4602b(c3386b.m28005g());
                        break;
                    case 34:
                        m4600c(c3386b.m28005g());
                        break;
                    case 40:
                        m4604b(c3386b.m28009e());
                        break;
                    case 50:
                        m4598d(c3386b.m28005g());
                        break;
                    case 58:
                        m4596e(c3386b.m28005g());
                        break;
                    case 66:
                        m4594f(c3386b.m28005g());
                        break;
                    case 74:
                        C10572b c10572b = new C10572b();
                        c3386b.m28019a(c10572b);
                        m4606a(c10572b);
                        break;
                    case 80:
                        m4601c(c3386b.m28009e());
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
        public C10575e m4602b(String str) {
            this.f32863e = true;
            this.f32864f = str;
            return this;
        }

        /* renamed from: c */
        public C10575e m4601c(int i) {
            this.f32877s = true;
            this.f32878t = i;
            return this;
        }

        /* renamed from: c */
        public C10575e m4600c(String str) {
            this.f32865g = true;
            this.f32866h = str;
            return this;
        }

        /* renamed from: d */
        public int m4599d() {
            return this.f32860b;
        }

        /* renamed from: d */
        public C10575e m4598d(String str) {
            this.f32869k = true;
            this.f32870l = str;
            return this;
        }

        /* renamed from: e */
        public C10575e m4596e(String str) {
            this.f32871m = true;
            this.f32872n = str;
            return this;
        }

        /* renamed from: e */
        public boolean m4597e() {
            return this.f32859a;
        }

        /* renamed from: f */
        public C10575e m4594f(String str) {
            this.f32873o = true;
            this.f32874p = str;
            return this;
        }

        /* renamed from: f */
        public String m4595f() {
            return this.f32862d;
        }

        /* renamed from: g */
        public boolean m4593g() {
            return this.f32861c;
        }

        /* renamed from: h */
        public String m4592h() {
            return this.f32864f;
        }

        /* renamed from: i */
        public boolean m4591i() {
            return this.f32863e;
        }

        /* renamed from: j */
        public String m4590j() {
            return this.f32866h;
        }

        /* renamed from: k */
        public boolean m4589k() {
            return this.f32865g;
        }

        /* renamed from: l */
        public int m4588l() {
            return this.f32868j;
        }

        /* renamed from: m */
        public boolean m4587m() {
            return this.f32867i;
        }

        /* renamed from: n */
        public String m4586n() {
            return this.f32870l;
        }

        /* renamed from: o */
        public boolean m4585o() {
            return this.f32869k;
        }

        /* renamed from: p */
        public String m4584p() {
            return this.f32872n;
        }

        /* renamed from: q */
        public boolean m4583q() {
            return this.f32871m;
        }

        /* renamed from: r */
        public String m4582r() {
            return this.f32874p;
        }

        /* renamed from: s */
        public boolean m4581s() {
            return this.f32873o;
        }

        /* renamed from: t */
        public boolean m4580t() {
            return this.f32875q;
        }

        /* renamed from: u */
        public C10572b m4579u() {
            return this.f32876r;
        }

        /* renamed from: v */
        public int m4578v() {
            return this.f32878t;
        }

        /* renamed from: w */
        public boolean m4577w() {
            return this.f32877s;
        }
    }

    /* renamed from: com.xiaomi.push.protobuf.b$f */
    /* loaded from: classes2.dex */
    public static final class C10576f extends AbstractC3390e {

        /* renamed from: a */
        private boolean f32880a;

        /* renamed from: c */
        private boolean f32882c;

        /* renamed from: e */
        private boolean f32884e;

        /* renamed from: b */
        private String f32881b = "";

        /* renamed from: d */
        private String f32883d = "";

        /* renamed from: f */
        private C10572b f32885f = null;

        /* renamed from: g */
        private int f32886g = -1;

        /* renamed from: b */
        public static C10576f m4572b(byte[] bArr) {
            return (C10576f) new C10576f().a(bArr);
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public int mo4533a() {
            if (this.f32886g < 0) {
                mo4526b();
            }
            return this.f32886g;
        }

        /* renamed from: a */
        public C10576f m4576a(C10572b c10572b) {
            if (c10572b == null) {
                throw new NullPointerException();
            }
            this.f32884e = true;
            this.f32885f = c10572b;
            return this;
        }

        /* renamed from: a */
        public C10576f m4575a(String str) {
            this.f32880a = true;
            this.f32881b = str;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public void mo4529a(C3387c c3387c) {
            if (m4570e()) {
                c3387c.m27988a(1, m4571d());
            }
            if (m4568g()) {
                c3387c.m27988a(2, m4569f());
            }
            if (m4567h()) {
                c3387c.m27989a(3, m4566i());
            }
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public int mo4526b() {
            int i = 0;
            if (m4570e()) {
                i = 0 + C3387c.m27971b(1, m4571d());
            }
            if (m4568g()) {
                i += C3387c.m27971b(2, m4569f());
            }
            if (m4567h()) {
                i += C3387c.m27972b(3, m4566i());
            }
            this.f32886g = i;
            return i;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public C10576f mo4530a(C3386b c3386b) {
            while (true) {
                int m28021a = c3386b.m28021a();
                switch (m28021a) {
                    case 0:
                        break;
                    case 10:
                        m4575a(c3386b.m28005g());
                        break;
                    case 18:
                        m4573b(c3386b.m28005g());
                        break;
                    case 26:
                        C10572b c10572b = new C10572b();
                        c3386b.m28019a(c10572b);
                        m4576a(c10572b);
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
        public C10576f m4573b(String str) {
            this.f32882c = true;
            this.f32883d = str;
            return this;
        }

        /* renamed from: d */
        public String m4571d() {
            return this.f32881b;
        }

        /* renamed from: e */
        public boolean m4570e() {
            return this.f32880a;
        }

        /* renamed from: f */
        public String m4569f() {
            return this.f32883d;
        }

        /* renamed from: g */
        public boolean m4568g() {
            return this.f32882c;
        }

        /* renamed from: h */
        public boolean m4567h() {
            return this.f32884e;
        }

        /* renamed from: i */
        public C10572b m4566i() {
            return this.f32885f;
        }
    }

    /* renamed from: com.xiaomi.push.protobuf.b$g */
    /* loaded from: classes.dex */
    public static final class C10577g extends AbstractC3390e {

        /* renamed from: a */
        private boolean f32887a;

        /* renamed from: c */
        private boolean f32889c;

        /* renamed from: e */
        private boolean f32891e;

        /* renamed from: b */
        private String f32888b = "";

        /* renamed from: d */
        private String f32890d = "";

        /* renamed from: f */
        private String f32892f = "";

        /* renamed from: g */
        private int f32893g = -1;

        /* renamed from: b */
        public static C10577g m4562b(byte[] bArr) {
            return (C10577g) new C10577g().a(bArr);
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public int mo4533a() {
            if (this.f32893g < 0) {
                mo4526b();
            }
            return this.f32893g;
        }

        /* renamed from: a */
        public C10577g m4565a(String str) {
            this.f32887a = true;
            this.f32888b = str;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public void mo4529a(C3387c c3387c) {
            if (m4559e()) {
                c3387c.m27988a(1, m4560d());
            }
            if (m4557g()) {
                c3387c.m27988a(2, m4558f());
            }
            if (m4555i()) {
                c3387c.m27988a(3, m4556h());
            }
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public int mo4526b() {
            int i = 0;
            if (m4559e()) {
                i = 0 + C3387c.m27971b(1, m4560d());
            }
            if (m4557g()) {
                i += C3387c.m27971b(2, m4558f());
            }
            if (m4555i()) {
                i += C3387c.m27971b(3, m4556h());
            }
            this.f32893g = i;
            return i;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public C10577g mo4530a(C3386b c3386b) {
            while (true) {
                int m28021a = c3386b.m28021a();
                switch (m28021a) {
                    case 0:
                        break;
                    case 10:
                        m4565a(c3386b.m28005g());
                        break;
                    case 18:
                        m4563b(c3386b.m28005g());
                        break;
                    case 26:
                        m4561c(c3386b.m28005g());
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
        public C10577g m4563b(String str) {
            this.f32889c = true;
            this.f32890d = str;
            return this;
        }

        /* renamed from: c */
        public C10577g m4561c(String str) {
            this.f32891e = true;
            this.f32892f = str;
            return this;
        }

        /* renamed from: d */
        public String m4560d() {
            return this.f32888b;
        }

        /* renamed from: e */
        public boolean m4559e() {
            return this.f32887a;
        }

        /* renamed from: f */
        public String m4558f() {
            return this.f32890d;
        }

        /* renamed from: g */
        public boolean m4557g() {
            return this.f32889c;
        }

        /* renamed from: h */
        public String m4556h() {
            return this.f32892f;
        }

        /* renamed from: i */
        public boolean m4555i() {
            return this.f32891e;
        }
    }

    /* renamed from: com.xiaomi.push.protobuf.b$h */
    /* loaded from: classes.dex */
    public static final class C10578h extends AbstractC3390e {

        /* renamed from: a */
        private boolean f32894a;

        /* renamed from: c */
        private boolean f32896c;

        /* renamed from: b */
        private int f32895b = 0;

        /* renamed from: d */
        private String f32897d = "";

        /* renamed from: e */
        private int f32898e = -1;

        /* renamed from: b */
        public static C10578h m4551b(byte[] bArr) {
            return (C10578h) new C10578h().a(bArr);
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public int mo4533a() {
            if (this.f32898e < 0) {
                mo4526b();
            }
            return this.f32898e;
        }

        /* renamed from: a */
        public C10578h m4554a(int i) {
            this.f32894a = true;
            this.f32895b = i;
            return this;
        }

        /* renamed from: a */
        public C10578h m4553a(String str) {
            this.f32896c = true;
            this.f32897d = str;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public void mo4529a(C3387c c3387c) {
            if (m4549e()) {
                c3387c.m27992a(1, m4550d());
            }
            if (m4547g()) {
                c3387c.m27988a(2, m4548f());
            }
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public int mo4526b() {
            int i = 0;
            if (m4549e()) {
                i = 0 + C3387c.m27961c(1, m4550d());
            }
            if (m4547g()) {
                i += C3387c.m27971b(2, m4548f());
            }
            this.f32898e = i;
            return i;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public C10578h mo4530a(C3386b c3386b) {
            while (true) {
                int m28021a = c3386b.m28021a();
                switch (m28021a) {
                    case 0:
                        break;
                    case 8:
                        m4554a(c3386b.m28009e());
                        break;
                    case 18:
                        m4553a(c3386b.m28005g());
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

        /* renamed from: d */
        public int m4550d() {
            return this.f32895b;
        }

        /* renamed from: e */
        public boolean m4549e() {
            return this.f32894a;
        }

        /* renamed from: f */
        public String m4548f() {
            return this.f32897d;
        }

        /* renamed from: g */
        public boolean m4547g() {
            return this.f32896c;
        }
    }

    /* renamed from: com.xiaomi.push.protobuf.b$i */
    /* loaded from: classes.dex */
    public static final class C10579i extends AbstractC3390e {

        /* renamed from: a */
        private boolean f32899a;

        /* renamed from: b */
        private C3385a f32900b = C3385a.f13604a;

        /* renamed from: c */
        private int f32901c = -1;

        /* renamed from: b */
        public static C10579i m4544b(byte[] bArr) {
            return (C10579i) new C10579i().a(bArr);
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public int mo4533a() {
            if (this.f32901c < 0) {
                mo4526b();
            }
            return this.f32901c;
        }

        /* renamed from: a */
        public C10579i m4546a(C3385a c3385a) {
            this.f32899a = true;
            this.f32900b = c3385a;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public void mo4529a(C3387c c3387c) {
            if (m4542e()) {
                c3387c.m27990a(1, m4543d());
            }
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public int mo4526b() {
            int i = 0;
            if (m4542e()) {
                i = 0 + C3387c.m27973b(1, m4543d());
            }
            this.f32901c = i;
            return i;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public C10579i mo4530a(C3386b c3386b) {
            while (true) {
                int m28021a = c3386b.m28021a();
                switch (m28021a) {
                    case 0:
                        break;
                    case 10:
                        m4546a(c3386b.m28004h());
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

        /* renamed from: d */
        public C3385a m4543d() {
            return this.f32900b;
        }

        /* renamed from: e */
        public boolean m4542e() {
            return this.f32899a;
        }
    }

    /* renamed from: com.xiaomi.push.protobuf.b$j */
    /* loaded from: classes.dex */
    public static final class C10580j extends AbstractC3390e {

        /* renamed from: a */
        private boolean f32902a;

        /* renamed from: c */
        private boolean f32904c;

        /* renamed from: b */
        private C3385a f32903b = C3385a.f13604a;

        /* renamed from: d */
        private C10572b f32905d = null;

        /* renamed from: e */
        private int f32906e = -1;

        /* renamed from: b */
        public static C10580j m4538b(byte[] bArr) {
            return (C10580j) new C10580j().a(bArr);
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public int mo4533a() {
            if (this.f32906e < 0) {
                mo4526b();
            }
            return this.f32906e;
        }

        /* renamed from: a */
        public C10580j m4541a(C3385a c3385a) {
            this.f32902a = true;
            this.f32903b = c3385a;
            return this;
        }

        /* renamed from: a */
        public C10580j m4540a(C10572b c10572b) {
            if (c10572b == null) {
                throw new NullPointerException();
            }
            this.f32904c = true;
            this.f32905d = c10572b;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public void mo4529a(C3387c c3387c) {
            if (m4536e()) {
                c3387c.m27990a(1, m4537d());
            }
            if (m4535f()) {
                c3387c.m27989a(2, m4534g());
            }
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public int mo4526b() {
            int i = 0;
            if (m4536e()) {
                i = 0 + C3387c.m27973b(1, m4537d());
            }
            if (m4535f()) {
                i += C3387c.m27972b(2, m4534g());
            }
            this.f32906e = i;
            return i;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public C10580j mo4530a(C3386b c3386b) {
            while (true) {
                int m28021a = c3386b.m28021a();
                switch (m28021a) {
                    case 0:
                        break;
                    case 10:
                        m4541a(c3386b.m28004h());
                        break;
                    case 18:
                        C10572b c10572b = new C10572b();
                        c3386b.m28019a(c10572b);
                        m4540a(c10572b);
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

        /* renamed from: d */
        public C3385a m4537d() {
            return this.f32903b;
        }

        /* renamed from: e */
        public boolean m4536e() {
            return this.f32902a;
        }

        /* renamed from: f */
        public boolean m4535f() {
            return this.f32904c;
        }

        /* renamed from: g */
        public C10572b m4534g() {
            return this.f32905d;
        }
    }

    /* renamed from: com.xiaomi.push.protobuf.b$k */
    /* loaded from: classes.dex */
    public static final class C10581k extends AbstractC3390e {

        /* renamed from: a */
        private boolean f32907a;

        /* renamed from: c */
        private boolean f32909c;

        /* renamed from: e */
        private boolean f32911e;

        /* renamed from: g */
        private boolean f32913g;

        /* renamed from: i */
        private boolean f32915i;

        /* renamed from: k */
        private boolean f32917k;

        /* renamed from: b */
        private String f32908b = "";

        /* renamed from: d */
        private String f32910d = "";

        /* renamed from: f */
        private long f32912f = 0;

        /* renamed from: h */
        private long f32914h = 0;

        /* renamed from: j */
        private boolean f32916j = false;

        /* renamed from: l */
        private int f32918l = 0;

        /* renamed from: m */
        private int f32919m = -1;

        /* renamed from: b */
        public static C10581k m4522b(byte[] bArr) {
            return (C10581k) new C10581k().a(bArr);
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public int mo4533a() {
            if (this.f32919m < 0) {
                mo4526b();
            }
            return this.f32919m;
        }

        /* renamed from: a */
        public C10581k m4532a(int i) {
            this.f32917k = true;
            this.f32918l = i;
            return this;
        }

        /* renamed from: a */
        public C10581k m4531a(long j) {
            this.f32911e = true;
            this.f32912f = j;
            return this;
        }

        /* renamed from: a */
        public C10581k m4528a(String str) {
            this.f32907a = true;
            this.f32908b = str;
            return this;
        }

        /* renamed from: a */
        public C10581k m4527a(boolean z) {
            this.f32915i = true;
            this.f32916j = z;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: a */
        public void mo4529a(C3387c c3387c) {
            if (m4520e()) {
                c3387c.m27988a(1, m4521d());
            }
            if (m4518g()) {
                c3387c.m27988a(2, m4519f());
            }
            if (m4516i()) {
                c3387c.m27991a(3, m4517h());
            }
            if (m4514k()) {
                c3387c.m27991a(4, m4515j());
            }
            if (m4512m()) {
                c3387c.m27987a(5, m4513l());
            }
            if (m4510o()) {
                c3387c.m27992a(6, m4511n());
            }
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public int mo4526b() {
            int i = 0;
            if (m4520e()) {
                i = 0 + C3387c.m27971b(1, m4521d());
            }
            if (m4518g()) {
                i += C3387c.m27971b(2, m4519f());
            }
            if (m4516i()) {
                i += C3387c.m27960c(3, m4517h());
            }
            if (m4514k()) {
                i += C3387c.m27960c(4, m4515j());
            }
            if (m4512m()) {
                i += C3387c.m27970b(5, m4513l());
            }
            if (m4510o()) {
                i += C3387c.m27961c(6, m4511n());
            }
            this.f32919m = i;
            return i;
        }

        /* renamed from: b */
        public C10581k m4525b(long j) {
            this.f32913g = true;
            this.f32914h = j;
            return this;
        }

        @Override // com.google.p222a.p223a.AbstractC3390e
        /* renamed from: b */
        public C10581k mo4530a(C3386b c3386b) {
            while (true) {
                int m28021a = c3386b.m28021a();
                switch (m28021a) {
                    case 0:
                        break;
                    case 10:
                        m4528a(c3386b.m28005g());
                        break;
                    case 18:
                        m4523b(c3386b.m28005g());
                        break;
                    case 24:
                        m4531a(c3386b.m28013c());
                        break;
                    case 32:
                        m4525b(c3386b.m28013c());
                        break;
                    case 40:
                        m4527a(c3386b.m28007f());
                        break;
                    case 48:
                        m4532a(c3386b.m28009e());
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
        public C10581k m4523b(String str) {
            this.f32909c = true;
            this.f32910d = str;
            return this;
        }

        /* renamed from: d */
        public String m4521d() {
            return this.f32908b;
        }

        /* renamed from: e */
        public boolean m4520e() {
            return this.f32907a;
        }

        /* renamed from: f */
        public String m4519f() {
            return this.f32910d;
        }

        /* renamed from: g */
        public boolean m4518g() {
            return this.f32909c;
        }

        /* renamed from: h */
        public long m4517h() {
            return this.f32912f;
        }

        /* renamed from: i */
        public boolean m4516i() {
            return this.f32911e;
        }

        /* renamed from: j */
        public long m4515j() {
            return this.f32914h;
        }

        /* renamed from: k */
        public boolean m4514k() {
            return this.f32913g;
        }

        /* renamed from: l */
        public boolean m4513l() {
            return this.f32916j;
        }

        /* renamed from: m */
        public boolean m4512m() {
            return this.f32915i;
        }

        /* renamed from: n */
        public int m4511n() {
            return this.f32918l;
        }

        /* renamed from: o */
        public boolean m4510o() {
            return this.f32917k;
        }
    }
}
