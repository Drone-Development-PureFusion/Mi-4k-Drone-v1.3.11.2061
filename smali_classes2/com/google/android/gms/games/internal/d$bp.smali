.class final Lcom/google/android/gms/games/internal/d$bp;
.super Lcom/google/android/gms/games/internal/d$ax;

# interfaces
.implements Lcom/google/android/gms/games/a/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "bp"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/a/b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/d$ax;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v0, Lcom/google/android/gms/games/a/b;

    invoke-direct {v0, p1}, Lcom/google/android/gms/games/a/b;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$bp;->a:Lcom/google/android/gms/games/a/b;

    return-void
.end method


# virtual methods
.method public c()Lcom/google/android/gms/games/a/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$bp;->a:Lcom/google/android/gms/games/a/b;

    return-object v0
.end method
