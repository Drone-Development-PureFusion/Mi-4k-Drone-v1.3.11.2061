.class Lcom/google/android/gms/awareness/snapshot/internal/j$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/awareness/snapshot/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/awareness/snapshot/internal/j$2;->a(Lcom/google/android/gms/awareness/snapshot/internal/m;)Lcom/google/android/gms/awareness/snapshot/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/awareness/snapshot/internal/m;

.field final synthetic b:Lcom/google/android/gms/awareness/snapshot/internal/j$2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/awareness/snapshot/internal/j$2;Lcom/google/android/gms/awareness/snapshot/internal/m;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$2$1;->b:Lcom/google/android/gms/awareness/snapshot/internal/j$2;

    iput-object p2, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$2$1;->a:Lcom/google/android/gms/awareness/snapshot/internal/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$2$1;->a:Lcom/google/android/gms/awareness/snapshot/internal/m;

    invoke-interface {v0}, Lcom/google/android/gms/awareness/snapshot/internal/m;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/android/gms/awareness/state/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$2$1;->a:Lcom/google/android/gms/awareness/snapshot/internal/m;

    invoke-interface {v0}, Lcom/google/android/gms/awareness/snapshot/internal/m;->b()Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$2$1;->a:Lcom/google/android/gms/awareness/snapshot/internal/m;

    invoke-interface {v0}, Lcom/google/android/gms/awareness/snapshot/internal/m;->b()Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->c()Lcom/google/android/gms/awareness/snapshot/internal/HeadphoneStateImpl;

    move-result-object v0

    goto :goto_0
.end method
