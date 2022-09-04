.class public final Lcom/google/android/gms/cast/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/a$b;,
        Lcom/google/android/gms/cast/a$f;,
        Lcom/google/android/gms/cast/a$a;,
        Lcom/google/android/gms/cast/a$c;,
        Lcom/google/android/gms/cast/a$e;,
        Lcom/google/android/gms/cast/a$d;
    }
.end annotation


# static fields
.field public static final a:I = 0x10000

.field public static final b:I = 0x80

.field public static final c:I = -0x1

.field public static final d:I = 0x0

.field public static final e:I = 0x1

.field public static final f:I = -0x1

.field public static final g:I = 0x0

.field public static final h:I = 0x1

.field public static final i:Ljava/lang/String; = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING"

.field static final j:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<",
            "Lcom/google/android/gms/cast/internal/e;",
            "Lcom/google/android/gms/cast/a$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/cast/a$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final l:Lcom/google/android/gms/cast/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/cast/a$1;

    invoke-direct {v0}, Lcom/google/android/gms/cast/a$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/a;->j:Lcom/google/android/gms/common/api/a$b;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "Cast.API"

    sget-object v2, Lcom/google/android/gms/cast/a;->j:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/cast/internal/l;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/cast/a;->k:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/cast/a$b$a;

    invoke-direct {v0}, Lcom/google/android/gms/cast/a$b$a;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/a;->l:Lcom/google/android/gms/cast/a$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
