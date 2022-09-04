.class final Lcom/google/android/gms/games/internal/d$cc;
.super Lcom/google/android/gms/games/internal/d$ax;

# interfaces
.implements Lcom/google/android/gms/games/multiplayer/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "cc"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/multiplayer/a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/d$ax;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v0, Lcom/google/android/gms/games/multiplayer/a;

    invoke-direct {v0, p1}, Lcom/google/android/gms/games/multiplayer/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cc;->a:Lcom/google/android/gms/games/multiplayer/a;

    return-void
.end method


# virtual methods
.method public c()Lcom/google/android/gms/games/multiplayer/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cc;->a:Lcom/google/android/gms/games/multiplayer/a;

    return-object v0
.end method
