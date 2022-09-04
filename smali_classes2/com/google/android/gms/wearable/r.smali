.class public Lcom/google/android/gms/wearable/r;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wearable/r$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/wearable/e;

.field public static final b:Lcom/google/android/gms/wearable/a;

.field public static final c:Lcom/google/android/gms/wearable/m;

.field public static final d:Lcom/google/android/gms/wearable/p;

.field public static final e:Lcom/google/android/gms/wearable/c;

.field public static final f:Lcom/google/android/gms/wearable/v;

.field public static final g:Lcom/google/android/gms/wearable/t;

.field public static final h:Lcom/google/android/gms/wearable/y;

.field public static final i:Lcom/google/android/gms/wearable/ab;

.field public static final j:Lcom/google/android/gms/wearable/ac;

.field public static final k:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g",
            "<",
            "Lcom/google/android/gms/wearable/internal/ar;",
            ">;"
        }
    .end annotation
.end field

.field public static final l:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/wearable/r$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final m:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<",
            "Lcom/google/android/gms/wearable/internal/ar;",
            "Lcom/google/android/gms/wearable/r$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/wearable/internal/bp;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/bp;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/r;->a:Lcom/google/android/gms/wearable/e;

    new-instance v0, Lcom/google/android/gms/wearable/internal/bb;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/bb;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/r;->b:Lcom/google/android/gms/wearable/a;

    new-instance v0, Lcom/google/android/gms/wearable/internal/aa;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/aa;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/r;->c:Lcom/google/android/gms/wearable/m;

    new-instance v0, Lcom/google/android/gms/wearable/internal/ad;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/ad;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/r;->d:Lcom/google/android/gms/wearable/p;

    new-instance v0, Lcom/google/android/gms/wearable/internal/bd;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/bd;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/r;->e:Lcom/google/android/gms/wearable/c;

    new-instance v0, Lcom/google/android/gms/wearable/internal/ay;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/ay;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/r;->f:Lcom/google/android/gms/wearable/v;

    new-instance v0, Lcom/google/android/gms/wearable/internal/aw;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/aw;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/r;->g:Lcom/google/android/gms/wearable/t;

    new-instance v0, Lcom/google/android/gms/wearable/internal/bo;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/bo;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/r;->h:Lcom/google/android/gms/wearable/y;

    new-instance v0, Lcom/google/android/gms/wearable/internal/ao;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/ao;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/r;->i:Lcom/google/android/gms/wearable/ab;

    new-instance v0, Lcom/google/android/gms/wearable/internal/at;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/at;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/r;->j:Lcom/google/android/gms/wearable/ac;

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/r;->k:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lcom/google/android/gms/wearable/r$1;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/r$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/r;->m:Lcom/google/android/gms/common/api/a$b;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "Wearable.API"

    sget-object v2, Lcom/google/android/gms/wearable/r;->m:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/wearable/r;->k:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/wearable/r;->l:Lcom/google/android/gms/common/api/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
