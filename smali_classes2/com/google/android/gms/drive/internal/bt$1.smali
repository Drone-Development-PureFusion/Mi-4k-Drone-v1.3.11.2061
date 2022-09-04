.class Lcom/google/android/gms/drive/internal/bt$1;
.super Lcom/google/android/gms/drive/internal/bs$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/bt;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/internal/AddEventListenerRequest;Lcom/google/android/gms/drive/internal/f;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/drive/internal/AddEventListenerRequest;

.field final synthetic b:Lcom/google/android/gms/drive/internal/f;

.field final synthetic c:Lcom/google/android/gms/drive/internal/bt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/bt;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/internal/AddEventListenerRequest;Lcom/google/android/gms/drive/internal/f;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/bt$1;->c:Lcom/google/android/gms/drive/internal/bt;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/bt$1;->a:Lcom/google/android/gms/drive/internal/AddEventListenerRequest;

    iput-object p4, p0, Lcom/google/android/gms/drive/internal/bt$1;->b:Lcom/google/android/gms/drive/internal/f;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/bs$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/bt$1;->a(Lcom/google/android/gms/drive/internal/bt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/bt;)V
    .locals 5

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->i()Lcom/google/android/gms/drive/internal/n;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/bt$1;->a:Lcom/google/android/gms/drive/internal/AddEventListenerRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/bt$1;->b:Lcom/google/android/gms/drive/internal/f;

    const/4 v3, 0x0

    new-instance v4, Lcom/google/android/gms/drive/internal/at;

    invoke-direct {v4, p0}, Lcom/google/android/gms/drive/internal/at;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/google/android/gms/drive/internal/n;->a(Lcom/google/android/gms/drive/internal/AddEventListenerRequest;Lcom/google/android/gms/drive/internal/p;Ljava/lang/String;Lcom/google/android/gms/drive/internal/o;)V

    return-void
.end method
