.class Lcom/google/firebase/database/k$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/k;->d()Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<",
        "Lcom/google/firebase/database/k;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Iterator;

.field final synthetic b:Lcom/google/firebase/database/k;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/k;Ljava/util/Iterator;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/k$2;->b:Lcom/google/firebase/database/k;

    iput-object p2, p0, Lcom/google/firebase/database/k$2;->a:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/firebase/database/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/firebase/database/k$2$1;

    invoke-direct {v0, p0}, Lcom/google/firebase/database/k$2$1;-><init>(Lcom/google/firebase/database/k$2;)V

    return-object v0
.end method
