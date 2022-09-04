.class public final Lcom/google/android/gms/wearable/internal/bl;
.super Lcom/google/android/gms/wearable/internal/v$a;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lcom/google/android/gms/wearable/internal/bm;

.field private c:Lcom/google/android/gms/wearable/internal/be;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/wearable/internal/v$a;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/bl;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/bl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bl;->b:Lcom/google/android/gms/wearable/internal/bm;

    new-instance v2, Lcom/google/android/gms/wearable/internal/be;

    invoke-direct {v2, p1, p2}, Lcom/google/android/gms/wearable/internal/be;-><init>(II)V

    iput-object v2, p0, Lcom/google/android/gms/wearable/internal/bl;->c:Lcom/google/android/gms/wearable/internal/be;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-interface {v0, v2}, Lcom/google/android/gms/wearable/internal/bm;->a(Lcom/google/android/gms/wearable/internal/be;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(Lcom/google/android/gms/wearable/internal/bm;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/bl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/bm;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/bl;->b:Lcom/google/android/gms/wearable/internal/bm;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bl;->c:Lcom/google/android/gms/wearable/internal/be;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lcom/google/android/gms/wearable/internal/bm;->a(Lcom/google/android/gms/wearable/internal/be;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
