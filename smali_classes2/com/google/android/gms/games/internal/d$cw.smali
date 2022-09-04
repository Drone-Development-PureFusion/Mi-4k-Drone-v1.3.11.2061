.class final Lcom/google/android/gms/games/internal/d$cw;
.super Lcom/google/android/gms/games/internal/d$ax;

# interfaces
.implements Lcom/google/android/gms/games/snapshot/g$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "cw"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/snapshot/Snapshot;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/google/android/gms/games/snapshot/Snapshot;

.field private final f:Lcom/google/android/gms/drive/Contents;

.field private final g:Lcom/google/android/gms/games/snapshot/SnapshotContents;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/drive/Contents;)V
    .locals 6

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, v2

    move-object v5, v2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/games/internal/d$cw;-><init>(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;Lcom/google/android/gms/drive/Contents;Lcom/google/android/gms/drive/Contents;Lcom/google/android/gms/drive/Contents;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;Lcom/google/android/gms/drive/Contents;Lcom/google/android/gms/drive/Contents;Lcom/google/android/gms/drive/Contents;)V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/d$ax;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v2, Lcom/google/android/gms/games/snapshot/c;

    invoke-direct {v2, p1}, Lcom/google/android/gms/games/snapshot/c;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    :try_start_0
    invoke-virtual {v2}, Lcom/google/android/gms/games/snapshot/c;->c()I

    move-result v3

    if-nez v3, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cw;->a:Lcom/google/android/gms/games/snapshot/Snapshot;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cw;->e:Lcom/google/android/gms/games/snapshot/Snapshot;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v2}, Lcom/google/android/gms/games/snapshot/c;->b()V

    iput-object p2, p0, Lcom/google/android/gms/games/internal/d$cw;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/games/internal/d$cw;->f:Lcom/google/android/gms/drive/Contents;

    new-instance v0, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;

    invoke-direct {v0, p5}, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;-><init>(Lcom/google/android/gms/drive/Contents;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cw;->g:Lcom/google/android/gms/games/snapshot/SnapshotContents;

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v2}, Lcom/google/android/gms/games/snapshot/c;->c()I

    move-result v3

    if-ne v3, v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->e()I

    move-result v3

    const/16 v4, 0xfa4

    if-eq v3, v4, :cond_1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->a(Z)V

    new-instance v1, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/games/snapshot/c;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    invoke-direct {v1, v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;-><init>(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V

    new-instance v0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;

    new-instance v3, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;

    invoke-direct {v3, p3}, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;-><init>(Lcom/google/android/gms/drive/Contents;)V

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;-><init>(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cw;->a:Lcom/google/android/gms/games/snapshot/Snapshot;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cw;->e:Lcom/google/android/gms/games/snapshot/Snapshot;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/google/android/gms/games/snapshot/c;->b()V

    throw v0

    :cond_1
    move v0, v1

    goto :goto_1

    :cond_2
    :try_start_2
    new-instance v1, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/games/snapshot/c;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    invoke-direct {v1, v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;-><init>(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V

    new-instance v0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;

    new-instance v3, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;

    invoke-direct {v3, p3}, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;-><init>(Lcom/google/android/gms/drive/Contents;)V

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;-><init>(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cw;->a:Lcom/google/android/gms/games/snapshot/Snapshot;

    new-instance v1, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/google/android/gms/games/snapshot/c;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    invoke-direct {v1, v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;-><init>(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V

    new-instance v0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;

    new-instance v3, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;

    invoke-direct {v3, p4}, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;-><init>(Lcom/google/android/gms/drive/Contents;)V

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;-><init>(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cw;->e:Lcom/google/android/gms/games/snapshot/Snapshot;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method


# virtual methods
.method public c()Lcom/google/android/gms/games/snapshot/Snapshot;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cw;->a:Lcom/google/android/gms/games/snapshot/Snapshot;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cw;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/games/snapshot/Snapshot;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cw;->e:Lcom/google/android/gms/games/snapshot/Snapshot;

    return-object v0
.end method

.method public f()Lcom/google/android/gms/games/snapshot/SnapshotContents;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cw;->g:Lcom/google/android/gms/games/snapshot/SnapshotContents;

    return-object v0
.end method
