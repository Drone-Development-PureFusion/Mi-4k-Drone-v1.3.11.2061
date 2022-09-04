.class public final Lcom/google/firebase/e$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/firebase/e;->a(Lcom/google/firebase/e;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/e$a;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/firebase/e;->b(Lcom/google/firebase/e;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/e$a;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/firebase/e;->c(Lcom/google/firebase/e;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/e$a;->c:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/firebase/e;->d(Lcom/google/firebase/e;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/e$a;->d:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/firebase/e;->e(Lcom/google/firebase/e;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/e$a;->e:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/firebase/e;->f(Lcom/google/firebase/e;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/e$a;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/google/firebase/e$a;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "ApiKey must be set."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/e$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a()Lcom/google/firebase/e;
    .locals 8

    new-instance v0, Lcom/google/firebase/e;

    iget-object v1, p0, Lcom/google/firebase/e$a;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/e$a;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/e$a;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/firebase/e$a;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/firebase/e$a;->e:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/firebase/e$a;->f:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/e$1;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/firebase/e$a;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "ApplicationId must be set."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/e$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/google/firebase/e$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/google/firebase/e$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/google/firebase/e$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/google/firebase/e$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/google/firebase/e$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/google/firebase/e$a;->f:Ljava/lang/String;

    return-object p0
.end method
