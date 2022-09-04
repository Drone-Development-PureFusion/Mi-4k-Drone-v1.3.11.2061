.class Lcom/google/android/gms/games/internal/a/f$c$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/a/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/f$c;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/a/m$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/Status;

.field final synthetic b:Lcom/google/android/gms/games/internal/a/f$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/f$c;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/f$c$1;->b:Lcom/google/android/gms/games/internal/a/f$c;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/a/f$c$1;->a:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/a/f$c$1;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()Lcom/google/android/gms/games/a/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public d()Lcom/google/android/gms/games/a/f;
    .locals 2

    new-instance v0, Lcom/google/android/gms/games/a/f;

    const/16 v1, 0xe

    invoke-static {v1}, Lcom/google/android/gms/common/data/DataHolder;->b(I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/games/a/f;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-object v0
.end method
