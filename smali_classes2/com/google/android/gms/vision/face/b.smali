.class public final Lcom/google/android/gms/vision/face/b;
.super Lcom/google/android/gms/vision/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/face/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/vision/b",
        "<",
        "Lcom/google/android/gms/vision/face/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x0

.field public static final d:I = 0x1

.field public static final e:I = 0x0

.field public static final f:I = 0x1


# instance fields
.field private final g:Lcom/google/android/gms/vision/h;

.field private final h:Lcom/google/android/gms/vision/face/internal/client/a;

.field private final i:Ljava/lang/Object;

.field private j:Z


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/vision/b;-><init>()V

    new-instance v0, Lcom/google/android/gms/vision/h;

    invoke-direct {v0}, Lcom/google/android/gms/vision/h;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/face/b;->g:Lcom/google/android/gms/vision/h;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/face/b;->i:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/vision/face/b;->j:Z

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Default constructor called"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private constructor <init>(Lcom/google/android/gms/vision/face/internal/client/a;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/vision/b;-><init>()V

    new-instance v0, Lcom/google/android/gms/vision/h;

    invoke-direct {v0}, Lcom/google/android/gms/vision/h;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/face/b;->g:Lcom/google/android/gms/vision/h;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/face/b;->i:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/vision/face/b;->j:Z

    iput-object p1, p0, Lcom/google/android/gms/vision/face/b;->h:Lcom/google/android/gms/vision/face/internal/client/a;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/vision/face/internal/client/a;Lcom/google/android/gms/vision/face/b$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/vision/face/b;-><init>(Lcom/google/android/gms/vision/face/internal/client/a;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/vision/d;)Landroid/util/SparseArray;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/d;",
            ")",
            "Landroid/util/SparseArray",
            "<",
            "Lcom/google/android/gms/vision/face/a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No frame supplied."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/vision/d;->b()Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/vision/face/b;->i:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-boolean v3, p0, Lcom/google/android/gms/vision/face/b;->j:Z

    if-nez v3, :cond_1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Cannot use detector after release()"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    iget-object v3, p0, Lcom/google/android/gms/vision/face/b;->h:Lcom/google/android/gms/vision/face/internal/client/a;

    invoke-static {p1}, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->a(Lcom/google/android/gms/vision/d;)Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lcom/google/android/gms/vision/face/internal/client/a;->a(Ljava/nio/ByteBuffer;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;)[Lcom/google/android/gms/vision/face/a;

    move-result-object v3

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    new-instance v5, Landroid/util/SparseArray;

    array-length v1, v3

    invoke-direct {v5, v1}, Landroid/util/SparseArray;-><init>(I)V

    array-length v6, v3

    move v2, v0

    move v1, v0

    :goto_0
    if-ge v2, v6, :cond_3

    aget-object v7, v3, v2

    invoke-virtual {v7}, Lcom/google/android/gms/vision/face/a;->j()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v8, p0, Lcom/google/android/gms/vision/face/b;->g:Lcom/google/android/gms/vision/h;

    invoke-virtual {v8, v0}, Lcom/google/android/gms/vision/h;->a(I)I

    move-result v0

    invoke-virtual {v5, v0, v7}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_3
    return-object v5
.end method

.method public a()V
    .locals 2

    invoke-super {p0}, Lcom/google/android/gms/vision/b;->a()V

    iget-object v1, p0, Lcom/google/android/gms/vision/face/b;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/vision/face/b;->j:Z

    if-nez v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/face/b;->h:Lcom/google/android/gms/vision/face/internal/client/a;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/face/internal/client/a;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/vision/face/b;->j:Z

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(I)Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/vision/face/b;->g:Lcom/google/android/gms/vision/h;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/vision/h;->b(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/vision/face/b;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v2, p0, Lcom/google/android/gms/vision/face/b;->j:Z

    if-nez v2, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Cannot use detector after release()"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/vision/face/b;->h:Lcom/google/android/gms/vision/face/internal/client/a;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/vision/face/internal/client/a;->a(I)Z

    move-result v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/face/b;->h:Lcom/google/android/gms/vision/face/internal/client/a;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/face/internal/client/a;->b()Z

    move-result v0

    return v0
.end method

.method protected finalize()V
    .locals 3

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/vision/face/b;->i:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v0, p0, Lcom/google/android/gms/vision/face/b;->j:Z

    if-eqz v0, :cond_0

    const-string v0, "FaceDetector"

    const-string v2, "FaceDetector was not released with FaceDetector.release()"

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/google/android/gms/vision/face/b;->a()V

    :cond_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    throw v0
.end method
