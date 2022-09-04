.class public Lcom/baidu/tts/b/a/b/e;
.super Lcom/baidu/tts/b/a/b/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/tts/b/a/b/e$b;,
        Lcom/baidu/tts/b/a/b/e$a;,
        Lcom/baidu/tts/b/a/b/e$c;
    }
.end annotation


# instance fields
.field private b:Lcom/baidu/tts/b/a/b/e$b;

.field private c:[J

.field private d:Lcom/baidu/tts/e/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/baidu/tts/b/a/b/a;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/baidu/tts/b/a/b/e;->c:[J

    return-void
.end method

.method static synthetic a(Lcom/baidu/tts/b/a/b/e;)Lcom/baidu/tts/b/a/b/e$b;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e;->b:Lcom/baidu/tts/b/a/b/e$b;

    return-object v0
.end method

.method static synthetic b(Lcom/baidu/tts/b/a/b/e;)[J
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e;->c:[J

    return-object v0
.end method

.method static synthetic c(Lcom/baidu/tts/b/a/b/e;)Lcom/baidu/tts/e/c;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e;->d:Lcom/baidu/tts/e/c;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/baidu/tts/m/e;)I
    .locals 4

    invoke-virtual {p1}, Lcom/baidu/tts/m/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/baidu/tts/tools/ResourceTools;->stringToByteArrayAddNull(Ljava/lang/String;)[B

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/tts/b/a/b/e;->c:[J

    const/4 v2, 0x0

    aget-wide v2, v1, v2

    invoke-static {v0, v2, v3}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSDomainDataInit([BJ)I

    move-result v0

    return v0
.end method

.method public a(Lcom/baidu/tts/m/f;)I
    .locals 4

    invoke-virtual {p1}, Lcom/baidu/tts/m/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/baidu/tts/m/f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    if-eqz v2, :cond_1

    :cond_0
    sget-object v0, Lcom/baidu/tts/f/n;->Y:Lcom/baidu/tts/f/n;

    invoke-virtual {v0}, Lcom/baidu/tts/f/n;->b()I

    move-result v0

    :goto_0
    return v0

    :cond_1
    invoke-static {v1}, Lcom/baidu/tts/tools/ResourceTools;->stringToByteArrayAddNull(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v0}, Lcom/baidu/tts/tools/ResourceTools;->stringToByteArrayAddNull(Ljava/lang/String;)[B

    move-result-object v0

    iget-object v2, p0, Lcom/baidu/tts/b/a/b/e;->c:[J

    const/4 v3, 0x0

    aget-wide v2, v2, v3

    invoke-static {v1, v0, v2, v3}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->loadEnglishEngine([B[BJ)I

    move-result v0

    const-string v1, "OfflineSynthesizer"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "loadEnglishModel ret="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/baidu/tts/m/g;)I
    .locals 8

    const/4 v0, 0x0

    invoke-virtual {p1}, Lcom/baidu/tts/m/g;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/baidu/tts/m/g;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v3, :cond_0

    if-eqz v4, :cond_0

    sget-object v0, Lcom/baidu/tts/f/n;->Y:Lcom/baidu/tts/f/n;

    invoke-virtual {v0}, Lcom/baidu/tts/f/n;->b()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    if-nez v3, :cond_2

    invoke-static {v1}, Lcom/baidu/tts/tools/ResourceTools;->stringToByteArrayAddNull(Ljava/lang/String;)[B

    move-result-object v1

    iget-object v3, p0, Lcom/baidu/tts/b/a/b/e;->c:[J

    aget-wide v6, v3, v0

    invoke-static {v1, v6, v7}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSReInitData([BJ)I

    move-result v1

    :goto_1
    if-nez v4, :cond_1

    invoke-static {v2}, Lcom/baidu/tts/tools/ResourceTools;->stringToByteArrayAddNull(Ljava/lang/String;)[B

    move-result-object v2

    iget-object v3, p0, Lcom/baidu/tts/b/a/b/e;->c:[J

    aget-wide v4, v3, v0

    invoke-static {v2, v4, v5}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSReInitData([BJ)I

    move-result v0

    :cond_1
    add-int/2addr v0, v1

    goto :goto_0

    :cond_2
    move v1, v0

    goto :goto_1
.end method

.method public a()Lcom/baidu/tts/aop/tts/TtsError;
    .locals 4

    :try_start_0
    invoke-static {}, Lcom/baidu/tts/h/b/b;->a()Lcom/baidu/tts/h/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/tts/h/b/b;->h()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/baidu/tts/e/c;->a(Landroid/content/Context;)Lcom/baidu/tts/e/c;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/tts/b/a/b/e;->d:Lcom/baidu/tts/e/c;

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e;->d:Lcom/baidu/tts/e/c;

    invoke-virtual {v0}, Lcom/baidu/tts/e/c;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e;->b:Lcom/baidu/tts/b/a/b/e$b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/tts/b/a/b/e$b;

    invoke-direct {v0}, Lcom/baidu/tts/b/a/b/e$b;-><init>()V

    iput-object v0, p0, Lcom/baidu/tts/b/a/b/e;->b:Lcom/baidu/tts/b/a/b/e$b;

    :cond_0
    invoke-static {}, Lcom/baidu/tts/auth/a;->a()Lcom/baidu/tts/auth/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/tts/b/a/b/e;->b:Lcom/baidu/tts/b/a/b/e$b;

    invoke-virtual {v0, v1}, Lcom/baidu/tts/auth/a;->a(Lcom/baidu/tts/b/a/b/e$b;)Lcom/baidu/tts/auth/b$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/tts/auth/b$a;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e;->b:Lcom/baidu/tts/b/a/b/e$b;

    invoke-virtual {v0}, Lcom/baidu/tts/b/a/b/e$b;->d()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/tts/b/a/b/e;->b:Lcom/baidu/tts/b/a/b/e$b;

    invoke-virtual {v1}, Lcom/baidu/tts/b/a/b/e$b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lcom/baidu/tts/tools/ResourceTools;->stringToByteArrayAddNull(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v1}, Lcom/baidu/tts/tools/ResourceTools;->stringToByteArrayAddNull(Ljava/lang/String;)[B

    move-result-object v1

    const-string v2, "OfflineSynthesizer"

    const-string v3, "before bdTTSEngineInit"

    invoke-static {v2, v3}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/baidu/tts/b/a/b/e;->c:[J

    invoke-static {v0, v1, v2}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSEngineInit([B[B[J)I

    move-result v0

    const-string v1, "OfflineSynthesizer"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "engine init ret = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_1
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "OfflineSynthesizer"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "embedded statistics open exception="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/baidu/tts/h/a/c;->a()Lcom/baidu/tts/h/a/c;

    move-result-object v1

    sget-object v2, Lcom/baidu/tts/f/n;->y:Lcom/baidu/tts/f/n;

    const-string v3, "bdTTSEngineInit result not 0"

    invoke-virtual {v1, v2, v0, v3}, Lcom/baidu/tts/h/a/c;->a(Lcom/baidu/tts/f/n;ILjava/lang/String;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcom/baidu/tts/auth/b$a;->b()Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    goto :goto_1
.end method

.method public a(Lcom/baidu/tts/m/i;)Lcom/baidu/tts/aop/tts/TtsError;
    .locals 3

    :try_start_0
    new-instance v0, Lcom/baidu/tts/b/a/b/e$c;

    invoke-direct {v0, p0, p1}, Lcom/baidu/tts/b/a/b/e$c;-><init>(Lcom/baidu/tts/b/a/b/e;Lcom/baidu/tts/m/i;)V

    invoke-virtual {v0}, Lcom/baidu/tts/b/a/b/e$c;->a()Lcom/baidu/tts/aop/tts/TtsError;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    invoke-static {}, Lcom/baidu/tts/h/a/c;->a()Lcom/baidu/tts/h/a/c;

    move-result-object v1

    sget-object v2, Lcom/baidu/tts/f/n;->A:Lcom/baidu/tts/f/n;

    invoke-virtual {v1, v2, v0}, Lcom/baidu/tts/h/a/c;->a(Lcom/baidu/tts/f/n;Ljava/lang/Throwable;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<OfflineSynthesizerParams:",
            "Ljava/lang/Object;",
            ">(TOfflineSynthesizerParams;)V"
        }
    .end annotation

    check-cast p1, Lcom/baidu/tts/b/a/b/e$b;

    iput-object p1, p0, Lcom/baidu/tts/b/a/b/e;->b:Lcom/baidu/tts/b/a/b/e$b;

    return-void
.end method

.method public b(Lcom/baidu/tts/m/e;)I
    .locals 2

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e;->c:[J

    const/4 v1, 0x0

    aget-wide v0, v0, v1

    invoke-static {v0, v1}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSDomainDataUninit(J)I

    move-result v0

    return v0
.end method

.method public b()Lcom/baidu/tts/aop/tts/TtsError;
    .locals 4

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e;->c:[J

    const/4 v1, 0x0

    aget-wide v0, v0, v1

    invoke-static {v0, v1}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSEngineUninit(J)I

    :try_start_0
    iget-object v1, p0, Lcom/baidu/tts/b/a/b/e;->d:Lcom/baidu/tts/e/c;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e;->d:Lcom/baidu/tts/e/c;

    invoke-virtual {v0}, Lcom/baidu/tts/e/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e;->d:Lcom/baidu/tts/e/c;

    invoke-virtual {v0}, Lcom/baidu/tts/e/c;->c()V

    invoke-static {}, Lcom/baidu/tts/e/c;->e()V

    :cond_0
    monitor-exit v1

    :goto_0
    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    const-string v1, "OfflineSynthesizer"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "embedded statistics release exception="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
