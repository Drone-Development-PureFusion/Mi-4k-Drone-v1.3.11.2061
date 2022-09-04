package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import com.google.android.gms.awareness.AbstractC4093e;
import com.google.android.gms.awareness.snapshot.AbstractC4105a;
import com.google.android.gms.awareness.snapshot.AbstractC4106b;
import com.google.android.gms.awareness.snapshot.AbstractC4107c;
import com.google.android.gms.awareness.snapshot.AbstractC4108d;
import com.google.android.gms.awareness.snapshot.AbstractC4109e;
import com.google.android.gms.awareness.snapshot.AbstractC4110f;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.awareness.state.AbstractC4141a;
import com.google.android.gms.awareness.state.AbstractC4143b;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.contextmanager.internal.C4758c;
import com.google.android.gms.contextmanager.internal.C4764d;
import com.google.android.gms.games.C5375d;
import com.google.android.gms.internal.AbstractC7710su;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.places.AbstractC8243g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.google.android.gms.awareness.snapshot.internal.j */
/* loaded from: classes2.dex */
public class C4120j implements AbstractC4093e {
    /* renamed from: a */
    private AbstractC4494i<AbstractC4105a> m25395a(AbstractC4489g abstractC4489g, ArrayList<BeaconStateImpl.TypeFilterImpl> arrayList) {
        return new AbstractC7710su<AbstractC4105a, AbstractC4137m>(abstractC4489g.mo17255a((AbstractC4489g) m25396a(abstractC4489g, C5375d.f19453c, arrayList))) { // from class: com.google.android.gms.awareness.snapshot.internal.j.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.AbstractC7710su
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public AbstractC4105a mo13674a(final AbstractC4137m abstractC4137m) {
                return new AbstractC4105a() { // from class: com.google.android.gms.awareness.snapshot.internal.j.6.1
                    @Override // com.google.android.gms.common.api.AbstractC4502m
                    /* renamed from: a */
                    public Status mo7645a() {
                        return abstractC4137m.a();
                    }

                    @Override // com.google.android.gms.awareness.snapshot.AbstractC4105a
                    /* renamed from: b */
                    public BeaconState mo25375b() {
                        if (abstractC4137m.mo22801b() == null) {
                            return null;
                        }
                        return abstractC4137m.mo22801b().m25441b();
                    }
                };
            }
        };
    }

    /* renamed from: a */
    private static C4758c.AbstractC4761b m25397a(AbstractC4489g abstractC4489g, final int i) {
        return new C4758c.AbstractC4761b(abstractC4489g) { // from class: com.google.android.gms.awareness.snapshot.internal.j.7
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4764d c4764d) {
                c4764d.m22811a(this, new SnapshotRequest(i, null));
            }
        };
    }

    /* renamed from: a */
    private static C4758c.AbstractC4761b m25396a(AbstractC4489g abstractC4489g, final int i, final ArrayList<BeaconStateImpl.TypeFilterImpl> arrayList) {
        return new C4758c.AbstractC4761b(abstractC4489g) { // from class: com.google.android.gms.awareness.snapshot.internal.j.8
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4764d c4764d) {
                c4764d.m22811a(this, new SnapshotRequest(i, arrayList));
            }
        };
    }

    /* renamed from: a */
    private static ArrayList<BeaconStateImpl.TypeFilterImpl> m25392a(Collection<BeaconState.TypeFilter> collection) {
        C4588d.m23626a(collection, "beaconTypes cannot be null");
        C4588d.m23618b(collection.size() > 0, "beaconTypes must not be empty");
        ArrayList<BeaconStateImpl.TypeFilterImpl> arrayList = new ArrayList<>();
        Iterator<BeaconState.TypeFilter> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add((BeaconStateImpl.TypeFilterImpl) it2.next());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static ArrayList<BeaconStateImpl.TypeFilterImpl> m25391a(BeaconState.TypeFilter... typeFilterArr) {
        C4588d.m23626a(typeFilterArr, "beaconTypes cannot be null");
        C4588d.m23618b(typeFilterArr.length > 0, "beaconTypes must not be empty");
        ArrayList<BeaconStateImpl.TypeFilterImpl> arrayList = new ArrayList<>();
        for (BeaconState.TypeFilter typeFilter : typeFilterArr) {
            arrayList.add((BeaconStateImpl.TypeFilterImpl) typeFilter);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.awareness.AbstractC4093e
    /* renamed from: a */
    public AbstractC4494i<AbstractC4106b> mo25398a(AbstractC4489g abstractC4489g) {
        return new AbstractC7710su<AbstractC4106b, AbstractC4137m>(abstractC4489g.mo17255a((AbstractC4489g) m25397a(abstractC4489g, (int) C5375d.f19452b))) { // from class: com.google.android.gms.awareness.snapshot.internal.j.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.AbstractC7710su
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public AbstractC4106b mo13674a(final AbstractC4137m abstractC4137m) {
                return new AbstractC4106b() { // from class: com.google.android.gms.awareness.snapshot.internal.j.1.1
                    @Override // com.google.android.gms.common.api.AbstractC4502m
                    /* renamed from: a */
                    public Status mo7645a() {
                        return abstractC4137m.a();
                    }

                    @Override // com.google.android.gms.awareness.snapshot.AbstractC4106b
                    /* renamed from: b */
                    public ActivityRecognitionResult mo25385b() {
                        if (abstractC4137m.mo22801b() == null) {
                            return null;
                        }
                        return abstractC4137m.mo22801b().m25442a();
                    }
                };
            }
        };
    }

    @Override // com.google.android.gms.awareness.AbstractC4093e
    /* renamed from: a */
    public AbstractC4494i<AbstractC4105a> mo25394a(AbstractC4489g abstractC4489g, Collection<BeaconState.TypeFilter> collection) {
        return m25395a(abstractC4489g, m25392a(collection));
    }

    @Override // com.google.android.gms.awareness.AbstractC4093e
    /* renamed from: a */
    public AbstractC4494i<AbstractC4105a> mo25393a(AbstractC4489g abstractC4489g, BeaconState.TypeFilter... typeFilterArr) {
        return m25395a(abstractC4489g, m25391a(typeFilterArr));
    }

    @Override // com.google.android.gms.awareness.AbstractC4093e
    /* renamed from: b */
    public AbstractC4494i<AbstractC4107c> mo25390b(AbstractC4489g abstractC4489g) {
        return new AbstractC7710su<AbstractC4107c, AbstractC4137m>(abstractC4489g.mo17255a((AbstractC4489g) m25397a(abstractC4489g, (int) C5375d.f19454d))) { // from class: com.google.android.gms.awareness.snapshot.internal.j.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.AbstractC7710su
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public AbstractC4107c mo13674a(final AbstractC4137m abstractC4137m) {
                return new AbstractC4107c() { // from class: com.google.android.gms.awareness.snapshot.internal.j.2.1
                    @Override // com.google.android.gms.common.api.AbstractC4502m
                    /* renamed from: a */
                    public Status mo7645a() {
                        return abstractC4137m.a();
                    }

                    @Override // com.google.android.gms.awareness.snapshot.AbstractC4107c
                    /* renamed from: b */
                    public AbstractC4141a mo25383b() {
                        if (abstractC4137m.mo22801b() == null) {
                            return null;
                        }
                        return abstractC4137m.mo22801b().m25440c();
                    }
                };
            }
        };
    }

    @Override // com.google.android.gms.awareness.AbstractC4093e
    /* renamed from: c */
    public AbstractC4494i<AbstractC4108d> mo25389c(AbstractC4489g abstractC4489g) {
        return new AbstractC7710su<AbstractC4108d, AbstractC4137m>(abstractC4489g.mo17255a((AbstractC4489g) m25397a(abstractC4489g, (int) C5375d.f19455e))) { // from class: com.google.android.gms.awareness.snapshot.internal.j.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.AbstractC7710su
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public AbstractC4108d mo13674a(final AbstractC4137m abstractC4137m) {
                return new AbstractC4108d() { // from class: com.google.android.gms.awareness.snapshot.internal.j.3.1
                    @Override // com.google.android.gms.common.api.AbstractC4502m
                    /* renamed from: a */
                    public Status mo7645a() {
                        return abstractC4137m.a();
                    }

                    @Override // com.google.android.gms.awareness.snapshot.AbstractC4108d
                    /* renamed from: b */
                    public Location mo25381b() {
                        if (abstractC4137m.mo22801b() == null) {
                            return null;
                        }
                        return abstractC4137m.mo22801b().m25439d();
                    }
                };
            }
        };
    }

    @Override // com.google.android.gms.awareness.AbstractC4093e
    /* renamed from: d */
    public AbstractC4494i<AbstractC4109e> mo25388d(AbstractC4489g abstractC4489g) {
        return new AbstractC7710su<AbstractC4109e, AbstractC4137m>(abstractC4489g.mo17255a((AbstractC4489g) m25397a(abstractC4489g, (int) C5375d.f19456f))) { // from class: com.google.android.gms.awareness.snapshot.internal.j.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.AbstractC7710su
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public AbstractC4109e mo13674a(final AbstractC4137m abstractC4137m) {
                return new AbstractC4109e() { // from class: com.google.android.gms.awareness.snapshot.internal.j.4.1

                    /* renamed from: c */
                    private boolean f15698c = false;

                    /* renamed from: d */
                    private List<AbstractC8243g> f15699d = null;

                    @Override // com.google.android.gms.common.api.AbstractC4502m
                    /* renamed from: a */
                    public Status mo7645a() {
                        return abstractC4137m.a();
                    }

                    @Override // com.google.android.gms.awareness.snapshot.AbstractC4109e
                    /* renamed from: b */
                    public List<AbstractC8243g> mo25379b() {
                        DataHolder m25437f;
                        if (this.f15698c) {
                            return this.f15699d;
                        }
                        this.f15698c = true;
                        if (abstractC4137m.mo22801b() == null || (m25437f = abstractC4137m.mo22801b().m25437f()) == null) {
                            return null;
                        }
                        C4116f c4116f = new C4116f(m25437f);
                        try {
                            if (c4116f.c() <= 0) {
                                return null;
                            }
                            this.f15699d = ((PlacesData) ((SafeParcelable) c4116f.mo9715a(0))).m25451a();
                            return this.f15699d;
                        } finally {
                            c4116f.b();
                        }
                    }
                };
            }
        };
    }

    @Override // com.google.android.gms.awareness.AbstractC4093e
    /* renamed from: e */
    public AbstractC4494i<AbstractC4110f> mo25387e(AbstractC4489g abstractC4489g) {
        return new AbstractC7710su<AbstractC4110f, AbstractC4137m>(abstractC4489g.mo17255a((AbstractC4489g) m25397a(abstractC4489g, (int) C5375d.f19457g))) { // from class: com.google.android.gms.awareness.snapshot.internal.j.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.AbstractC7710su
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public AbstractC4110f mo13674a(final AbstractC4137m abstractC4137m) {
                return new AbstractC4110f() { // from class: com.google.android.gms.awareness.snapshot.internal.j.5.1
                    @Override // com.google.android.gms.common.api.AbstractC4502m
                    /* renamed from: a */
                    public Status mo7645a() {
                        return abstractC4137m.a();
                    }

                    @Override // com.google.android.gms.awareness.snapshot.AbstractC4110f
                    /* renamed from: b */
                    public AbstractC4143b mo25377b() {
                        if (abstractC4137m.mo22801b() == null) {
                            return null;
                        }
                        return abstractC4137m.mo22801b().m25434i();
                    }
                };
            }
        };
    }
}
