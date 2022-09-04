package com.google.firebase.database.connection.idl;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.firebase_database.ModuleDescriptor;
import com.google.android.gms.internal.AbstractC7097hm;
import com.google.android.gms.internal.AbstractC7102hq;
import com.google.android.gms.internal.AbstractC7103hr;
import com.google.android.gms.internal.AbstractC7121hu;
import com.google.android.gms.internal.C7092hk;
import com.google.android.gms.internal.C7099hn;
import com.google.android.gms.internal.C7105hs;
import com.google.android.gms.internal.C7120ht;
import com.google.android.gms.internal.C7312kq;
import com.google.android.gms.internal.akb;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.firebase.database.connection.idl.AbstractC9847e;
import com.google.firebase.database.connection.idl.AbstractC9850f;
import com.google.firebase.database.connection.idl.AbstractC9856h;
import com.google.firebase.database.connection.idl.AbstractC9859i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
@DynamiteApi
/* loaded from: classes2.dex */
public class IPersistentConnectionImpl extends AbstractC9856h.AbstractBinderC9857a {

    /* renamed from: a */
    private AbstractC7103hr f30693a;

    /* renamed from: a */
    private static AbstractC7097hm m6841a(final AbstractC9847e abstractC9847e) {
        return new AbstractC7097hm() { // from class: com.google.firebase.database.connection.idl.IPersistentConnectionImpl.6
            @Override // com.google.android.gms.internal.AbstractC7097hm
            /* renamed from: a */
            public void mo6823a(boolean z, final AbstractC7097hm.AbstractC7098a abstractC7098a) {
                try {
                    AbstractC9847e.this.mo6792a(z, new AbstractC9850f.AbstractBinderC9851a() { // from class: com.google.firebase.database.connection.idl.IPersistentConnectionImpl.6.1
                        @Override // com.google.firebase.database.connection.idl.AbstractC9850f
                        /* renamed from: a */
                        public void mo6790a(String str) {
                            abstractC7098a.mo6825a(str);
                        }

                        @Override // com.google.firebase.database.connection.idl.AbstractC9850f
                        /* renamed from: b */
                        public void mo6789b(String str) {
                            abstractC7098a.mo6824b(str);
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }

    /* renamed from: a */
    private static AbstractC7103hr.AbstractC7104a m6840a(final AbstractC9859i abstractC9859i) {
        return new AbstractC7103hr.AbstractC7104a() { // from class: com.google.firebase.database.connection.idl.IPersistentConnectionImpl.4
            @Override // com.google.android.gms.internal.AbstractC7103hr.AbstractC7104a
            /* renamed from: a */
            public void mo6831a() {
                try {
                    AbstractC9859i.this.mo6783a();
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7103hr.AbstractC7104a
            /* renamed from: a */
            public void mo6830a(List<String> list, Object obj, boolean z, Long l) {
                try {
                    AbstractC9859i.this.mo6781a(list, BinderC4173f.m25293a(obj), z, IPersistentConnectionImpl.m6836b(l));
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7103hr.AbstractC7104a
            /* renamed from: a */
            public void mo6829a(List<String> list, List<C7120ht> list2, Long l) {
                ArrayList arrayList = new ArrayList(list2.size());
                ArrayList arrayList2 = new ArrayList(list2.size());
                for (C7120ht c7120ht : list2) {
                    arrayList.add(RangeParcelable.m6822a(c7120ht));
                    arrayList2.add(c7120ht.m15486c());
                }
                try {
                    AbstractC9859i.this.mo6780a(list, arrayList, BinderC4173f.m25293a(arrayList2), IPersistentConnectionImpl.m6836b(l));
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7103hr.AbstractC7104a
            /* renamed from: a */
            public void mo6828a(Map<String, Object> map) {
                try {
                    AbstractC9859i.this.mo6782a(BinderC4173f.m25293a(map));
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7103hr.AbstractC7104a
            /* renamed from: a */
            public void mo6827a(boolean z) {
                try {
                    AbstractC9859i.this.mo6779a(z);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7103hr.AbstractC7104a
            /* renamed from: b */
            public void mo6826b() {
                try {
                    AbstractC9859i.this.mo6778b();
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }

    /* renamed from: a */
    private static AbstractC7121hu m6839a(final AbstractC9862j abstractC9862j) {
        return new AbstractC7121hu() { // from class: com.google.firebase.database.connection.idl.IPersistentConnectionImpl.2
            @Override // com.google.android.gms.internal.AbstractC7121hu
            /* renamed from: a */
            public void mo6832a(String str, String str2) {
                try {
                    AbstractC9862j.this.mo6776a(str, str2);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }

    /* renamed from: a */
    private static AbstractC9847e m6843a(final AbstractC7097hm abstractC7097hm) {
        return new AbstractC9847e.AbstractBinderC9848a() { // from class: com.google.firebase.database.connection.idl.IPersistentConnectionImpl.5
            @Override // com.google.firebase.database.connection.idl.AbstractC9847e
            /* renamed from: a */
            public void mo6792a(boolean z, final AbstractC9850f abstractC9850f) {
                AbstractC7097hm.this.mo6823a(z, new AbstractC7097hm.AbstractC7098a() { // from class: com.google.firebase.database.connection.idl.IPersistentConnectionImpl.5.1
                    @Override // com.google.android.gms.internal.AbstractC7097hm.AbstractC7098a
                    /* renamed from: a */
                    public void mo6825a(String str) {
                        try {
                            abstractC9850f.mo6790a(str);
                        } catch (RemoteException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    @Override // com.google.android.gms.internal.AbstractC7097hm.AbstractC7098a
                    /* renamed from: b */
                    public void mo6824b(String str) {
                        try {
                            abstractC9850f.mo6789b(str);
                        } catch (RemoteException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
            }
        };
    }

    /* renamed from: a */
    private static AbstractC9859i m6842a(final AbstractC7103hr.AbstractC7104a abstractC7104a) {
        return new AbstractC9859i.AbstractBinderC9860a() { // from class: com.google.firebase.database.connection.idl.IPersistentConnectionImpl.3
            @Override // com.google.firebase.database.connection.idl.AbstractC9859i
            /* renamed from: a */
            public void mo6783a() {
                AbstractC7103hr.AbstractC7104a.this.mo6831a();
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9859i
            /* renamed from: a */
            public void mo6782a(AbstractC4170e abstractC4170e) {
                AbstractC7103hr.AbstractC7104a.this.mo6828a((Map) BinderC4173f.m25294a(abstractC4170e));
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9859i
            /* renamed from: a */
            public void mo6781a(List<String> list, AbstractC4170e abstractC4170e, boolean z, long j) {
                AbstractC7103hr.AbstractC7104a.this.mo6830a(list, BinderC4173f.m25294a(abstractC4170e), z, IPersistentConnectionImpl.m6837b(j));
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9859i
            /* renamed from: a */
            public void mo6780a(List<String> list, List<RangeParcelable> list2, AbstractC4170e abstractC4170e, long j) {
                List list3 = (List) BinderC4173f.m25294a(abstractC4170e);
                ArrayList arrayList = new ArrayList(list2.size());
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= list2.size()) {
                        AbstractC7103hr.AbstractC7104a.this.mo6829a(list, arrayList, IPersistentConnectionImpl.m6837b(j));
                        return;
                    } else {
                        arrayList.add(RangeParcelable.m6821a(list2.get(i2), list3.get(i2)));
                        i = i2 + 1;
                    }
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9859i
            /* renamed from: a */
            public void mo6779a(boolean z) {
                AbstractC7103hr.AbstractC7104a.this.mo6827a(z);
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9859i
            /* renamed from: b */
            public void mo6778b() {
                AbstractC7103hr.AbstractC7104a.this.mo6826b();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static long m6836b(Long l) {
        if (l != null) {
            if (l.longValue() != -1) {
                return l.longValue();
            }
            throw new IllegalArgumentException("Tag parameter clashed with NO_TAG value");
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static Long m6837b(long j) {
        if (j == -1) {
            return null;
        }
        return Long.valueOf(j);
    }

    public static AbstractC9856h loadDynamic(Context context, ConnectionConfig connectionConfig, AbstractC7097hm abstractC7097hm, ScheduledExecutorService scheduledExecutorService, AbstractC7103hr.AbstractC7104a abstractC7104a) {
        try {
            AbstractC9856h asInterface = AbstractC9856h.AbstractBinderC9857a.asInterface(akb.m17066a(context, akb.f22112d, ModuleDescriptor.MODULE_ID).m17062a("com.google.firebase.database.connection.idl.IPersistentConnectionImpl"));
            asInterface.setup(connectionConfig, m6843a(abstractC7097hm), BinderC4173f.m25293a(scheduledExecutorService), m6842a(abstractC7104a));
            return asInterface;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (akb.C6444a e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void compareAndPut(List<String> list, AbstractC4170e abstractC4170e, String str, AbstractC9862j abstractC9862j) {
        this.f30693a.mo6809a(list, BinderC4173f.m25294a(abstractC4170e), str, m6839a(abstractC9862j));
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void initialize() {
        this.f30693a.mo6814a();
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void interrupt(String str) {
        this.f30693a.mo6799d(str);
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public boolean isInterrupted(String str) {
        return this.f30693a.mo6797f(str);
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void listen(List<String> list, AbstractC4170e abstractC4170e, final AbstractC9853g abstractC9853g, long j, AbstractC9862j abstractC9862j) {
        Long m6837b = m6837b(j);
        AbstractC7102hq abstractC7102hq = new AbstractC7102hq() { // from class: com.google.firebase.database.connection.idl.IPersistentConnectionImpl.1
            @Override // com.google.android.gms.internal.AbstractC7102hq
            /* renamed from: a */
            public String mo6835a() {
                try {
                    return abstractC9853g.mo6787a();
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7102hq
            /* renamed from: b */
            public boolean mo6834b() {
                try {
                    return abstractC9853g.mo6786b();
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7102hq
            /* renamed from: c */
            public C7092hk mo6833c() {
                try {
                    return CompoundHashParcelable.m6849a(abstractC9853g.mo6785c());
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        this.f30693a.mo6807a(list, (Map) BinderC4173f.m25294a(abstractC4170e), abstractC7102hq, m6837b, m6839a(abstractC9862j));
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void merge(List<String> list, AbstractC4170e abstractC4170e, AbstractC9862j abstractC9862j) {
        this.f30693a.mo6806a(list, (Map) BinderC4173f.m25294a(abstractC4170e), m6839a(abstractC9862j));
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void onDisconnectCancel(List<String> list, AbstractC9862j abstractC9862j) {
        this.f30693a.mo6811a(list, m6839a(abstractC9862j));
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void onDisconnectMerge(List<String> list, AbstractC4170e abstractC4170e, AbstractC9862j abstractC9862j) {
        this.f30693a.mo6803b(list, (Map) BinderC4173f.m25294a(abstractC4170e), m6839a(abstractC9862j));
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void onDisconnectPut(List<String> list, AbstractC4170e abstractC4170e, AbstractC9862j abstractC9862j) {
        this.f30693a.mo6804b(list, BinderC4173f.m25294a(abstractC4170e), m6839a(abstractC9862j));
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void purgeOutstandingWrites() {
        this.f30693a.mo6800d();
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void put(List<String> list, AbstractC4170e abstractC4170e, AbstractC9862j abstractC9862j) {
        this.f30693a.mo6810a(list, BinderC4173f.m25294a(abstractC4170e), m6839a(abstractC9862j));
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void refreshAuthToken() {
        this.f30693a.mo6802c();
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void refreshAuthToken2(String str) {
        this.f30693a.mo6801c(str);
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void resume(String str) {
        this.f30693a.mo6798e(str);
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void setup(ConnectionConfig connectionConfig, AbstractC9847e abstractC9847e, AbstractC4170e abstractC4170e, AbstractC9859i abstractC9859i) {
        this.f30693a = new C7105hs(new C7099hn(new C7312kq(connectionConfig.m6848a(), connectionConfig.m6847b()), m6841a(abstractC9847e), (ScheduledExecutorService) BinderC4173f.m25294a(abstractC4170e), connectionConfig.f30685e, connectionConfig.f30686f, connectionConfig.f30687g), HostInfoParcelable.m6845a(connectionConfig.f30682b), m6840a(abstractC9859i));
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void shutdown() {
        this.f30693a.mo6805b();
    }

    @Override // com.google.firebase.database.connection.idl.AbstractC9856h
    public void unlisten(List<String> list, AbstractC4170e abstractC4170e) {
        this.f30693a.mo6808a(list, (Map) BinderC4173f.m25294a(abstractC4170e));
    }
}
