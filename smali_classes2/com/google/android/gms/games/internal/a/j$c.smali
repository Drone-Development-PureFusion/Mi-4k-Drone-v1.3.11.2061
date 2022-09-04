.class abstract Lcom/google/android/gms/games/internal/a/j$c;
.super Lcom/google/android/gms/games/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/a/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/games/c$a",
        "<",
        "Lcom/google/android/gms/games/quest/f$c;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>(Lcom/google/android/gms/common/api/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/c$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/j$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/a/j$c;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/quest/f$c;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/a/j$c$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/a/j$c$1;-><init>(Lcom/google/android/gms/games/internal/a/j$c;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/j$c;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/quest/f$c;

    move-result-object v0

    return-object v0
.end method
