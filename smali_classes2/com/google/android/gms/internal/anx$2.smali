.class Lcom/google/android/gms/internal/anx$2;
.super Lcom/google/android/gms/internal/anx$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/anx;->a(Lcom/google/android/gms/common/api/g;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/google/android/gms/internal/anx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/anx;Lcom/google/android/gms/common/api/g;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/anx$2;->d:Lcom/google/android/gms/internal/anx;

    iput-object p3, p0, Lcom/google/android/gms/internal/anx$2;->a:Ljava/util/List;

    iput-object p4, p0, Lcom/google/android/gms/internal/anx$2;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/anx$2;->c:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/anx$e;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/any;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/anx$2;->a(Lcom/google/android/gms/internal/any;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/any;)V
    .locals 6

    iget-object v1, p0, Lcom/google/android/gms/internal/anx$2;->e:Lcom/google/android/gms/internal/anv;

    iget-object v2, p0, Lcom/google/android/gms/internal/anx$2;->a:Ljava/util/List;

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/google/android/gms/internal/anx$2;->b:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/anx$2;->c:Ljava/lang/String;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/any;->a(Lcom/google/android/gms/internal/anv;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
