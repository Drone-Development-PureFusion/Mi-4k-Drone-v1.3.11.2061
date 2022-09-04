.class public Lcom/google/firebase/appindexing/g$a;
.super Lcom/google/firebase/appindexing/a/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/appindexing/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/appindexing/a/e",
        "<",
        "Lcom/google/firebase/appindexing/g$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Thing"

    invoke-direct {p0, v0}, Lcom/google/firebase/appindexing/g$a;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Lcom/google/firebase/appindexing/a/e;-><init>(Ljava/lang/String;)V

    return-void
.end method
