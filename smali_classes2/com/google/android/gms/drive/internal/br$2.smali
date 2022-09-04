.class Lcom/google/android/gms/drive/internal/br$2;
.super Lcom/google/android/gms/drive/internal/br$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/br;->a(Lcom/google/android/gms/common/api/g;I)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/google/android/gms/drive/internal/br;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/br;Lcom/google/android/gms/common/api/g;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/br$2;->b:Lcom/google/android/gms/drive/internal/br;

    iput p3, p0, Lcom/google/android/gms/drive/internal/br$2;->a:I

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/br$c;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/br$2;->a(Lcom/google/android/gms/drive/internal/bt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/bt;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->i()Lcom/google/android/gms/drive/internal/n;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/CreateContentsRequest;

    iget v2, p0, Lcom/google/android/gms/drive/internal/br$2;->a:I

    invoke-direct {v1, v2}, Lcom/google/android/gms/drive/internal/CreateContentsRequest;-><init>(I)V

    new-instance v2, Lcom/google/android/gms/drive/internal/br$a;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/br$a;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/n;->a(Lcom/google/android/gms/drive/internal/CreateContentsRequest;Lcom/google/android/gms/drive/internal/o;)V

    return-void
.end method
