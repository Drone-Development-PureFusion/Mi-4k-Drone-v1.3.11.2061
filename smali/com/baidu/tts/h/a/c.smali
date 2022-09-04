.class public Lcom/baidu/tts/h/a/c;
.super Ljava/lang/Object;


# static fields
.field private static volatile a:Lcom/baidu/tts/h/a/c;


# instance fields
.field private b:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable",
            "<",
            "Lcom/baidu/tts/f/n;",
            "Lcom/baidu/tts/h/a/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/baidu/tts/h/a/c;->a:Lcom/baidu/tts/h/a/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lcom/baidu/tts/h/a/c;->b:Ljava/util/Hashtable;

    return-void
.end method

.method public static a()Lcom/baidu/tts/h/a/c;
    .locals 2

    sget-object v0, Lcom/baidu/tts/h/a/c;->a:Lcom/baidu/tts/h/a/c;

    if-nez v0, :cond_1

    const-class v1, Lcom/baidu/tts/h/a/c;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/baidu/tts/h/a/c;->a:Lcom/baidu/tts/h/a/c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/tts/h/a/c;

    invoke-direct {v0}, Lcom/baidu/tts/h/a/c;-><init>()V

    sput-object v0, Lcom/baidu/tts/h/a/c;->a:Lcom/baidu/tts/h/a/c;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/baidu/tts/h/a/c;->a:Lcom/baidu/tts/h/a/c;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public a(Lcom/baidu/tts/f/n;I)Lcom/baidu/tts/aop/tts/TtsError;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/baidu/tts/h/a/c;->a(Lcom/baidu/tts/f/n;ILjava/lang/String;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/baidu/tts/f/n;ILjava/lang/String;)Lcom/baidu/tts/aop/tts/TtsError;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/baidu/tts/h/a/c;->a(Lcom/baidu/tts/f/n;ILjava/lang/String;Ljava/lang/Throwable;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/baidu/tts/f/n;ILjava/lang/String;Ljava/lang/Throwable;)Lcom/baidu/tts/aop/tts/TtsError;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/baidu/tts/h/a/c;->b(Lcom/baidu/tts/f/n;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/baidu/tts/aop/tts/TtsError;->setCode(I)V

    invoke-virtual {v0, p3}, Lcom/baidu/tts/aop/tts/TtsError;->setMessage(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, Lcom/baidu/tts/aop/tts/TtsError;->setThrowable(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public a(Lcom/baidu/tts/f/n;Ljava/lang/String;)Lcom/baidu/tts/aop/tts/TtsError;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcom/baidu/tts/h/a/c;->a(Lcom/baidu/tts/f/n;ILjava/lang/String;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/baidu/tts/f/n;Ljava/lang/Throwable;)Lcom/baidu/tts/aop/tts/TtsError;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/baidu/tts/h/a/c;->b(Lcom/baidu/tts/f/n;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/baidu/tts/aop/tts/TtsError;->setThrowable(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public a(Lcom/baidu/tts/f/n;)Lcom/baidu/tts/h/a/b;
    .locals 2

    iget-object v0, p0, Lcom/baidu/tts/h/a/c;->b:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/tts/h/a/b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/tts/h/a/b;

    invoke-direct {v0, p1}, Lcom/baidu/tts/h/a/b;-><init>(Lcom/baidu/tts/f/n;)V

    iget-object v1, p0, Lcom/baidu/tts/h/a/c;->b:Ljava/util/Hashtable;

    invoke-virtual {v1, p1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public b(Lcom/baidu/tts/f/n;)Lcom/baidu/tts/aop/tts/TtsError;
    .locals 2

    invoke-virtual {p0, p1}, Lcom/baidu/tts/h/a/c;->a(Lcom/baidu/tts/f/n;)Lcom/baidu/tts/h/a/b;

    move-result-object v0

    new-instance v1, Lcom/baidu/tts/aop/tts/TtsError;

    invoke-direct {v1}, Lcom/baidu/tts/aop/tts/TtsError;-><init>()V

    invoke-virtual {v1, v0}, Lcom/baidu/tts/aop/tts/TtsError;->setTtsErrorFlyweight(Lcom/baidu/tts/h/a/b;)V

    return-object v1
.end method
