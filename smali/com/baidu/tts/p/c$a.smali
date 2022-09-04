.class public Lcom/baidu/tts/p/c$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/tts/p/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/tts/p/c;

.field private b:Lcom/baidu/tts/loopj/RequestHandle;


# direct methods
.method public constructor <init>(Lcom/baidu/tts/p/c;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/p/c$a;->a:Lcom/baidu/tts/p/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b()Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    .locals 5

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    iget-object v0, p0, Lcom/baidu/tts/p/c$a;->a:Lcom/baidu/tts/p/c;

    invoke-static {v0}, Lcom/baidu/tts/p/c;->c(Lcom/baidu/tts/p/c;)Lcom/baidu/tts/l/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/tts/l/a;->f()Ljava/util/Map;

    move-result-object v0

    const-string v1, "listId"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_0

    iget-object v4, p0, Lcom/baidu/tts/p/c$a;->a:Lcom/baidu/tts/p/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v4, v1}, Lcom/baidu/tts/p/c;->a(Lcom/baidu/tts/p/c;I)I

    iget-object v1, p0, Lcom/baidu/tts/p/c$a;->a:Lcom/baidu/tts/p/c;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v1, v0}, Lcom/baidu/tts/p/c;->b(Lcom/baidu/tts/p/c;I)I

    :cond_0
    iget-object v0, p0, Lcom/baidu/tts/p/c$a;->a:Lcom/baidu/tts/p/c;

    invoke-static {v0}, Lcom/baidu/tts/p/c;->c(Lcom/baidu/tts/p/c;)Lcom/baidu/tts/l/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/tts/l/a;->f()Ljava/util/Map;

    move-result-object v0

    const-string v1, "list"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    :try_start_0
    const-string v0, "deviceInfo"

    iget-object v4, p0, Lcom/baidu/tts/p/c$a;->a:Lcom/baidu/tts/p/c;

    invoke-static {v4}, Lcom/baidu/tts/p/c;->d(Lcom/baidu/tts/p/c;)Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/baidu/tts/p/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "appinfo"

    iget-object v4, p0, Lcom/baidu/tts/p/c$a;->a:Lcom/baidu/tts/p/c;

    invoke-static {v4}, Lcom/baidu/tts/p/c;->d(Lcom/baidu/tts/p/c;)Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/baidu/tts/p/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "methodinfo"

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "UploadStatistics"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "StatisticsData= "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "d"

    invoke-direct {v1, v3, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    :try_start_1
    new-instance v0, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    const-string v3, "UTF-8"

    invoke-direct {v0, v2, v3}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    move-object v0, v1

    goto :goto_1
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 6

    const/4 v1, 0x0

    new-instance v0, Lcom/baidu/tts/loopj/SyncHttpClient;

    invoke-direct {v0}, Lcom/baidu/tts/loopj/SyncHttpClient;-><init>()V

    sget-object v2, Lcom/baidu/tts/f/o;->c:Lcom/baidu/tts/f/o;

    invoke-virtual {v2}, Lcom/baidu/tts/f/o;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0}, Lcom/baidu/tts/p/c$a;->b()Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    move-result-object v3

    new-instance v5, Lcom/baidu/tts/p/d;

    invoke-direct {v5}, Lcom/baidu/tts/p/d;-><init>()V

    move-object v4, v1

    invoke-virtual/range {v0 .. v5}, Lcom/baidu/tts/loopj/SyncHttpClient;->post(Landroid/content/Context;Ljava/lang/String;Lorg/apache/http/HttpEntity;Ljava/lang/String;Lcom/baidu/tts/loopj/ResponseHandlerInterface;)Lcom/baidu/tts/loopj/RequestHandle;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/tts/p/c$a;->b:Lcom/baidu/tts/loopj/RequestHandle;

    invoke-virtual {v5}, Lcom/baidu/tts/p/d;->a()I

    move-result v0

    iget-object v1, p0, Lcom/baidu/tts/p/c$a;->a:Lcom/baidu/tts/p/c;

    iget-object v1, v1, Lcom/baidu/tts/p/c;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/baidu/tts/p/c$a$1;

    invoke-direct {v2, p0, v0}, Lcom/baidu/tts/p/c$a$1;-><init>(Lcom/baidu/tts/p/c$a;I)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/baidu/tts/p/c$a;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
