.class public Lcom/baidu/tts/b/b/b/b;
.super Lcom/baidu/tts/b/b/b/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/tts/b/b/b/b$a;
    }
.end annotation


# instance fields
.field protected final b:Ljava/util/concurrent/locks/Lock;

.field protected final c:Ljava/util/concurrent/locks/Condition;

.field private volatile d:Landroid/media/AudioTrack;

.field private e:Lcom/baidu/tts/b/b/b/b$a;

.field private f:Lcom/baidu/tts/i/a/b;

.field private g:Z

.field private h:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/baidu/tts/b/b/b/a;-><init>()V

    new-instance v0, Lcom/baidu/tts/i/a/b;

    invoke-direct {v0}, Lcom/baidu/tts/i/a/b;-><init>()V

    iput-object v0, p0, Lcom/baidu/tts/b/b/b/b;->f:Lcom/baidu/tts/i/a/b;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/baidu/tts/b/b/b/b;->b:Ljava/util/concurrent/locks/Lock;

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/tts/b/b/b/b;->c:Ljava/util/concurrent/locks/Condition;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/tts/b/b/b/b;->g:Z

    return-void
.end method

.method private a(III)I
    .locals 5

    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-static {p1, p2, p3}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    sparse-switch p2, :sswitch_data_0

    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    move-result v3

    :goto_0
    const/4 v4, 0x3

    if-ne p3, v4, :cond_0

    move v0, v1

    :cond_0
    mul-int/2addr v0, v3

    rem-int v0, v2, v0

    if-nez v0, :cond_1

    if-ge v2, v1, :cond_2

    :cond_1
    const/16 v0, 0x1400

    :goto_1
    return v0

    :sswitch_0
    move v3, v1

    goto :goto_0

    :sswitch_1
    move v3, v0

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
        0x4 -> :sswitch_0
        0xc -> :sswitch_1
    .end sparse-switch
.end method

.method private b(I)I
    .locals 1

    iget v0, p0, Lcom/baidu/tts/b/b/b/b;->h:I

    if-le p1, v0, :cond_0

    iput p1, p0, Lcom/baidu/tts/b/b/b/b;->h:I

    :cond_0
    iget v0, p0, Lcom/baidu/tts/b/b/b/b;->h:I

    return v0
.end method

.method private b(Lcom/baidu/tts/m/h;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->f:Lcom/baidu/tts/i/a/b;

    invoke-direct {p0}, Lcom/baidu/tts/b/b/b/b;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/baidu/tts/i/a/b;->a(I)V

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->f:Lcom/baidu/tts/i/a/b;

    invoke-virtual {v0}, Lcom/baidu/tts/i/a/b;->a()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/baidu/tts/b/b/b/b;->h:I

    invoke-direct {p0, p1}, Lcom/baidu/tts/b/b/b/b;->d(Lcom/baidu/tts/m/h;)V

    return-void
.end method

.method private c(Lcom/baidu/tts/m/h;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->f:Lcom/baidu/tts/i/a/b;

    invoke-virtual {v0}, Lcom/baidu/tts/i/a/b;->b()V

    invoke-direct {p0, p1}, Lcom/baidu/tts/b/b/b/b;->f(Lcom/baidu/tts/m/h;)V

    return-void
.end method

.method private d(Lcom/baidu/tts/m/h;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->a:Lcom/baidu/tts/b/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->a:Lcom/baidu/tts/b/b/a;

    invoke-interface {v0, p1}, Lcom/baidu/tts/b/b/a;->a(Lcom/baidu/tts/m/h;)V

    :cond_0
    return-void
.end method

.method private e(Lcom/baidu/tts/m/h;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->a:Lcom/baidu/tts/b/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->a:Lcom/baidu/tts/b/b/a;

    invoke-interface {v0, p1}, Lcom/baidu/tts/b/b/a;->b(Lcom/baidu/tts/m/h;)V

    :cond_0
    return-void
.end method

.method private f(Lcom/baidu/tts/m/h;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->a:Lcom/baidu/tts/b/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->a:Lcom/baidu/tts/b/b/a;

    invoke-interface {v0, p1}, Lcom/baidu/tts/b/b/a;->c(Lcom/baidu/tts/m/h;)V

    :cond_0
    return-void
.end method

.method private g()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->c:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :goto_0
    return-void

    :catch_0
    move-exception v0

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/baidu/tts/b/b/b/b;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method private h()I
    .locals 2

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v0}, Lcom/baidu/tts/b/b/b/b$a;->h()I

    move-result v0

    iget-object v1, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v1}, Lcom/baidu/tts/b/b/b/b$a;->a()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    div-int v0, v1, v0

    return v0
.end method


# virtual methods
.method public a(FF)I
    .locals 2

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    invoke-virtual {v0, p1, p2}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    move-result v0

    iget-object v1, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v1, p1}, Lcom/baidu/tts/b/b/b/b$a;->a(F)V

    iget-object v1, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v1, p2}, Lcom/baidu/tts/b/b/b/b$a;->b(F)V

    return v0
.end method

.method public a(I)I
    .locals 7

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v0}, Lcom/baidu/tts/b/b/b/b$a;->g()I

    move-result v0

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v0}, Lcom/baidu/tts/b/b/b/b$a;->a()I

    move-result v2

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v0}, Lcom/baidu/tts/b/b/b/b$a;->b()I

    move-result v3

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v0}, Lcom/baidu/tts/b/b/b/b$a;->c()I

    move-result v4

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v0}, Lcom/baidu/tts/b/b/b/b$a;->d()I

    move-result v6

    invoke-direct {p0, v2, v3, v4}, Lcom/baidu/tts/b/b/b/b;->a(III)I

    move-result v5

    new-instance v0, Landroid/media/AudioTrack;

    move v1, p1

    invoke-direct/range {v0 .. v6}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    iput-object v0, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/b/b/b/b$a;->a(I)V

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v0}, Lcom/baidu/tts/b/b/b/b$a;->e()F

    move-result v0

    iget-object v1, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v1}, Lcom/baidu/tts/b/b/b/b$a;->f()F

    move-result v1

    iget-object v2, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    invoke-virtual {v2, v0, v1}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public a()Lcom/baidu/tts/aop/tts/TtsError;
    .locals 7

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v0}, Lcom/baidu/tts/b/b/b/b$a;->a()I

    move-result v2

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v0}, Lcom/baidu/tts/b/b/b/b$a;->b()I

    move-result v3

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v0}, Lcom/baidu/tts/b/b/b/b$a;->c()I

    move-result v4

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v0}, Lcom/baidu/tts/b/b/b/b$a;->g()I

    move-result v1

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v0}, Lcom/baidu/tts/b/b/b/b$a;->d()I

    move-result v6

    invoke-direct {p0, v2, v3, v4}, Lcom/baidu/tts/b/b/b/b;->a(III)I

    move-result v5

    new-instance v0, Landroid/media/AudioTrack;

    invoke-direct/range {v0 .. v6}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    iput-object v0, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v0}, Lcom/baidu/tts/b/b/b/b$a;->e()F

    move-result v0

    iget-object v1, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    invoke-virtual {v1}, Lcom/baidu/tts/b/b/b/b$a;->f()F

    move-result v1

    iget-object v2, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    invoke-virtual {v2, v0, v1}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/baidu/tts/m/h;)Lcom/baidu/tts/aop/tts/TtsError;
    .locals 12

    const/4 v11, 0x0

    const/4 v10, 0x1

    const-string v0, "AudioTrackPlayer"

    const-string v1, "enter put"

    invoke-static {v0, v1}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/baidu/tts/m/h;->g()Lcom/baidu/tts/f/e;

    move-result-object v2

    sget-object v0, Lcom/baidu/tts/f/e;->a:Lcom/baidu/tts/f/e;

    if-ne v2, v0, :cond_0

    invoke-direct {p0, p1}, Lcom/baidu/tts/b/b/b/b;->b(Lcom/baidu/tts/m/h;)V

    :cond_0
    sget-object v0, Lcom/baidu/tts/f/e;->c:Lcom/baidu/tts/f/e;

    if-ne v2, v0, :cond_1

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->f:Lcom/baidu/tts/i/a/b;

    invoke-virtual {p1}, Lcom/baidu/tts/m/h;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/baidu/tts/i/a/b;->c(I)V

    :cond_1
    invoke-virtual {p1}, Lcom/baidu/tts/m/h;->d()[B

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->f:Lcom/baidu/tts/i/a/b;

    array-length v1, v3

    invoke-virtual {v0, v1}, Lcom/baidu/tts/i/a/b;->b(I)V

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->f:Lcom/baidu/tts/i/a/b;

    invoke-virtual {v0}, Lcom/baidu/tts/i/a/b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->f:Lcom/baidu/tts/i/a/b;

    invoke-virtual {v0}, Lcom/baidu/tts/i/a/b;->c()Lcom/baidu/tts/i/a/a;

    move-result-object v4

    const/4 v0, 0x0

    invoke-virtual {v4}, Lcom/baidu/tts/i/a/a;->a()I

    move-result v5

    invoke-virtual {v4}, Lcom/baidu/tts/i/a/a;->b()I

    move-result v6

    :goto_1
    if-ge v0, v6, :cond_4

    iget-object v1, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v1

    if-eq v1, v10, :cond_4

    sub-int v1, v6, v0

    const-string v7, "AudioTrackPlayer"

    const-string v8, "before write"

    invoke-static {v7, v8}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    add-int v7, v0, v5

    iget-object v8, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    invoke-virtual {v8, v3, v7, v1}, Landroid/media/AudioTrack;->write([BII)I

    move-result v1

    const-string v7, "AudioTrackPlayer"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "writtenbytes="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "--offset="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "--dataLength="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    add-int/2addr v1, v0

    :goto_2
    iget-boolean v0, p0, Lcom/baidu/tts/b/b/b/b;->g:Z

    if-eqz v0, :cond_3

    :try_start_0
    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v0, "AudioTrackPlayer"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "await before"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->c:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->await()V

    const-string v0, "AudioTrackPlayer"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "await after"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_2

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/baidu/tts/b/b/b/b;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_3
    move v0, v1

    goto/16 :goto_1

    :cond_4
    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    if-ne v0, v10, :cond_5

    :goto_3
    return-object v11

    :cond_5
    invoke-virtual {v4}, Lcom/baidu/tts/i/a/a;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/baidu/tts/m/h;->c()I

    move-result v0

    invoke-virtual {v4}, Lcom/baidu/tts/i/a/a;->d()F

    move-result v1

    int-to-float v0, v0

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/baidu/tts/b/b/b/b;->b(I)I

    move-result v4

    const-string v5, "AudioTrackPlayer"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "percent="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, "--currentProgress="

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "--progress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/baidu/tts/m/h;->A()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/tts/m/h;

    invoke-virtual {v0, v4}, Lcom/baidu/tts/m/h;->c(I)V

    invoke-direct {p0, v0}, Lcom/baidu/tts/b/b/b/b;->e(Lcom/baidu/tts/m/h;)V

    goto/16 :goto_0

    :cond_6
    sget-object v0, Lcom/baidu/tts/f/e;->b:Lcom/baidu/tts/f/e;

    if-ne v2, v0, :cond_7

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->f:Lcom/baidu/tts/i/a/b;

    invoke-virtual {v0}, Lcom/baidu/tts/i/a/b;->d()I

    move-result v1

    invoke-virtual {p1}, Lcom/baidu/tts/m/h;->A()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/tts/m/h;

    invoke-virtual {v0, v1}, Lcom/baidu/tts/m/h;->c(I)V

    invoke-direct {p0, v0}, Lcom/baidu/tts/b/b/b/b;->e(Lcom/baidu/tts/m/h;)V

    invoke-direct {p0, p1}, Lcom/baidu/tts/b/b/b/b;->c(Lcom/baidu/tts/m/h;)V

    :cond_7
    :goto_4
    const-string v0, "AudioTrackPlayer"

    const-string v1, "end put"

    invoke-static {v0, v1}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    const-string v0, "AudioTrackPlayer"

    const-string v1, "put responseBag=null"

    invoke-static {v0, v1}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4
.end method

.method public a(Lcom/baidu/tts/b/b/a;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/b/b/b/b;->a:Lcom/baidu/tts/b/b/a;

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<AudioTrackPlayerParams:",
            "Ljava/lang/Object;",
            ">(TAudioTrackPlayerParams;)V"
        }
    .end annotation

    check-cast p1, Lcom/baidu/tts/b/b/b/b$a;

    iput-object p1, p0, Lcom/baidu/tts/b/b/b/b;->e:Lcom/baidu/tts/b/b/b/b$a;

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/tts/b/b/b/b;->g:Z

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/tts/b/b/b/b;->g:Z

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    invoke-direct {p0}, Lcom/baidu/tts/b/b/b/b;->g()V

    return-void
.end method

.method public e()V
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/tts/b/b/b/b;->g:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/tts/b/b/b/b;->g:Z

    invoke-direct {p0}, Lcom/baidu/tts/b/b/b/b;->g()V

    :cond_0
    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    return-void
.end method

.method public f()Lcom/baidu/tts/aop/tts/TtsError;
    .locals 2

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/baidu/tts/b/b/b/b;->e()V

    iget-object v0, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    iput-object v1, p0, Lcom/baidu/tts/b/b/b/b;->d:Landroid/media/AudioTrack;

    return-object v1
.end method
