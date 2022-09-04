.class Lcom/google/android/gms/internal/acs$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/acs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/google/android/gms/internal/acr$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/acr$c",
            "<TT;>;"
        }
    .end annotation
.end field

.field public final b:Lcom/google/android/gms/internal/acr$a;

.field final synthetic c:Lcom/google/android/gms/internal/acs;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/acs;Lcom/google/android/gms/internal/acr$c;Lcom/google/android/gms/internal/acr$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/acr$c",
            "<TT;>;",
            "Lcom/google/android/gms/internal/acr$a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/acs$a;->c:Lcom/google/android/gms/internal/acs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/acs$a;->a:Lcom/google/android/gms/internal/acr$c;

    iput-object p3, p0, Lcom/google/android/gms/internal/acs$a;->b:Lcom/google/android/gms/internal/acr$a;

    return-void
.end method
