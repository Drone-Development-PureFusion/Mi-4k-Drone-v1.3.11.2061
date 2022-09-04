.class Lcom/google/android/gms/drive/internal/bx$1;
.super Lcom/google/android/gms/drive/internal/bx$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/bx;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;ILcom/google/android/gms/drive/w;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/drive/n;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/google/android/gms/drive/w;

.field final synthetic e:Lcom/google/android/gms/drive/internal/bx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/bx;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;IILcom/google/android/gms/drive/w;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/bx$1;->e:Lcom/google/android/gms/drive/internal/bx;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/bx$1;->a:Lcom/google/android/gms/drive/n;

    iput p4, p0, Lcom/google/android/gms/drive/internal/bx$1;->b:I

    iput p5, p0, Lcom/google/android/gms/drive/internal/bx$1;->c:I

    iput-object p6, p0, Lcom/google/android/gms/drive/internal/bx$1;->d:Lcom/google/android/gms/drive/w;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/bx$d;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/bx$1;->a(Lcom/google/android/gms/drive/internal/bt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/bt;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bx$1;->a:Lcom/google/android/gms/drive/n;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/n;->j()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->B()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->a(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/drive/internal/CreateFileRequest;

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/bx$1;->e:Lcom/google/android/gms/drive/internal/bx;

    invoke-virtual {v1}, Lcom/google/android/gms/drive/internal/bx;->a()Lcom/google/android/gms/drive/DriveId;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/bx$1;->a:Lcom/google/android/gms/drive/n;

    invoke-virtual {v2}, Lcom/google/android/gms/drive/n;->j()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v2

    iget v3, p0, Lcom/google/android/gms/drive/internal/bx$1;->b:I

    iget v4, p0, Lcom/google/android/gms/drive/internal/bx$1;->c:I

    iget-object v5, p0, Lcom/google/android/gms/drive/internal/bx$1;->d:Lcom/google/android/gms/drive/w;

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/drive/internal/CreateFileRequest;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;IILcom/google/android/gms/drive/w;)V

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->i()Lcom/google/android/gms/drive/internal/n;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/drive/internal/bx$a;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/bx$a;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/drive/internal/n;->a(Lcom/google/android/gms/drive/internal/CreateFileRequest;Lcom/google/android/gms/drive/internal/o;)V

    return-void
.end method
