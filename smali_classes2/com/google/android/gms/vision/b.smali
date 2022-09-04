.class public abstract Lcom/google/android/gms/vision/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/b$b;,
        Lcom/google/android/gms/vision/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Object;

.field private b:Lcom/google/android/gms/vision/b$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/vision/b$b",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/b;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/vision/d;)Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/d;",
            ")",
            "Landroid/util/SparseArray",
            "<TT;>;"
        }
    .end annotation
.end method

.method public a()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/vision/b;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/vision/b;->b:Lcom/google/android/gms/vision/b$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/vision/b;->b:Lcom/google/android/gms/vision/b$b;

    invoke-interface {v0}, Lcom/google/android/gms/vision/b$b;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/vision/b;->b:Lcom/google/android/gms/vision/b$b;

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Lcom/google/android/gms/vision/b$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/b$b",
            "<TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/vision/b;->b:Lcom/google/android/gms/vision/b$b;

    return-void
.end method

.method public a(I)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b(Lcom/google/android/gms/vision/d;)V
    .locals 5

    iget-object v1, p0, Lcom/google/android/gms/vision/b;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/vision/b;->b:Lcom/google/android/gms/vision/b$b;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Detector processor must first be set with setProcessor in order to receive detection results."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/vision/d$b;

    invoke-virtual {p1}, Lcom/google/android/gms/vision/d;->a()Lcom/google/android/gms/vision/d$b;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/android/gms/vision/d$b;-><init>(Lcom/google/android/gms/vision/d$b;)V

    invoke-virtual {v0}, Lcom/google/android/gms/vision/d$b;->g()V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/vision/b;->a(Lcom/google/android/gms/vision/d;)Landroid/util/SparseArray;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/vision/b;->b()Z

    move-result v3

    new-instance v4, Lcom/google/android/gms/vision/b$a;

    invoke-direct {v4, v2, v0, v3}, Lcom/google/android/gms/vision/b$a;-><init>(Landroid/util/SparseArray;Lcom/google/android/gms/vision/d$b;Z)V

    iget-object v0, p0, Lcom/google/android/gms/vision/b;->b:Lcom/google/android/gms/vision/b$b;

    invoke-interface {v0, v4}, Lcom/google/android/gms/vision/b$b;->a(Lcom/google/android/gms/vision/b$a;)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
