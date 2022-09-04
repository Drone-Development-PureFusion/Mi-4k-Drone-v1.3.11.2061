.class public final Lcom/google/android/gms/games/internal/a/m;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/snapshot/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/internal/a/m$b;,
        Lcom/google/android/gms/games/internal/a/m$a;,
        Lcom/google/android/gms/games/internal/a/m$d;,
        Lcom/google/android/gms/games/internal/a/m$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)I
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/d;->R()I

    move-result v0

    return v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;ZZI)Landroid/content/Intent;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4, p5}, Lcom/google/android/gms/games/internal/d;->a(Ljava/lang/String;ZZI)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/snapshot/Snapshot;Lcom/google/android/gms/games/snapshot/d;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/games/snapshot/Snapshot;",
            "Lcom/google/android/gms/games/snapshot/d;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/snapshot/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/m$3;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/games/internal/a/m$3;-><init>(Lcom/google/android/gms/games/internal/a/m;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/snapshot/Snapshot;Lcom/google/android/gms/games/snapshot/d;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/games/snapshot/SnapshotMetadata;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/snapshot/g$d;",
            ">;"
        }
    .end annotation

    invoke-interface {p2}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/games/internal/a/m;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Z)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/snapshot/SnapshotMetadata;I)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/games/snapshot/SnapshotMetadata;",
            "I)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/snapshot/g$d;",
            ">;"
        }
    .end annotation

    invoke-interface {p2}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1, p3}, Lcom/google/android/gms/games/internal/a/m;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;ZI)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/Snapshot;)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/games/snapshot/Snapshot;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/snapshot/g$d;",
            ">;"
        }
    .end annotation

    invoke-interface {p3}, Lcom/google/android/gms/games/snapshot/Snapshot;->c()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/games/snapshot/d$a;

    invoke-direct {v1}, Lcom/google/android/gms/games/snapshot/d$a;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/snapshot/d$a;->a(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)Lcom/google/android/gms/games/snapshot/d$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/games/snapshot/d$a;->a()Lcom/google/android/gms/games/snapshot/d;

    move-result-object v4

    invoke-interface {v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->e()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p3}, Lcom/google/android/gms/games/snapshot/Snapshot;->d()Lcom/google/android/gms/games/snapshot/SnapshotContents;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/games/internal/a/m;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/d;Lcom/google/android/gms/games/snapshot/SnapshotContents;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/d;Lcom/google/android/gms/games/snapshot/SnapshotContents;)Lcom/google/android/gms/common/api/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/games/snapshot/d;",
            "Lcom/google/android/gms/games/snapshot/SnapshotContents;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/snapshot/g$d;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/m$5;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/games/internal/a/m$5;-><init>(Lcom/google/android/gms/games/internal/a/m;Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/d;Lcom/google/android/gms/games/snapshot/SnapshotContents;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Z)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/snapshot/g$d;",
            ">;"
        }
    .end annotation

    const/4 v0, -0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/games/internal/a/m;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;ZI)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;ZI)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "ZI)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/snapshot/g$d;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/m$2;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/games/internal/a/m$2;-><init>(Lcom/google/android/gms/games/internal/a/m;Lcom/google/android/gms/common/api/g;Ljava/lang/String;ZI)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Z)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/snapshot/g$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/m$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/games/internal/a/m$1;-><init>(Lcom/google/android/gms/games/internal/a/m;Lcom/google/android/gms/common/api/g;Z)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/os/Bundle;)Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "com.google.android.gms.games.SNAPSHOT_METADATA"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    const-string v0, "com.google.android.gms.games.SNAPSHOT_METADATA"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/snapshot/Snapshot;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/games/snapshot/Snapshot;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/common/api/g;)I
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/d;->S()I

    move-result v0

    return v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/games/snapshot/SnapshotMetadata;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/snapshot/g$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/m$4;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/games/internal/a/m$4;-><init>(Lcom/google/android/gms/games/internal/a/m;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
