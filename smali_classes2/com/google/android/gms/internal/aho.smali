.class public Lcom/google/android/gms/internal/aho;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/g$b;
.implements Lcom/google/android/gms/common/api/g$c;


# instance fields
.field public final a:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<*>;"
        }
    .end annotation
.end field

.field private final d:I

.field private e:Lcom/google/android/gms/internal/ahp;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a",
            "<*>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/aho;->a:Lcom/google/android/gms/common/api/a;

    iput p2, p0, Lcom/google/android/gms/internal/aho;->d:I

    return-void
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aho;->e:Lcom/google/android/gms/internal/ahp;

    const-string v1, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/aho;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/aho;->e:Lcom/google/android/gms/internal/ahp;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ahp;->a(I)V

    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/internal/aho;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/aho;->e:Lcom/google/android/gms/internal/ahp;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ahp;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/internal/aho;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/aho;->e:Lcom/google/android/gms/internal/ahp;

    iget-object v1, p0, Lcom/google/android/gms/internal/aho;->a:Lcom/google/android/gms/common/api/a;

    iget v2, p0, Lcom/google/android/gms/internal/aho;->d:I

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ahp;->a(Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/api/a;I)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahp;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aho;->e:Lcom/google/android/gms/internal/ahp;

    return-void
.end method
