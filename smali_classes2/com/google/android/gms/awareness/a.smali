.class public final Lcom/google/android/gms/awareness/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/awareness/d;

.field public static final b:Lcom/google/android/gms/awareness/e;

.field public static final c:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/awareness/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/contextmanager/c;->b:Lcom/google/android/gms/awareness/d;

    sput-object v0, Lcom/google/android/gms/awareness/a;->a:Lcom/google/android/gms/awareness/d;

    sget-object v0, Lcom/google/android/gms/contextmanager/c;->c:Lcom/google/android/gms/awareness/e;

    sput-object v0, Lcom/google/android/gms/awareness/a;->b:Lcom/google/android/gms/awareness/e;

    sget-object v0, Lcom/google/android/gms/contextmanager/c;->d:Lcom/google/android/gms/common/api/a;

    sput-object v0, Lcom/google/android/gms/awareness/a;->c:Lcom/google/android/gms/common/api/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
