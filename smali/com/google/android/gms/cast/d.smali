.class public final Lcom/google/android/gms/cast/d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/d$a;,
        Lcom/google/android/gms/cast/d$c;,
        Lcom/google/android/gms/cast/d$b;,
        Lcom/google/android/gms/cast/d$d;
    }
.end annotation


# static fields
.field public static final a:I = 0x1

.field public static final b:I = 0x2

.field public static final c:I = 0x3

.field public static final d:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/cast/d$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lcom/google/android/gms/cast/e;

.field private static final f:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<",
            "Lcom/google/android/gms/internal/agv;",
            "Lcom/google/android/gms/cast/d$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/cast/d$1;

    invoke-direct {v0}, Lcom/google/android/gms/cast/d$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/d;->f:Lcom/google/android/gms/common/api/a$b;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "CastRemoteDisplay.API"

    sget-object v2, Lcom/google/android/gms/cast/d;->f:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/cast/internal/l;->b:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/cast/d;->d:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/internal/agu;

    sget-object v1, Lcom/google/android/gms/cast/d;->d:Lcom/google/android/gms/common/api/a;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/agu;-><init>(Lcom/google/android/gms/common/api/a;)V

    sput-object v0, Lcom/google/android/gms/cast/d;->e:Lcom/google/android/gms/cast/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/content/Context;)Z
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/cast/internal/h;->a(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/cast/internal/h;->a:Lcom/google/android/gms/internal/amf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/amf;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
