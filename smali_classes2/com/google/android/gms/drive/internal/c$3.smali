.class Lcom/google/android/gms/drive/internal/c$3;
.super Lcom/google/android/gms/drive/internal/bs$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/c;->a(Lcom/google/android/gms/common/api/g;Ljava/util/Set;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/google/android/gms/drive/internal/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/c;Lcom/google/android/gms/common/api/g;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/c$3;->b:Lcom/google/android/gms/drive/internal/c;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/c$3;->a:Ljava/util/List;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/bs$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/c$3;->a(Lcom/google/android/gms/drive/internal/bt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/bt;)V
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->i()Lcom/google/android/gms/drive/internal/n;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/c$3;->b:Lcom/google/android/gms/drive/internal/c;

    iget-object v2, v2, Lcom/google/android/gms/drive/internal/c;->a:Lcom/google/android/gms/drive/DriveId;

    iget-object v3, p0, Lcom/google/android/gms/drive/internal/c$3;->a:Ljava/util/List;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;-><init>(Lcom/google/android/gms/drive/DriveId;Ljava/util/List;)V

    new-instance v2, Lcom/google/android/gms/drive/internal/at;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/at;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/n;->a(Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;Lcom/google/android/gms/drive/internal/o;)V

    return-void
.end method
