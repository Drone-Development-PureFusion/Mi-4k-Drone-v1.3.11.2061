.class public final Lcom/google/firebase/appindexing/a/a;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/appindexing/a;
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/google/firebase/appindexing/a$a;

    const-string v1, "ViewAction"

    invoke-direct {v0, v1}, Lcom/google/firebase/appindexing/a$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/appindexing/a$a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/appindexing/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/appindexing/a$a;->a()Lcom/google/firebase/appindexing/a;

    move-result-object v0

    return-object v0
.end method
