.class final Lcom/google/android/gms/games/internal/d$aw;
.super Lcom/google/android/gms/games/internal/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "aw"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/games/n$g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ahl$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/games/n$g;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$aw;->a:Lcom/google/android/gms/internal/ahl$b;

    return-void
.end method


# virtual methods
.method public f(ILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$aw;->a:Lcom/google/android/gms/internal/ahl$b;

    new-instance v1, Lcom/google/android/gms/games/internal/d$fe;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/d$fe;-><init>(ILandroid/os/Bundle;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void
.end method
