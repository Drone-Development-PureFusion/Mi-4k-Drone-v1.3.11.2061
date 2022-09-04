.class public final Lcom/google/android/gms/safetynet/b;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g",
            "<",
            "Lcom/google/android/gms/internal/any;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<",
            "Lcom/google/android/gms/internal/any;",
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

.field public static final d:Lcom/google/android/gms/safetynet/c;

.field public static final e:Lcom/google/android/gms/safetynet/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/safetynet/b;->a:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lcom/google/android/gms/safetynet/b$1;

    invoke-direct {v0}, Lcom/google/android/gms/safetynet/b$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/safetynet/b;->b:Lcom/google/android/gms/common/api/a$b;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "SafetyNet.API"

    sget-object v2, Lcom/google/android/gms/safetynet/b;->b:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/safetynet/b;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/safetynet/b;->c:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/internal/anx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/anx;-><init>()V

    sput-object v0, Lcom/google/android/gms/safetynet/b;->d:Lcom/google/android/gms/safetynet/c;

    new-instance v0, Lcom/google/android/gms/internal/anz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/anz;-><init>()V

    sput-object v0, Lcom/google/android/gms/safetynet/b;->e:Lcom/google/android/gms/safetynet/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
