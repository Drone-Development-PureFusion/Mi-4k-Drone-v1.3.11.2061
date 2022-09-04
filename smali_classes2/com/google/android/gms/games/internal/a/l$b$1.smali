.class Lcom/google/android/gms/games/internal/a/l$b$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/request/g$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/l$b;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/request/g$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/Status;

.field final synthetic b:Lcom/google/android/gms/games/internal/a/l$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/l$b;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/l$b$1;->b:Lcom/google/android/gms/games/internal/a/l$b;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/a/l$b$1;->a:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/a/l$b$1;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public a(I)Lcom/google/android/gms/games/request/a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/a/l$b$1;->a:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->i()I

    move-result v0

    new-instance v1, Lcom/google/android/gms/games/request/a;

    invoke-static {v0}, Lcom/google/android/gms/common/data/DataHolder;->b(I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/games/request/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-object v1
.end method

.method public b()V
    .locals 0

    return-void
.end method
