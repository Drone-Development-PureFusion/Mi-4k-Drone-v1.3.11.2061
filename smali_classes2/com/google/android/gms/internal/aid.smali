.class public Lcom/google/android/gms/internal/aid;
.super Lcom/google/android/gms/internal/ahu;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lcom/google/android/gms/common/api/a$a;",
        ">",
        "Lcom/google/android/gms/internal/ahu;"
    }
.end annotation


# instance fields
.field private final c:Lcom/google/android/gms/common/api/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/u",
            "<TO;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/u;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/u",
            "<TO;>;)V"
        }
    .end annotation

    const-string v0, "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method."

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ahu;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/aid;->c:Lcom/google/android/gms/common/api/u;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;
    .locals 1
    .param p1    # Lcom/google/android/gms/internal/ahl$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/a$c;",
            "R::",
            "Lcom/google/android/gms/common/api/m;",
            "T:",
            "Lcom/google/android/gms/internal/ahl$a",
            "<TR;TA;>;>(TT;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aid;->c:Lcom/google/android/gms/common/api/u;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/u;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/aiw;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aid;->c:Lcom/google/android/gms/common/api/u;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/u;->b()V

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;
    .locals 1
    .param p1    # Lcom/google/android/gms/internal/ahl$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/a$c;",
            "T:",
            "Lcom/google/android/gms/internal/ahl$a",
            "<+",
            "Lcom/google/android/gms/common/api/m;",
            "TA;>;>(TT;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aid;->c:Lcom/google/android/gms/common/api/u;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/u;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/aiw;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aid;->c:Lcom/google/android/gms/common/api/u;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/u;->c()V

    return-void
.end method

.method public c()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aid;->c:Lcom/google/android/gms/common/api/u;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/u;->h()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method
