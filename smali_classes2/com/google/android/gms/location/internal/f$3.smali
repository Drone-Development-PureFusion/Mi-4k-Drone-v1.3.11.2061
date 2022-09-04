.class Lcom/google/android/gms/location/internal/f$3;
.super Lcom/google/android/gms/location/internal/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/location/internal/f;->a(Lcom/google/android/gms/common/api/g;Ljava/util/List;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/google/android/gms/location/internal/f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/internal/f;Lcom/google/android/gms/common/api/g;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/internal/f$3;->b:Lcom/google/android/gms/location/internal/f;

    iput-object p3, p0, Lcom/google/android/gms/location/internal/f$3;->a:Ljava/util/List;

    invoke-direct {p0, p2}, Lcom/google/android/gms/location/internal/f$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/internal/l;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/internal/f$3;->a(Lcom/google/android/gms/location/internal/l;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/location/internal/l;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/f$3;->a:Ljava/util/List;

    invoke-virtual {p1, v0, p0}, Lcom/google/android/gms/location/internal/l;->a(Ljava/util/List;Lcom/google/android/gms/internal/ahl$b;)V

    return-void
.end method
