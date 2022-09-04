.class Lcom/google/android/gms/internal/ly;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Random;

.field private volatile c:Z

.field private d:Z

.field private e:Lcom/google/android/gms/internal/ls;

.field private f:Ljava/nio/channels/WritableByteChannel;

.field private final g:Ljava/lang/Thread;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ls;Ljava/lang/String;I)V
    .locals 4

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ly;->b:Ljava/util/Random;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ly;->c:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ly;->d:Z

    invoke-static {}, Lcom/google/android/gms/internal/ls;->a()Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ly$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ly$1;-><init>(Lcom/google/android/gms/internal/ly;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ly;->g:Ljava/lang/Thread;

    invoke-static {}, Lcom/google/android/gms/internal/ls;->b()Lcom/google/android/gms/internal/lr;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ly;->b()Ljava/lang/Thread;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x12

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "Writer-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/lr;->a(Ljava/lang/Thread;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ly;->e:Lcom/google/android/gms/internal/ls;

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ly;->a:Ljava/util/concurrent/BlockingQueue;

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/lu;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ly;->e:Lcom/google/android/gms/internal/ls;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ls;->a(Lcom/google/android/gms/internal/lu;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ly;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ly;->e()V

    return-void
.end method

.method private b(BZ[B)Ljava/nio/ByteBuffer;
    .locals 6

    const v5, 0xffff

    const/4 v3, 0x0

    const/16 v2, 0x7e

    const/4 v0, 0x2

    if-eqz p2, :cond_0

    const/4 v0, 0x6

    :cond_0
    array-length v1, p3

    if-ge v1, v2, :cond_1

    :goto_0
    array-length v4, p3

    add-int/2addr v0, v4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    or-int/lit8 v0, p1, -0x80

    int-to-byte v0, v0

    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    if-ge v1, v2, :cond_3

    if-eqz p2, :cond_8

    or-int/lit16 v0, v1, 0x80

    :goto_1
    int-to-byte v0, v0

    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    :goto_2
    if-eqz p2, :cond_6

    invoke-direct {p0}, Lcom/google/android/gms/internal/ly;->c()[B

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move v0, v3

    :goto_3
    array-length v2, p3

    if-ge v0, v2, :cond_6

    aget-byte v2, p3, v0

    rem-int/lit8 v3, v0, 0x4

    aget-byte v3, v1, v3

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_1
    if-gt v1, v5, :cond_2

    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v0, 0x8

    goto :goto_0

    :cond_3
    if-gt v1, v5, :cond_4

    if-eqz p2, :cond_7

    const/16 v0, 0xfe

    :goto_4
    int-to-byte v0, v0

    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    int-to-short v0, v1

    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    goto :goto_2

    :cond_4
    const/16 v0, 0x7f

    if-eqz p2, :cond_5

    const/16 v0, 0xff

    :cond_5
    int-to-byte v0, v0

    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    goto :goto_2

    :cond_6
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-object v4

    :cond_7
    move v0, v2

    goto :goto_4

    :cond_8
    move v0, v1

    goto :goto_1
.end method

.method private c()[B
    .locals 2

    const/4 v0, 0x4

    new-array v0, v0, [B

    iget-object v1, p0, Lcom/google/android/gms/internal/ly;->b:Ljava/util/Random;

    invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V

    return-object v0
.end method

.method private d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ly;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lcom/google/android/gms/internal/ly;->f:Ljava/nio/channels/WritableByteChannel;

    invoke-interface {v1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    return-void
.end method

.method private e()V
    .locals 3

    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ly;->c:Z

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ly;->d()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/lu;

    const-string v2, "IO Exception"

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/lu;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ly;->a(Lcom/google/android/gms/internal/lu;)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    :goto_2
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ly;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ly;->d()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_1
.end method


# virtual methods
.method a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ly;->c:Z

    return-void
.end method

.method declared-synchronized a(BZ[B)V
    .locals 3

    const/16 v2, 0x8

    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ly;->b(BZ[B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ly;->c:Z

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ly;->d:Z

    if-nez v1, :cond_0

    if-eq p1, v2, :cond_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/lu;

    const-string v1, "Shouldn\'t be sending"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/lu;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    if-ne p1, v2, :cond_2

    const/4 v1, 0x1

    :try_start_1
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ly;->d:Z

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ly;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void
.end method

.method a(Ljava/io/OutputStream;)V
    .locals 1

    invoke-static {p1}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ly;->f:Ljava/nio/channels/WritableByteChannel;

    return-void
.end method

.method b()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ly;->g:Ljava/lang/Thread;

    return-object v0
.end method
