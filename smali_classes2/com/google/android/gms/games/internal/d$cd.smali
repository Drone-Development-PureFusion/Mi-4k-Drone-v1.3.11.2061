.class final Lcom/google/android/gms/games/internal/d$cd;
.super Lcom/google/android/gms/games/internal/d$ax;

# interfaces
.implements Lcom/google/android/gms/games/social/b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "cd"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/social/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/d$ax;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v0, Lcom/google/android/gms/games/social/c;

    invoke-direct {v0, p1}, Lcom/google/android/gms/games/social/c;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cd;->a:Lcom/google/android/gms/games/social/c;

    return-void
.end method
