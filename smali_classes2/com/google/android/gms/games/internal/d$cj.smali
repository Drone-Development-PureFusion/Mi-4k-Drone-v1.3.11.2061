.class final Lcom/google/android/gms/games/internal/d$cj;
.super Lcom/google/android/gms/games/internal/d$ax;

# interfaces
.implements Lcom/google/android/gms/games/quest/f$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "cj"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/data/DataHolder;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/d$ax;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$cj;->a:Lcom/google/android/gms/common/data/DataHolder;

    return-void
.end method


# virtual methods
.method public c()Lcom/google/android/gms/games/quest/c;
    .locals 2

    new-instance v0, Lcom/google/android/gms/games/quest/c;

    iget-object v1, p0, Lcom/google/android/gms/games/internal/d$cj;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1}, Lcom/google/android/gms/games/quest/c;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-object v0
.end method
