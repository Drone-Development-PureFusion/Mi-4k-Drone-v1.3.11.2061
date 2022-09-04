.class public final Lcom/google/android/gms/wearable/internal/bi;
.super Ljava/io/OutputStream;


# instance fields
.field private final a:Ljava/io/OutputStream;

.field private volatile b:Lcom/google/android/gms/wearable/internal/be;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/OutputStream;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/bi;->a:Ljava/io/OutputStream;

    return-void
.end method

.method private a(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bi;->b:Lcom/google/android/gms/wearable/internal/be;

    if-eqz v0, :cond_1

    const-string v1, "ChannelOutputStream"

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "ChannelOutputStream"

    const-string v2, "Caught IOException, but channel has been closed. Translating to ChannelIOException."

    invoke-static {v1, v2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    new-instance p1, Lcom/google/android/gms/wearable/d;

    const-string v1, "Channel closed unexpectedly before stream was finished"

    iget v2, v0, Lcom/google/android/gms/wearable/internal/be;->a:I

    iget v0, v0, Lcom/google/android/gms/wearable/internal/be;->b:I

    invoke-direct {p1, v1, v2, v0}, Lcom/google/android/gms/wearable/d;-><init>(Ljava/lang/String;II)V

    :cond_1
    return-object p1
.end method


# virtual methods
.method a()Lcom/google/android/gms/wearable/internal/bm;
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/bi$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/bi$1;-><init>(Lcom/google/android/gms/wearable/internal/bi;)V

    return-object v0
.end method

.method a(Lcom/google/android/gms/wearable/internal/be;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/bi;->b:Lcom/google/android/gms/wearable/internal/be;

    return-void
.end method

.method public close()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bi;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/wearable/internal/bi;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public flush()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bi;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/wearable/internal/bi;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public write(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bi;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/wearable/internal/bi;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public write([B)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bi;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/wearable/internal/bi;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public write([BII)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bi;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/wearable/internal/bi;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method
