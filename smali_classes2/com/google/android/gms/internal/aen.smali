.class public Lcom/google/android/gms/internal/aen;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/auth/a/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/aen$c;,
        Lcom/google/android/gms/internal/aen$b;,
        Lcom/google/android/gms/internal/aen$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/common/api/Status;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/internal/aen;->a:Lcom/google/android/gms/common/api/Status;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/aen;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;Landroid/accounts/Account;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Landroid/accounts/Account;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/m;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/aen$3;

    sget-object v1, Lcom/google/android/gms/auth/a/a;->a:Lcom/google/android/gms/common/api/a;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/internal/aen$3;-><init>(Lcom/google/android/gms/internal/aen;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;Landroid/accounts/Account;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/auth/a/b$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/aen$2;

    sget-object v1, Lcom/google/android/gms/auth/a/a;->a:Lcom/google/android/gms/common/api/a;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/internal/aen$2;-><init>(Lcom/google/android/gms/internal/aen;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Z)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/aen$1;

    sget-object v1, Lcom/google/android/gms/auth/a/a;->a:Lcom/google/android/gms/common/api/a;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/internal/aen$1;-><init>(Lcom/google/android/gms/internal/aen;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;Z)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    return-void
.end method
