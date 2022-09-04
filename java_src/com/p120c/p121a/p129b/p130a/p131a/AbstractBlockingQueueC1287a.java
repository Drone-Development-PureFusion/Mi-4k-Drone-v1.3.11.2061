package com.p120c.p121a.p129b.p130a.p131a;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
/* renamed from: com.c.a.b.a.a.a */
/* loaded from: classes.dex */
public interface AbstractBlockingQueueC1287a<E> extends AbstractC1288b<E>, BlockingQueue<E> {
    /* renamed from: a */
    E mo35947a();

    /* renamed from: a */
    E mo35946a(long j, TimeUnit timeUnit);

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: a */
    void mo35944a(E e);

    /* renamed from: a */
    boolean mo35943a(E e, long j, TimeUnit timeUnit);

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b, java.util.Queue, java.util.Collection, java.util.concurrent.BlockingQueue
    boolean add(E e);

    /* renamed from: b */
    E mo35942b();

    /* renamed from: b */
    E mo35941b(long j, TimeUnit timeUnit);

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: b */
    void mo35939b(E e);

    /* renamed from: b */
    boolean mo35938b(E e, long j, TimeUnit timeUnit);

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: c */
    boolean mo35935c(E e);

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b, java.util.Collection, java.util.concurrent.BlockingQueue
    boolean contains(Object obj);

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: d */
    boolean mo35933d(E e);

    /* renamed from: e */
    void mo35931e(E e);

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b, java.util.Queue
    E element();

    /* renamed from: f */
    void mo35929f(E e);

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: g */
    boolean mo35927g(Object obj);

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: h */
    boolean mo35925h(Object obj);

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: i */
    void mo35923i(E e);

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b, java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b, java.util.Queue, java.util.concurrent.BlockingQueue
    boolean offer(E e);

    @Override // java.util.concurrent.BlockingQueue
    boolean offer(E e, long j, TimeUnit timeUnit);

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b, java.util.Queue
    E peek();

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b, java.util.Queue
    E poll();

    @Override // java.util.concurrent.BlockingQueue
    E poll(long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.BlockingQueue
    void put(E e);

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b, java.util.Queue
    E remove();

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b, java.util.Collection, java.util.concurrent.BlockingQueue
    boolean remove(Object obj);

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b, java.util.Collection
    int size();

    @Override // java.util.concurrent.BlockingQueue
    E take();
}
