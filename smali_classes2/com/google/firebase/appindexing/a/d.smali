.class public final Lcom/google/firebase/appindexing/a/d;
.super Lcom/google/firebase/appindexing/a/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/appindexing/a/e",
        "<",
        "Lcom/google/firebase/appindexing/a/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "ReadPermission"

.field public static final b:Ljava/lang/String; = "WritePermission"

.field public static final c:Ljava/lang/String; = "CommentPermission"


# direct methods
.method constructor <init>()V
    .locals 1

    const-string v0, "DigitalDocumentPermission"

    invoke-direct {p0, v0}, Lcom/google/firebase/appindexing/a/e;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/google/firebase/appindexing/a/d;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "permissionType"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/appindexing/a/d;->put(Ljava/lang/String;[Ljava/lang/String;)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/d;

    return-object v0
.end method

.method public varargs a([Lcom/google/firebase/appindexing/a/l;)Lcom/google/firebase/appindexing/a/d;
    .locals 1
    .param p1    # [Lcom/google/firebase/appindexing/a/l;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "grantee"

    invoke-virtual {p0, v0, p1}, Lcom/google/firebase/appindexing/a/d;->a(Ljava/lang/String;[Lcom/google/firebase/appindexing/a/e;)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/a/d;

    return-object v0
.end method
