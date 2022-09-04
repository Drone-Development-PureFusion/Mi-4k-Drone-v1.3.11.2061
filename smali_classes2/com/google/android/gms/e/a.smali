.class public final Lcom/google/android/gms/e/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g",
            "<",
            "Lcom/google/android/gms/internal/ann;",
            ">;"
        }
    .end annotation
.end field

.field static final b:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<",
            "Lcom/google/android/gms/internal/ann;",
            "Lcom/google/android/gms/common/api/a$a$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/common/api/a$a$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lcom/google/android/gms/e/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/e/a;->a:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lcom/google/android/gms/e/a$1;

    invoke-direct {v0}, Lcom/google/android/gms/e/a$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/e/a;->b:Lcom/google/android/gms/common/api/a$b;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "Panorama.API"

    sget-object v2, Lcom/google/android/gms/e/a;->b:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/e/a;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/e/a;->c:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/internal/anm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/anm;-><init>()V

    sput-object v0, Lcom/google/android/gms/e/a;->d:Lcom/google/android/gms/e/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
