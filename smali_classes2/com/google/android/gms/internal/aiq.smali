.class public final Lcom/google/android/gms/internal/aiq;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lcom/google/android/gms/internal/aip;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/aip",
            "<",
            "Lcom/google/android/gms/common/api/a$c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/google/android/gms/internal/aiy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/aiy",
            "<",
            "Lcom/google/android/gms/common/api/a$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/aip;Lcom/google/android/gms/internal/aiy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/aip",
            "<",
            "Lcom/google/android/gms/common/api/a$c;",
            ">;",
            "Lcom/google/android/gms/internal/aiy",
            "<",
            "Lcom/google/android/gms/common/api/a$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/aiq;->a:Lcom/google/android/gms/internal/aip;

    iput-object p2, p0, Lcom/google/android/gms/internal/aiq;->b:Lcom/google/android/gms/internal/aiy;

    return-void
.end method
