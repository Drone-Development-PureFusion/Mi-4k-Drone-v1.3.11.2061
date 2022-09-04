.class Lcom/google/firebase/c/j$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/c/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/c/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/Exception;

.field final synthetic b:Lcom/google/firebase/c/j;


# direct methods
.method public constructor <init>(Lcom/google/firebase/c/j;Ljava/lang/Exception;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/c/j$b;->b:Lcom/google/firebase/c/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/firebase/c/j$b;->a:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public c()Ljava/lang/Exception;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/j$b;->a:Ljava/lang/Exception;

    return-object v0
.end method

.method public d()Lcom/google/firebase/c/i;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/c/j$b;->e()Lcom/google/firebase/c/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/c/j;->l()Lcom/google/firebase/c/i;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/google/firebase/c/j;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/j$b;->b:Lcom/google/firebase/c/j;

    return-object v0
.end method
