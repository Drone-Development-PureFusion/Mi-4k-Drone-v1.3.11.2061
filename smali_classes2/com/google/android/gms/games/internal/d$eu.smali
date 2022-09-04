.class final Lcom/google/android/gms/games/internal/d$eu;
.super Lcom/google/android/gms/games/internal/d$ax;

# interfaces
.implements Lcom/google/android/gms/games/a/m$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "eu"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/a/n;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/d$ax;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    :try_start_0
    new-instance v0, Lcom/google/android/gms/games/a/n;

    invoke-direct {v0, p1}, Lcom/google/android/gms/games/a/n;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$eu;->a:Lcom/google/android/gms/games/a/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    throw v0
.end method


# virtual methods
.method public c()Lcom/google/android/gms/games/a/n;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$eu;->a:Lcom/google/android/gms/games/a/n;

    return-object v0
.end method
