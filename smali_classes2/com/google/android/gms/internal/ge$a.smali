.class Lcom/google/android/gms/internal/ge$a;
.super Lcom/google/android/gms/internal/fz$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ge;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ge;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    invoke-direct {p0}, Lcom/google/android/gms/internal/fz$a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ge;Lcom/google/android/gms/internal/ge$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ge$a;-><init>(Lcom/google/android/gms/internal/ge;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iget v0, v0, Lcom/google/android/gms/internal/ge;->a:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iget v1, v1, Lcom/google/android/gms/internal/ge;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x24

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected response type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    invoke-static {v0}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/android/gms/internal/ge;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public a(Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;)V
    .locals 4
    .param p1    # Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iget v0, v0, Lcom/google/android/gms/internal/ge;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iget v1, v1, Lcom/google/android/gms/internal/ge;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x24

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected response type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iput-object p1, v0, Lcom/google/android/gms/internal/ge;->j:Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    invoke-static {v0}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/android/gms/internal/ge;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/firebase/auth/api/model/GetTokenResponse;)V
    .locals 4
    .param p1    # Lcom/google/firebase/auth/api/model/GetTokenResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iget v1, v1, Lcom/google/android/gms/internal/ge;->a:I

    if-ne v1, v0, :cond_0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iget v1, v1, Lcom/google/android/gms/internal/ge;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x25

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected response type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iput-object p1, v0, Lcom/google/android/gms/internal/ge;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    invoke-static {v0}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/android/gms/internal/ge;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/firebase/auth/api/model/GetTokenResponse;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;)V
    .locals 4
    .param p1    # Lcom/google/firebase/auth/api/model/GetTokenResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/api/model/GetAccountInfoUser;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iget v0, v0, Lcom/google/android/gms/internal/ge;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iget v1, v1, Lcom/google/android/gms/internal/ge;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x25

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected response type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iput-object p1, v0, Lcom/google/android/gms/internal/ge;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iput-object p2, v0, Lcom/google/android/gms/internal/ge;->i:Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    invoke-static {v0}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/android/gms/internal/ge;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iget v0, v0, Lcom/google/android/gms/internal/ge;->a:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iget v1, v1, Lcom/google/android/gms/internal/ge;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x24

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected response type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    invoke-static {v0}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/android/gms/internal/ge;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iget v0, v0, Lcom/google/android/gms/internal/ge;->a:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    iget v1, v1, Lcom/google/android/gms/internal/ge;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x24

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected response type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ge$a;->a:Lcom/google/android/gms/internal/ge;

    invoke-static {v0}, Lcom/google/android/gms/internal/ge;->a(Lcom/google/android/gms/internal/ge;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
