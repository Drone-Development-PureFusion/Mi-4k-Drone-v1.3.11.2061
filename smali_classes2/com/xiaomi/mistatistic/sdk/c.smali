.class final Lcom/xiaomi/mistatistic/sdk/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/net/URLStreamHandlerFactory;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createURLStreamHandler(Ljava/lang/String;)Ljava/net/URLStreamHandler;
    .locals 2

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/xiaomi/mistatistic/sdk/d;

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/URLStatsRecorder;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/URLStreamHandler;

    invoke-direct {v1, v0}, Lcom/xiaomi/mistatistic/sdk/d;-><init>(Ljava/net/URLStreamHandler;)V

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
