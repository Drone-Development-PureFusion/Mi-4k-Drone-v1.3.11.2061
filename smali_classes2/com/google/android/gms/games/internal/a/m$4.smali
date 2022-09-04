.class Lcom/google/android/gms/games/internal/a/m$4;
.super Lcom/google/android/gms/games/internal/a/m$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/m;->b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

.field final synthetic b:Lcom/google/android/gms/games/internal/a/m;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/m;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/m$4;->b:Lcom/google/android/gms/games/internal/a/m;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/a/m$4;->a:Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/games/internal/a/m$b;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/m$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/m$4;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/a/m$4;->a:Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    invoke-interface {v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/games/internal/d;->i(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;)V

    return-void
.end method
