.class Lcom/google/android/gms/drive/internal/c$1;
.super Lcom/google/android/gms/drive/internal/c$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/drive/internal/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/c;Lcom/google/android/gms/common/api/g;Z)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/c$1;->b:Lcom/google/android/gms/drive/internal/c;

    iput-boolean p3, p0, Lcom/google/android/gms/drive/internal/c$1;->a:Z

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/drive/internal/c$d;-><init>(Lcom/google/android/gms/drive/internal/c;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/internal/c$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/c$1;->a(Lcom/google/android/gms/drive/internal/bt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/bt;)V
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->i()Lcom/google/android/gms/drive/internal/n;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/GetMetadataRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/c$1;->b:Lcom/google/android/gms/drive/internal/c;

    iget-object v2, v2, Lcom/google/android/gms/drive/internal/c;->a:Lcom/google/android/gms/drive/DriveId;

    iget-boolean v3, p0, Lcom/google/android/gms/drive/internal/c$1;->a:Z

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/internal/GetMetadataRequest;-><init>(Lcom/google/android/gms/drive/DriveId;Z)V

    new-instance v2, Lcom/google/android/gms/drive/internal/c$b;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/c$b;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/n;->a(Lcom/google/android/gms/drive/internal/GetMetadataRequest;Lcom/google/android/gms/drive/internal/o;)V

    return-void
.end method
