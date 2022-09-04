.class public final Lcom/google/android/gms/b/c;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/common/api/a$a$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/common/api/a$a$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/google/android/gms/b/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/appdatasearch/a;->b:Lcom/google/android/gms/common/api/a;

    sput-object v0, Lcom/google/android/gms/b/c;->a:Lcom/google/android/gms/common/api/a;

    sget-object v0, Lcom/google/android/gms/appdatasearch/a;->b:Lcom/google/android/gms/common/api/a;

    sput-object v0, Lcom/google/android/gms/b/c;->b:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/internal/aeh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/aeh;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/c;->c:Lcom/google/android/gms/b/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
