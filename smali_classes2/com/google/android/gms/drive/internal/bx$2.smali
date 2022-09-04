.class Lcom/google/android/gms/drive/internal/bx$2;
.super Lcom/google/android/gms/drive/internal/bx$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/bx;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/drive/n;

.field final synthetic b:Lcom/google/android/gms/drive/internal/bx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/bx;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/bx$2;->b:Lcom/google/android/gms/drive/internal/bx;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/bx$2;->a:Lcom/google/android/gms/drive/n;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/bx$f;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/bx$2;->a(Lcom/google/android/gms/drive/internal/bt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/bt;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bx$2;->a:Lcom/google/android/gms/drive/n;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/n;->j()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->B()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->a(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->i()Lcom/google/android/gms/drive/internal/n;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/CreateFolderRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/bx$2;->b:Lcom/google/android/gms/drive/internal/bx;

    invoke-virtual {v2}, Lcom/google/android/gms/drive/internal/bx;->a()Lcom/google/android/gms/drive/DriveId;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/drive/internal/bx$2;->a:Lcom/google/android/gms/drive/n;

    invoke-virtual {v3}, Lcom/google/android/gms/drive/n;->j()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/internal/CreateFolderRequest;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V

    new-instance v2, Lcom/google/android/gms/drive/internal/bx$b;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/bx$b;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/n;->a(Lcom/google/android/gms/drive/internal/CreateFolderRequest;Lcom/google/android/gms/drive/internal/o;)V

    return-void
.end method
