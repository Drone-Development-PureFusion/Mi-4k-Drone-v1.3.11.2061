.class abstract Lcom/google/android/gms/internal/ge;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ge$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<SuccessT:",
        "Ljava/lang/Object;",
        "CallbackT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final a:I

.field protected final b:Lcom/google/android/gms/internal/ge$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ge$a;"
        }
    .end annotation
.end field

.field protected c:Lcom/google/firebase/b;

.field protected d:Lcom/google/firebase/auth/n;

.field protected e:Lcom/google/android/gms/internal/ga;

.field protected f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TCallbackT;"
        }
    .end annotation
.end field

.field protected g:Lcom/google/android/gms/internal/gd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/gd",
            "<TSuccessT;>;"
        }
    .end annotation
.end field

.field protected h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

.field protected i:Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

.field protected j:Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;

.field k:Z

.field l:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TSuccessT;"
        }
    .end annotation
.end field

.field m:Lcom/google/android/gms/common/api/Status;

.field private n:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ge$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ge$a;-><init>(Lcom/google/android/gms/internal/ge;Lcom/google/android/gms/internal/ge$1;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ge;->b:Lcom/google/android/gms/internal/ge$a;

    iput p1, p0, Lcom/google/android/gms/internal/ge;->a:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ge;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ge;->d()V

    return-void
.end method

.method private d()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ge;->b()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ge;->n:Z

    const-string v1, "no success or failure set on method implementation"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/gd;)Lcom/google/android/gms/internal/ge;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/gd",
            "<TSuccessT;>;)",
            "Lcom/google/android/gms/internal/ge",
            "<TSuccessT;TCallbackT;>;"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ge;->g:Lcom/google/android/gms/internal/gd;

    return-object p0
.end method

.method public a(Lcom/google/firebase/auth/n;)Lcom/google/android/gms/internal/ge;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/n;",
            ")",
            "Lcom/google/android/gms/internal/ge",
            "<TSuccessT;TCallbackT;>;"
        }
    .end annotation

    const-string v0, "firebaseUser cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/n;

    iput-object v0, p0, Lcom/google/android/gms/internal/ge;->d:Lcom/google/firebase/auth/n;

    return-object p0
.end method

.method public a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/ge;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/b;",
            ")",
            "Lcom/google/android/gms/internal/ge",
            "<TSuccessT;TCallbackT;>;"
        }
    .end annotation

    const-string v0, "firebaseApp cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/b;

    iput-object v0, p0, Lcom/google/android/gms/internal/ge;->c:Lcom/google/firebase/b;

    return-object p0
.end method

.method public a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ge;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCallbackT;)",
            "Lcom/google/android/gms/internal/ge",
            "<TSuccessT;TCallbackT;>;"
        }
    .end annotation

    const-string v0, "external callback cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ge;->f:Ljava/lang/Object;

    return-object p0
.end method

.method protected abstract a()V
.end method

.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ge;->n:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ge;->k:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ge;->m:Lcom/google/android/gms/common/api/Status;

    iget-object v0, p0, Lcom/google/android/gms/internal/ge;->g:Lcom/google/android/gms/internal/gd;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/gd;->a(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ga;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ge;->e:Lcom/google/android/gms/internal/ga;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ge;->a()V

    return-void
.end method

.method public abstract b()V
.end method

.method public b(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSuccessT;)V"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ge;->n:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ge;->k:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ge;->l:Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ge;->g:Lcom/google/android/gms/internal/gd;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/gd;->a(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ge;->b(Ljava/lang/Object;)V

    return-void
.end method
