.class Lcom/google/android/gms/drive/internal/bu$2;
.super Lcom/google/android/gms/drive/internal/bs$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/bu;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;Lcom/google/android/gms/drive/x;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/drive/n;

.field final synthetic b:Lcom/google/android/gms/drive/x;

.field final synthetic c:Lcom/google/android/gms/drive/internal/bu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/bu;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/n;Lcom/google/android/gms/drive/x;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/bu$2;->c:Lcom/google/android/gms/drive/internal/bu;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/bu$2;->a:Lcom/google/android/gms/drive/n;

    iput-object p4, p0, Lcom/google/android/gms/drive/internal/bu$2;->b:Lcom/google/android/gms/drive/x;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/bs$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/bu$2;->a(Lcom/google/android/gms/drive/internal/bt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/bt;)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/bu$2;->a:Lcom/google/android/gms/drive/n;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/n;->j()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->B()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->a(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->i()Lcom/google/android/gms/drive/internal/n;

    move-result-object v6

    new-instance v0, Lcom/google/android/gms/drive/internal/CloseContentsAndUpdateMetadataRequest;

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/bu$2;->c:Lcom/google/android/gms/drive/internal/bu;

    invoke-static {v1}, Lcom/google/android/gms/drive/internal/bu;->a(Lcom/google/android/gms/drive/internal/bu;)Lcom/google/android/gms/drive/Contents;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/drive/Contents;->b()Lcom/google/android/gms/drive/DriveId;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/bu$2;->a:Lcom/google/android/gms/drive/n;

    invoke-virtual {v2}, Lcom/google/android/gms/drive/n;->j()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/drive/internal/bu$2;->c:Lcom/google/android/gms/drive/internal/bu;

    invoke-static {v3}, Lcom/google/android/gms/drive/internal/bu;->a(Lcom/google/android/gms/drive/internal/bu;)Lcom/google/android/gms/drive/Contents;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/drive/Contents;->f()I

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/drive/internal/bu$2;->c:Lcom/google/android/gms/drive/internal/bu;

    invoke-static {v4}, Lcom/google/android/gms/drive/internal/bu;->a(Lcom/google/android/gms/drive/internal/bu;)Lcom/google/android/gms/drive/Contents;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/drive/Contents;->g()Z

    move-result v4

    iget-object v5, p0, Lcom/google/android/gms/drive/internal/bu$2;->b:Lcom/google/android/gms/drive/x;

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/drive/internal/CloseContentsAndUpdateMetadataRequest;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;IZLcom/google/android/gms/drive/x;)V

    new-instance v1, Lcom/google/android/gms/drive/internal/at;

    invoke-direct {v1, p0}, Lcom/google/android/gms/drive/internal/at;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v6, v0, v1}, Lcom/google/android/gms/drive/internal/n;->a(Lcom/google/android/gms/drive/internal/CloseContentsAndUpdateMetadataRequest;Lcom/google/android/gms/drive/internal/o;)V

    return-void
.end method
