.class final Lcom/google/android/gms/games/internal/d$o;
.super Lcom/google/android/gms/games/internal/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "o"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/games/c$a",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/c$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/games/c$a",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/a;-><init>()V

    const-string v0, "Holder must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/c$a;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$o;->a:Lcom/google/android/gms/games/c$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$o;->a:Lcom/google/android/gms/games/c$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/games/c$a;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method

.method public d(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$o;->a:Lcom/google/android/gms/games/c$a;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/games/c$a;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
