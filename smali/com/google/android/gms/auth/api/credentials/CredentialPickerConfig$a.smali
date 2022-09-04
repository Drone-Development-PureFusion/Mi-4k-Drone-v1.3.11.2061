.class public Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;->a:Z

    iput-boolean v1, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;->b:Z

    iput v1, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;->c:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;->a:Z

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;->b:Z

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;->c:I

    return v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;->c:I

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;->a:Z

    return-object p0
.end method

.method public a()Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;
    .locals 2

    new-instance v0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;-><init>(Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$1;)V

    return-object v0
.end method

.method public b(Z)Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;->b:Z

    return-object p0
.end method

.method public c(Z)Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    const/4 v0, 0x3

    :goto_0
    iput v0, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;->c:I

    return-object p0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method
