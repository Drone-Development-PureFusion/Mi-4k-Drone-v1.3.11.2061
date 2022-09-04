.class Lcom/google/android/gms/drive/internal/c$4;
.super Lcom/google/android/gms/drive/internal/c$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/c;->b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/drive/n;

.field final synthetic b:Lcom/google/android/gms/drive/internal/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/c;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/c$4;->b:Lcom/google/android/gms/drive/internal/c;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/c$4;->a:Lcom/google/android/gms/drive/n;

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/drive/internal/c$d;-><init>(Lcom/google/android/gms/drive/internal/c;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/internal/c$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/c$4;->a(Lcom/google/android/gms/drive/internal/bt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/bt;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/c$4;->a:Lcom/google/android/gms/drive/n;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/n;->j()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->B()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->a(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->i()Lcom/google/android/gms/drive/internal/n;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/UpdateMetadataRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/c$4;->b:Lcom/google/android/gms/drive/internal/c;

    iget-object v2, v2, Lcom/google/android/gms/drive/internal/c;->a:Lcom/google/android/gms/drive/DriveId;

    iget-object v3, p0, Lcom/google/android/gms/drive/internal/c$4;->a:Lcom/google/android/gms/drive/n;

    invoke-virtual {v3}, Lcom/google/android/gms/drive/n;->j()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/internal/UpdateMetadataRequest;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V

    new-instance v2, Lcom/google/android/gms/drive/internal/c$b;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/c$b;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/n;->a(Lcom/google/android/gms/drive/internal/UpdateMetadataRequest;Lcom/google/android/gms/drive/internal/o;)V

    return-void
.end method
