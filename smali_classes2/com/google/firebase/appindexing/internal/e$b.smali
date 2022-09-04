.class abstract Lcom/google/firebase/appindexing/internal/e$b;
.super Lcom/google/android/gms/internal/aiv;

# interfaces
.implements Lcom/google/android/gms/internal/ahl$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/appindexing/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/aiv",
        "<",
        "Lcom/google/android/gms/internal/aee;",
        "Ljava/lang/Void;",
        ">;",
        "Lcom/google/android/gms/internal/ahl$b",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field protected c:Lcom/google/android/gms/g/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/g/g",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aiv;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/firebase/appindexing/internal/e$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/appindexing/internal/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/appindexing/internal/e$b;->c:Lcom/google/android/gms/g/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/appindexing/internal/e$b;->c:Lcom/google/android/gms/g/g;

    const-string v1, "User Action indexing error, please try again."

    invoke-static {p1, v1}, Lcom/google/firebase/appindexing/internal/k;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;)Lcom/google/firebase/appindexing/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method protected synthetic a(Lcom/google/android/gms/common/api/a$c;Lcom/google/android/gms/g/g;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/aee;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/appindexing/internal/e$b;->a(Lcom/google/android/gms/internal/aee;Lcom/google/android/gms/g/g;)V

    return-void
.end method

.method protected abstract a(Lcom/google/android/gms/internal/aeb;)V
.end method

.method protected final a(Lcom/google/android/gms/internal/aee;Lcom/google/android/gms/g/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/aee;",
            "Lcom/google/android/gms/g/g",
            "<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iput-object p2, p0, Lcom/google/firebase/appindexing/internal/e$b;->c:Lcom/google/android/gms/g/g;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/aee;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aeb;

    invoke-virtual {p0, v0}, Lcom/google/firebase/appindexing/internal/e$b;->a(Lcom/google/android/gms/internal/aeb;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lcom/google/firebase/appindexing/internal/e$b;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public c(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->f()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Failed result must not be success."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/google/firebase/appindexing/internal/e$b;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
