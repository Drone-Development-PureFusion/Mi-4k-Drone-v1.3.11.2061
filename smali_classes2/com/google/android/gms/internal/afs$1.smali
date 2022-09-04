.class Lcom/google/android/gms/internal/afs$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/afs;-><init>(Landroid/view/View;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/afs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/afs;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/afs$1;->a:Lcom/google/android/gms/internal/afs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/afs$1;->a:Lcom/google/android/gms/internal/afs;

    invoke-static {v0}, Lcom/google/android/gms/internal/afs;->a(Lcom/google/android/gms/internal/afs;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/afs$1;->a:Lcom/google/android/gms/internal/afs;

    invoke-static {v1}, Lcom/google/android/gms/internal/afs;->b(Lcom/google/android/gms/internal/afs;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v2

    if-eqz v2, :cond_0

    instance-of v2, v0, Landroid/support/v4/app/FragmentActivity;

    if-eqz v2, :cond_0

    check-cast v0, Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v2

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v3, "TRACKS_CHOOSER_DIALOG_TAG"

    invoke-virtual {v0, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v2, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    invoke-virtual {v1}, Lcom/google/android/gms/cast/framework/media/c;->h()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v0

    invoke-virtual {v1}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/cast/MediaStatus;->j()[J

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment;->a(Lcom/google/android/gms/cast/MediaInfo;[J)Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "TRACKS_CHOOSER_DIALOG_TAG"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/cast/framework/media/TracksChooserDialogFragment;->show(Landroid/support/v4/app/FragmentTransaction;Ljava/lang/String;)I

    goto :goto_0
.end method
