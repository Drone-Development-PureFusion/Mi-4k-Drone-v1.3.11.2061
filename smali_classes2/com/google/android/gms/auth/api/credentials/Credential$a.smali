.class public Lcom/google/android/gms/auth/api/credentials/Credential$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/auth/api/credentials/Credential;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Landroid/net/Uri;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/auth/api/credentials/IdToken;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/auth/api/credentials/Credential;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->a(Lcom/google/android/gms/auth/api/credentials/Credential;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->b(Lcom/google/android/gms/auth/api/credentials/Credential;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->c(Lcom/google/android/gms/auth/api/credentials/Credential;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->c:Landroid/net/Uri;

    invoke-static {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->d(Lcom/google/android/gms/auth/api/credentials/Credential;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->d:Ljava/util/List;

    invoke-static {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->e(Lcom/google/android/gms/auth/api/credentials/Credential;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->e:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->f(Lcom/google/android/gms/auth/api/credentials/Credential;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->f:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->g(Lcom/google/android/gms/auth/api/credentials/Credential;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->g:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->h(Lcom/google/android/gms/auth/api/credentials/Credential;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Lcom/google/android/gms/auth/api/credentials/Credential$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->c:Landroid/net/Uri;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/Credential$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/auth/api/credentials/Credential;
    .locals 10

    new-instance v0, Lcom/google/android/gms/auth/api/credentials/Credential;

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->c:Landroid/net/Uri;

    iget-object v5, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->d:Ljava/util/List;

    iget-object v6, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->e:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->f:Ljava/lang/String;

    iget-object v8, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->g:Ljava/lang/String;

    iget-object v9, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->h:Ljava/lang/String;

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/auth/api/credentials/Credential;-><init>(ILjava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/Credential$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/Credential$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/Credential$a;->f:Ljava/lang/String;

    return-object p0
.end method
