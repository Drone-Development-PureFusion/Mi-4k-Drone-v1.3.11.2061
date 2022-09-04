.class Lcom/google/android/gms/internal/anx$c$1;
.super Lcom/google/android/gms/internal/ant;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/anx$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/anx$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/anx$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/anx$c$1;->a:Lcom/google/android/gms/internal/anx$c;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ant;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/anx$c$1;->a:Lcom/google/android/gms/internal/anx$c;

    new-instance v1, Lcom/google/android/gms/internal/anx$h;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/anx$h;-><init>(Lcom/google/android/gms/common/api/Status;Z)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/anx$c;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
