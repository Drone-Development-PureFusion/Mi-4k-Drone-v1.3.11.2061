.class Lcom/google/android/gms/internal/anx$1;
.super Lcom/google/android/gms/internal/anx$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/anx;->a(Lcom/google/android/gms/common/api/g;[B)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[B

.field final synthetic b:Lcom/google/android/gms/internal/anx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/anx;Lcom/google/android/gms/common/api/g;[B)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/anx$1;->b:Lcom/google/android/gms/internal/anx;

    iput-object p3, p0, Lcom/google/android/gms/internal/anx$1;->a:[B

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/anx$b;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/any;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/anx$1;->a(Lcom/google/android/gms/internal/any;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/any;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/anx$1;->c:Lcom/google/android/gms/internal/anv;

    iget-object v1, p0, Lcom/google/android/gms/internal/anx$1;->a:[B

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/any;->a(Lcom/google/android/gms/internal/anv;[B)V

    return-void
.end method
