.class public final Lcom/google/android/gms/plus/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/plus/c$b;,
        Lcom/google/android/gms/plus/c$a;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g",
            "<",
            "Lcom/google/android/gms/plus/internal/e;",
            ">;"
        }
    .end annotation
.end field

.field static final b:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<",
            "Lcom/google/android/gms/plus/internal/e;",
            "Lcom/google/android/gms/plus/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/plus/c$a;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Lcom/google/android/gms/common/api/Scope;

.field public static final e:Lcom/google/android/gms/common/api/Scope;

.field public static final f:Lcom/google/android/gms/plus/b;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final g:Lcom/google/android/gms/plus/a;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final h:Lcom/google/android/gms/plus/g;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final i:Lcom/google/android/gms/plus/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/plus/c;->a:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lcom/google/android/gms/plus/c$1;

    invoke-direct {v0}, Lcom/google/android/gms/plus/c$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/plus/c;->b:Lcom/google/android/gms/common/api/a$b;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "Plus.API"

    sget-object v2, Lcom/google/android/gms/plus/c;->b:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/plus/c;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/plus/c;->c:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "https://www.googleapis.com/auth/plus.login"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/plus/c;->d:Lcom/google/android/gms/common/api/Scope;

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "https://www.googleapis.com/auth/plus.me"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/plus/c;->e:Lcom/google/android/gms/common/api/Scope;

    new-instance v0, Lcom/google/android/gms/internal/ans;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ans;-><init>()V

    sput-object v0, Lcom/google/android/gms/plus/c;->f:Lcom/google/android/gms/plus/b;

    new-instance v0, Lcom/google/android/gms/internal/anp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/anp;-><init>()V

    sput-object v0, Lcom/google/android/gms/plus/c;->g:Lcom/google/android/gms/plus/a;

    new-instance v0, Lcom/google/android/gms/internal/anr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/anr;-><init>()V

    sput-object v0, Lcom/google/android/gms/plus/c;->h:Lcom/google/android/gms/plus/g;

    new-instance v0, Lcom/google/android/gms/internal/anq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/anq;-><init>()V

    sput-object v0, Lcom/google/android/gms/plus/c;->i:Lcom/google/android/gms/plus/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/plus/internal/e;
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "GoogleApiClient parameter is required."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/g;->j()Z

    move-result v0

    const-string v1, "GoogleApiClient must be connected."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/plus/c;->c:Lcom/google/android/gms/common/api/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a;)Z

    move-result v0

    const-string v1, "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/plus/c;->c:Lcom/google/android/gms/common/api/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/common/api/a;)Z

    move-result v0

    if-eqz p1, :cond_1

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GoogleApiClient has an optional Plus.API and is not connected to Plus. Use GoogleApiClient.hasConnectedApi(Plus.API) to guard this call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/plus/c;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/plus/internal/e;

    :goto_1
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method
