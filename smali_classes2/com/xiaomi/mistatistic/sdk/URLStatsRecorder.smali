.class public Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/util/Map;

.field private static final b:Ljava/util/List;

.field private static final c:Ljava/util/List;

.field private static final d:Ljava/util/List;

.field private static final e:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->d:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->e:Ljava/util/List;

    sget-object v0, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->b:Ljava/util/List;

    const-string v1, "file"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->b:Ljava/util/List;

    const-string v1, "ftp"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->b:Ljava/util/List;

    const-string v1, "http"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->b:Ljava/util/List;

    const-string v1, "https"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->b:Ljava/util/List;

    const-string v1, "jar"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->c:Ljava/util/List;

    const-string v1, "http"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->a:Ljava/util/Map;

    return-object v0
.end method

.method public static addHttpEvent(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V
    .locals 1

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;)V

    return-void
.end method

.method public static dump()V
    .locals 5

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xiaomi/mistatistic/sdk/controller/j;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;

    :try_start_0
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "EVENT: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;->getUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/xiaomi/mistatistic/sdk/data/HttpEvent;->toJSON()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static enableAutoRecord()Z
    .locals 6

    const/4 v3, 0x1

    :try_start_0
    sget-object v0, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v2, Ljava/net/URL;

    const-string v4, "www.xiaomi.com"

    const-string v5, ""

    invoke-direct {v2, v0, v4, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/xiaomi/mistatistic/sdk/controller/o;

    invoke-direct {v1}, Lcom/xiaomi/mistatistic/sdk/controller/o;-><init>()V

    const-string v2, "failed to enable url interceptor"

    invoke-virtual {v1, v2, v0}, Lcom/xiaomi/mistatistic/sdk/controller/o;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_0
    :try_start_1
    const-class v0, Ljava/net/URL;

    const-string v1, "streamHandlers"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Hashtable;

    sget-object v1, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/URLStreamHandler;

    sget-object v5, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->a:Ljava/util/Map;

    invoke-interface {v5, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    new-instance v0, Lcom/xiaomi/mistatistic/sdk/c;

    invoke-direct {v0}, Lcom/xiaomi/mistatistic/sdk/c;-><init>()V

    invoke-static {v0}, Ljava/net/URL;->setURLStreamHandlerFactory(Ljava/net/URLStreamHandlerFactory;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move v0, v3

    goto :goto_1
.end method

.method public static setEventFilter(Lcom/xiaomi/mistatistic/sdk/controller/HttpEventFilter;)V
    .locals 1

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a()Lcom/xiaomi/mistatistic/sdk/controller/j;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/xiaomi/mistatistic/sdk/controller/j;->a(Lcom/xiaomi/mistatistic/sdk/controller/HttpEventFilter;)V

    return-void
.end method
