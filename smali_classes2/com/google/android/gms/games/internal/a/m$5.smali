.class Lcom/google/android/gms/games/internal/a/m$5;
.super Lcom/google/android/gms/games/internal/a/m$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/m;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/d;Lcom/google/android/gms/games/snapshot/SnapshotContents;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/google/android/gms/games/snapshot/d;

.field final synthetic d:Lcom/google/android/gms/games/snapshot/SnapshotContents;

.field final synthetic e:Lcom/google/android/gms/games/internal/a/m;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/m;Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/d;Lcom/google/android/gms/games/snapshot/SnapshotContents;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/m$5;->e:Lcom/google/android/gms/games/internal/a/m;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/a/m$5;->a:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/games/internal/a/m$5;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/games/internal/a/m$5;->c:Lcom/google/android/gms/games/snapshot/d;

    iput-object p6, p0, Lcom/google/android/gms/games/internal/a/m$5;->d:Lcom/google/android/gms/games/snapshot/SnapshotContents;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/games/internal/a/m$d;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/m$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/m$5;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 6

    iget-object v2, p0, Lcom/google/android/gms/games/internal/a/m$5;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/games/internal/a/m$5;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/games/internal/a/m$5;->c:Lcom/google/android/gms/games/snapshot/d;

    iget-object v5, p0, Lcom/google/android/gms/games/internal/a/m$5;->d:Lcom/google/android/gms/games/snapshot/SnapshotContents;

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/d;Lcom/google/android/gms/games/snapshot/SnapshotContents;)V

    return-void
.end method
