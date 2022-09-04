.class final Lcom/google/android/gms/games/internal/d$co;
.super Lcom/google/android/gms/games/internal/d$ax;

# interfaces
.implements Lcom/google/android/gms/games/n$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "co"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/internal/player/d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/d$ax;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v0, Lcom/google/android/gms/games/internal/player/d;

    invoke-direct {v0, p1}, Lcom/google/android/gms/games/internal/player/d;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$co;->a:Lcom/google/android/gms/games/internal/player/d;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$co;->b:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
