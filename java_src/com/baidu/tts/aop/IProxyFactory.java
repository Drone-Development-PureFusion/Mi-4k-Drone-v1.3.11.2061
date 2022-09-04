package com.baidu.tts.aop;

import java.util.List;
/* loaded from: classes.dex */
public interface IProxyFactory<T> {
    IInterceptorHandler createInterceptorHandler();

    List<IInterceptor> createInterceptors();

    /* renamed from: createProxied */
    T mo40046createProxied();

    T makeProxy();
}
