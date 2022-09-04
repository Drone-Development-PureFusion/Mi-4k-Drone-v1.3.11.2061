.class public final Lcom/google/android/gms/common/internal/p$g;
.super Lcom/google/android/gms/common/internal/af$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/internal/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/common/internal/p;

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/p;I)V
    .locals 0
    .param p1    # Lcom/google/android/gms/common/internal/p;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/af$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/internal/p$g;->a:Lcom/google/android/gms/common/internal/p;

    iput p2, p0, Lcom/google/android/gms/common/internal/p$g;->b:I

    return-void
.end method

.method private a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/common/internal/p$g;->a:Lcom/google/android/gms/common/internal/p;

    return-void
.end method


# virtual methods
.method public a(ILandroid/os/Bundle;)V
    .locals 3
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/BinderThread;
    .end annotation

    const-string v0, "GmsClient"

    const-string v1, "received deprecated onAccountValidationComplete callback, ignoring"

    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    invoke-static {v0, v1, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 2
    .param p2    # Landroid/os/IBinder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/BinderThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/internal/p$g;->a:Lcom/google/android/gms/common/internal/p;

    const-string v1, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/common/internal/p$g;->a:Lcom/google/android/gms/common/internal/p;

    iget v1, p0, Lcom/google/android/gms/common/internal/p$g;->b:I

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/google/android/gms/common/internal/p;->a(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/p$g;->a()V

    return-void
.end method
