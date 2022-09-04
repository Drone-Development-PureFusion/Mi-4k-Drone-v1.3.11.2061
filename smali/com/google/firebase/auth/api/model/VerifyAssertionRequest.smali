.class public Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I
    .annotation runtime Lcom/google/android/gms/internal/gc;
    .end annotation
.end field

.field private b:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "requestUri"
    .end annotation
.end field

.field private c:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "idToken"
    .end annotation
.end field

.field private d:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/gc;
    .end annotation
.end field

.field private e:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/gc;
    .end annotation
.end field

.field private f:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/gc;
    .end annotation
.end field

.field private g:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation runtime Lcom/google/android/gms/internal/gc;
    .end annotation
.end field

.field private h:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "postBody"
    .end annotation
.end field

.field private i:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "oauthTokenSecret"
    .end annotation
.end field

.field private j:Z
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "returnSecureToken"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/api/model/h;

    invoke-direct {v0}, Lcom/google/firebase/auth/api/model/h;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->a:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->j:Z

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->a:I

    iput-object p2, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->g:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->h:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->i:Ljava/lang/String;

    iput-boolean p10, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->j:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->a:I

    const-string v0, "http://localhost"

    iput-object v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->b:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->d:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->e:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->i:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->j:Z

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Both idToken, and accessToken cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->f:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->g:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->d:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "id_token"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->e:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "access_token"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->g:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "identifier"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->i:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "oauth_token_secret"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    const-string v1, "providerId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->f:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->i:Ljava/lang/String;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->j:Z

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->g:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;->h:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/auth/api/model/h;->a(Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;Landroid/os/Parcel;I)V

    return-void
.end method
