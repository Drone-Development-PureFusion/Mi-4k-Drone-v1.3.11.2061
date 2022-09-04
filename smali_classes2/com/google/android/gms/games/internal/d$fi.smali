.class final Lcom/google/android/gms/games/internal/d$fi;
.super Lcom/google/android/gms/games/internal/d$ax;

# interfaces
.implements Lcom/google/android/gms/games/request/g$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "fi"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/internal/request/b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/d$ax;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-static {p1}, Lcom/google/android/gms/games/internal/request/b;->a(Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/games/internal/request/b;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$fi;->a:Lcom/google/android/gms/games/internal/request/b;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$fi;->a:Lcom/google/android/gms/games/internal/request/b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/games/internal/request/b;->a(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$fi;->a:Lcom/google/android/gms/games/internal/request/b;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/request/b;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
