.class public final Lcom/google/android/gms/auth/api/credentials/HintRequest$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/auth/api/credentials/HintRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:[Ljava/lang/String;

.field private d:Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;

    invoke-direct {v0}, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;->a()Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/auth/api/credentials/HintRequest$a;->d:Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/auth/api/credentials/HintRequest$a;)Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/HintRequest$a;->d:Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/auth/api/credentials/HintRequest$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/credentials/HintRequest$a;->a:Z

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/auth/api/credentials/HintRequest$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/credentials/HintRequest$a;->b:Z

    return v0
.end method

.method static synthetic d(Lcom/google/android/gms/auth/api/credentials/HintRequest$a;)[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/HintRequest$a;->c:[Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;)Lcom/google/android/gms/auth/api/credentials/HintRequest$a;
    .locals 1
    .param p1    # Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    iput-object v0, p0, Lcom/google/android/gms/auth/api/credentials/HintRequest$a;->d:Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/auth/api/credentials/HintRequest$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/auth/api/credentials/HintRequest$a;->a:Z

    return-object p0
.end method

.method public varargs a([Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/HintRequest$a;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    new-array p1, v0, [Ljava/lang/String;

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/HintRequest$a;->c:[Ljava/lang/String;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/auth/api/credentials/HintRequest;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/HintRequest$a;->c:[Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/auth/api/credentials/HintRequest$a;->c:[Ljava/lang/String;

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/credentials/HintRequest$a;->a:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/credentials/HintRequest$a;->b:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/HintRequest$a;->c:[Ljava/lang/String;

    array-length v0, v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "At least one authentication method must be specified"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/auth/api/credentials/HintRequest;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/auth/api/credentials/HintRequest;-><init>(Lcom/google/android/gms/auth/api/credentials/HintRequest$a;Lcom/google/android/gms/auth/api/credentials/HintRequest$1;)V

    return-object v0
.end method

.method public b(Z)Lcom/google/android/gms/auth/api/credentials/HintRequest$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/auth/api/credentials/HintRequest$a;->b:Z

    return-object p0
.end method
