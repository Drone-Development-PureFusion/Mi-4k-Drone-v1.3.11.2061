.class final Lcom/google/android/gms/games/internal/d$s;
.super Lcom/google/android/gms/games/internal/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "s"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/games/video/f$d;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/games/video/f$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/games/video/f$d;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/a;-><init>()V

    const-string v0, "Holder must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ahl$b;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$s;->a:Lcom/google/android/gms/internal/ahl$b;

    const-string v0, "Callback must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/video/f$d;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$s;->b:Lcom/google/android/gms/games/video/f$d;

    return-void
.end method


# virtual methods
.method public d(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$s;->a:Lcom/google/android/gms/internal/ahl$b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public i(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$s;->b:Lcom/google/android/gms/games/video/f$d;

    invoke-interface {v0, p1}, Lcom/google/android/gms/games/video/f$d;->a(I)V

    return-void
.end method
