.class Lcom/google/android/gms/internal/anx$3;
.super Lcom/google/android/gms/internal/anx$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/anx;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;[I)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/google/android/gms/internal/anx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/anx;Lcom/google/android/gms/common/api/g;[ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/anx$3;->c:Lcom/google/android/gms/internal/anx;

    iput-object p3, p0, Lcom/google/android/gms/internal/anx$3;->a:[I

    iput-object p4, p0, Lcom/google/android/gms/internal/anx$3;->b:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/anx$e;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/any;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/anx$3;->a(Lcom/google/android/gms/internal/any;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/any;)V
    .locals 6

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/anx$3;->a:[I

    array-length v3, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget v4, v1, v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/anx$3;->e:Lcom/google/android/gms/internal/anv;

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/google/android/gms/internal/anx$3;->b:Ljava/lang/String;

    const/4 v5, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/any;->a(Lcom/google/android/gms/internal/anv;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
