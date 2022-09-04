package org.p286a.p287a.p306i.p308b;

import java.net.URI;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.p286a.p287a.p288a.AbstractC11009c;
@AbstractC11009c
/* renamed from: org.a.a.i.b.ad */
/* loaded from: classes2.dex */
public class C11175ad extends AbstractList<Object> {

    /* renamed from: a */
    private final Set<URI> f35979a = new HashSet();

    /* renamed from: b */
    private final List<URI> f35980b = new ArrayList();

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public URI get(int i) {
        return this.f35980b.get(i);
    }

    /* renamed from: a */
    public List<URI> m1794a() {
        return new ArrayList(this.f35980b);
    }

    /* renamed from: a */
    public boolean m1792a(URI uri) {
        return this.f35979a.contains(uri);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        this.f35980b.add(i, (URI) obj);
        this.f35979a.add((URI) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public URI remove(int i) {
        URI remove = this.f35980b.remove(i);
        this.f35979a.remove(remove);
        if (this.f35980b.size() != this.f35979a.size()) {
            this.f35979a.addAll(this.f35980b);
        }
        return remove;
    }

    /* renamed from: b */
    public void m1790b(URI uri) {
        this.f35979a.add(uri);
        this.f35980b.add(uri);
    }

    /* renamed from: c */
    public boolean m1789c(URI uri) {
        boolean remove = this.f35979a.remove(uri);
        if (remove) {
            Iterator<URI> it2 = this.f35980b.iterator();
            while (it2.hasNext()) {
                if (it2.next().equals(uri)) {
                    it2.remove();
                }
            }
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f35979a.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        URI uri = this.f35980b.set(i, (URI) obj);
        this.f35979a.remove(uri);
        this.f35979a.add((URI) obj);
        if (this.f35980b.size() != this.f35979a.size()) {
            this.f35979a.addAll(this.f35980b);
        }
        return uri;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f35980b.size();
    }
}
