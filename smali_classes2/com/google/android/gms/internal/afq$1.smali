.class Lcom/google/android/gms/internal/afq$1;
.super Landroid/support/v4/media/session/MediaSessionCompat$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/afq;->a(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/cast/CastDevice;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/afq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/afq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/afq$1;->a:Lcom/google/android/gms/internal/afq;

    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afq$1;->a:Lcom/google/android/gms/internal/afq;

    invoke-static {v0}, Lcom/google/android/gms/internal/afq;->a(Lcom/google/android/gms/internal/afq;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->s()V

    return-void
.end method

.method public a(Landroid/content/Intent;)Z
    .locals 3

    const-string v0, "android.intent.extra.KEY_EVENT"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/view/KeyEvent;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/16 v2, 0x7f

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x7e

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/afq$1;->a:Lcom/google/android/gms/internal/afq;

    invoke-static {v0}, Lcom/google/android/gms/internal/afq;->a(Lcom/google/android/gms/internal/afq;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->s()V

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afq$1;->a:Lcom/google/android/gms/internal/afq;

    invoke-static {v0}, Lcom/google/android/gms/internal/afq;->a(Lcom/google/android/gms/internal/afq;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->s()V

    return-void
.end method
