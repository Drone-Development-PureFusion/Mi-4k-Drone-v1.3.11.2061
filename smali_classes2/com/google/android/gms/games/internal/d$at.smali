.class final Lcom/google/android/gms/games/internal/d$at;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "at"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Ljava/lang/String;

.field private final c:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->e()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/games/f;->a(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$at;->a:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->g()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "external_game_id"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/common/data/DataHolder;->c(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$at;->b:Ljava/lang/String;

    const-string v0, "muted"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/common/data/DataHolder;->d(Ljava/lang/String;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/internal/d$at;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$at;->b:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/games/internal/d$at;->c:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    throw v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$at;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
