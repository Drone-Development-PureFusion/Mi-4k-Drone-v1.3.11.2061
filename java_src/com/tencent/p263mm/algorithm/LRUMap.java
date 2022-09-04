package com.tencent.p263mm.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.tencent.mm.algorithm.LRUMap */
/* loaded from: classes2.dex */
public class LRUMap<K, O> {

    /* renamed from: c */
    private Map<K, LRUMap<K, O>.TimeVal<O>> f31540c;

    /* renamed from: d */
    private int f31541d;

    /* renamed from: e */
    private int f31542e;

    /* renamed from: f */
    private PreRemoveCallback<K, O> f31543f;

    /* renamed from: com.tencent.mm.algorithm.LRUMap$OnClearListener */
    /* loaded from: classes2.dex */
    public interface OnClearListener<K, O> {
        void onClear(K k, O o);
    }

    /* renamed from: com.tencent.mm.algorithm.LRUMap$PreRemoveCallback */
    /* loaded from: classes2.dex */
    public interface PreRemoveCallback<K, O> {
        void preRemoveCallback(K k, O o);
    }

    /* renamed from: com.tencent.mm.algorithm.LRUMap$TimeVal */
    /* loaded from: classes2.dex */
    public class TimeVal<OO> {
        public OO obj;

        /* renamed from: t */
        public Long f31546t;

        public TimeVal(OO oo) {
            this.obj = oo;
            UpTime();
        }

        public void UpTime() {
            this.f31546t = Long.valueOf(System.currentTimeMillis());
        }
    }

    public LRUMap(int i) {
        this(i, null);
    }

    public LRUMap(int i, PreRemoveCallback<K, O> preRemoveCallback) {
        this.f31540c = null;
        this.f31543f = null;
        this.f31541d = i;
        this.f31542e = 0;
        this.f31543f = preRemoveCallback;
        this.f31540c = new HashMap();
    }

    public boolean check(K k) {
        return this.f31540c.containsKey(k);
    }

    public boolean checkAndUpTime(K k) {
        if (this.f31540c.containsKey(k)) {
            this.f31540c.get(k).UpTime();
            return true;
        }
        return false;
    }

    public void clear() {
        this.f31540c.clear();
    }

    public void clear(OnClearListener<K, O> onClearListener) {
        if (this.f31540c != null) {
            if (onClearListener != null) {
                for (Map.Entry<K, LRUMap<K, O>.TimeVal<O>> entry : this.f31540c.entrySet()) {
                    onClearListener.onClear(entry.getKey(), entry.getValue().obj);
                }
            }
            this.f31540c.clear();
        }
    }

    public O get(K k) {
        LRUMap<K, O>.TimeVal<O> timeVal = this.f31540c.get(k);
        if (timeVal == null) {
            return null;
        }
        return timeVal.obj;
    }

    public O getAndUptime(K k) {
        LRUMap<K, O>.TimeVal<O> timeVal = this.f31540c.get(k);
        if (timeVal == null) {
            return null;
        }
        this.f31540c.get(k).UpTime();
        return timeVal.obj;
    }

    public void remove(K k) {
        if (!this.f31540c.containsKey(k)) {
            return;
        }
        if (this.f31543f != null) {
            this.f31543f.preRemoveCallback(k, this.f31540c.get(k).obj);
        }
        this.f31540c.remove(k);
    }

    public void setMaxSize(int i) {
        if (i > 0) {
            this.f31541d = i;
        }
    }

    public void setPerDeleteSize(int i) {
        if (i > 0) {
            this.f31542e = i;
        }
    }

    public int size() {
        return this.f31540c.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void update(K k, O o) {
        int i;
        if (this.f31540c.get(k) != null) {
            this.f31540c.get(k).UpTime();
            this.f31540c.get(k).obj = o;
            return;
        }
        this.f31540c.put(k, new TimeVal<>(o));
        if (this.f31540c.size() <= this.f31541d) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f31540c.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<K, LRUMap<K, O>.TimeVal<O>>>() { // from class: com.tencent.mm.algorithm.LRUMap.1
            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return compare((Map.Entry) ((Map.Entry) obj), (Map.Entry) ((Map.Entry) obj2));
            }

            public int compare(Map.Entry<K, LRUMap<K, O>.TimeVal<O>> entry, Map.Entry<K, LRUMap<K, O>.TimeVal<O>> entry2) {
                return entry.getValue().f31546t.compareTo(entry2.getValue().f31546t);
            }
        });
        if (this.f31542e <= 0) {
            i = this.f31541d / 10;
            if (i <= 0) {
                i = 1;
            }
        } else {
            i = this.f31542e;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            int i2 = i;
            if (!it2.hasNext()) {
                return;
            }
            remove(((Map.Entry) it2.next()).getKey());
            i = i2 - 1;
            if (i <= 0) {
                return;
            }
        }
    }
}
