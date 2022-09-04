.class public final Lcom/google/android/gms/internal/gb;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/gb$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g",
            "<",
            "Lcom/google/android/gms/internal/fu;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/internal/gb$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<",
            "Lcom/google/android/gms/internal/fu;",
            "Lcom/google/android/gms/internal/gb$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gb;->a:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lcom/google/android/gms/internal/gb$1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gb$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gb;->c:Lcom/google/android/gms/common/api/a$b;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "InternalFirebaseAuth.FIREBASE_AUTH_API"

    sget-object v2, Lcom/google/android/gms/internal/gb;->c:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/internal/gb;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/internal/gb;->b:Lcom/google/android/gms/common/api/a;

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/gb$a;)Lcom/google/android/gms/internal/ft;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ft;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ft;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/gb$a;)V

    return-object v0
.end method
