package com.google.android.gms.games.internal.p241a;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.C5355c;
import com.google.android.gms.games.internal.C5670d;
import com.google.android.gms.games.request.AbstractC6000f;
import com.google.android.gms.games.request.AbstractC6001g;
import com.google.android.gms.games.request.C5995a;
import com.google.android.gms.games.request.GameRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* renamed from: com.google.android.gms.games.internal.a.l */
/* loaded from: classes2.dex */
public final class C5533l implements AbstractC6001g {

    /* renamed from: com.google.android.gms.games.internal.a.l$4 */
    /* loaded from: classes2.dex */
    class C55374 extends AbstractC5546c {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20156a(this, (String) null, (String[]) null, 0, (byte[]) null, 0);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.l$5 */
    /* loaded from: classes2.dex */
    class C55385 extends AbstractC5546c {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20156a(this, (String) null, (String[]) null, 0, (byte[]) null, 0);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.l$6 */
    /* loaded from: classes2.dex */
    class C55396 extends AbstractC5548d {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20162a(this, (String) null, (String) null, (String[]) null);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.l$7 */
    /* loaded from: classes2.dex */
    class C55407 extends AbstractC5544b {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20169a(this, (String) null, (String) null, 0, 0, 0);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.l$8 */
    /* loaded from: classes2.dex */
    class C55418 extends AbstractC5542a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20077g(this, null, 0);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.l$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5542a extends C5355c.AbstractC5363a<AbstractC6001g.AbstractC6002a> {
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC6001g.AbstractC6002a mo7807b(final Status status) {
            return new AbstractC6001g.AbstractC6002a() { // from class: com.google.android.gms.games.internal.a.l.a.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.l$b */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5544b extends C5355c.AbstractC5363a<AbstractC6001g.AbstractC6003b> {
        private AbstractC5544b(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC6001g.AbstractC6003b mo7807b(final Status status) {
            return new AbstractC6001g.AbstractC6003b() { // from class: com.google.android.gms.games.internal.a.l.b.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.games.request.AbstractC6001g.AbstractC6003b
                /* renamed from: a */
                public C5995a mo19152a(int i) {
                    return new C5995a(DataHolder.m23889b(status.m24015i()));
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.l$c */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5546c extends C5355c.AbstractC5363a<AbstractC6001g.AbstractC6004c> {
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC6001g.AbstractC6004c mo7807b(final Status status) {
            return new AbstractC6001g.AbstractC6004c() { // from class: com.google.android.gms.games.internal.a.l.c.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.l$d */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5548d extends C5355c.AbstractC5363a<AbstractC6001g.AbstractC6005d> {
        private AbstractC5548d(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC6001g.AbstractC6005d mo7807b(final Status status) {
            return new AbstractC6001g.AbstractC6005d() { // from class: com.google.android.gms.games.internal.a.l.d.1
                @Override // com.google.android.gms.games.request.AbstractC6001g.AbstractC6005d
                /* renamed from: a */
                public int mo19151a(String str) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown request ID ".concat(valueOf) : new String("Unknown request ID "));
                }

                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }

                @Override // com.google.android.gms.games.request.AbstractC6001g.AbstractC6005d
                /* renamed from: c */
                public Set<String> mo19150c() {
                    return null;
                }
            };
        }
    }

    @Override // com.google.android.gms.games.request.AbstractC6001g
    /* renamed from: a */
    public Intent mo19161a(AbstractC4489g abstractC4489g, int i, byte[] bArr, int i2, Bitmap bitmap, String str) {
        return C5355c.m20511a(abstractC4489g).m20204a(i, bArr, i2, bitmap, str);
    }

    @Override // com.google.android.gms.games.request.AbstractC6001g
    /* renamed from: a */
    public AbstractC4494i<AbstractC6001g.AbstractC6003b> mo19162a(AbstractC4489g abstractC4489g, final int i, final int i2, final int i3) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5544b(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.l.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20186a(this, i, i2, i3);
            }
        });
    }

    @Override // com.google.android.gms.games.request.AbstractC6001g
    /* renamed from: a */
    public AbstractC4494i<AbstractC6001g.AbstractC6005d> mo19159a(AbstractC4489g abstractC4489g, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return mo19158a(abstractC4489g, arrayList);
    }

    @Override // com.google.android.gms.games.request.AbstractC6001g
    /* renamed from: a */
    public AbstractC4494i<AbstractC6001g.AbstractC6005d> mo19158a(AbstractC4489g abstractC4489g, List<String> list) {
        final String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5548d(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.l.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20119b(this, strArr);
            }
        });
    }

    @Override // com.google.android.gms.games.request.AbstractC6001g
    /* renamed from: a */
    public ArrayList<GameRequest> mo19165a(Intent intent) {
        return intent == null ? new ArrayList<>() : mo19164a(intent.getExtras());
    }

    @Override // com.google.android.gms.games.request.AbstractC6001g
    /* renamed from: a */
    public ArrayList<GameRequest> mo19164a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey(AbstractC6001g.f20355j)) {
            return new ArrayList<>();
        }
        ArrayList arrayList = (ArrayList) bundle.get(AbstractC6001g.f20355j);
        ArrayList<GameRequest> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add((GameRequest) arrayList.get(i));
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.games.request.AbstractC6001g
    /* renamed from: a */
    public void mo19163a(AbstractC4489g abstractC4489g) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20043r();
        }
    }

    @Override // com.google.android.gms.games.request.AbstractC6001g
    /* renamed from: a */
    public void mo19160a(AbstractC4489g abstractC4489g, AbstractC6000f abstractC6000f) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20092d(abstractC4489g.mo17373a((AbstractC4489g) abstractC6000f));
        }
    }

    @Override // com.google.android.gms.games.request.AbstractC6001g
    /* renamed from: b */
    public Intent mo19157b(AbstractC4489g abstractC4489g) {
        return C5355c.m20511a(abstractC4489g).m20215O();
    }

    @Override // com.google.android.gms.games.request.AbstractC6001g
    /* renamed from: b */
    public AbstractC4494i<AbstractC6001g.AbstractC6005d> mo19156b(AbstractC4489g abstractC4489g, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return mo19155b(abstractC4489g, arrayList);
    }

    @Override // com.google.android.gms.games.request.AbstractC6001g
    /* renamed from: b */
    public AbstractC4494i<AbstractC6001g.AbstractC6005d> mo19155b(AbstractC4489g abstractC4489g, List<String> list) {
        final String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5548d(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.l.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20104c(this, strArr);
            }
        });
    }

    @Override // com.google.android.gms.games.request.AbstractC6001g
    /* renamed from: c */
    public int mo19154c(AbstractC4489g abstractC4489g) {
        return C5355c.m20511a(abstractC4489g).m20214P();
    }

    @Override // com.google.android.gms.games.request.AbstractC6001g
    /* renamed from: d */
    public int mo19153d(AbstractC4489g abstractC4489g) {
        return C5355c.m20511a(abstractC4489g).m20213Q();
    }
}
