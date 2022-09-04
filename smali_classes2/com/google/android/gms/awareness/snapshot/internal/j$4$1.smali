.class Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/awareness/snapshot/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/awareness/snapshot/internal/j$4;->a(Lcom/google/android/gms/awareness/snapshot/internal/m;)Lcom/google/android/gms/awareness/snapshot/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/awareness/snapshot/internal/m;

.field final synthetic b:Lcom/google/android/gms/awareness/snapshot/internal/j$4;

.field private c:Z

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/places/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/awareness/snapshot/internal/j$4;Lcom/google/android/gms/awareness/snapshot/internal/m;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;->b:Lcom/google/android/gms/awareness/snapshot/internal/j$4;

    iput-object p2, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;->a:Lcom/google/android/gms/awareness/snapshot/internal/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;->c:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;->a:Lcom/google/android/gms/awareness/snapshot/internal/m;

    invoke-interface {v0}, Lcom/google/android/gms/awareness/snapshot/internal/m;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/places/g;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;->c:Z

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;->d:Ljava/util/List;

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;->c:Z

    iget-object v1, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;->a:Lcom/google/android/gms/awareness/snapshot/internal/m;

    invoke-interface {v1}, Lcom/google/android/gms/awareness/snapshot/internal/m;->b()Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;->a:Lcom/google/android/gms/awareness/snapshot/internal/m;

    invoke-interface {v1}, Lcom/google/android/gms/awareness/snapshot/internal/m;->b()Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->f()Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/google/android/gms/awareness/snapshot/internal/f;

    invoke-direct {v2, v1}, Lcom/google/android/gms/awareness/snapshot/internal/f;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    :try_start_0
    invoke-virtual {v2}, Lcom/google/android/gms/awareness/snapshot/internal/f;->c()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-gtz v1, :cond_2

    invoke-virtual {v2}, Lcom/google/android/gms/awareness/snapshot/internal/f;->b()V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {v2, v0}, Lcom/google/android/gms/common/data/k;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    check-cast v0, Lcom/google/android/gms/awareness/snapshot/internal/PlacesData;

    invoke-virtual {v0}, Lcom/google/android/gms/awareness/snapshot/internal/PlacesData;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;->d:Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;->d:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v2}, Lcom/google/android/gms/awareness/snapshot/internal/f;->b()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/google/android/gms/awareness/snapshot/internal/f;->b()V

    throw v0
.end method
