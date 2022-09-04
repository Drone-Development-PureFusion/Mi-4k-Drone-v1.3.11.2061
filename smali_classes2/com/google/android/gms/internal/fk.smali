.class public abstract Lcom/google/android/gms/internal/fk;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/fk$b;,
        Lcom/google/android/gms/internal/fk$c;,
        Lcom/google/android/gms/internal/fk$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Lcom/google/android/gms/internal/fk;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/fk$1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/fk$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/fk;->a:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/fk;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/fk;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/fk;

    return-object v0
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/internal/fk$a;)V
.end method
