.class Lcom/google/android/gms/internal/aoq$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aoq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aoq;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/aoq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aoq$a;->a:Lcom/google/android/gms/internal/aoq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/aoq;Lcom/google/android/gms/internal/aoq$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/aoq$a;-><init>(Lcom/google/android/gms/internal/aoq;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$a;->a:Lcom/google/android/gms/internal/aoq;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/aoq;->a(Lcom/google/android/gms/internal/aoq;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$a;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->d(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x1a

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Container "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " loading failed."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$a;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->i(Lcom/google/android/gms/internal/aoq;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$a;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->i(Lcom/google/android/gms/internal/aoq;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/internal/aow;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/aow;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$a;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->j(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/tagmanager/aj;

    move-result-object v0

    const-string v1, "app"

    invoke-virtual {v6}, Lcom/google/android/gms/internal/aow;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lcom/google/android/gms/internal/aow;->e()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v6}, Lcom/google/android/gms/internal/aow;->a()J

    move-result-wide v4

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/tagmanager/aj;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    invoke-virtual {v6}, Lcom/google/android/gms/internal/aow;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x32

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Logged event "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " to Firebase (marked as passthrough)."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Error logging event with measurement proxy:"

    invoke-virtual {v0}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lcom/google/android/gms/internal/aow;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x2d

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Discarded event "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " (marked as non-passthrough)."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$a;->a:Lcom/google/android/gms/internal/aoq;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/aoq;->a(Lcom/google/android/gms/internal/aoq;Ljava/util/List;)Ljava/util/List;

    :cond_3
    return-void
.end method
