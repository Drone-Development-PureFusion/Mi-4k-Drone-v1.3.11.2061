.class final Lcom/google/android/gms/games/internal/d$ci;
.super Lcom/google/android/gms/games/internal/d$ax;

# interfaces
.implements Lcom/google/android/gms/games/n$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ci"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/j;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/d$ax;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v0, Lcom/google/android/gms/games/j;

    invoke-direct {v0, p1}, Lcom/google/android/gms/games/j;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$ci;->a:Lcom/google/android/gms/games/j;

    return-void
.end method


# virtual methods
.method public c()Lcom/google/android/gms/games/j;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ci;->a:Lcom/google/android/gms/games/j;

    return-object v0
.end method
