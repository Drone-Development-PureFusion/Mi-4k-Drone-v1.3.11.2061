.class public Lcom/xiaomi/mistatistic/sdk/MIStatsHttpClientHelper;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/Object;)I
    .locals 2

    const/4 v0, 0x0

    instance-of v1, p0, Lorg/apache/http/HttpResponse;

    if-eqz v1, :cond_0

    check-cast p0, Lorg/apache/http/HttpResponse;

    invoke-interface {p0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    goto :goto_0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p1}, Lorg/apache/http/HttpHost;->toURI()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {p0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v7

    new-instance v0, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    invoke-static {v6}, Lcom/xiaomi/mistatistic/sdk/MIStatsHttpClientHelper;->a(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;JILjava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v6

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v2

    new-instance v3, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V

    throw v0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p1}, Lorg/apache/http/HttpHost;->toURI()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {p0, p1, p2, p3, p4}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v7

    new-instance v0, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    invoke-static {v6}, Lcom/xiaomi/mistatistic/sdk/MIStatsHttpClientHelper;->a(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;JILjava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v6

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v2

    new-instance v3, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V

    throw v0

    :catch_1
    move-exception v0

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v2

    new-instance v3, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V

    throw v0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;
    .locals 8

    invoke-interface {p1}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {p0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v7

    new-instance v0, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    invoke-static {v6}, Lcom/xiaomi/mistatistic/sdk/MIStatsHttpClientHelper;->a(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;JILjava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v6

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v2

    new-instance v3, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V

    throw v0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;
    .locals 8

    invoke-interface {p1}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {p0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v7

    new-instance v0, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    invoke-static {v6}, Lcom/xiaomi/mistatistic/sdk/MIStatsHttpClientHelper;->a(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;JILjava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v6

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v2

    new-instance v3, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V

    throw v0

    :catch_1
    move-exception v0

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v2

    new-instance v3, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V

    throw v0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;
    .locals 8

    invoke-virtual {p1}, Lorg/apache/http/HttpHost;->toURI()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {p0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v6

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v7

    new-instance v0, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    invoke-static {v6}, Lcom/xiaomi/mistatistic/sdk/MIStatsHttpClientHelper;->a(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;JILjava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v6

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v2

    new-instance v3, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V

    throw v0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    .locals 8

    invoke-virtual {p1}, Lorg/apache/http/HttpHost;->toURI()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {p0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object v6

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v7

    new-instance v0, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    invoke-static {v6}, Lcom/xiaomi/mistatistic/sdk/MIStatsHttpClientHelper;->a(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;JILjava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v6

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v2

    new-instance v3, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V

    throw v0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    .locals 8

    invoke-interface {p1}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {p0, p1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v6

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v7

    new-instance v0, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    invoke-static {v6}, Lcom/xiaomi/mistatistic/sdk/MIStatsHttpClientHelper;->a(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;JILjava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v6

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v2

    new-instance v3, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V

    throw v0

    :catch_1
    move-exception v0

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v2

    new-instance v3, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V

    throw v0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    .locals 8

    invoke-interface {p1}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {p0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object v6

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v7

    new-instance v0, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    invoke-static {v6}, Lcom/xiaomi/mistatistic/sdk/MIStatsHttpClientHelper;->a(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;JILjava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v6

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v2

    new-instance v3, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V

    throw v0
.end method
