.class Lcom/baidu/tts/b/a/b/e$a;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/tts/b/a/b/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/tts/b/a/b/e;

.field private b:I


# direct methods
.method public constructor <init>(Lcom/baidu/tts/b/a/b/e;I)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/b/a/b/e$a;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    iput p2, p0, Lcom/baidu/tts/b/a/b/e$a;->b:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    :try_start_0
    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e$a;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v0}, Lcom/baidu/tts/b/a/b/e;->c(Lcom/baidu/tts/b/a/b/e;)Lcom/baidu/tts/e/c;

    move-result-object v8

    monitor-enter v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e$a;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v0}, Lcom/baidu/tts/b/a/b/e;->c(Lcom/baidu/tts/b/a/b/e;)Lcom/baidu/tts/e/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/tts/e/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e$a;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v0}, Lcom/baidu/tts/b/a/b/e;->c(Lcom/baidu/tts/b/a/b/e;)Lcom/baidu/tts/e/c;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget v4, p0, Lcom/baidu/tts/b/a/b/e$a;->b:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, ""

    invoke-virtual/range {v1 .. v7}, Lcom/baidu/tts/e/c;->a(JIIILjava/lang/String;)V

    :cond_0
    monitor-exit v8

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    monitor-exit v8
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

    const-string v3, "AddPVResultsToDB exception="

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
