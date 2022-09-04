package com.p120c.p121a.p129b.p130a.p131a;

import java.util.Iterator;
import java.util.Queue;
/* renamed from: com.c.a.b.a.a.b */
/* loaded from: classes.dex */
public interface AbstractC1288b<E> extends Queue<E> {
    /* renamed from: a */
    void mo35944a(E e);

    @Override // java.util.Queue, java.util.Collection, java.util.concurrent.BlockingQueue
    boolean add(E e);

    /* renamed from: b */
    void mo35939b(E e);

    /* renamed from: c */
    E mo35937c();

    /* renamed from: c */
    boolean mo35935c(E e);

    @Override // java.util.Collection, java.util.concurrent.BlockingQueue
    boolean contains(Object obj);

    /* renamed from: d */
    E mo35934d();

    /* renamed from: d */
    boolean mo35933d(E e);

    /* renamed from: e */
    E mo35932e();

    @Override // java.util.Queue
    E element();

    /* renamed from: f */
    E mo35930f();

    /* renamed from: g */
    E mo35928g();

    /* renamed from: g */
    boolean mo35927g(Object obj);

    /* renamed from: h */
    E mo35926h();

    /* renamed from: h */
    boolean mo35925h(Object obj);

    /* renamed from: i */
    E mo35924i();

    /* renamed from: i */
    void mo35923i(E e);

    @Override // java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    /* renamed from: j */
    E mo35922j();

    /* renamed from: k */
    E mo35921k();

    /* renamed from: l */
    Iterator<E> mo35920l();

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    boolean offer(E e);

    @Override // java.util.Queue
    E peek();

    @Override // java.util.Queue
    E poll();

    @Override // java.util.Queue
    E remove();

    @Override // java.util.Collection, java.util.concurrent.BlockingQueue
    boolean remove(Object obj);

    @Override // java.util.Collection
    int size();
}
