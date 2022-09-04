.class public final Lcom/google/android/gms/nearby/internal/connection/dev/l;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/nearby/connection/dev/d;


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g",
            "<",
            "Lcom/google/android/gms/nearby/internal/connection/dev/k;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<",
            "Lcom/google/android/gms/nearby/internal/connection/dev/k;",
            "Lcom/google/android/gms/common/api/a$a$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/internal/connection/dev/l;->a:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lcom/google/android/gms/nearby/internal/connection/dev/l$1;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/internal/connection/dev/l$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/internal/connection/dev/l;->b:Lcom/google/android/gms/common/api/a$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
