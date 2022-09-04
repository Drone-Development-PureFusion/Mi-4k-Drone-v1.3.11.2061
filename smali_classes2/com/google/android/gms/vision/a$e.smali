.class Lcom/google/android/gms/vision/a$e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field final synthetic b:Lcom/google/android/gms/vision/a;

.field private c:Lcom/google/android/gms/vision/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/vision/b",
            "<*>;"
        }
    .end annotation
.end field

.field private d:J

.field private final e:Ljava/lang/Object;

.field private f:Z

.field private g:J

.field private h:I

.field private i:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/vision/a;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/vision/a$e;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/google/android/gms/vision/a;Lcom/google/android/gms/vision/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/b",
            "<*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/vision/a$e;->b:Lcom/google/android/gms/vision/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/vision/a$e;->d:J

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/a$e;->e:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/vision/a$e;->f:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/vision/a$e;->h:I

    iput-object p2, p0, Lcom/google/android/gms/vision/a$e;->c:Lcom/google/android/gms/vision/b;

    return-void
.end method


# virtual methods
.method a()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Assert"
        }
    .end annotation

    sget-boolean v0, Lcom/google/android/gms/vision/a$e;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/vision/a$e;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v0}, Lcom/google/android/gms/vision/a;->d(Lcom/google/android/gms/vision/a;)Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v0

    sget-object v1, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/a$e;->c:Lcom/google/android/gms/vision/b;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/b;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/vision/a$e;->c:Lcom/google/android/gms/vision/b;

    return-void
.end method

.method a(Z)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/vision/a$e;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-boolean p1, p0, Lcom/google/android/gms/vision/a$e;->f:Z

    iget-object v0, p0, Lcom/google/android/gms/vision/a$e;->e:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method a([BLandroid/hardware/Camera;)V
    .locals 6

    iget-object v1, p0, Lcom/google/android/gms/vision/a$e;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/vision/a$e;->i:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/vision/a$e;->i:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/vision/a$e;->i:Ljava/nio/ByteBuffer;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/a$e;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v0}, Lcom/google/android/gms/vision/a;->e(Lcom/google/android/gms/vision/a;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "CameraSource"

    const-string v2, "Skipping frame. Could not find ByteBuffer associated with the image data from the camera."

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    monitor-exit v1

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/google/android/gms/vision/a$e;->d:J

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/vision/a$e;->g:J

    iget v0, p0, Lcom/google/android/gms/vision/a$e;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/a$e;->h:I

    iget-object v0, p0, Lcom/google/android/gms/vision/a$e;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v0}, Lcom/google/android/gms/vision/a;->e(Lcom/google/android/gms/vision/a;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/gms/vision/a$e;->i:Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lcom/google/android/gms/vision/a$e;->e:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public run()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/vision/a$e;->e:Ljava/lang/Object;

    monitor-enter v1

    :goto_1
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/vision/a$e;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/vision/a$e;->i:Ljava/nio/ByteBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/vision/a$e;->e:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_2
    const-string v2, "CameraSource"

    const-string v3, "Frame processing loop terminated."

    invoke-static {v2, v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    monitor-exit v1

    :goto_2
    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/vision/a$e;->f:Z

    if-nez v0, :cond_1

    monitor-exit v1

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_1
    :try_start_3
    new-instance v0, Lcom/google/android/gms/vision/d$a;

    invoke-direct {v0}, Lcom/google/android/gms/vision/d$a;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/vision/a$e;->i:Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lcom/google/android/gms/vision/a$e;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v3}, Lcom/google/android/gms/vision/a;->g(Lcom/google/android/gms/vision/a;)Lcom/google/android/gms/common/images/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/common/images/a;->a()I

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/vision/a$e;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v4}, Lcom/google/android/gms/vision/a;->g(Lcom/google/android/gms/vision/a;)Lcom/google/android/gms/common/images/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/common/images/a;->b()I

    move-result v4

    const/16 v5, 0x11

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/google/android/gms/vision/d$a;->a(Ljava/nio/ByteBuffer;III)Lcom/google/android/gms/vision/d$a;

    move-result-object v0

    iget v2, p0, Lcom/google/android/gms/vision/a$e;->h:I

    invoke-virtual {v0, v2}, Lcom/google/android/gms/vision/d$a;->a(I)Lcom/google/android/gms/vision/d$a;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/vision/a$e;->g:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/vision/d$a;->a(J)Lcom/google/android/gms/vision/d$a;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/vision/a$e;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v2}, Lcom/google/android/gms/vision/a;->f(Lcom/google/android/gms/vision/a;)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/vision/d$a;->b(I)Lcom/google/android/gms/vision/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/vision/d$a;->a()Lcom/google/android/gms/vision/d;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/vision/a$e;->i:Ljava/nio/ByteBuffer;

    const/4 v3, 0x0

    iput-object v3, p0, Lcom/google/android/gms/vision/a$e;->i:Ljava/nio/ByteBuffer;

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v1, p0, Lcom/google/android/gms/vision/a$e;->c:Lcom/google/android/gms/vision/b;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/vision/b;->b(Lcom/google/android/gms/vision/d;)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iget-object v0, p0, Lcom/google/android/gms/vision/a$e;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v0}, Lcom/google/android/gms/vision/a;->b(Lcom/google/android/gms/vision/a;)Landroid/hardware/Camera;

    move-result-object v0

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    goto :goto_0

    :catch_1
    move-exception v0

    :try_start_5
    const-string v1, "CameraSource"

    const-string v3, "Exception thrown from receiver."

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    iget-object v0, p0, Lcom/google/android/gms/vision/a$e;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v0}, Lcom/google/android/gms/vision/a;->b(Lcom/google/android/gms/vision/a;)Landroid/hardware/Camera;

    move-result-object v0

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/vision/a$e;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v1}, Lcom/google/android/gms/vision/a;->b(Lcom/google/android/gms/vision/a;)Landroid/hardware/Camera;

    move-result-object v1

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    throw v0
.end method
