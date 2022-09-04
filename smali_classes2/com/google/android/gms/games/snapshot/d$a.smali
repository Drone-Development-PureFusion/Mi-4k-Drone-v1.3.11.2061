.class public final Lcom/google/android/gms/games/snapshot/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/snapshot/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/Long;

.field private c:Ljava/lang/Long;

.field private d:Lcom/google/android/gms/common/data/BitmapTeleporter;

.field private e:Landroid/net/Uri;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)Lcom/google/android/gms/games/snapshot/d$a;
    .locals 1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/d$a;->b:Ljava/lang/Long;

    return-object p0
.end method

.method public a(Landroid/graphics/Bitmap;)Lcom/google/android/gms/games/snapshot/d$a;
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/data/BitmapTeleporter;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/data/BitmapTeleporter;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/d$a;->d:Lcom/google/android/gms/common/data/BitmapTeleporter;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/d$a;->e:Landroid/net/Uri;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)Lcom/google/android/gms/games/snapshot/d$a;
    .locals 5

    const/4 v4, 0x0

    invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/d$a;->a:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->l()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/d$a;->b:Ljava/lang/Long;

    invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->n()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/d$a;->c:Ljava/lang/Long;

    iget-object v0, p0, Lcom/google/android/gms/games/snapshot/d$a;->b:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iput-object v4, p0, Lcom/google/android/gms/games/snapshot/d$a;->b:Ljava/lang/Long;

    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->f()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/d$a;->e:Landroid/net/Uri;

    iget-object v0, p0, Lcom/google/android/gms/games/snapshot/d$a;->e:Landroid/net/Uri;

    if-eqz v0, :cond_1

    iput-object v4, p0, Lcom/google/android/gms/games/snapshot/d$a;->d:Lcom/google/android/gms/common/data/BitmapTeleporter;

    :cond_1
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/games/snapshot/d$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/snapshot/d$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/games/snapshot/d;
    .locals 6

    new-instance v0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChangeEntity;

    iget-object v1, p0, Lcom/google/android/gms/games/snapshot/d$a;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/games/snapshot/d$a;->b:Ljava/lang/Long;

    iget-object v3, p0, Lcom/google/android/gms/games/snapshot/d$a;->d:Lcom/google/android/gms/common/data/BitmapTeleporter;

    iget-object v4, p0, Lcom/google/android/gms/games/snapshot/d$a;->e:Landroid/net/Uri;

    iget-object v5, p0, Lcom/google/android/gms/games/snapshot/d$a;->c:Ljava/lang/Long;

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChangeEntity;-><init>(Ljava/lang/String;Ljava/lang/Long;Lcom/google/android/gms/common/data/BitmapTeleporter;Landroid/net/Uri;Ljava/lang/Long;)V

    return-object v0
.end method

.method public b(J)Lcom/google/android/gms/games/snapshot/d$a;
    .locals 1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/d$a;->c:Ljava/lang/Long;

    return-object p0
.end method
