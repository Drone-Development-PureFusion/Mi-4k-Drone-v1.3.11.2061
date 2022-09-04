.class Lcom/google/android/gms/internal/ft$g;
.super Lcom/google/android/gms/internal/aiv;

# interfaces
.implements Lcom/google/android/gms/internal/gd;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ft;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResultT:",
        "Ljava/lang/Object;",
        "CallbackT:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/aiv",
        "<",
        "Lcom/google/android/gms/internal/fu;",
        "TResultT;>;",
        "Lcom/google/android/gms/internal/gd",
        "<TResultT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ft;

.field private b:Lcom/google/android/gms/internal/ge;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ge",
            "<TResultT;TCallbackT;>;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/g/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/g/g",
            "<TResultT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ft;Lcom/google/android/gms/internal/ge;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ge",
            "<TResultT;TCallbackT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ft$g;->a:Lcom/google/android/gms/internal/ft;

    invoke-direct {p0}, Lcom/google/android/gms/internal/aiv;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ft$g;->b:Lcom/google/android/gms/internal/ge;

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$g;->b:Lcom/google/android/gms/internal/ge;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/android/gms/internal/gd;)Lcom/google/android/gms/internal/ge;

    return-void
.end method


# virtual methods
.method protected synthetic a(Lcom/google/android/gms/common/api/a$c;Lcom/google/android/gms/g/g;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/fu;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ft$g;->a(Lcom/google/android/gms/internal/fu;Lcom/google/android/gms/g/g;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/fu;Lcom/google/android/gms/g/g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/fu;",
            "Lcom/google/android/gms/g/g",
            "<TResultT;>;)V"
        }
    .end annotation

    iput-object p2, p0, Lcom/google/android/gms/internal/ft$g;->c:Lcom/google/android/gms/g/g;

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$g;->b:Lcom/google/android/gms/internal/ge;

    invoke-interface {p1}, Lcom/google/android/gms/internal/fu;->t_()Lcom/google/android/gms/internal/ga;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/android/gms/internal/ga;)V

    return-void
.end method

.method public final a(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResultT;",
            "Lcom/google/android/gms/common/api/Status;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$g;->c:Lcom/google/android/gms/g/g;

    const-string v1, "doExecute must be called before onComplete"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$g;->c:Lcom/google/android/gms/g/g;

    invoke-static {p2}, Lcom/google/android/gms/internal/fw;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/firebase/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ft$g;->c:Lcom/google/android/gms/g/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method
